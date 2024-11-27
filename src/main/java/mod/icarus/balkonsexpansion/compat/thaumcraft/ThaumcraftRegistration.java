package mod.icarus.balkonsexpansion.compat.thaumcraft;

import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BEItemBuilder;
import mod.icarus.balkonsexpansion.BERecipes;
import mod.icarus.balkonsexpansion.BERegistry;
import mod.icarus.balkonsexpansion.compat.thaumcraft.item.BEItemFlailVoid;
import mod.icarus.balkonsexpansion.item.BEItemFlail;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import mod.icarus.balkonsexpansion.item.BEItemMusket;
import net.minecraft.item.EnumRarity;
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
import thaumcraft.api.ThaumcraftMaterials;
import thaumcraft.api.items.ItemsTC;

public class ThaumcraftRegistration {
    public static BEItemMelee battleaxeThaumium;
    public static BEItemMelee battleaxeVoid;
    public static BEItemMelee boomerangThaumium;
    public static BEItemMelee boomerangVoid;
    public static BEItemMusket bayonetThaumium;
    public static BEItemMusket bayonetVoid;
    public static BEItemFlail flailThaumium;
    public static BEItemFlailVoid flailVoid;
    public static BEItemMelee halberdThaumium;
    public static BEItemMelee halberdVoid;
    public static BEItemMelee katanaThaumium;
    public static BEItemMelee katanaVoid;
    public static BEItemMelee knifeThaumium;
    public static BEItemMelee knifeVoid;
    public static BEItemMelee spearThaumium;
    public static BEItemMelee spearVoid;
    public static BEItemMelee warhammerThaumium;
    public static BEItemMelee warhammerVoid;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            registry.register(spearThaumium = BEItemBuilder.createCustomSpear("spear.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, -0.15F, 1.0F, EnumRarity.UNCOMMON));
            registry.register(halberdThaumium = BEItemBuilder.createCustomHalberd("halberd.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, 0.4F, 1.0F, EnumRarity.UNCOMMON));
            registry.register(battleaxeThaumium = BEItemBuilder.createCustomBattleaxe("battleaxe.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, 0.25F, 1.0F, EnumRarity.UNCOMMON));
            registry.register(knifeThaumium = BEItemBuilder.createCustomKnife("knife.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, -0.15F, EnumRarity.UNCOMMON));
            registry.register(warhammerThaumium = BEItemBuilder.createCustomWarhammer("warhammer.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, 0.55F, EnumRarity.UNCOMMON));
            registry.register(flailThaumium = BEItemBuilder.createCustomFlail("flail.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, EnumRarity.UNCOMMON));
            registry.register(katanaThaumium = BEItemBuilder.createCustomKatana("katana.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, -0.4F, EnumRarity.UNCOMMON));
            registry.register(boomerangThaumium = BEItemBuilder.createCustomBoomerang("boomerang.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, 0.1F, EnumRarity.UNCOMMON));
           registry.register(bayonetThaumium = BEItemBuilder.createCustomMusketBayonet("musketbayonet.thaumium", ThaumcraftMaterials.TOOLMAT_THAUMIUM, knifeThaumium, -0.15F, EnumRarity.UNCOMMON));
        }

        if (BEConfig.thaumcraft_settings.TC_VOID_MATERIAL) {
            registry.register(spearVoid = ThaumcraftItemBuilder.createVoidSpear("spear.void", ThaumcraftMaterials.TOOLMAT_VOID, 0.0F, 2.0F));
            registry.register(halberdVoid = ThaumcraftItemBuilder.createVoidHalberd("halberd.void", ThaumcraftMaterials.TOOLMAT_VOID, 0.6F, 2.0F));
            registry.register(battleaxeVoid = ThaumcraftItemBuilder.createVoidBattleaxe("battleaxe.void", ThaumcraftMaterials.TOOLMAT_VOID, 0.45F, 1.0F));
            registry.register(knifeVoid = ThaumcraftItemBuilder.createVoidKnife("knife.void", ThaumcraftMaterials.TOOLMAT_VOID, -0.1F));
            registry.register(warhammerVoid = ThaumcraftItemBuilder.createVoidWarhammer("warhammer.void", ThaumcraftMaterials.TOOLMAT_VOID, 0.7F));
            registry.register(flailVoid = ThaumcraftItemBuilder.createVoidFlail("flail.void", ThaumcraftMaterials.TOOLMAT_VOID));
            registry.register(katanaVoid = ThaumcraftItemBuilder.createVoidKatana("katana.void", ThaumcraftMaterials.TOOLMAT_VOID, -0.6F));
            registry.register(boomerangVoid = ThaumcraftItemBuilder.createVoidBoomerang("boomerang.void", ThaumcraftMaterials.TOOLMAT_VOID, 0.3F));
            //registry.register(bayonetThaumium = BEItemBuilder.createCustomMusketBayonet("musketbayonet.void", ThaumcraftMaterials.TOOLMAT_VOID, knifeVoid, -0.15F, EnumRarity.UNCOMMON));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotThaumium", "stickWood", battleaxeThaumium));
            registry.register(BERecipes.registerBoomerangRecipe("ingotThaumium", "plankWood", boomerangThaumium));
            registry.register(BERecipes.registerBayonetRecipe(knifeThaumium, bayonetThaumium));
            registry.register(BERecipes.registerFlailRecipe("ingotThaumium", "stickWood", "string", flailThaumium));
            registry.register(BERecipes.registerHalberdRecipe("ingotThaumium", "stickWood", halberdThaumium));
            registry.register(BERecipes.registerKatanaRecipe("ingotThaumium", "stickWood", katanaThaumium));
            registry.register(BERecipes.registerKnifeRecipe("ingotThaumium", "stickWood", knifeThaumium));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotThaumium", "stickWood", knifeThaumium));
            registry.register(BERecipes.registerSpearRecipe("ingotThaumium", "stickWood", spearThaumium));
            registry.register(BERecipes.registerWarhammerRecipe("ingotThaumium", "stickWood", warhammerThaumium));

            GameRegistry.addSmelting(new ItemStack(battleaxeThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(boomerangThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(flailThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(halberdThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(katanaThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(knifeThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(spearThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
            GameRegistry.addSmelting(new ItemStack(warhammerThaumium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 6), 0.6F);
        }

        if (BEConfig.thaumcraft_settings.TC_VOID_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe("ingotVoid", "stickWood", battleaxeVoid));
            registry.register(BERecipes.registerBoomerangRecipe("ingotVoid", ItemsTC.voidSeed, boomerangVoid));
            //registry.register(BERecipes.registerBayonetRecipe(knifeVoid, bayonetVoid));
            registry.register(BERecipes.registerFlailRecipe("ingotVoid", "stickWood", "string", flailVoid));
            registry.register(BERecipes.registerHalberdRecipe("ingotVoid", "stickWood", halberdVoid));
            registry.register(BERecipes.registerKatanaRecipe("ingotVoid", "stickWood", katanaVoid));
            registry.register(BERecipes.registerKnifeRecipe("ingotVoid", "stickWood", knifeVoid));
            registry.register(BERecipes.registerKnifeAltRecipe("ingotVoid", "stickWood", knifeVoid));
            registry.register(BERecipes.registerSpearRecipe("ingotVoid", "stickWood", spearVoid));
            registry.register(BERecipes.registerWarhammerRecipe("ingotVoid", "stickWood", warhammerVoid));

            GameRegistry.addSmelting(new ItemStack(battleaxeVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(boomerangVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(flailVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(halberdVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(katanaVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(knifeVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(spearVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
            GameRegistry.addSmelting(new ItemStack(warhammerVoid, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(ItemsTC.nuggets, 1, 7), 1.2F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.thaumcraft_settings.TC_THAUMIUM_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeThaumium);
            BERegistry.registerWeaponItemModel(boomerangThaumium);
            BERegistry.registerWeaponItemModel(bayonetThaumium);
            BERegistry.registerWeaponItemModel(flailThaumium);
            BERegistry.registerWeaponItemModel(halberdThaumium);
            BERegistry.registerWeaponItemModel(katanaThaumium);
            BERegistry.registerWeaponItemModel(knifeThaumium);
            BERegistry.registerWeaponItemModel(spearThaumium);
            BERegistry.registerWeaponItemModel(warhammerThaumium);
        }

        if (BEConfig.thaumcraft_settings.TC_VOID_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeVoid);
            BERegistry.registerWeaponItemModel(boomerangVoid);
            //BERegistry.registerWeaponItemModel(bayonetVoid);
            BERegistry.registerWeaponItemModel(flailVoid);
            BERegistry.registerWeaponItemModel(halberdVoid);
            BERegistry.registerWeaponItemModel(katanaVoid);
            BERegistry.registerWeaponItemModel(knifeVoid);
            BERegistry.registerWeaponItemModel(spearVoid);
            BERegistry.registerWeaponItemModel(warhammerVoid);
        }
    }
}
