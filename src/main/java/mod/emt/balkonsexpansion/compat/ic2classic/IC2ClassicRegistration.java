package mod.emt.balkonsexpansion.compat.ic2classic;

import ic2.core.util.helpers.ToolHelper;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BEItemBuilder;
import mod.emt.balkonsexpansion.BERecipes;
import mod.emt.balkonsexpansion.BERegistry;
import mod.emt.balkonsexpansion.item.BEItemFlail;
import mod.emt.balkonsexpansion.item.BEItemMelee;
import mod.emt.balkonsexpansion.item.BEItemMusket;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class IC2ClassicRegistration {
    public static BEItemMelee battleaxeBronze;
    public static BEItemMelee boomerangBronze;
    public static BEItemMusket bayonetBronze;
    public static BEItemFlail flailBronze;
    public static BEItemMelee halberdBronze;
    public static BEItemMelee katanaBronze;
    public static BEItemMelee knifeBronze;
    public static BEItemMelee spearBronze;
    public static BEItemMelee warhammerBronze;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.ic2_classic_settings.IC2C_BRONZE_MATERIAL) {
            registry.register(spearBronze = BEItemBuilder.createCustomSpear("spear.bronze.ic2c", ToolHelper.bronzeToolMaterial, -0.15F, 1.0F));
            registry.register(halberdBronze = BEItemBuilder.createCustomHalberd("halberd.bronze.ic2c", ToolHelper.bronzeToolMaterial, 0.4F, 1.0F));
            registry.register(battleaxeBronze = BEItemBuilder.createCustomBattleaxe("battleaxe.bronze.ic2c", ToolHelper.bronzeToolMaterial, 0.25F, 1.0F));
            registry.register(knifeBronze = BEItemBuilder.createCustomKnife("knife.bronze.ic2c", ToolHelper.bronzeToolMaterial, -0.15F));
            registry.register(warhammerBronze = BEItemBuilder.createCustomWarhammer("warhammer.bronze.ic2c", ToolHelper.bronzeToolMaterial, 0.55F));
            registry.register(flailBronze = BEItemBuilder.createCustomFlail("flail.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(katanaBronze = BEItemBuilder.createCustomKatana("katana.bronze.ic2c", ToolHelper.bronzeToolMaterial));
            registry.register(boomerangBronze = BEItemBuilder.createCustomBoomerang("boomerang.bronze.ic2c", ToolHelper.bronzeToolMaterial, 0.1F));
            registry.register(bayonetBronze = BEItemBuilder.createCustomMusketBayonet("musketbayonet.bronze.ic2c", ToolHelper.bronzeToolMaterial, knifeBronze, -0.15F));
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
