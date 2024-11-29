package mod.icarus.balkonsexpansion.compat.bwm;

import mod.icarus.balkonsexpansion.BalkonsExpansion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;

import static betterwithmods.module.gameplay.AnvilRecipes.addSteelShapedRecipe;

public class BERecipesBWM {
    // Soulforged Steel Anvil - 2 Ingredients
    public static IRecipe registerSteelAnvilTool2(Object material1, Object material2, Item result, String... crafting) {
        return addSteelShapedRecipe(new ResourceLocation(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath()),
                new ItemStack(result), crafting,
                'X', material1,
                '#', material2);
    }

    // Soulforged Steel Anvil - 3 Ingredients
    public static IRecipe registerSteelAnvilTool3(Object material1, Object material2, Object material3, Item result, String... crafting) {
        return addSteelShapedRecipe(new ResourceLocation(BalkonsExpansion.MOD_ID, result.getRegistryName().getPath()),
                new ItemStack(result), crafting,
                'X', material1,
                '#', material2,
                '*', material3);
    }
}
