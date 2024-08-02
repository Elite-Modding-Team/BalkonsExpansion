package mod.emt.balkonsexpansion.compat.galacticraft;

import ckathode.weaponmod.entity.projectile.ICustomProjectileMaterials;
import ckathode.weaponmod.entity.projectile.MaterialRegistry;
import ckathode.weaponmod.item.IItemWeapon;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import net.minecraft.item.ItemStack;

// Some entities of BWM: Legacy such as flails can change their color, which is what this is used for.
public class GalacticraftMaterialColors {
    public static final int MATERIAL_DESH = MarsItems.TOOLDESH.ordinal();
    public static final int MATERIAL_HEAVY_DUTY = GCItems.TOOL_STEEL.ordinal();
    public static final int MATERIAL_TITANIUM = AsteroidsItems.TOOL_TITANIUM.ordinal();

    public static void init() {
        MaterialRegistry.registerCustomProjectileMaterial(new ICustomProjectileMaterials() {
            @Override
            public int[] getAllMaterialIDs() {
                return new int[]{MATERIAL_DESH, MATERIAL_HEAVY_DUTY, MATERIAL_TITANIUM};
            }

            @Override
            public int getMaterialID(ItemStack itemStack) {
                if (itemStack != null && itemStack.getItem() instanceof IItemWeapon) {
                    IItemWeapon weapon = ((IItemWeapon) itemStack.getItem());
                    
                    if (weapon.getMeleeComponent() != null) {
                        if (weapon.getMeleeComponent().weaponMaterial == MarsItems.TOOLDESH) return MATERIAL_DESH;
                        if (weapon.getMeleeComponent().weaponMaterial == GCItems.TOOL_STEEL) return MATERIAL_HEAVY_DUTY;
                        if (weapon.getMeleeComponent().weaponMaterial == AsteroidsItems.TOOL_TITANIUM) return MATERIAL_TITANIUM;
                    }
                }

                return -1;
            }

            @Override
            public float[] getColorFromMaterialID(int i) {
                // The color for the given item tier must be returned as
                // {R,G,B}, where each value is between 0 and 1.
                if (i == MATERIAL_DESH) return new float[]{0.286F, 0.286F, 0.286F};
                if (i == MATERIAL_HEAVY_DUTY) return new float[]{0.369F, 0.412F, 0.412F};
                if (i == MATERIAL_TITANIUM) return new float[]{0.224F, 0.259F, 0.369F};
                
                return null;
            }
        });
    }
}
