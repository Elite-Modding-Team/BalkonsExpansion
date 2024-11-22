package mod.icarus.balkonsexpansion.compat.projectred;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import mrtjp.projectred.ProjectRedExploration;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class ProjectRedMaterialColors {
    public static final int MATERIAL_PERIDOT = ProjectRedExploration.toolMaterialPeridot().ordinal();
    public static final int MATERIAL_RUBY = ProjectRedExploration.toolMaterialRuby().ordinal();
    public static final int MATERIAL_SAPPHIRE = ProjectRedExploration.toolMaterialSapphire().ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_PERIDOT, MATERIAL_RUBY, MATERIAL_SAPPHIRE};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == ProjectRedExploration.toolMaterialPeridot())
                            return MATERIAL_PERIDOT;
                        if (weapon.getMeleeComponent().weaponMaterial == ProjectRedExploration.toolMaterialRuby())
                            return MATERIAL_RUBY;
                        if (weapon.getMeleeComponent().weaponMaterial == ProjectRedExploration.toolMaterialSapphire())
                            return MATERIAL_SAPPHIRE;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_PERIDOT) return new float[]{0.239F, 0.624F, 0.039F};
                if (i == MATERIAL_RUBY) return new float[]{0.725F, 0.145F, 0.145F};
                if (i == MATERIAL_SAPPHIRE) return new float[]{0.196F, 0.18F, 0.694F};

                return null;
            }
        });
    }
}
