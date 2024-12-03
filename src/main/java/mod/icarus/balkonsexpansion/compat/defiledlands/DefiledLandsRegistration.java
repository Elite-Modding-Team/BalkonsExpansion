package mod.icarus.balkonsexpansion.compat.defiledlands;

import lykrast.defiledlands.common.init.ModItems;
import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BEItemBuilder;
import mod.icarus.balkonsexpansion.BERecipes;
import mod.icarus.balkonsexpansion.BERegistry;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
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

public class DefiledLandsRegistration {
    public static BEItemMelee battleaxeUmbrium;
    public static BEItemMelee boomerangUmbrium;
    public static BEItemMusket bayonetUmbrium;
    public static BEItemFlail flailUmbrium;
    public static BEItemMelee halberdUmbrium;
    public static BEItemMelee katanaUmbrium;
    public static BEItemMelee knifeUmbrium;
    public static BEItemMelee spearUmbrium;
    public static BEItemMelee warhammerUmbrium;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.defiled_lands_settings.DL_UMBRIUM_MATERIAL) {
            registry.register(spearUmbrium = BEItemBuilder.createCustomSpear("spear.umbrium", ModItems.materialUmbrium, -0.15F, 1.0F));
            registry.register(halberdUmbrium = BEItemBuilder.createCustomHalberd("halberd.umbrium", ModItems.materialUmbrium, 0.4F, 1.0F));
            registry.register(battleaxeUmbrium = BEItemBuilder.createCustomBattleaxe("battleaxe.umbrium", ModItems.materialUmbrium, 0.25F, 1.0F));
            registry.register(knifeUmbrium = BEItemBuilder.createCustomKnife("knife.umbrium", ModItems.materialUmbrium, -0.15F));
            registry.register(warhammerUmbrium = BEItemBuilder.createCustomWarhammer("warhammer.umbrium", ModItems.materialUmbrium, 0.55F));
            registry.register(flailUmbrium = BEItemBuilder.createCustomFlail("flail.umbrium", ModItems.materialUmbrium));
            registry.register(katanaUmbrium = BEItemBuilder.createCustomKatana("katana.umbrium", ModItems.materialUmbrium));
            registry.register(boomerangUmbrium = BEItemBuilder.createCustomBoomerang("boomerang.umbrium", ModItems.materialUmbrium, 0.1F));
            registry.register(bayonetUmbrium = BEItemBuilder.createCustomMusketBayonet("musketbayonet.umbrium", ModItems.materialUmbrium, knifeUmbrium, -0.15F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.defiled_lands_settings.DL_UMBRIUM_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotUmbrium", "stickWood", battleaxeUmbrium));
            registry.register(BERecipes.registerBoomerangRecipe("ingotUmbrium", "plankWood", boomerangUmbrium));
            registry.register(BERecipes.registerBayonetRecipe(knifeUmbrium, bayonetUmbrium));
            registry.register(BERecipes.registerFlailRecipe("ingotUmbrium", "stickWood", "string", flailUmbrium));
            registry.register(BERecipes.registerHalberdRecipe("ingotUmbrium", "stickWood", halberdUmbrium));
            registry.register(BERecipes.registerKatanaRecipe("ingotUmbrium", "stickWood", katanaUmbrium));
            registry.register(BERecipes.registerKnifeRecipe("ingotUmbrium", "stickWood", knifeUmbrium));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotUmbrium", "stickWood", knifeUmbrium));
            registry.register(BERecipes.registerSpearRecipe("ingotUmbrium", "stickWood", spearUmbrium));
            registry.register(BERecipes.registerWarhammerRecipe("ingotUmbrium", "stickWood", warhammerUmbrium));

            GameRegistry.addSmelting(new ItemStack(battleaxeUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(boomerangUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(flailUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(halberdUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(katanaUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(knifeUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(spearUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
            GameRegistry.addSmelting(new ItemStack(warhammerUmbrium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ModItems.umbriumNugget), 0.1F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.defiled_lands_settings.DL_UMBRIUM_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeUmbrium);
            BERegistry.registerWeaponItemModel(boomerangUmbrium);
            BERegistry.registerWeaponItemModel(bayonetUmbrium);
            BERegistry.registerWeaponItemModel(flailUmbrium);
            BERegistry.registerWeaponItemModel(halberdUmbrium);
            BERegistry.registerWeaponItemModel(katanaUmbrium);
            BERegistry.registerWeaponItemModel(knifeUmbrium);
            BERegistry.registerWeaponItemModel(spearUmbrium);
            BERegistry.registerWeaponItemModel(warhammerUmbrium);
        }
    }
}
