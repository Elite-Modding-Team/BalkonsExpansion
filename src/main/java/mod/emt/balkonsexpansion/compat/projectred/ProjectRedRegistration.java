package mod.emt.balkonsexpansion.compat.projectred;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import mrtjp.projectred.ProjectRedExploration;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ProjectRedRegistration {
    public static ItemMelee battleaxePeridot;
    public static ItemMelee battleaxeRuby;
    public static ItemMelee battleaxeSapphire;
    public static ItemMelee boomerangPeridot;
    public static ItemMelee boomerangRuby;
    public static ItemMelee boomerangSapphire;
    public static ItemMusket bayonetPeridot;
    public static ItemMusket bayonetRuby;
    public static ItemMusket bayonetSapphire;
    public static ItemFlail flailPeridot;
    public static ItemFlail flailRuby;
    public static ItemFlail flailSapphire;
    public static ItemMelee halberdPeridot;
    public static ItemMelee halberdRuby;
    public static ItemMelee halberdSapphire;
    public static ItemMelee katanaPeridot;
    public static ItemMelee katanaRuby;
    public static ItemMelee katanaSapphire;
    public static ItemMelee knifePeridot;
    public static ItemMelee knifeRuby;
    public static ItemMelee knifeSapphire;
    public static ItemMelee spearPeridot;
    public static ItemMelee spearRuby;
    public static ItemMelee spearSapphire;
    public static ItemMelee warhammerPeridot;
    public static ItemMelee warhammerRuby;
    public static ItemMelee warhammerSapphire;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.project_red_settings.PR_RUBY_MATERIAL) {
            registry.register(spearRuby = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(halberdRuby = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(battleaxeRuby = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(knifeRuby = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(warhammerRuby = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(flailRuby = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(katanaRuby = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(boomerangRuby = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(bayonetRuby = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.ruby.pr", ProjectRedExploration.toolMaterialRuby(), knifeRuby));
        }

        if (BEConfig.project_red_settings.PR_SAPPHIRE_MATERIAL) {
            registry.register(spearSapphire = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(halberdSapphire = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(battleaxeSapphire = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(knifeSapphire = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(warhammerSapphire = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(flailSapphire = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(katanaSapphire = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(boomerangSapphire = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(bayonetSapphire = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.sapphire.pr", ProjectRedExploration.toolMaterialSapphire(), knifeSapphire));
        }

        if (BEConfig.project_red_settings.PR_PERIDOT_MATERIAL) {
            registry.register(spearPeridot = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(halberdPeridot = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(battleaxePeridot = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(knifePeridot = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(warhammerPeridot = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(flailPeridot = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(katanaPeridot = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(boomerangPeridot = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(bayonetPeridot = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.peridot.pr", ProjectRedExploration.toolMaterialPeridot(), knifePeridot));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.project_red_settings.PR_PERIDOT_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("gemPeridot", "stickWood", battleaxePeridot));
            registry.register(BERecipes.registerBoomerangRecipe("gemPeridot", "plankWood", boomerangPeridot));
            registry.register(BERecipes.registerBayonetRecipe(knifePeridot, bayonetPeridot));
            registry.register(BERecipes.registerFlailRecipe("gemPeridot", "stickWood", "string", flailPeridot));
            registry.register(BERecipes.registerHalberdRecipe("gemPeridot", "stickWood", halberdPeridot));
            registry.register(BERecipes.registerKatanaRecipe("gemPeridot", "stickWood", katanaPeridot));
            registry.register(BERecipes.registerKnifeRecipe("gemPeridot", "stickWood", knifePeridot));
            registry.register(BERecipes.registerKnifeAltRecipe("gemPeridot", "stickWood", knifePeridot));
            registry.register(BERecipes.registerSpearRecipe("gemPeridot", "stickWood", spearPeridot));
            registry.register(BERecipes.registerWarhammerRecipe("gemPeridot", "stickWood", warhammerPeridot));
        }

        if (BEConfig.project_red_settings.PR_RUBY_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("gemRuby", "stickWood", battleaxeRuby));
            registry.register(BERecipes.registerBoomerangRecipe("gemRuby", "plankWood", boomerangRuby));
            registry.register(BERecipes.registerBayonetRecipe(knifeRuby, bayonetRuby));
            registry.register(BERecipes.registerFlailRecipe("gemRuby", "stickWood", "string", flailRuby));
            registry.register(BERecipes.registerHalberdRecipe("gemRuby", "stickWood", halberdRuby));
            registry.register(BERecipes.registerKatanaRecipe("gemRuby", "stickWood", katanaRuby));
            registry.register(BERecipes.registerKnifeRecipe("gemRuby", "stickWood", knifeRuby));
            registry.register(BERecipes.registerKnifeAltRecipe("gemRuby", "stickWood", knifeRuby));
            registry.register(BERecipes.registerSpearRecipe("gemRuby", "stickWood", spearRuby));
            registry.register(BERecipes.registerWarhammerRecipe("gemRuby", "stickWood", warhammerRuby));
        }

        if (BEConfig.project_red_settings.PR_SAPPHIRE_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("gemSapphire", "stickWood", battleaxeSapphire));
            registry.register(BERecipes.registerBoomerangRecipe("gemSapphire", "plankWood", boomerangSapphire));
            registry.register(BERecipes.registerBayonetRecipe(knifeSapphire, bayonetSapphire));
            registry.register(BERecipes.registerFlailRecipe("gemSapphire", "stickWood", "string", flailSapphire));
            registry.register(BERecipes.registerHalberdRecipe("gemSapphire", "stickWood", halberdSapphire));
            registry.register(BERecipes.registerKatanaRecipe("gemSapphire", "stickWood", katanaSapphire));
            registry.register(BERecipes.registerKnifeRecipe("gemSapphire", "stickWood", knifeSapphire));
            registry.register(BERecipes.registerKnifeAltRecipe("gemSapphire", "stickWood", knifeSapphire));
            registry.register(BERecipes.registerSpearRecipe("gemSapphire", "stickWood", spearSapphire));
            registry.register(BERecipes.registerWarhammerRecipe("gemSapphire", "stickWood", warhammerSapphire));
        }

        // Project Red tools have no smelting recipes so none needs to be added.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.project_red_settings.PR_PERIDOT_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxePeridot);
            BERegistry.registerWeaponItemModel(boomerangPeridot);
            BERegistry.registerWeaponItemModel(bayonetPeridot);
            BERegistry.registerWeaponItemModel(flailPeridot);
            BERegistry.registerWeaponItemModel(halberdPeridot);
            BERegistry.registerWeaponItemModel(katanaPeridot);
            BERegistry.registerWeaponItemModel(knifePeridot);
            BERegistry.registerWeaponItemModel(spearPeridot);
            BERegistry.registerWeaponItemModel(warhammerPeridot);
        }

        if (BEConfig.project_red_settings.PR_RUBY_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeRuby);
            BERegistry.registerWeaponItemModel(boomerangRuby);
            BERegistry.registerWeaponItemModel(bayonetRuby);
            BERegistry.registerWeaponItemModel(flailRuby);
            BERegistry.registerWeaponItemModel(halberdRuby);
            BERegistry.registerWeaponItemModel(katanaRuby);
            BERegistry.registerWeaponItemModel(knifeRuby);
            BERegistry.registerWeaponItemModel(spearRuby);
            BERegistry.registerWeaponItemModel(warhammerRuby);
        }

        if (BEConfig.project_red_settings.PR_SAPPHIRE_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeSapphire);
            BERegistry.registerWeaponItemModel(boomerangSapphire);
            BERegistry.registerWeaponItemModel(bayonetSapphire);
            BERegistry.registerWeaponItemModel(flailSapphire);
            BERegistry.registerWeaponItemModel(halberdSapphire);
            BERegistry.registerWeaponItemModel(katanaSapphire);
            BERegistry.registerWeaponItemModel(knifeSapphire);
            BERegistry.registerWeaponItemModel(spearSapphire);
            BERegistry.registerWeaponItemModel(warhammerSapphire);
        }
    }
}
