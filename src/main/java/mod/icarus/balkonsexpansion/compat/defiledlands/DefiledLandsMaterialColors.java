package mod.icarus.balkonsexpansion.compat.defiledlands;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import lykrast.defiledlands.common.init.ModItems;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class DefiledLandsMaterialColors {
    public static final int MATERIAL_UMBRIUM = ModItems.materialUmbrium.ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_UMBRIUM};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == ModItems.materialUmbrium)
                            return MATERIAL_UMBRIUM;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where MATERIAL_UMBRIUM value is between 0 and 1.
                if (i == MATERIAL_UMBRIUM) return new float[]{0.549F, 0.086F, 0.678F};

                return null;
            }
        });
    }
}
