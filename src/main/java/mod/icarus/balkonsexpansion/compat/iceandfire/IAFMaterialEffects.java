package mod.icarus.balkonsexpansion.compat.iceandfire;

import com.github.alexthe666.iceandfire.entity.EntityFireDragon;
import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import mod.icarus.balkonsexpansion.BEMaterialEffectHelper;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;

// TODO: Add knockback to elemental dragon bone materials
public class IAFMaterialEffects {
    public static void registerMaterialEffects() {
        // Flamed Dragon Bone - +8 damage against Ice Dragons and ignites targets for 5 seconds
        if (BEMaterialHelper.iafFireDragonboneMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafFireDragonboneMaterial(),
                    8.0F, EntityIceDragon.class
            );
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafFireDragonboneMaterial(), 5);
        }

        // Fire Dragonsteel - Ignites targets for 15 seconds
        if (BEMaterialHelper.iafFireDragonsteelMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafFireDragonsteelMaterial(), 15);
        }

        // Iced Dragon Bone - +8 damage against Fire Dragons, applies Mining Fatigue III and Slowness III for 5 seconds
        if (BEMaterialHelper.iafIceDragonboneMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafIceDragonboneMaterial(),
                    8.0F, EntityFireDragon.class
            );
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafIceDragonboneMaterial(), new PotionEffect(MobEffects.MINING_FATIGUE, 5 * 20, 2));
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafIceDragonboneMaterial(), new PotionEffect(MobEffects.SLOWNESS, 5 * 20, 2));
        }

        // Ice Dragonsteel - Applies Slowness III for 15 seconds
        if (BEMaterialHelper.iafIceDragonsteelMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafIceDragonsteelMaterial(), new PotionEffect(MobEffects.SLOWNESS, 15 * 20, 2));
        }

        // Lightning Dragon Bone - +4 damage against Fire Dragons and Ice Dragons, strikes targets with lightning
        if (BEMaterialHelper.iafLightningDragonboneMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafLightningDragonboneMaterial(),
                    4.0F, EntityFireDragon.class
            );
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafLightningDragonboneMaterial(),
                    4.0F, EntityIceDragon.class
            );
        }

        // Silver - +2 damage against undead
        if (BEMaterialHelper.iafSilverMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafSilverMaterial(),
                    2.0F, EnumCreatureAttribute.UNDEAD
            );
        }
    }
}
