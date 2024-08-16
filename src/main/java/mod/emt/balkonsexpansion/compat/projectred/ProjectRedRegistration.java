package mod.emt.balkonsexpansion.compat.projectred;

import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BEItemBuilder;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.item.BEItemFlail;
import mod.emt.balkonsexpansion.item.BEItemMelee;
import mod.emt.balkonsexpansion.item.BEItemMusket;
import mrtjp.projectred.ProjectRedExploration;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ProjectRedRegistration {
    public static BEItemMelee battleaxePeridot;
    public static BEItemMelee battleaxeRuby;
    public static BEItemMelee battleaxeSapphire;
    public static BEItemMelee boomerangPeridot;
    public static BEItemMelee boomerangRuby;
    public static BEItemMelee boomerangSapphire;
    public static BEItemMusket bayonetPeridot;
    public static BEItemMusket bayonetRuby;
    public static BEItemMusket bayonetSapphire;
    public static BEItemFlail flailPeridot;
    public static BEItemFlail flailRuby;
    public static BEItemFlail flailSapphire;
    public static BEItemMelee halberdPeridot;
    public static BEItemMelee halberdRuby;
    public static BEItemMelee halberdSapphire;
    public static BEItemMelee katanaPeridot;
    public static BEItemMelee katanaRuby;
    public static BEItemMelee katanaSapphire;
    public static BEItemMelee knifePeridot;
    public static BEItemMelee knifeRuby;
    public static BEItemMelee knifeSapphire;
    public static BEItemMelee spearPeridot;
    public static BEItemMelee spearRuby;
    public static BEItemMelee spearSapphire;
    public static BEItemMelee warhammerPeridot;
    public static BEItemMelee warhammerRuby;
    public static BEItemMelee warhammerSapphire;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.project_red_settings.PR_RUBY_MATERIAL) {
            registry.register(spearRuby = BEItemBuilder.createCustomSpear("spear.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(halberdRuby = BEItemBuilder.createCustomHalberd("halberd.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(battleaxeRuby = BEItemBuilder.createCustomBattleaxe("battleaxe.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(knifeRuby = BEItemBuilder.createCustomKnife("knife.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(warhammerRuby = BEItemBuilder.createCustomWarhammer("warhammer.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(flailRuby = BEItemBuilder.createCustomFlail("flail.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(katanaRuby = BEItemBuilder.createCustomKatana("katana.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(boomerangRuby = BEItemBuilder.createCustomBoomerang("boomerang.ruby.pr", ProjectRedExploration.toolMaterialRuby()));
            registry.register(bayonetRuby = BEItemBuilder.createCustomMusketBayonet("musketbayonet.ruby.pr", ProjectRedExploration.toolMaterialRuby(), knifeRuby));
        }

        if (BEConfig.project_red_settings.PR_SAPPHIRE_MATERIAL) {
            registry.register(spearSapphire = BEItemBuilder.createCustomSpear("spear.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(halberdSapphire = BEItemBuilder.createCustomHalberd("halberd.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(battleaxeSapphire = BEItemBuilder.createCustomBattleaxe("battleaxe.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(knifeSapphire = BEItemBuilder.createCustomKnife("knife.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(warhammerSapphire = BEItemBuilder.createCustomWarhammer("warhammer.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(flailSapphire = BEItemBuilder.createCustomFlail("flail.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(katanaSapphire = BEItemBuilder.createCustomKatana("katana.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(boomerangSapphire = BEItemBuilder.createCustomBoomerang("boomerang.sapphire.pr", ProjectRedExploration.toolMaterialSapphire()));
            registry.register(bayonetSapphire = BEItemBuilder.createCustomMusketBayonet("musketbayonet.sapphire.pr", ProjectRedExploration.toolMaterialSapphire(), knifeSapphire));
        }

        if (BEConfig.project_red_settings.PR_PERIDOT_MATERIAL) {
            registry.register(spearPeridot = BEItemBuilder.createCustomSpear("spear.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(halberdPeridot = BEItemBuilder.createCustomHalberd("halberd.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(battleaxePeridot = BEItemBuilder.createCustomBattleaxe("battleaxe.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(knifePeridot = BEItemBuilder.createCustomKnife("knife.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(warhammerPeridot = BEItemBuilder.createCustomWarhammer("warhammer.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(flailPeridot = BEItemBuilder.createCustomFlail("flail.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(katanaPeridot = BEItemBuilder.createCustomKatana("katana.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(boomerangPeridot = BEItemBuilder.createCustomBoomerang("boomerang.peridot.pr", ProjectRedExploration.toolMaterialPeridot()));
            registry.register(bayonetPeridot = BEItemBuilder.createCustomMusketBayonet("musketbayonet.peridot.pr", ProjectRedExploration.toolMaterialPeridot(), knifePeridot));
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
