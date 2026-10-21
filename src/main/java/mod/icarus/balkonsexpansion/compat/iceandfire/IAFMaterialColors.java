package mod.icarus.balkonsexpansion.compat.iceandfire;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import mod.icarus.balkonsexpansion.BEMaterialHelper;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class IAFMaterialColors {
    public static final int MATERIAL_DRAGONBONE = BEMaterialHelper.iafDragonboneMaterial().ordinal();
    public static final int MATERIAL_FIRE_DRAGONBONE = BEMaterialHelper.iafFireDragonboneMaterial().ordinal();
    public static final int MATERIAL_FIRE_DRAGONSTEEL = BEMaterialHelper.iafFireDragonsteelMaterial().ordinal();
    public static final int MATERIAL_ICE_DRAGONBONE = BEMaterialHelper.iafIceDragonboneMaterial().ordinal();
    public static final int MATERIAL_ICE_DRAGONSTEEL = BEMaterialHelper.iafIceDragonsteelMaterial().ordinal();
    public static final int MATERIAL_SILVER = BEMaterialHelper.iafSilverMaterial().ordinal();

    public static void registerMaterialColors() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_DRAGONBONE, MATERIAL_FIRE_DRAGONBONE, MATERIAL_FIRE_DRAGONSTEEL, MATERIAL_ICE_DRAGONBONE, MATERIAL_ICE_DRAGONSTEEL,
                        MATERIAL_SILVER};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());

                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafDragonboneMaterial())
                            return MATERIAL_DRAGONBONE;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafFireDragonboneMaterial())
                            return MATERIAL_FIRE_DRAGONBONE;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafFireDragonsteelMaterial())
                            return MATERIAL_FIRE_DRAGONSTEEL;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafIceDragonboneMaterial())
                            return MATERIAL_ICE_DRAGONBONE;
                        if (weapon.getMeleeComponent().weaponMaterial == BEMaterialHelper.iafIceDragonsteelMaterial())
                            return MATERIAL_ICE_DRAGONSTEEL;
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
                if (i == MATERIAL_FIRE_DRAGONBONE) return new float[]{0.784F, 0.243F, 0.031F};
                if (i == MATERIAL_FIRE_DRAGONSTEEL) return new float[]{0.36F, 0.149F, 0.145F};
                if (i == MATERIAL_ICE_DRAGONBONE) return new float[]{0.64F, 0.925F, 0.91F};
                if (i == MATERIAL_ICE_DRAGONSTEEL) return new float[]{0.31F, 0.4F, 0.44F};
                if (i == MATERIAL_SILVER) return new float[]{0.992F, 0.992F, 0.992F};

                return null;
            }
        });
    }
}
