package mod.emt.balkonsexpansion.compat.galacticraft;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemMelee;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class GalacticraftRegistration {
    public static ItemMelee halberdDesh;
    public static ItemMelee spearDesh;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(halberdDesh = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.desh", MarsItems.TOOLDESH));
        registry.register(spearDesh = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.desh", MarsItems.TOOLDESH));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        ModelLoader.setCustomModelResourceLocation(halberdDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, halberdDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(spearDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, spearDesh.getTranslationKey().substring(5)), "inventory"));
    }
}
