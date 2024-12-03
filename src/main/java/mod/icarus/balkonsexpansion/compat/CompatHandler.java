package mod.icarus.balkonsexpansion.compat;

import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BalkonsExpansion;
import mod.icarus.balkonsexpansion.compat.ae2.*;
import mod.icarus.balkonsexpansion.compat.bwm.*;
import mod.icarus.balkonsexpansion.compat.defiledlands.*;
import mod.icarus.balkonsexpansion.compat.galacticraft.*;
import mod.icarus.balkonsexpansion.compat.ic2classic.*;
import mod.icarus.balkonsexpansion.compat.ic2experimental.*;
import mod.icarus.balkonsexpansion.compat.immersiveengineering.*;
import mod.icarus.balkonsexpansion.compat.mistyworld.*;
import mod.icarus.balkonsexpansion.compat.projectred.*;
import mod.icarus.balkonsexpansion.compat.railcraft.*;
import mod.icarus.balkonsexpansion.compat.thaumcraft.*;
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
        // Applied Energistics 2
        if (Loader.isModLoaded("appliedenergistics2") && BEConfig.mod_integration_settings.AE2_INTEGRATION) {
            AE2Registration.registerItems(event);
            AE2MaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                AE2Registration.registerRenderersItem();
            }
        }

        // Better With Mods
        if (Loader.isModLoaded("betterwithmods") && BEConfig.mod_integration_settings.BWM_INTEGRATION) {
            BWMRegistration.registerItems(event);
            BWMMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                BWMRegistration.registerRenderersItem();
            }
        }

        // Defiled Lands
        if (Loader.isModLoaded("defiledlands") && BEConfig.mod_integration_settings.DL_INTEGRATION) {
            DefiledLandsRegistration.registerItems(event);
            DefiledLandsMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                DefiledLandsRegistration.registerRenderersItem();
            }
        }

        // Galacticraft Legacy
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.mod_integration_settings.GALACTICRAFT_INTEGRATION)) {
            GalacticraftRegistration.registerItems(event);
            GalacticraftMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                GalacticraftRegistration.registerRenderersItem();
            }
        }

        // Immersive Engineering
        if (Loader.isModLoaded("immersiveengineering") && BEConfig.mod_integration_settings.IE_INTEGRATION) {
            IERegistration.registerItems(event);
            IEMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                IERegistration.registerRenderersItem();
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

        // Misty World
        if (Loader.isModLoaded("mist") && BEConfig.mod_integration_settings.MISTY_WORLD_INTEGRATION) {
            MistyWorldRegistration.registerItems(event);
            MistyWorldMaterialColors.registerMaterialColors();

            if (FMLLaunchHandler.side().isClient()) {
                MistyWorldRegistration.registerRenderersItem();
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
        // Applied Energistics 2
        if (Loader.isModLoaded("appliedenergistics2") && BEConfig.mod_integration_settings.AE2_INTEGRATION)
            AE2Registration.registerRecipes(event);
        // Better With Mods
        if (Loader.isModLoaded("betterwithmods") && BEConfig.mod_integration_settings.BWM_INTEGRATION)
            BWMRegistration.registerRecipes(event);
        // Defiled Lands
        if (Loader.isModLoaded("defiledlands") && BEConfig.mod_integration_settings.DL_INTEGRATION)
            DefiledLandsRegistration.registerRecipes(event);
        // Galacticraft Legacy
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets") && BEConfig.mod_integration_settings.GALACTICRAFT_INTEGRATION))
            GalacticraftRegistration.registerRecipes(event);
        // Immersive Engineering
        if (Loader.isModLoaded("immersiveengineering") && BEConfig.mod_integration_settings.IE_INTEGRATION)
            IERegistration.registerRecipes(event);
        // IndustrialCraft 2 Classic
        if (Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION)
            IC2ClassicRegistration.registerRecipes(event);
        // IndustrialCraft 2 Experimental
        if (Loader.isModLoaded("ic2") && !Loader.isModLoaded("ic2-classic-spmod") && BEConfig.mod_integration_settings.IC2_INTEGRATION)
            IC2ExperimentalRegistration.registerRecipes(event);
        // Misty World
        if (Loader.isModLoaded("mist") && BEConfig.mod_integration_settings.MISTY_WORLD_INTEGRATION)
            MistyWorldRegistration.registerRecipes(event);
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
