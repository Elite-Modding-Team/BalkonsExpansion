package mod.emt.balkonsexpansion.compat;

import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import mod.emt.balkonsexpansion.compat.galacticraft.GalacticraftMaterialColors;
import mod.emt.balkonsexpansion.compat.galacticraft.GalacticraftRegistration;
import mod.emt.balkonsexpansion.compat.railcraft.RailcraftMaterialColors;
import mod.emt.balkonsexpansion.compat.railcraft.RailcraftRegistration;
import mod.emt.balkonsexpansion.compat.thaumcraft.ThaumcraftMaterialColors;
import mod.emt.balkonsexpansion.compat.thaumcraft.ThaumcraftRegistration;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;

@EventBusSubscriber(modid = BalkonsExpansion.MOD_ID)
public class CompatHandler {
    public static void preInit() {
    }

    public static void init() {
    }

    public static void postInit() {
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Galacticraft Legacy
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.general_settings.GALACTICRAFT_INTEGRATION)) {
            GalacticraftRegistration.registerItems(event);
            GalacticraftMaterialColors.registerMaterialColors();
            if (FMLLaunchHandler.side().isClient()) {
                GalacticraftRegistration.registerRenderersItem();
            }
        }

        // Railcraft
        if (Loader.isModLoaded("railcraft") && BEConfig.general_settings.RAILCRAFT_INTEGRATION) {
            RailcraftRegistration.registerItems(event);
            RailcraftMaterialColors.registerMaterialColors();
            if (FMLLaunchHandler.side().isClient()) {
                RailcraftRegistration.registerRenderersItem();
            }
        }

        // Thaumcraft
        if (Loader.isModLoaded("thaumcraft") && BEConfig.general_settings.THAUMCRAFT_INTEGRATION) {
            ThaumcraftRegistration.registerItems(event);
            ThaumcraftMaterialColors.registerMaterialColors();
            if (FMLLaunchHandler.side().isClient()) {
                ThaumcraftRegistration.registerRenderersItem();
            }
        }
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        // Galacticraft Legacy
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.general_settings.GALACTICRAFT_INTEGRATION))
            GalacticraftRegistration.registerRecipes(event);
        // Railcraft
        if (Loader.isModLoaded("railcraft") && BEConfig.general_settings.RAILCRAFT_INTEGRATION)
            RailcraftRegistration.registerRecipes(event);
        // Thaumcraft
        if (Loader.isModLoaded("thaumcraft") && BEConfig.general_settings.THAUMCRAFT_INTEGRATION)
            ThaumcraftRegistration.registerRecipes(event);
    }
}
