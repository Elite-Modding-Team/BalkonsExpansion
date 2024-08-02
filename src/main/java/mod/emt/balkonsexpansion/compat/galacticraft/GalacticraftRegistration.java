package mod.emt.balkonsexpansion.compat.galacticraft;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
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
    public static ItemMelee battleaxeDesh;
    public static ItemMelee boomerangDesh;
    public static ItemMusket bayonetDesh;
    public static ItemFlail flailDesh;
    public static ItemMelee halberdDesh;
    public static ItemMelee katanaDesh;
    public static ItemMelee knifeDesh;
    public static ItemMelee spearDesh;
    public static ItemMelee warhammerDesh;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(spearDesh = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.desh", MarsItems.TOOLDESH));
        registry.register(halberdDesh = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.desh", MarsItems.TOOLDESH));
        registry.register(battleaxeDesh = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.desh", MarsItems.TOOLDESH));
        registry.register(knifeDesh = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.desh", MarsItems.TOOLDESH));
        registry.register(warhammerDesh = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.desh", MarsItems.TOOLDESH));
        registry.register(flailDesh = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.desh", MarsItems.TOOLDESH));
        registry.register(katanaDesh = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.desh", MarsItems.TOOLDESH));
        registry.register(boomerangDesh = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.desh", MarsItems.TOOLDESH));
        registry.register(bayonetDesh = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.desh", MarsItems.TOOLDESH, knifeDesh));
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        ModelLoader.setCustomModelResourceLocation(battleaxeDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, battleaxeDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(boomerangDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, boomerangDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(bayonetDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, bayonetDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(flailDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, flailDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(halberdDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, halberdDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(katanaDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, katanaDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(knifeDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, knifeDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(spearDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, spearDesh.getTranslationKey().substring(5)), "inventory"));
        ModelLoader.setCustomModelResourceLocation(warhammerDesh, 0, new ModelResourceLocation(new ResourceLocation(BalkonsExpansion.MOD_ID, warhammerDesh.getTranslationKey().substring(5)), "inventory"));
    }
}
