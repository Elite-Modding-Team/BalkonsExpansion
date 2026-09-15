package mod.icarus.balkonsexpansion.compat.iceandfire;

import mod.icarus.balkonsexpansion.BEMaterialEffectHelper;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.entity.EnumCreatureAttribute;

public class IAFMaterialEffects {
    public static void registerMaterialEffects() {
        // Silver - +2 damage against undead
        if (BEMaterialHelper.iafSilverMaterial() != null) {
            BEMaterialEffectHelper.registerMaterialEffect(BEMaterialHelper.iafSilverMaterial(),
                    2.0F, EnumCreatureAttribute.UNDEAD
            );
        }
    }
}
