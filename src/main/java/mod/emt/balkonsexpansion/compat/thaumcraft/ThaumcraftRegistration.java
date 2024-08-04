package mod.emt.balkonsexpansion.compat.thaumcraft;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import thaumcraft.api.ThaumcraftMaterials;
import thaumcraft.api.items.ItemsTC;

public class ThaumcraftRegistration {
    public static ItemMelee battleaxeThaumium;
    public static ItemMelee battleaxeVoid;
    public static ItemMelee boomerangThaumium;
    public static ItemMelee boomerangVoid;
    public static ItemMusket bayonetThaumium;
    public static ItemMusket bayonetVoid;
    public static ItemFlail flailThaumium;
    public static ItemFlail flailVoid;
    public static ItemMelee halberdThaumium;
    public static ItemMelee halberdVoid;
    public static ItemMelee katanaThaumium;
    public static ItemMelee katanaVoid;
    public static ItemMelee knifeThaumium;
    public static ItemMelee knifeVoid;
    public static ItemMelee spearThaumium;
    public static ItemMelee spearVoid;
    public static ItemMelee warhammerThaumium;
    public static ItemMelee warhammerVoid;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            registry.register(spearThaumium = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(halberdThaumium = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(battleaxeThaumium = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(knifeThaumium = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(warhammerThaumium = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(flailThaumium = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(katanaThaumium = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(boomerangThaumium = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM));
            registry.register(bayonetThaumium = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, knifeThaumium));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotThaumium", "stickWood", battleaxeThaumium));
            registry.register(BERecipes.registerBoomerangRecipe("ingotThaumium", "plankWood", boomerangThaumium));
            registry.register(BERecipes.registerBayonetRecipe(knifeThaumium, bayonetThaumium));
            registry.register(BERecipes.registerFlailRecipe("ingotThaumium", "stickWood", "string", flailThaumium));
            registry.register(BERecipes.registerHalberdRecipe("ingotThaumium", "stickWood", halberdThaumium));
            registry.register(BERecipes.registerKatanaRecipe("ingotThaumium", "stickWood", katanaThaumium));
            registry.register(BERecipes.registerKnifeRecipe("ingotThaumium", "stickWood", knifeThaumium));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotThaumium", "stickWood", knifeThaumium));
            registry.register(BERecipes.registerSpearRecipe("ingotThaumium", "stickWood", spearThaumium));
            registry.register(BERecipes.registerWarhammerRecipe("ingotThaumium", "stickWood", warhammerThaumium));

            GameRegistry.addSmelting(new ItemStack(battleaxeThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(boomerangThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(flailThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(halberdThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(katanaThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(knifeThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(spearThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(warhammerThaumium, 1, 32767), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeThaumium);
            BERegistry.registerWeaponItemModel(boomerangThaumium);
            BERegistry.registerWeaponItemModel(bayonetThaumium);
            BERegistry.registerWeaponItemModel(flailThaumium);
            BERegistry.registerWeaponItemModel(halberdThaumium);
            BERegistry.registerWeaponItemModel(katanaThaumium);
            BERegistry.registerWeaponItemModel(knifeThaumium);
            BERegistry.registerWeaponItemModel(spearThaumium);
            BERegistry.registerWeaponItemModel(warhammerThaumium);
        }
    }
}
