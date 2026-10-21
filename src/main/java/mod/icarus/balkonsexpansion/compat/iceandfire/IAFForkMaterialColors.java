package mod.icarus.balkonsexpansion.compat.iceandfire;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class IAFForkMaterialColors {
    public static final int MATERIAL_COPPER = BEMaterialHelper.iafCopperMaterial().ordinal();
    public static final int MATERIAL_LIGHTNING_DRAGONBONE = BEMaterialHelper.iafLightningDragonboneMaterial().ordinal();
    public static final int MATERIAL_LIGHTNING_DRAGONSTEEL = BEMaterialHelper.iafLightningDragonsteelMaterial().ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_COPPER, MATERIAL_LIGHTNING_DRAGONBONE, MATERIAL_LIGHTNING_DRAGONSTEEL};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafCopperMaterial())
                            return MATERIAL_COPPER;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafLightningDragonboneMaterial())
                            return MATERIAL_LIGHTNING_DRAGONBONE;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafLightningDragonsteelMaterial())
                            return MATERIAL_LIGHTNING_DRAGONSTEEL;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_COPPER) return new float[]{0.72F, 0.475F, 0.34F};
                if (i == MATERIAL_LIGHTNING_DRAGONBONE) return new float[]{0.718F, 0.114F, 0.84F};
                if (i == MATERIAL_LIGHTNING_DRAGONSTEEL) return new float[]{0.2F, 0.11F, 0.54F};
                return null;
            }
        });
    }
}
