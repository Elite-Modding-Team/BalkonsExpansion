package mod.icarus.balkonsexpansion.compat.iceandfire;

import com.github.alexthe666.iceandfire.entity.EntityIceDragon;
import mod.icarus.balkonsexpansion.BEMaterialEffectHelper;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.entity.EnumCreatureAttribute;

// TODO: Add knockback to elemental dragon bone materials
public class IAFMaterialEffects {
    public static void registerMaterialEffects() {
        // Flamed Dragon Bone - +8 damage against ice dragons and ignites targets for 5 seconds
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

        // Silver - +2 damage against undead
        if (BEMaterialHelper.iafSilverMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafSilverMaterial(),
                    2.0F, EnumCreatureAttribute.UNDEAD
            );
        }
    }
}
