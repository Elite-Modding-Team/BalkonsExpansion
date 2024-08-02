package mod.emt.balkonsexpansion;

import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.ShapedOreRecipe;

// Used to make registering recipes for weapons *way* less painful.
public class BERecipes {
    public static IRecipe registerBattleaxeRecipe(Object material, Object stick, Item result, String name) {
        return new ShapedOreRecipe(null, result, "XXX", "X#X", " # ", 'X', material, '#', stick).setRegistryName(BalkonsExpansion.MOD_ID, name);
    }
}
