package mod.icarus.balkonsexpansion;

import mod.icarus.balkonsexpansion.BalkonsExpansion;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class BERegistry {
    // Used to make registering item models for weapons less painful.
    public static void registerWeaponItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, item.getTranslationKey().substring(5)), "inventory"));
    }
}
