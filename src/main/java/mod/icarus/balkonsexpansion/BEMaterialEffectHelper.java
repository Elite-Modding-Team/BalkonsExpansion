package mod.icarus.balkonsexpansion;

import ckathode.weaponmod.entity.projectile.EntityProjectile;
import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Applies effects or extra damage when hitting mobs through melee or through the weapon's projectile (boomerangs, flails, etc)
// Also has the ability to check for specific mobs or creature attributes to target against (e.g. undead or creepers)
@Mod.EventBusSubscriber(modid = BalkonsExpansion.MOD_ID)
public class BEMaterialEffectHelper {
    private static final Map<Item.ToolMaterial, List<MaterialEffect>> REGISTRY = new HashMap<>();

    public static class MaterialEffect {
        private final float extraDamage;
        private final EnumCreatureAttribute creatureAttribute;
        private final boolean invertCreatureAttribute;
        private final Class<?> targetClass;
        private final PotionEffect potionEffect;
        private final int fireSeconds;

        public MaterialEffect(float extraDamage, EnumCreatureAttribute creatureAttribute, boolean invertCreatureAttribute, Class<?> targetClass,
                              PotionEffect potionEffect, int fireSeconds) {
            this.extraDamage = extraDamage;
            this.creatureAttribute = creatureAttribute;
            this.invertCreatureAttribute = invertCreatureAttribute;
            this.targetClass = targetClass;
            this.potionEffect = potionEffect;
            this.fireSeconds = fireSeconds;
        }

        public boolean appliesTo(EntityLivingBase target) {
            if (creatureAttribute != null) {
                boolean matches = target.getCreatureAttribute() == creatureAttribute;
                if (invertCreatureAttribute == matches) {
                    return false;
                }
            }
            return targetClass == null || targetClass.isInstance(target);
        }

        public void apply(LivingHurtEvent event) {
            EntityLivingBase target = event.getEntityLiving();

            if (extraDamage != 0.0F) {
                event.setAmount(event.getAmount() + extraDamage);
            }

            if (potionEffect != null) {
                target.addPotionEffect(new PotionEffect(potionEffect.getPotion(), potionEffect.getDuration(), potionEffect.getAmplifier()));
            }

            if (fireSeconds > 0) {
                target.setFire(fireSeconds);
            }
        }
    }

    public static void registerMaterialEffect(Item.ToolMaterial material, float extraDamage, EnumCreatureAttribute creatureAttribute, boolean invertCreatureAttribute, Class<?> targetClass, PotionEffect potionEffect, int fireSeconds) {
        if (material == null) {
            return;
        }

        if (extraDamage == 0.0F && potionEffect == null && fireSeconds <= 0) {
            return;
        }

        List<MaterialEffect> effects = REGISTRY.computeIfAbsent(material, k -> new ArrayList<>());
        effects.add(new MaterialEffect(extraDamage, creatureAttribute, invertCreatureAttribute, targetClass, potionEffect, fireSeconds));
    }

    public static void registerMaterialEffect(Item.ToolMaterial material, float extraDamage, EnumCreatureAttribute creatureAttribute) {
        registerMaterialEffect(material, extraDamage, creatureAttribute, false, null, null, 0);
    }

    public static void registerMaterialEffect(Item.ToolMaterial material, float extraDamage, Class<?> targetClass) {
        registerMaterialEffect(material, extraDamage, null, false, targetClass, null, 0);
    }

    public static void registerMaterialEffect(Item.ToolMaterial material, PotionEffect potionEffect) {
        registerMaterialEffect(material, 0.0F, null, false, null, potionEffect, 0);
    }

    public static void registerMaterialEffect(Item.ToolMaterial material, int fireSeconds) {
        registerMaterialEffect(material, 0.0F, null, false, null, null, fireSeconds);
    }


    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        DamageSource source = event.getSource();
        if (source == null) {
            return;
        }

        Entity immediate = source.getImmediateSource();
        Entity trueSource = source.getTrueSource();
        ItemStack stack = ItemStack.EMPTY;

        if (immediate instanceof EntityProjectile) {
            stack = ((EntityProjectile) immediate).getPickupItem();
        } else if (trueSource instanceof EntityLivingBase) {
            stack = ((EntityLivingBase) trueSource).getHeldItemMainhand();
        }

        if (stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon)) {
            return;
        }

        IItemWeapon weapon = (IItemWeapon) stack.getItem();
        if (weapon.getMeleeComponent() == null || weapon.getMeleeComponent().weaponMaterial == null) {
            return;
        }

        Item.ToolMaterial material = weapon.getMeleeComponent().weaponMaterial;
        List<MaterialEffect> effects = REGISTRY.get(material);
        if (effects == null) {
            return;
        }

        EntityLivingBase target = event.getEntityLiving();
        for (MaterialEffect effect : effects) {
            if (effect.appliesTo(target)) {
                effect.apply(event);
            }
        }
    }
}
