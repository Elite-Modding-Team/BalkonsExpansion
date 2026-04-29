package mod.icarus.balkonsexpansion;

import ckathode.weaponmod.entity.projectile.EntityProjectile;
import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = BalkonsExpansion.MOD_ID)
public class BEPotionMaterial {
    private static final Map<Item.ToolMaterial, PotionEffect> REGISTRY = new HashMap<>();

    public static void registerMaterialEffect(Item.ToolMaterial material, PotionEffect effect) {
        if (material != null && effect != null) {
            REGISTRY.put(material, effect);
        }
    }

    // Applies effects when hitting mobs through melee or through the weapon's projectile (boomerangs, flails, etc)
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        DamageSource source = event.getSource();
        if (source == null) return;

        Entity immediate = source.getImmediateSource();
        Entity trueSource = source.getTrueSource();
        ItemStack stack = ItemStack.EMPTY;

        if (immediate instanceof EntityProjectile) {
            stack = ((EntityProjectile) immediate).getPickupItem();
        } else if (trueSource instanceof EntityLivingBase) {
            stack = ((EntityLivingBase) trueSource).getHeldItemMainhand();
        }

        if (stack == null || stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon)) return;

        IItemWeapon weapon = (IItemWeapon) stack.getItem();
        if (weapon.getMeleeComponent() == null || weapon.getMeleeComponent().weaponMaterial == null) return;

        Item.ToolMaterial mat = weapon.getMeleeComponent().weaponMaterial;
        PotionEffect registeredEffect = REGISTRY.get(mat);

        if (registeredEffect != null) {
            applyEffect(event.getEntityLiving(), registeredEffect);
        }
    }

    private static void applyEffect(EntityLivingBase target, PotionEffect effect) {
        if (target != null) {
            target.addPotionEffect(new PotionEffect(effect.getPotion(), effect.getDuration(), effect.getAmplifier()));
        }
    }
}
