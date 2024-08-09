package mod.emt.balkonsexpansion.compat.galacticraft;

import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import micdoodle8.mods.galacticraft.core.GCItems;
import micdoodle8.mods.galacticraft.planets.asteroids.items.AsteroidsItems;
import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BEItemBuilder;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
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
            registry.register(spearHeavyDuty = BEItemBuilder.createCustomSpear("spear.heavy_duty", GCItems.TOOL_STEEL, -0.15F, 1.0F));
            registry.register(halberdHeavyDuty = BEItemBuilder.createCustomHalberd("halberd.heavy_duty", GCItems.TOOL_STEEL, 0.4F, 1.0F));
            registry.register(battleaxeHeavyDuty = BEItemBuilder.createCustomBattleaxe("battleaxe.heavy_duty", GCItems.TOOL_STEEL, 0.25F, 1.0F));
            registry.register(knifeHeavyDuty = BEItemBuilder.createCustomKnife("knife.heavy_duty", GCItems.TOOL_STEEL, -0.15F));
            registry.register(warhammerHeavyDuty = BEItemBuilder.createCustomWarhammer("warhammer.heavy_duty", GCItems.TOOL_STEEL, 0.55F));
            registry.register(flailHeavyDuty = BEItemBuilder.createCustomFlail("flail.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(katanaHeavyDuty = BEItemBuilder.createCustomKatana("katana.heavy_duty", GCItems.TOOL_STEEL));
            registry.register(boomerangHeavyDuty = BEItemBuilder.createCustomBoomerang("boomerang.heavy_duty", GCItems.TOOL_STEEL, 0.1F));
            registry.register(bayonetHeavyDuty = BEItemBuilder.createCustomMusketBayonet("musketbayonet.heavy_duty", GCItems.TOOL_STEEL, knifeHeavyDuty, -0.15F));
        }

        if (BEConfig.galacticraft_settings.GC_DESH_MATERIAL) {
            registry.register(spearDesh = BEItemBuilder.createCustomSpear("spear.desh", MarsItems.TOOLDESH, -0.1F, 1.0F));
            registry.register(halberdDesh = BEItemBuilder.createCustomHalberd("halberd.desh", MarsItems.TOOLDESH, 0.5F, 1.0F));
            registry.register(battleaxeDesh = BEItemBuilder.createCustomBattleaxe("battleaxe.desh", MarsItems.TOOLDESH, 0.35F, 1.0F));
            registry.register(knifeDesh = BEItemBuilder.createCustomKnife("knife.desh", MarsItems.TOOLDESH, -0.1F));
            registry.register(warhammerDesh = BEItemBuilder.createCustomWarhammer("warhammer.desh", MarsItems.TOOLDESH, 0.65F));
            registry.register(flailDesh = BEItemBuilder.createCustomFlail("flail.desh", MarsItems.TOOLDESH));
            registry.register(katanaDesh = BEItemBuilder.createCustomKatana("katana.desh", MarsItems.TOOLDESH, -0.5F));
            registry.register(boomerangDesh = BEItemBuilder.createCustomBoomerang("boomerang.desh", MarsItems.TOOLDESH, 0.2F));
            registry.register(bayonetDesh = BEItemBuilder.createCustomMusketBayonet("musketbayonet.desh", MarsItems.TOOLDESH, knifeDesh, -0.1F));
        }

        if (BEConfig.galacticraft_settings.GC_TITANIUM_MATERIAL) {
            registry.register(spearTitanium = BEItemBuilder.createCustomSpear("spear.titanium", AsteroidsItems.TOOL_TITANIUM, -0.1F, 2.0F));
            registry.register(halberdTitanium = BEItemBuilder.createCustomHalberd("halberd.titanium", AsteroidsItems.TOOL_TITANIUM, 0.6F, 2.0F));
            registry.register(battleaxeTitanium = BEItemBuilder.createCustomBattleaxe("battleaxe.titanium", AsteroidsItems.TOOL_TITANIUM, 0.45F, 1.0F));
            registry.register(knifeTitanium = BEItemBuilder.createCustomKnife("knife.titanium", AsteroidsItems.TOOL_TITANIUM, -0.1F));
            registry.register(warhammerTitanium = BEItemBuilder.createCustomWarhammer("warhammer.titanium", AsteroidsItems.TOOL_TITANIUM, 0.7F));
            registry.register(flailTitanium = BEItemBuilder.createCustomFlail("flail.titanium", AsteroidsItems.TOOL_TITANIUM));
            registry.register(katanaTitanium = BEItemBuilder.createCustomKatana("katana.titanium", AsteroidsItems.TOOL_TITANIUM, -0.5F));
            registry.register(boomerangTitanium = BEItemBuilder.createCustomBoomerang("boomerang.titanium", AsteroidsItems.TOOL_TITANIUM, 0.3F));
            registry.register(bayonetTitanium = BEItemBuilder.createCustomMusketBayonet("musketbayonet.titanium", AsteroidsItems.TOOL_TITANIUM, knifeTitanium, -0.1F));
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

        // Galacticraft tools have no smelting recipes so none needs to be added.
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
