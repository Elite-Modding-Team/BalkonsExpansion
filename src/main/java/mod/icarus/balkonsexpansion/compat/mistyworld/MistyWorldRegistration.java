package mod.icarus.balkonsexpansion.compat.mistyworld;

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
import ru.liahim.mist.api.item.MistItems;
import ru.liahim.mist.init.ModItems;

public class MistyWorldRegistration {
    public static BEItemMelee battleaxeNiobium;
    public static BEItemMelee boomerangNiobium;
    public static BEItemMusket bayonetNiobium;
    public static BEItemFlail flailNiobium;
    public static BEItemMelee halberdNiobium;
    public static BEItemMelee katanaNiobium;
    public static BEItemMelee knifeNiobium;
    public static BEItemMelee spearNiobium;
    public static BEItemMelee warhammerNiobium;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        if (BEConfig.misty_world_settings.MW_NIOBIUM_MATERIAL) {
            registry.register(spearNiobium = BEItemBuilder.createCustomSpear("spear.niobium.mw", ModItems.NIOBIUM_TOOLS, -0.15F, 1.0F));
            registry.register(halberdNiobium = BEItemBuilder.createCustomHalberd("halberd.niobium.mw", ModItems.NIOBIUM_TOOLS, 0.4F, 1.0F));
            registry.register(battleaxeNiobium = BEItemBuilder.createCustomBattleaxe("battleaxe.niobium.mw", ModItems.NIOBIUM_TOOLS, 0.25F, 1.0F));
            registry.register(knifeNiobium = BEItemBuilder.createCustomKnife("knife.niobium.mw", ModItems.NIOBIUM_TOOLS, -0.15F));
            registry.register(warhammerNiobium = BEItemBuilder.createCustomWarhammer("warhammer.niobium.mw", ModItems.NIOBIUM_TOOLS, 0.55F));
            registry.register(flailNiobium = BEItemBuilder.createCustomFlail("flail.niobium.mw", ModItems.NIOBIUM_TOOLS));
            registry.register(katanaNiobium = BEItemBuilder.createCustomKatana("katana.niobium.mw", ModItems.NIOBIUM_TOOLS));
            registry.register(boomerangNiobium = BEItemBuilder.createCustomBoomerang("boomerang.niobium.mw", ModItems.NIOBIUM_TOOLS, 0.1F));
            registry.register(bayonetNiobium = BEItemBuilder.createCustomMusketBayonet("musketbayonet.niobium.mw", ModItems.NIOBIUM_TOOLS, knifeNiobium, -0.15F));
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        IForgeRegistry<IRecipe> registry = event.getRegistry();

        if (BEConfig.misty_world_settings.MW_NIOBIUM_MATERIAL) {
            registry.register(BERecipes.registerBattleaxeRecipe(MistItems.NIOBIUM_INGOT, "stickWood", battleaxeNiobium));
            registry.register(BERecipes.registerBoomerangRecipe(MistItems.NIOBIUM_INGOT, "plankWood", boomerangNiobium));
            registry.register(BERecipes.registerBayonetRecipe(knifeNiobium, bayonetNiobium));
            registry.register(BERecipes.registerFlailRecipe(MistItems.NIOBIUM_INGOT, "stickWood", "string", flailNiobium));
            registry.register(BERecipes.registerHalberdRecipe(MistItems.NIOBIUM_INGOT, "stickWood", halberdNiobium));
            registry.register(BERecipes.registerKatanaRecipe(MistItems.NIOBIUM_INGOT, "stickWood", katanaNiobium));
            registry.register(BERecipes.registerKnifeRecipe(MistItems.NIOBIUM_INGOT, "stickWood", knifeNiobium));
            registry.register(BERecipes.registerKnifeAltRecipe(MistItems.NIOBIUM_INGOT, "stickWood", knifeNiobium));
            registry.register(BERecipes.registerSpearRecipe(MistItems.NIOBIUM_INGOT, "stickWood", spearNiobium));
            registry.register(BERecipes.registerWarhammerRecipe(MistItems.NIOBIUM_INGOT, "stickWood", warhammerNiobium));

            GameRegistry.addSmelting(new ItemStack(battleaxeNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(boomerangNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(flailNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(halberdNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(katanaNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(knifeNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(spearNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
            GameRegistry.addSmelting(new ItemStack(warhammerNiobium, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MistItems.NIOBIUM_NUGGET), 0.1F);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerRenderersItem() {
        if (BEConfig.misty_world_settings.MW_NIOBIUM_MATERIAL) {
            BERegistry.registerWeaponItemModel(battleaxeNiobium);
            BERegistry.registerWeaponItemModel(boomerangNiobium);
            BERegistry.registerWeaponItemModel(bayonetNiobium);
            BERegistry.registerWeaponItemModel(flailNiobium);
            BERegistry.registerWeaponItemModel(halberdNiobium);
            BERegistry.registerWeaponItemModel(katanaNiobium);
            BERegistry.registerWeaponItemModel(knifeNiobium);
            BERegistry.registerWeaponItemModel(spearNiobium);
            BERegistry.registerWeaponItemModel(warhammerNiobium);
        }
    }
}
