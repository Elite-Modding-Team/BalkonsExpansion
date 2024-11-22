package mod.icarus.balkonsexpansion.compat;

import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BalkonsExpansion;
import mod.icarus.balkonsexpansion.compat.galacticraft.GalacticraftMaterialColors;
import mod.icarus.balkonsexpansion.compat.galacticraft.GalacticraftRegistration;
import mod.icarus.balkonsexpansion.compat.ic2classic.IC2ClassicMaterialColors;
import mod.icarus.balkonsexpansion.compat.ic2classic.IC2ClassicRegistration;
import mod.icarus.balkonsexpansion.compat.ic2experimental.IC2ExperimentalMaterialColors;
import mod.icarus.balkonsexpansion.compat.ic2experimental.IC2ExperimentalRegistration;
import mod.icarus.balkonsexpansion.compat.projectred.ProjectRedMaterialColors;
import mod.icarus.balkonsexpansion.compat.projectred.ProjectRedRegistration;
import mod.icarus.balkonsexpansion.compat.railcraft.RailcraftMaterialColors;
import mod.icarus.balkonsexpansion.compat.railcraft.RailcraftRegistration;
import mod.icarus.balkonsexpansion.compat.thaumcraft.ThaumcraftMaterialColors;
import mod.icarus.balkonsexpansion.compat.thaumcraft.ThaumcraftRegistration;
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
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.mod_integration_settings.GALACTICRAFT_INTEGRATION)) {
            GalacticraftRegistration.registerItems(event);
            GalacticraftMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                GalacticraftRegistration.registerRenderersItem();
            }
        }

        // IndustrialCraft 2 Classic
        if (Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION) {
            IC2ClassicRegistration.registerItems(event);
            IC2ClassicMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                IC2ClassicRegistration.registerRenderersItem();
            }
        }

        // IndustrialCraft 2 Experimental
        if (Loader.isModLoaded("ic2") && !Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION) {
            IC2ExperimentalRegistration.registerItems(event);
            IC2ExperimentalMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                IC2ExperimentalRegistration.registerRenderersItem();
            }
        }

        // Project Red
        if (Loader.isModLoaded("projectred-exploration") && BEConfig.mod_integration_settings.PROJECT_RED_INTEGRATION) {
            ProjectRedRegistration.registerItems(event);
            ProjectRedMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                ProjectRedRegistration.registerRenderersItem();
            }
        }

        // Railcraft
        if (Loader.isModLoaded("railcraft") && BEConfig.mod_integration_settings.RAILCRAFT_INTEGRATION) {
            RailcraftRegistration.registerItems(event);
            RailcraftMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                RailcraftRegistration.registerRenderersItem();
            }
        }

        // Thaumcraft
        if (Loader.isModLoaded("thaumcraft") && BEConfig.mod_integration_settings.THAUMCRAFT_INTEGRATION) {
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
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.mod_integration_settings.GALACTICRAFT_INTEGRATION))
            GalacticraftRegistration.registerRecipes(event);
        // IndustrialCraft 2 Classic
        if (Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION)
            IC2ClassicRegistration.registerRecipes(event);
        // IndustrialCraft 2 Experimental
        if (Loader.isModLoaded("ic2") && !Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION)
            IC2ExperimentalRegistration.registerRecipes(event);
        // Project Red
        if (Loader.isModLoaded("projectred-exploration") && BEConfig.mod_integration_settings.PROJECT_RED_INTEGRATION)
            ProjectRedRegistration.registerRecipes(event);
        // Railcraft
        if (Loader.isModLoaded("railcraft") && BEConfig.mod_integration_settings.RAILCRAFT_INTEGRATION)
            RailcraftRegistration.registerRecipes(event);
        // Thaumcraft
        if (Loader.isModLoaded("thaumcraft") && BEConfig.mod_integration_settings.THAUMCRAFT_INTEGRATION)
            ThaumcraftRegistration.registerRecipes(event);
    }
}