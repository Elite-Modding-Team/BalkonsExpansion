package mod.emt.balkonsexpansion;

import ckathode.weaponmod.BalkonsWeaponMod;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

// Used to make registering recipes for weapons *way* less painful. Knives have two recipes.
public class BERecipes {
    public static IRecipe registerBattleaxeRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "XXX", "X#X", " # ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerBayonetRecipe(Object knife, Item result) {
        return new ShapelessOreRecipe(null, result, BalkonsWeaponMod.musket, knife).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerBoomerangRecipe(Object material, Object wood, Item result) {
        return new ShapedOreRecipe(null, result, "##X", "  #", "  #", 'X', material, '#', wood).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerFlailRecipe(Object material, Object stick, Object string, Item result) {
        return new ShapedOreRecipe(null, result, "  *", " #*", "# X", 'X', material, '#', stick, '*', string).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerHalberdRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, " XX", " #X", "#  ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerKatanaRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "  X", " X ", "#  ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerKnifeRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "X", "#", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerKnifeAltRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "X#", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath() + ".a");
    }

    public static IRecipe registerSpearRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "  X", " # ", "#  ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }

    public static IRecipe registerWarhammerRecipe(Object material, Object stick, Item result) {
        return new ShapedOreRecipe(null, result, "X#X", "X#X", " # ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath());
    }
}
