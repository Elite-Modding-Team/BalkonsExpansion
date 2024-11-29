package mod.icarus.balkonsexpansion.compat.bwm;

import betterwithmods.common.BWMItems;
import betterwithmods.common.items.ItemMaterial;
import betterwithmods.module.gameplay.miniblocks.MiniBlockIngredient;
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
import net.minecraftforge.oredict.OreIngredient;
import net.minecraftforge.registries.IForgeRegistry;

public class BWMRegistration {
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

        if (BEConfig.bwm_settings.BWM_STEEL_MATERIAL) {
            registry.register(spearSteel = BEItemBuilder.createCustomSpear("spear.steel.bwm", BWMItems.SOULFORGED_STEEL, -0.1F, 2.0F));
            registry.register(halberdSteel = BEItemBuilder.createCustomHalberd("halberd.steel.bwm", BWMItems.SOULFORGED_STEEL, 0.6F, 2.0F));
            //registry.register(battleaxeSteel = BEItemBuilder.createCustomBattleaxe("battleaxe.steel.bwm", BWMItems.SOULFORGED_STEEL, 0.45F, 1.0F));
            registry.register(knifeSteel = BEItemBuilder.createCustomKnife("knife.steel.bwm", BWMItems.SOULFORGED_STEEL, -0.1F));
            registry.register(warhammerSteel = BEItemBuilder.createCustomWarhammer("warhammer.steel.bwm", BWMItems.SOULFORGED_STEEL, 0.7F));
            registry.register(flailSteel = BEItemBuilder.createCustomFlail("flail.steel.bwm", BWMItems.SOULFORGED_STEEL));
            registry.register(katanaSteel = BEItemBuilder.createCustomKatana("katana.steel.bwm", BWMItems.SOULFORGED_STEEL, -0.6F));
            registry.register(boomerangSteel = BEItemBuilder.createCustomBoomerang("boomerang.steel.bwm", BWMItems.SOULFORGED_STEEL, 0.3F));
            registry.register(bayonetSteel = BEItemBuilder.createCustomMusketBayonet("musketbayonet.steel.bwm", BWMItems.SOULFORGED_STEEL, knifeSteel, -0.1F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.bwm_settings.BWM_STEEL_MATERIAL) {
            registry.register(BERecipes.registerBayonetRecipe(knifeSteel, bayonetSteel));

            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", new MiniBlockIngredient("moulding", new OreIngredient("plankWood")), boomerangSteel, "###X", "   #", "   #", "   #");
            BERecipesBWM.registerSteelAnvilTool3("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), "string", flailSteel, "   *", "  #*", " # *", "#  X");
            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), halberdSteel, "  XX", "  #X", " #  ", "#   ");
            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), katanaSteel, " X", "X ", "X ", "# ");
            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), knifeSteel, "X", "X", "#");
            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), spearSteel, "   X", "  # ", " #  ", "#   ");
            BERecipesBWM.registerSteelAnvilTool2("ingotSoulforgedSteel", ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT), warhammerSteel, "X#X", "X#X", " # ", " # ");
        }

        // BWM tools have no smelting recipes so support isn't needed.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.bwm_settings.BWM_STEEL_MATERIAL) {
            //BERegistry.registerWeaponItemModel(battleaxeSteel);
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
