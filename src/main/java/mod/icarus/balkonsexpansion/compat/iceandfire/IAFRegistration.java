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
    public static BEItemMelee battleaxeSilver;
    public static BEItemMelee boomerangSilver;
    public static BEItemMusket bayonetSilver;
    public static BEItemFlail flailSilver;
    public static BEItemMelee halberdSilver;
    public static BEItemMelee katanaSilver;
    public static BEItemMelee knifeSilver;
    public static BEItemMelee spearSilver;
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
    }
}
