package mod.icarus.balkonsexpansion.compat.thaumcraft;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftMaterials;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class ThaumcraftMaterialColors {
    public static final int MATERIAL_THAUMIUM = ThaumcraftMaterials.TOOLMAT_THAUMIUM.ordinal();
    public static final int MATERIAL_VOID = ThaumcraftMaterials.TOOLMAT_VOID.ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_THAUMIUM, MATERIAL_VOID};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == ThaumcraftMaterials.TOOLMAT_THAUMIUM)
                            return MATERIAL_THAUMIUM;
                        if (weapon.getMeleeComponent().weaponMaterial == ThaumcraftMaterials.TOOLMAT_VOID)
                            return MATERIAL_VOID;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_THAUMIUM) return new float[]{0.318F, 0.263F, 0.486F};
                if (i == MATERIAL_VOID) return new float[]{0.106F, 0.043F, 0.169F};

                return null;
            }
        });
    }
}