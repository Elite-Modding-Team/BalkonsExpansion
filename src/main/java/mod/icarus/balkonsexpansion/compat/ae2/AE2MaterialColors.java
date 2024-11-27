package mod.icarus.balkonsexpansion.compat.ae2;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class AE2MaterialColors {
    public static final int MATERIAL_CERTUS_QUARTZ = 2001;
    public static final int MATERIAL_NETHER_QUARTZ = 2002;

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_CERTUS_QUARTZ, MATERIAL_NETHER_QUARTZ};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    // Both materials unfortunately reuse vanilla's iron tool material.
                    // Detect by the specific tools instead.
                    if (weapon.getMeleeComponent() != null) {
                        if (itemStack.getItem().equals(AE2Registration.boomerangCertusQuartz) ||
                                itemStack.getItem().equals(AE2Registration.flailCertusQuartz) ||
                                itemStack.getItem().equals(AE2Registration.knifeCertusQuartz) ||
                                itemStack.getItem().equals(AE2Registration.spearCertusQuartz))
                            return MATERIAL_CERTUS_QUARTZ;
                        if (itemStack.getItem().equals(AE2Registration.boomerangNetherQuartz) ||
                                itemStack.getItem().equals(AE2Registration.flailNetherQuartz) ||
                                itemStack.getItem().equals(AE2Registration.knifeNetherQuartz) ||
                                itemStack.getItem().equals(AE2Registration.spearNetherQuartz))
                            return MATERIAL_NETHER_QUARTZ;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_CERTUS_QUARTZ) return new float[]{0.776F, 0.816F, 1.0F};
                if (i == MATERIAL_NETHER_QUARTZ) return new float[]{0.769F, 0.718F, 0.667F};

                return null;
            }
        });
    }
}
