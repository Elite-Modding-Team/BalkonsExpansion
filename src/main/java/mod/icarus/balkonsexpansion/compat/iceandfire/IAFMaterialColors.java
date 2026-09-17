package mod.icarus.balkonsexpansion.compat.iceandfire;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class IAFMaterialColors {
    public static final int MATERIAL_DRAGONBONE = BEMaterialHelper.iafDragonboneMaterial().ordinal();
    public static final int MATERIAL_SILVER = BEMaterialHelper.iafSilverMaterial().ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_DRAGONBONE, MATERIAL_SILVER};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafDragonboneMaterial())
                            return MATERIAL_DRAGONBONE;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafSilverMaterial())
                            return MATERIAL_SILVER;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_DRAGONBONE) return new float[]{0.77F, 0.75F, 0.65F};
                if (i == MATERIAL_SILVER) return new float[]{0.992F, 0.992F, 0.992F};

                return null;
            }
        });
    }
}
