package mod.icarus.balkonsexpansion.compat.iceandfire.events;

import ckathode.weaponmod.entity.projectile.EntityProjectile;
import ckathode.weaponmod.item.IItemWeapon;
import com.github.alexthe666.iceandfire.entity.FrozenEntityProperties;
import com.github.alexthe666.iceandfire.util.IsImmune;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.ilexiconn.llibrary.server.entity.EntityPropertiesHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventIAFIceWeapon {
    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if ((event.getSource().getImmediateSource() instanceof EntityLivingBase || event.getSource().getImmediateSource() instanceof EntityProjectile)
                && !"thorns".equals(event.getSource().getDamageType()) && !(event.getEntity() instanceof EntityItem)) {
            if (event == null || event.getEntityLiving() == null) {
                return;
            }

            EntityLivingBase target = event.getEntityLiving();
            DamageSource source = event.getSource();

            if (source == null) {
                return;
            }

            Entity immediate = source.getImmediateSource();
            Entity trueSource = source.getTrueSource();
            ItemStack stack = ItemStack.EMPTY;

            if (immediate instanceof EntityProjectile) {
                ItemStack projectileStack = ((EntityProjectile) immediate).getPickupItem();
                if (projectileStack != null && !projectileStack.isEmpty()) {
                    stack = projectileStack;
                }
            }

            if (stack.isEmpty() && trueSource instanceof EntityLivingBase) {
                ItemStack heldStack = ((EntityLivingBase) trueSource).getHeldItemMainhand();
                if (heldStack != null && !heldStack.isEmpty()) {
                    stack = heldStack;
                }
            }

            if (stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon)) {
                return;
            }

            IItemWeapon weapon = (IItemWeapon) stack.getItem();
            if (weapon.getMeleeComponent() == null) {
                return;
            }

            Item.ToolMaterial material = weapon.getMeleeComponent().weaponMaterial;
            if (material == null) {
                return;
            }

            World world = target.world;
            if (world.isRemote) {
                return;
            }

            // Iced Dragon Bone
            if (material == BEMaterialHelper.iafIceDragonboneMaterial()) {
                if (!IsImmune.toDragonIce(target)) {
                    FrozenEntityProperties frozenProps = EntityPropertiesHandler.INSTANCE.getProperties(target, FrozenEntityProperties.class);
                    if (frozenProps != null) frozenProps.setFrozenFor(50);
                }
            }

            // Ice Dragonsteel
            if (material == BEMaterialHelper.iafIceDragonsteelMaterial()) {
                if (!IsImmune.toDragonIce(target)) {
                    FrozenEntityProperties frozenProps = EntityPropertiesHandler.INSTANCE.getProperties(target, FrozenEntityProperties.class);
                    if (frozenProps != null) frozenProps.setFrozenFor(80);
                }
            }
        }
    }
}
