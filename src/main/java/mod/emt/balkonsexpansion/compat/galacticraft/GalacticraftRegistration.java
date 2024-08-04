package mod.emt.balkonsexpansion.compat.galacticraft;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class GalacticraftRegistration {
    public static ItemMelee battleaxeDesh;
    public static ItemMelee battleaxeHeavyDuty;
    public static ItemMelee battleaxeTitanium;
    public static ItemMelee boomerangDesh;
    public static ItemMelee boomerangHeavyDuty;
    public static ItemMelee boomerangTitanium;
    public static ItemMusket bayonetDesh;
    public static ItemMusket bayonetHeavyDuty;
    public static ItemMusket bayonetTitanium;
    public static ItemFlail flailDesh;
    public static ItemFlail flailHeavyDuty;
    public static ItemFlail flailTitanium;
    public static ItemMelee halberdDesh;
    public static ItemMelee halberdHeavyDuty;
    public static ItemMelee halberdTitanium;
    public static ItemMelee katanaDesh;
    public static ItemMelee katanaHeavyDuty;
    public static ItemMelee katanaTitanium;
    public static ItemMelee knifeDesh;
    public static ItemMelee knifeHeavyDuty;
    public static ItemMelee knifeTitanium;
    public static ItemMelee spearDesh;
    public static ItemMelee spearHeavyDuty;
    public static ItemMelee spearTitanium;
    public static ItemMelee warhammerDesh;
    public static ItemMelee warhammerHeavyDuty;
    public static ItemMelee warhammerTitanium;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.galacticraft_settings.GC_HEAVY_DUTY_MATERIAL) {
            registry.register(spearHeavyDuty = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(halberdHeavyDuty = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(battleaxeHeavyDuty = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(knifeHeavyDuty = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(warhammerHeavyDuty = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(flailHeavyDuty = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(katanaHeavyDuty = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(boomerangHeavyDuty = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(bayonetHeavyDuty = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.heavy_duty", GCItems.TOOL_STEEL, knifeHeavyDuty));
        }

        if (BEConfig.galacticraft_settings.GC_DESH_MATERIAL) {
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

        if (BEConfig.galacticraft_settings.GC_TITANIUM_MATERIAL) {
            registry.register(spearTitanium = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(halberdTitanium = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(battleaxeTitanium = WMItemBuilder.createStandardBattleaxe(BalkonsExpansion.MOD_ID, "battleaxe.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(knifeTitanium = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(warhammerTitanium = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(flailTitanium = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(katanaTitanium = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(boomerangTitanium = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(bayonetTitanium = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.titanium", AsteroidsItems.TOOL_TITANIUM, knifeTitanium));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        // Metadata sucks.
        if (BEConfig.galacticraft_settings.GC_DESH_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), battleaxeDesh));
            registry.register(BERecipes.registerBoomerangRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), "ingotIron", boomerangDesh));
            registry.register(BERecipes.registerBayonetRecipe(knifeDesh, bayonetDesh));
            registry.register(BERecipes.registerFlailRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), "string", flailDesh));
            registry.register(BERecipes.registerHalberdRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), halberdDesh));
            registry.register(BERecipes.registerKatanaRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), katanaDesh));
            registry.register(BERecipes.registerKnifeRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), knifeDesh));
            registry.register(BERecipes.registerKnifeAltRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), knifeDesh));
            registry.register(BERecipes.registerSpearRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), spearDesh));
            registry.register(BERecipes.registerWarhammerRecipe(new ItemStack(MarsItems.marsItemBasic, 1, 2), new ItemStack(MarsItems.marsItemBasic, 1, 1), warhammerDesh));
        }

        if (BEConfig.galacticraft_settings.GC_HEAVY_DUTY_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("compressedSteel", "stickWood", battleaxeHeavyDuty));
            registry.register(BERecipes.registerBoomerangRecipe("compressedSteel", "plankWood", boomerangHeavyDuty));
            registry.register(BERecipes.registerBayonetRecipe(knifeHeavyDuty, bayonetHeavyDuty));
            registry.register(BERecipes.registerFlailRecipe("compressedSteel", "stickWood", "string", flailHeavyDuty));
            registry.register(BERecipes.registerHalberdRecipe("compressedSteel", "stickWood", halberdHeavyDuty));
            registry.register(BERecipes.registerKatanaRecipe("compressedSteel", "stickWood", katanaHeavyDuty));
            registry.register(BERecipes.registerKnifeRecipe("compressedSteel", "stickWood", knifeHeavyDuty));
            registry.register(BERecipes.registerKnifeAltRecipe("compressedSteel", "stickWood", knifeHeavyDuty));
            registry.register(BERecipes.registerSpearRecipe("compressedSteel", "stickWood", spearHeavyDuty));
            registry.register(BERecipes.registerWarhammerRecipe("compressedSteel", "stickWood", warhammerHeavyDuty));
        }

        if (BEConfig.galacticraft_settings.GC_TITANIUM_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", battleaxeTitanium));
            registry.register(BERecipes.registerBoomerangRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", boomerangTitanium));
            registry.register(BERecipes.registerBayonetRecipe(knifeTitanium, bayonetTitanium));
            registry.register(BERecipes.registerFlailRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", "string", flailTitanium));
            registry.register(BERecipes.registerHalberdRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", halberdTitanium));
            registry.register(BERecipes.registerKatanaRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", katanaTitanium));
            registry.register(BERecipes.registerKnifeRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", knifeTitanium));
            registry.register(BERecipes.registerKnifeAltRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", knifeTitanium));
            registry.register(BERecipes.registerSpearRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", spearTitanium));
            registry.register(BERecipes.registerWarhammerRecipe(new ItemStack(AsteroidsItems.basicItem, 1, 6), "ingotIron", warhammerTitanium));
        }

        // Galacticraft weapons have no smelting recipes so none needs to be added.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.galacticraft_settings.GC_DESH_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeDesh);
            BERegistry.registerWeaponItemModel(boomerangDesh);
            BERegistry.registerWeaponItemModel(bayonetDesh);
            BERegistry.registerWeaponItemModel(flailDesh);
            BERegistry.registerWeaponItemModel(halberdDesh);
            BERegistry.registerWeaponItemModel(katanaDesh);
            BERegistry.registerWeaponItemModel(knifeDesh);
            BERegistry.registerWeaponItemModel(spearDesh);
            BERegistry.registerWeaponItemModel(warhammerDesh);
        }

        if (BEConfig.galacticraft_settings.GC_HEAVY_DUTY_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeHeavyDuty);
            BERegistry.registerWeaponItemModel(boomerangHeavyDuty);
            BERegistry.registerWeaponItemModel(bayonetHeavyDuty);
            BERegistry.registerWeaponItemModel(flailHeavyDuty);
            BERegistry.registerWeaponItemModel(halberdHeavyDuty);
            BERegistry.registerWeaponItemModel(katanaHeavyDuty);
            BERegistry.registerWeaponItemModel(knifeHeavyDuty);
            BERegistry.registerWeaponItemModel(spearHeavyDuty);
            BERegistry.registerWeaponItemModel(warhammerHeavyDuty);
        }

        if (BEConfig.galacticraft_settings.GC_TITANIUM_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeTitanium);
            BERegistry.registerWeaponItemModel(boomerangTitanium);
            BERegistry.registerWeaponItemModel(bayonetTitanium);
            BERegistry.registerWeaponItemModel(flailTitanium);
            BERegistry.registerWeaponItemModel(halberdTitanium);
            BERegistry.registerWeaponItemModel(katanaTitanium);
            BERegistry.registerWeaponItemModel(knifeTitanium);
            BERegistry.registerWeaponItemModel(spearTitanium);
            BERegistry.registerWeaponItemModel(warhammerTitanium);
        }
    }
}
