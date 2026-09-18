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
    public static BEItemMelee battleaxeDragonbone;
    public static BEItemMelee battleaxeFireDragonbone;
    public static BEItemMelee battleaxeSilver;
    public static BEItemMelee boomerangCopper;
    public static BEItemMelee boomerangDragonbone;
    public static BEItemMelee boomerangFireDragonbone;
    public static BEItemMelee boomerangSilver;
    public static BEItemMusket bayonetCopper;
    public static BEItemMusket bayonetDragonbone;
    public static BEItemMusket bayonetFireDragonbone;
    public static BEItemMusket bayonetSilver;
    public static BEItemFlail flailCopper;
    public static BEItemFlail flailDragonbone;
    public static BEItemFlail flailFireDragonbone;
    public static BEItemFlail flailSilver;
    public static BEItemMelee halberdCopper;
    public static BEItemMelee halberdDragonbone;
    public static BEItemMelee halberdFireDragonbone;
    public static BEItemMelee halberdSilver;
    public static BEItemMelee katanaCopper;
    public static BEItemMelee katanaDragonbone;
    public static BEItemMelee katanaFireDragonbone;
    public static BEItemMelee katanaSilver;
    public static BEItemMelee knifeCopper;
    public static BEItemMelee knifeDragonbone;
    public static BEItemMelee knifeFireDragonbone;
    public static BEItemMelee knifeSilver;
    public static BEItemMelee spearCopper;
    public static BEItemMelee spearDragonbone;
    public static BEItemMelee spearFireDragonbone;
    public static BEItemMelee spearSilver;
    public static BEItemMelee warhammerCopper;
    public static BEItemMelee warhammerDragonbone;
    public static BEItemMelee warhammerFireDragonbone;
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

        if (BEConfig.iaf_settings.IAF_DRAGONBONE_MATERIAL) {
            registry.register(spearDragonbone = BEItemBuilder.createCustomSpear("spear.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), -0.2F, 1.0F));
            registry.register(halberdDragonbone = BEItemBuilder.createCustomHalberd("halberd.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), 0.2F, 1.0F));
            registry.register(battleaxeDragonbone = BEItemBuilder.createCustomBattleaxe("battleaxe.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), 0.1F, 1.0F));
            registry.register(knifeDragonbone = BEItemBuilder.createCustomKnife("knife.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), -0.1F));
            registry.register(warhammerDragonbone = BEItemBuilder.createCustomWarhammer("warhammer.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), 0.3F));
            registry.register(flailDragonbone = BEItemBuilder.createCustomFlail("flail.dragonbone", BEMaterialHelper.iafDragonboneMaterial()));
            registry.register(katanaDragonbone = BEItemBuilder.createCustomKatana("katana.dragonbone", BEMaterialHelper.iafDragonboneMaterial()));
            registry.register(boomerangDragonbone = BEItemBuilder.createCustomBoomerang("boomerang.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), 0.0F));
            registry.register(bayonetDragonbone = BEItemBuilder.createCustomMusketBayonet("musketbayonet.dragonbone", BEMaterialHelper.iafDragonboneMaterial(), knifeDragonbone, -0.2F));
        }

        if (BEConfig.iaf_settings.IAF_FIRE_DRAGONBONE_MATERIAL) {
            registry.register(spearFireDragonbone = BEItemBuilder.createCustomSpear("spear.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), -0.2F, 1.0F));
            registry.register(halberdFireDragonbone = BEItemBuilder.createCustomHalberd("halberd.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), 0.2F, 1.0F));
            registry.register(battleaxeFireDragonbone = BEItemBuilder.createCustomBattleaxe("battleaxe.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), 0.1F, 1.0F));
            registry.register(knifeFireDragonbone = BEItemBuilder.createCustomKnife("knife.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), -0.1F));
            registry.register(warhammerFireDragonbone = BEItemBuilder.createCustomWarhammer("warhammer.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), 0.3F));
            registry.register(flailFireDragonbone = BEItemBuilder.createCustomFlail("flail.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial()));
            registry.register(katanaFireDragonbone = BEItemBuilder.createCustomKatana("katana.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial()));
            registry.register(boomerangFireDragonbone = BEItemBuilder.createCustomBoomerang("boomerang.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), 0.0F));
            registry.register(bayonetFireDragonbone = BEItemBuilder.createCustomMusketBayonet("musketbayonet.dragonbone.fire", BEMaterialHelper.iafFireDragonboneMaterial(), knifeFireDragonbone, -0.2F));
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

        if (BEConfig.iaf_settings.IAF_DRAGONBONE_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe(defaultGroup, "boneDragon", "boneWither", battleaxeDragonbone));
            registry.register(BERecipes.registerBoomerangRecipe(defaultGroup, "boneDragon", "boneWither", boomerangDragonbone));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeDragonbone, bayonetDragonbone));
            registry.register(BERecipes.registerFlailRecipe(defaultGroup, "boneDragon", "boneWither", "nuggetIron", flailDragonbone));
            registry.register(BERecipes.registerHalberdRecipe(defaultGroup, "boneDragon", "boneWither", halberdDragonbone));
            registry.register(BERecipes.registerKatanaRecipe(defaultGroup, "boneDragon", "boneWither", katanaDragonbone));
            registry.register(BERecipes.registerKnifeRecipe(defaultGroup, "boneDragon", "boneWither", knifeDragonbone));
            registry.register(BERecipes.registerKnifeAltRecipe(defaultGroup, "boneDragon", "boneWither", knifeDragonbone));
            registry.register(BERecipes.registerSpearRecipe(defaultGroup, "boneDragon", "boneWither", spearDragonbone));
            registry.register(BERecipes.registerWarhammerRecipe(defaultGroup, "boneDragon", "boneWither", warhammerDragonbone));
        }

        if (BEConfig.iaf_settings.IAF_FIRE_DRAGONBONE_MATERIAL) {
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, battleaxeDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), battleaxeFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, boomerangDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), boomerangFireDragonbone));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeFireDragonbone, bayonetFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, flailDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), flailFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, halberdDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), halberdFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, katanaDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), katanaFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, knifeDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), knifeFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, spearDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), spearFireDragonbone));
            registry.register(BERecipes.registerConversionRecipe(defaultGroup, warhammerDragonbone, Item.getByNameOrId("iceandfire:fire_dragon_blood"), warhammerFireDragonbone));
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

        if (BEConfig.iaf_settings.IAF_DRAGONBONE_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeDragonbone);
            BERegistry.registerWeaponItemModel(boomerangDragonbone);
            BERegistry.registerWeaponItemModel(bayonetDragonbone);
            BERegistry.registerWeaponItemModel(flailDragonbone);
            BERegistry.registerWeaponItemModel(halberdDragonbone);
            BERegistry.registerWeaponItemModel(katanaDragonbone);
            BERegistry.registerWeaponItemModel(knifeDragonbone);
            BERegistry.registerWeaponItemModel(spearDragonbone);
            BERegistry.registerWeaponItemModel(warhammerDragonbone);
        }

        if (BEConfig.iaf_settings.IAF_FIRE_DRAGONBONE_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeFireDragonbone);
            BERegistry.registerWeaponItemModel(boomerangFireDragonbone);
            BERegistry.registerWeaponItemModel(bayonetFireDragonbone);
            BERegistry.registerWeaponItemModel(flailFireDragonbone);
            BERegistry.registerWeaponItemModel(halberdFireDragonbone);
            BERegistry.registerWeaponItemModel(katanaFireDragonbone);
            BERegistry.registerWeaponItemModel(knifeFireDragonbone);
            BERegistry.registerWeaponItemModel(spearFireDragonbone);
            BERegistry.registerWeaponItemModel(warhammerFireDragonbone);
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
