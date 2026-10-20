package mod.icarus.balkonsexpansion.compat.iceandfire.events;

import ckathode.weaponmod.entity.projectile.EntityProjectile;
import ckathode.weaponmod.item.IItemWeapon;
import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.entity.EntityDragonLightningBolt;
import com.github.alexthe666.iceandfire.util.IsImmune;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class EventIAFLightningWeapon {
    // Melee weapons
    @SubscribeEvent
    public void onMeleeLivingHurt(LivingHurtEvent event) {
        if (event == null || event.getEntityLiving() == null || event.getSource() == null || "thorns".equals(event.getSource().getDamageType()) || !(event.getSource().getImmediateSource() instanceof EntityLivingBase)) {
            return;
        }

        EntityLivingBase attacker = (EntityLivingBase) event.getSource().getImmediateSource();
        EntityLivingBase target = event.getEntityLiving();
        ItemStack stack = attacker.getHeldItemMainhand();
        if (attacker.world.isRemote || target.isDead || stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon)) {
            return;
        }

        IItemWeapon weapon = (IItemWeapon) stack.getItem();
        if (weapon.getMeleeComponent() == null) {
            return;
        }

        Item.ToolMaterial material = weapon.getMeleeComponent().weaponMaterial;
        if (material == BEMaterialHelper.iafLightningDragonboneMaterial() || material == BEMaterialHelper.iafLightningDragonsteelMaterial()) {
            if (attacker.swingProgress < 0.2F) {
                target.world.spawnEntity(new EntityDragonLightningBolt(target.world, target.posX, target.posY, target.posZ, attacker, target));
                if (!IsImmune.toDragonLightning(target)) {
                    event.setAmount(event.getAmount() + (float) IceAndFire.CONFIG.dragonAttackDamageLightning);
                }
            }
        }
    }

    // Projectiles caused by boomerangs, flails, and musket bullets
    @SubscribeEvent
    public void onProjectileLivingHurt(LivingHurtEvent event) {
        if (event == null || event.getEntityLiving() == null || event.getSource() == null || "thorns".equals(event.getSource().getDamageType()) || !(event.getSource().getImmediateSource() instanceof EntityProjectile)) {
            return;
        }

        DamageSource source = event.getSource();
        EntityProjectile projectile = (EntityProjectile) source.getImmediateSource();
        EntityLivingBase target = event.getEntityLiving();
        Entity trueSource = source.getTrueSource();
        ItemStack stack = projectile.getPickupItem();

        if ((stack == null || stack.isEmpty()) && trueSource instanceof EntityLivingBase) {
            stack = ((EntityLivingBase) trueSource).getHeldItemMainhand();
        }

        if (target.world.isRemote || target.isDead || stack == null || stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon) || !(trueSource instanceof EntityLivingBase)) {
            return;
        }

        EntityLivingBase attacker = (EntityLivingBase) trueSource;
        IItemWeapon weapon = (IItemWeapon) stack.getItem();
        if (weapon.getMeleeComponent() == null) {
            return;
        }

        Item.ToolMaterial material = weapon.getMeleeComponent().weaponMaterial;
        if (material == BEMaterialHelper.iafLightningDragonboneMaterial() || material == BEMaterialHelper.iafLightningDragonsteelMaterial()) {
            target.world.spawnEntity(new EntityDragonLightningBolt(target.world, target.posX, target.posY, target.posZ, attacker, target));
            if (!IsImmune.toDragonLightning(target)) {
                event.setAmount(event.getAmount() + (float) IceAndFire.CONFIG.dragonAttackDamageLightning);
            }
        }
    }
}
