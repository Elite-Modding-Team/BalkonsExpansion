package mod.icarus.balkonsexpansion.compat.mistyworld;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.item.ItemStack;
import ru.liahim.mist.init.ModItems;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class MistyWorldMaterialColors {
    public static final int MATERIAL_NIOBIUM = ModItems.NIOBIUM_TOOLS.ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_NIOBIUM};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == ModItems.NIOBIUM_TOOLS)
                            return MATERIAL_NIOBIUM;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where MATERIAL_UMBRIUM value is between 0 and 1.
                if (i == MATERIAL_NIOBIUM) return new float[]{0.702F, 0.722F, 0.812F};

                return null;
            }
        });
    }
}
