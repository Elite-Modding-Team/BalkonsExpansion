package mod.icarus.balkonsexpansion.compat.iceandfire;

import mod.icarus.balkonsexpansion.*;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

// TODO: Add hit effects to Ice and Fire materials, RotN Edition hit effects might also be different
// Copper, Lightning Dragonbone, and Lightning Dragonsteel are exclusive to the RotN fork
public class IAFRegistration {
    public static BEItemMelee battleaxeCopper;
    public static BEItemMelee battleaxeSilver;
    public static BEItemMelee boomerangCopper;
    public static BEItemMelee boomerangSilver;
    public static BEItemMusket bayonetCopper;
    public static BEItemMusket bayonetSilver;
    public static BEItemFlail flailCopper;
    public static BEItemFlail flailSilver;
    public static BEItemMelee halberdCopper;
    public static BEItemMelee halberdSilver;
    public static BEItemMelee katanaCopper;
    public static BEItemMelee katanaSilver;
    public static BEItemMelee knifeCopper;
    public static BEItemMelee knifeSilver;
    public static BEItemMelee spearCopper;
    public static BEItemMelee spearSilver;
    public static BEItemMelee warhammerCopper;
    public static BEItemMelee warhammerSilver;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.iaf_settings.IAF_SILVER_MATERIAL) {
            registry.register(spearSilver = BEItemBuilder.createCustomSpear("spear.silver.iaf", BEMaterialHelper.iafSilverMaterial(), -0.1F, 1.0F));
            registry.register(halberdSilver = BEItemBuilder.createCustomHalberd("halberd.silver.iaf", BEMaterialHelper.iafSilverMaterial(), 0.45F, 1.0F));
            registry.register(battleaxeSilver = BEItemBuilder.createCustomBattleaxe("battleaxe.silver.iaf", BEMaterialHelper.iafSilverMaterial(), 0.3F, 1.0F));
            registry.register(knifeSilver = BEItemBuilder.createCustomKnife("knife.silver.iaf", BEMaterialHelper.iafSilverMaterial(), -0.1F));
            registry.register(warhammerSilver = BEItemBuilder.createCustomWarhammer("warhammer.silver.iaf", BEMaterialHelper.iafSilverMaterial(), 0.6F));
            registry.register(flailSilver = BEItemBuilder.createCustomFlail("flail.silver.iaf", BEMaterialHelper.iafSilverMaterial()));
            registry.register(katanaSilver = BEItemBuilder.createCustomKatana("katana.silver.iaf", BEMaterialHelper.iafSilverMaterial()));
            registry.register(boomerangSilver = BEItemBuilder.createCustomBoomerang("boomerang.silver.iaf", BEMaterialHelper.iafSilverMaterial(), 0.15F));
            registry.register(bayonetSilver = BEItemBuilder.createCustomMusketBayonet("musketbayonet.silver.iaf", BEMaterialHelper.iafSilverMaterial(), knifeSilver, -0.1F));
        }

        if (BEConfig.iaf_settings.IAF_COPPER_MATERIAL && BEForkChecker.isIAFRotNEdition()) {
            registry.register(spearCopper = BEItemBuilder.createCustomSpear("spear.copper.iaf", BEMaterialHelper.iafCopperMaterial(), -0.2F, 1.0F));
            registry.register(halberdCopper = BEItemBuilder.createCustomHalberd("halberd.copper.iaf", BEMaterialHelper.iafCopperMaterial(), 0.2F, 1.0F));
            registry.register(battleaxeCopper = BEItemBuilder.createCustomBattleaxe("battleaxe.copper.iaf", BEMaterialHelper.iafCopperMaterial(), 0.1F, 1.0F));
            registry.register(knifeCopper = BEItemBuilder.createCustomKnife("knife.copper.iaf", BEMaterialHelper.iafCopperMaterial(), -0.2F));
            registry.register(warhammerCopper = BEItemBuilder.createCustomWarhammer("warhammer.copper.iaf", BEMaterialHelper.iafCopperMaterial(), 0.3F));
            registry.register(flailCopper = BEItemBuilder.createCustomFlail("flail.copper.iaf", BEMaterialHelper.iafCopperMaterial()));
            registry.register(katanaCopper = BEItemBuilder.createCustomKatana("katana.copper.iaf", BEMaterialHelper.iafCopperMaterial()));
            registry.register(boomerangCopper = BEItemBuilder.createCustomBoomerang("boomerang.copper.iaf", BEMaterialHelper.iafCopperMaterial(), 0.0F));
            registry.register(bayonetCopper = BEItemBuilder.createCustomMusketBayonet("musketbayonet.copper.iaf", BEMaterialHelper.iafCopperMaterial(), knifeCopper, -0.2F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ResourceLocation defaultGroup = new ResourceLocation("");
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.iaf_settings.IAF_SILVER_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe(defaultGroup, "ingotSilver", "stickWood", battleaxeSilver));
            registry.register(BERecipes.registerBoomerangRecipe(defaultGroup, "ingotSilver", "plankWood", boomerangSilver));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeSilver, bayonetSilver));
            registry.register(BERecipes.registerFlailRecipe(defaultGroup, "ingotSilver", "stickWood", "string", flailSilver));
            registry.register(BERecipes.registerHalberdRecipe(defaultGroup, "ingotSilver", "stickWood", halberdSilver));
            registry.register(BERecipes.registerKatanaRecipe(defaultGroup, "ingotSilver", "stickWood", katanaSilver));
            registry.register(BERecipes.registerKnifeRecipe(defaultGroup, "ingotSilver", "stickWood", knifeSilver));
            registry.register(BERecipes.registerKnifeAltRecipe(defaultGroup, "ingotSilver", "stickWood", knifeSilver));
            registry.register(BERecipes.registerSpearRecipe(defaultGroup, "ingotSilver", "stickWood", spearSilver));
            registry.register(BERecipes.registerWarhammerRecipe(defaultGroup, "ingotSilver", "stickWood", warhammerSilver));
        }

        if (BEConfig.iaf_settings.IAF_COPPER_MATERIAL && BEForkChecker.isIAFRotNEdition()) {
            registry.register(BERecipes.registerBattleaxeRecipe(defaultGroup, "ingotCopper", "stickWood", battleaxeCopper));
            registry.register(BERecipes.registerBoomerangRecipe(defaultGroup, "ingotCopper", "plankWood", boomerangCopper));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeCopper, bayonetCopper));
            registry.register(BERecipes.registerFlailRecipe(defaultGroup, "ingotCopper", "stickWood", "string", flailCopper));
            registry.register(BERecipes.registerHalberdRecipe(defaultGroup, "ingotCopper", "stickWood", halberdCopper));
            registry.register(BERecipes.registerKatanaRecipe(defaultGroup, "ingotCopper", "stickWood", katanaCopper));
            registry.register(BERecipes.registerKnifeRecipe(defaultGroup, "ingotCopper", "stickWood", knifeCopper));
            registry.register(BERecipes.registerKnifeAltRecipe(defaultGroup, "ingotCopper", "stickWood", knifeCopper));
            registry.register(BERecipes.registerSpearRecipe(defaultGroup, "ingotCopper", "stickWood", spearCopper));
            registry.register(BERecipes.registerWarhammerRecipe(defaultGroup, "ingotCopper", "stickWood", warhammerCopper));
        }

        // Ice and Fire tools have no smelting recipes so support isn't needed.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.iaf_settings.IAF_SILVER_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeSilver);
            BERegistry.registerWeaponItemModel(boomerangSilver);
            BERegistry.registerWeaponItemModel(bayonetSilver);
            BERegistry.registerWeaponItemModel(flailSilver);
            BERegistry.registerWeaponItemModel(halberdSilver);
            BERegistry.registerWeaponItemModel(katanaSilver);
            BERegistry.registerWeaponItemModel(knifeSilver);
            BERegistry.registerWeaponItemModel(spearSilver);
            BERegistry.registerWeaponItemModel(warhammerSilver);
        }

        if (BEConfig.iaf_settings.IAF_COPPER_MATERIAL && BEForkChecker.isIAFRotNEdition()) {
            BERegistry.registerWeaponItemModel(battleaxeCopper);
            BERegistry.registerWeaponItemModel(boomerangCopper);
            BERegistry.registerWeaponItemModel(bayonetCopper);
            BERegistry.registerWeaponItemModel(flailCopper);
            BERegistry.registerWeaponItemModel(halberdCopper);
            BERegistry.registerWeaponItemModel(katanaCopper);
            BERegistry.registerWeaponItemModel(knifeCopper);
            BERegistry.registerWeaponItemModel(spearCopper);
            BERegistry.registerWeaponItemModel(warhammerCopper);
        }
    }
}
