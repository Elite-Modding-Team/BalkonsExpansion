package mod.emt.balkonsexpansion.compat.ic2classic;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import ic2.core.util.helpers.ToolHelper;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BEItemBuilder;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import mods.railcraft.common.items.ItemMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class IC2ClassicRegistration {
    public static ItemMelee battleaxeBronze;
    public static ItemMelee boomerangBronze;
    public static ItemMusket bayonetBronze;
    public static ItemFlail flailBronze;
    public static ItemMelee halberdBronze;
    public static ItemMelee katanaBronze;
    public static ItemMelee knifeBronze;
    public static ItemMelee spearBronze;
    public static ItemMelee warhammerBronze;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.ic2_classic_settings.IC2C_BRONZE_MATERIAL) {
            registry.register(spearBronze = WMItemBuilder.createStandardSpear(BalkonsExpansion.MOD_ID, "spear.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(halberdBronze = WMItemBuilder.createStandardHalberd(BalkonsExpansion.MOD_ID, "halberd.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(battleaxeBronze = BEItemBuilder.createCustomBattleaxe("battleaxe.bronze.ic2c", ToolHelper.bronzeToolMaterial, 0.2F, 1.0F));
            registry.register(knifeBronze = WMItemBuilder.createStandardKnife(BalkonsExpansion.MOD_ID, "knife.bronze.ic2c", ItemMaterials.STEEL_TOOL));
            registry.register(warhammerBronze = WMItemBuilder.createStandardWarhammer(BalkonsExpansion.MOD_ID, "warhammer.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(flailBronze = WMItemBuilder.createStandardFlail(BalkonsExpansion.MOD_ID, "flail.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(katanaBronze = WMItemBuilder.createStandardKatana(BalkonsExpansion.MOD_ID, "katana.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(boomerangBronze = WMItemBuilder.createStandardBoomerang(BalkonsExpansion.MOD_ID, "boomerang.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(bayonetBronze = WMItemBuilder.createStandardMusketWithBayonet(BalkonsExpansion.MOD_ID, "musketbayonet.bronze.ic2c", ToolHelper.bronzeToolMaterial, knifeBronze));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.ic2_classic_settings.IC2C_BRONZE_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotBronze", "stickWood", battleaxeBronze));
            registry.register(BERecipes.registerBoomerangRecipe("ingotBronze", "plankWood", boomerangBronze));
            registry.register(BERecipes.registerBayonetRecipe(knifeBronze, bayonetBronze));
            registry.register(BERecipes.registerFlailRecipe("ingotBronze", "stickWood", "string", flailBronze));
            registry.register(BERecipes.registerHalberdRecipe("ingotBronze", "stickWood", halberdBronze));
            registry.register(BERecipes.registerKatanaRecipe("ingotBronze", "stickWood", katanaBronze));
            registry.register(BERecipes.registerKnifeRecipe("ingotBronze", "stickWood", knifeBronze));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotBronze", "stickWood", knifeBronze));
            registry.register(BERecipes.registerSpearRecipe("ingotBronze", "stickWood", spearBronze));
            registry.register(BERecipes.registerWarhammerRecipe("ingotBronze", "stickWood", warhammerBronze));
        }

        // IC2 Classic tools have no smelting recipes so none needs to be added.
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.ic2_classic_settings.IC2C_BRONZE_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeBronze);
            BERegistry.registerWeaponItemModel(boomerangBronze);
            BERegistry.registerWeaponItemModel(bayonetBronze);
            BERegistry.registerWeaponItemModel(flailBronze);
            BERegistry.registerWeaponItemModel(halberdBronze);
            BERegistry.registerWeaponItemModel(katanaBronze);
            BERegistry.registerWeaponItemModel(knifeBronze);
            BERegistry.registerWeaponItemModel(spearBronze);
            BERegistry.registerWeaponItemModel(warhammerBronze);
        }
    }
}
