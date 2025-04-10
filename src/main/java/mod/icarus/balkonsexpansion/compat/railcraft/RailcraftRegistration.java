package mod.icarus.balkonsexpansion.compat.railcraft;

import mods.railcraft.common.items.RailcraftItems;
import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BEItemBuilder;
import mod.icarus.balkonsexpansion.BERecipes;
import mod.icarus.balkonsexpansion.BERegistry;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
import mods.railcraft.common.items.ItemMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class RailcraftRegistration {
    public static BEItemMelee battleaxeSteel;
    public static BEItemMelee boomerangSteel;
    public static BEItemMusket bayonetSteel;
    public static BEItemFlail flailSteel;
    public static BEItemMelee halberdSteel;
    public static BEItemMelee katanaSteel;
    public static BEItemMelee knifeSteel;
    public static BEItemMelee spearSteel;
    public static BEItemMelee warhammerSteel;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.railcraft_settings.RC_STEEL_MATERIAL) {
            registry.register(spearSteel = BEItemBuilder.createCustomSpear("spear.steel.rc", ItemMaterials.STEEL_TOOL, -0.15F, 1.0F));
            registry.register(halberdSteel = BEItemBuilder.createCustomHalberd("halberd.steel.rc", ItemMaterials.STEEL_TOOL, 0.4F, 1.0F));
            registry.register(battleaxeSteel = BEItemBuilder.createCustomBattleaxe("battleaxe.steel.rc", ItemMaterials.STEEL_TOOL, 0.25F, 1.0F));
            registry.register(knifeSteel = BEItemBuilder.createCustomKnife("knife.steel.rc", ItemMaterials.STEEL_TOOL, -0.15F));
            registry.register(warhammerSteel = BEItemBuilder.createCustomWarhammer("warhammer.steel.rc", ItemMaterials.STEEL_TOOL, 0.55F));
            registry.register(flailSteel = BEItemBuilder.createCustomFlail("flail.steel.rc", ItemMaterials.STEEL_TOOL));
            registry.register(katanaSteel = BEItemBuilder.createCustomKatana("katana.steel.rc", ItemMaterials.STEEL_TOOL));
            registry.register(boomerangSteel = BEItemBuilder.createCustomBoomerang("boomerang.steel.rc", ItemMaterials.STEEL_TOOL, 0.1F));
            registry.register(bayonetSteel = BEItemBuilder.createCustomMusketBayonet("musketbayonet.steel.rc", ItemMaterials.STEEL_TOOL, knifeSteel, -0.15F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.railcraft_settings.RC_STEEL_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotSteel", "stickWood", battleaxeSteel));
            registry.register(BERecipes.registerBoomerangRecipe("ingotSteel", "plankWood", boomerangSteel));
            registry.register(BERecipes.registerBayonetRecipe(knifeSteel, bayonetSteel));
            registry.register(BERecipes.registerFlailRecipe("ingotSteel", "stickWood", "string", flailSteel));
            registry.register(BERecipes.registerHalberdRecipe("ingotSteel", "stickWood", halberdSteel));
            registry.register(BERecipes.registerKatanaRecipe("ingotSteel", "stickWood", katanaSteel));
            registry.register(BERecipes.registerKnifeRecipe("ingotSteel", "stickWood", knifeSteel));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotSteel", "stickWood", knifeSteel));
            registry.register(BERecipes.registerSpearRecipe("ingotSteel", "stickWood", spearSteel));
            registry.register(BERecipes.registerWarhammerRecipe("ingotSteel", "stickWood", warhammerSteel));

            GameRegistry.addSmelting(new ItemStack(battleaxeSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(boomerangSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(flailSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(halberdSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(katanaSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(knifeSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(spearSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
            GameRegistry.addSmelting(new ItemStack(warhammerSteel, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(RailcraftItems.NUGGET.item(), 1, 0), 0.1F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.railcraft_settings.RC_STEEL_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeSteel);
            BERegistry.registerWeaponItemModel(boomerangSteel);
            BERegistry.registerWeaponItemModel(bayonetSteel);
            BERegistry.registerWeaponItemModel(flailSteel);
            BERegistry.registerWeaponItemModel(halberdSteel);
            BERegistry.registerWeaponItemModel(katanaSteel);
            BERegistry.registerWeaponItemModel(knifeSteel);
            BERegistry.registerWeaponItemModel(spearSteel);
            BERegistry.registerWeaponItemModel(warhammerSteel);
        }
    }
}
