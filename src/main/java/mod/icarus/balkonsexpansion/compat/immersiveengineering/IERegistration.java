package mod.icarus.balkonsexpansion.compat.immersiveengineering;

import blusunrize.immersiveengineering.api.Lib;
import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BEItemBuilder;
import mod.icarus.balkonsexpansion.BERecipes;
import mod.icarus.balkonsexpansion.BERegistry;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class IERegistration {
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

        if (BEConfig.ie_settings.IE_STEEL_MATERIAL) {
            registry.register(spearSteel = BEItemBuilder.createCustomSpear("spear.steel.ie", Lib.MATERIAL_Steel, -0.1F, 1.0F));
            registry.register(halberdSteel = BEItemBuilder.createCustomHalberd("halberd.steel.ie", Lib.MATERIAL_Steel, 0.45F, 1.0F));
            registry.register(battleaxeSteel = BEItemBuilder.createCustomBattleaxe("battleaxe.steel.ie", Lib.MATERIAL_Steel, 0.3F, 1.0F));
            registry.register(knifeSteel = BEItemBuilder.createCustomKnife("knife.steel.ie", Lib.MATERIAL_Steel, -0.1F));
            registry.register(warhammerSteel = BEItemBuilder.createCustomWarhammer("warhammer.steel.ie", Lib.MATERIAL_Steel, 0.6F));
            registry.register(flailSteel = BEItemBuilder.createCustomFlail("flail.steel.ie", Lib.MATERIAL_Steel));
            registry.register(katanaSteel = BEItemBuilder.createCustomKatana("katana.steel.ie", Lib.MATERIAL_Steel, -0.45F));
            registry.register(boomerangSteel = BEItemBuilder.createCustomBoomerang("boomerang.steel.ie", Lib.MATERIAL_Steel, 0.15F));
            registry.register(bayonetSteel = BEItemBuilder.createCustomMusketBayonet("musketbayonet.steel.ie", Lib.MATERIAL_Steel, knifeSteel, -0.1F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.ie_settings.IE_STEEL_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotSteel", "stickTreatedWood", battleaxeSteel));
            registry.register(BERecipes.registerBoomerangRecipe("ingotSteel", "plankTreatedWood", boomerangSteel));
            registry.register(BERecipes.registerBayonetRecipe(knifeSteel, bayonetSteel));
            registry.register(BERecipes.registerFlailRecipe("ingotSteel", "stickTreatedWood", "fiberHemp", flailSteel));
            registry.register(BERecipes.registerHalberdRecipe("ingotSteel", "stickTreatedWood", halberdSteel));
            registry.register(BERecipes.registerKatanaRecipe("ingotSteel", "stickTreatedWood", katanaSteel));
            registry.register(BERecipes.registerKnifeRecipe("ingotSteel", "stickTreatedWood", knifeSteel));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotSteel", "stickTreatedWood", knifeSteel));
            registry.register(BERecipes.registerSpearRecipe("ingotSteel", "stickTreatedWood", spearSteel));
            registry.register(BERecipes.registerWarhammerRecipe("ingotSteel", "stickTreatedWood", warhammerSteel));
        }

        // Immersive Engineering tools have no smelting recipes so support isn't needed.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.ie_settings.IE_STEEL_MATERIAL) {
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
