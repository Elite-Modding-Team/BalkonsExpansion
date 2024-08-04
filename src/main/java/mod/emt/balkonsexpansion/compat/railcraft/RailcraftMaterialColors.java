package mod.emt.balkonsexpansion.compat.railcraft;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import mods.railcraft.common.items.ItemMaterials;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class RailcraftMaterialColors {
    public static final int MATERIAL_STEEL = ItemMaterials.STEEL_TOOL.ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_STEEL};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == ItemMaterials.STEEL_TOOL)
                            return MATERIAL_STEEL;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_STEEL) return new float[]{0.357F, 0.357F, 0.357F};

                return null;
            }
        });
    }
}
