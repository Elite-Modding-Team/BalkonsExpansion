package mod.icarus.balkonsexpansion.compat.thaumcraft;

import mod.icarus.balkonsexpansion.BEMaterialEffectHelper;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import thaumcraft.api.ThaumcraftMaterials;

public class ThaumcraftMaterialEffects {
    public static void registerMaterialEffects() {
        // Void - 4 seconds of Weakness
        if (ThaumcraftMaterials.TOOLMAT_VOID != null) {
            BEMaterialEffectHelper.registerMaterialEffect(ThaumcraftMaterials.TOOLMAT_VOID,
                    new PotionEffect(MobEffects.WEAKNESS, 4 * 20, 0)
            );
        }
    }
}
