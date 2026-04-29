package mod.icarus.balkonsexpansion.compat.thaumcraft;

import mod.icarus.balkonsexpansion.BEPotionMaterial;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import thaumcraft.api.ThaumcraftMaterials;

public class ThaumcraftPotionMaterials {
    public static void registerPotionMaterials() {
        if (ThaumcraftMaterials.TOOLMAT_VOID != null) {
            BEPotionMaterial.registerMaterialEffect(ThaumcraftMaterials.TOOLMAT_VOID,
                    new PotionEffect(MobEffects.WEAKNESS, 4 * 20, 0)
            );
        }
    }
}
