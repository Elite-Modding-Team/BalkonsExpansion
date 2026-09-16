package mod.icarus.balkonsexpansion;

import net.minecraft.item.Item;

// Sure do love multiple versions and forks of the same mod!
public class BEMaterialHelper {
    public static Item.ToolMaterial iafCopperMaterial() {
        return Item.ToolMaterial.valueOf("Copper");
    }

    public static Item.ToolMaterial iafSilverMaterial() {
        return Item.ToolMaterial.valueOf("Silver");
    }

    public static Item.ToolMaterial ic2ExperimentalBronzeMaterial() {
        return Item.ToolMaterial.valueOf("IC2_BRONZE");
    }
}
