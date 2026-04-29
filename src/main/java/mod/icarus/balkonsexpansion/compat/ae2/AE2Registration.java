package mod.icarus.balkonsexpansion.compat.ae2;

import appeng.core.AEConfig;
import appeng.core.features.AEFeature;
import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BEItemBuilder;
import mod.icarus.balkonsexpansion.BERecipes;
import mod.icarus.balkonsexpansion.BERegistry;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

// Both materials unfortunately reuse vanilla's iron tool material.
public class AE2Registration {
    public static BEItemMelee battleaxeCertusQuartz;
    public static BEItemMelee battleaxeNetherQuartz;
    public static BEItemMelee boomerangCertusQuartz;
    public static BEItemMelee boomerangNetherQuartz;
    public static BEItemMusket bayonetCertusQuartz;
    public static BEItemMusket bayonetNetherQuartz;
    public static BEItemFlail flailCertusQuartz;
    public static BEItemFlail flailNetherQuartz;
    public static BEItemMelee halberdCertusQuartz;
    public static BEItemMelee halberdNetherQuartz;
    public static BEItemMelee katanaCertusQuartz;
    public static BEItemMelee katanaNetherQuartz;
    public static BEItemMelee knifeCertusQuartz;
    public static BEItemMelee knifeNetherQuartz;
    public static BEItemMelee spearCertusQuartz;
    public static BEItemMelee spearNetherQuartz;
    public static BEItemMelee warhammerCertusQuartz;
    public static BEItemMelee warhammerNetherQuartz;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.ae2_settings.AE2_CERTUS_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.CERTUS_QUARTZ_TOOLS)) {
            registry.register(spearCertusQuartz = BEItemBuilder.createCustomSpear("spear.certus_quartz", ToolMaterial.IRON));
            registry.register(halberdCertusQuartz = BEItemBuilder.createCustomHalberd("halberd.certus_quartz", ToolMaterial.IRON));
            registry.register(battleaxeCertusQuartz = BEItemBuilder.createCustomBattleaxe("battleaxe.certus_quartz", ToolMaterial.IRON));
            registry.register(knifeCertusQuartz = BEItemBuilder.createCustomKnife("knife.certus_quartz", ToolMaterial.IRON));
            registry.register(warhammerCertusQuartz = BEItemBuilder.createCustomWarhammer("warhammer.certus_quartz", ToolMaterial.IRON));
            registry.register(flailCertusQuartz = BEItemBuilder.createCustomFlail("flail.certus_quartz", ToolMaterial.IRON));
            registry.register(katanaCertusQuartz = BEItemBuilder.createCustomKatana("katana.certus_quartz", ToolMaterial.IRON));
            registry.register(boomerangCertusQuartz = BEItemBuilder.createCustomBoomerang("boomerang.certus_quartz", ToolMaterial.IRON));
            registry.register(bayonetCertusQuartz = BEItemBuilder.createCustomMusketBayonet("musketbayonet.certus_quartz", ToolMaterial.IRON, knifeCertusQuartz));
        }

        if (BEConfig.ae2_settings.AE2_NETHER_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.NETHER_QUARTZ_TOOLS)) {
            registry.register(spearNetherQuartz = BEItemBuilder.createCustomSpear("spear.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(halberdNetherQuartz = BEItemBuilder.createCustomHalberd("halberd.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(battleaxeNetherQuartz = BEItemBuilder.createCustomBattleaxe("battleaxe.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(knifeNetherQuartz = BEItemBuilder.createCustomKnife("knife.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(warhammerNetherQuartz = BEItemBuilder.createCustomWarhammer("warhammer.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(flailNetherQuartz = BEItemBuilder.createCustomFlail("flail.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(katanaNetherQuartz = BEItemBuilder.createCustomKatana("katana.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(boomerangNetherQuartz = BEItemBuilder.createCustomBoomerang("boomerang.nether_quartz.ae2", ToolMaterial.IRON));
            registry.register(bayonetNetherQuartz = BEItemBuilder.createCustomMusketBayonet("musketbayonet.nether_quartz.ae2", ToolMaterial.IRON, knifeNetherQuartz));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        ResourceLocation defaultGroup = new ResourceLocation("");
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.ae2_settings.AE2_CERTUS_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.CERTUS_QUARTZ_TOOLS)) {
            registry.register(BERecipes.registerBattleaxeRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", battleaxeCertusQuartz));
            registry.register(BERecipes.registerBoomerangRecipe(defaultGroup, "crystalCertusQuartz", "plankWood", boomerangCertusQuartz));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeCertusQuartz, bayonetCertusQuartz));
            registry.register(BERecipes.registerFlailRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", "string", flailCertusQuartz));
            registry.register(BERecipes.registerHalberdRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", halberdCertusQuartz));
            registry.register(BERecipes.registerKatanaRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", katanaCertusQuartz));
            registry.register(BERecipes.registerKnifeRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", knifeCertusQuartz));
            registry.register(BERecipes.registerKnifeAltRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", knifeCertusQuartz));
            registry.register(BERecipes.registerSpearRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", spearCertusQuartz));
            registry.register(BERecipes.registerWarhammerRecipe(defaultGroup, "crystalCertusQuartz", "stickWood", warhammerCertusQuartz));
        }

        if (BEConfig.ae2_settings.AE2_NETHER_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.NETHER_QUARTZ_TOOLS)) {
            registry.register(BERecipes.registerBattleaxeRecipe(defaultGroup, "gemQuartz", "stickWood", battleaxeNetherQuartz));
            registry.register(BERecipes.registerBoomerangRecipe(defaultGroup, "gemQuartz", "plankWood", boomerangNetherQuartz));
            registry.register(BERecipes.registerBayonetRecipe(defaultGroup, knifeNetherQuartz, bayonetNetherQuartz));
            registry.register(BERecipes.registerFlailRecipe(defaultGroup, "gemQuartz", "stickWood", "string", flailNetherQuartz));
            registry.register(BERecipes.registerHalberdRecipe(defaultGroup, "gemQuartz", "stickWood", halberdNetherQuartz));
            registry.register(BERecipes.registerKatanaRecipe(defaultGroup, "gemQuartz", "stickWood", katanaNetherQuartz));
            registry.register(BERecipes.registerKnifeRecipe(defaultGroup, "gemQuartz", "stickWood", knifeNetherQuartz));
            registry.register(BERecipes.registerKnifeAltRecipe(defaultGroup, "gemQuartz", "stickWood", knifeNetherQuartz));
            registry.register(BERecipes.registerSpearRecipe(defaultGroup, "gemQuartz", "stickWood", spearNetherQuartz));
            registry.register(BERecipes.registerWarhammerRecipe(defaultGroup, "gemQuartz", "stickWood", warhammerNetherQuartz));
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.ae2_settings.AE2_CERTUS_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.CERTUS_QUARTZ_TOOLS)) {
            BERegistry.registerWeaponItemModel(battleaxeCertusQuartz);
            BERegistry.registerWeaponItemModel(boomerangCertusQuartz);
            BERegistry.registerWeaponItemModel(bayonetCertusQuartz);
            BERegistry.registerWeaponItemModel(flailCertusQuartz);
            BERegistry.registerWeaponItemModel(halberdCertusQuartz);
            BERegistry.registerWeaponItemModel(katanaCertusQuartz);
            BERegistry.registerWeaponItemModel(knifeCertusQuartz);
            BERegistry.registerWeaponItemModel(spearCertusQuartz);
            BERegistry.registerWeaponItemModel(warhammerCertusQuartz);
        }

        if (BEConfig.ae2_settings.AE2_NETHER_QUARTZ_MATERIAL && AEConfig.instance().isFeatureEnabled(AEFeature.NETHER_QUARTZ_TOOLS)) {
            BERegistry.registerWeaponItemModel(battleaxeNetherQuartz);
            BERegistry.registerWeaponItemModel(boomerangNetherQuartz);
            BERegistry.registerWeaponItemModel(bayonetNetherQuartz);
            BERegistry.registerWeaponItemModel(flailNetherQuartz);
            BERegistry.registerWeaponItemModel(halberdNetherQuartz);
            BERegistry.registerWeaponItemModel(katanaNetherQuartz);
            BERegistry.registerWeaponItemModel(knifeNetherQuartz);
            BERegistry.registerWeaponItemModel(spearNetherQuartz);
            BERegistry.registerWeaponItemModel(warhammerNetherQuartz);
        }
    }
}
