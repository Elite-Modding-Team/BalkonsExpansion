package mod.icarus.balkonsexpansion;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = BalkonsExpansion.MOD_ID, name = BalkonsExpansion.NAME)
public class BEConfig {
    @Config.Comment("!General")
    public static GeneralSettings general_settings = new GeneralSettings();

    @Config.Comment("!Mod Integration")
    public static ModIntegrationSettings mod_integration_settings = new ModIntegrationSettings();

    @Config.Comment("Applied Energistics 2")
    public static AE2Settings ae2_settings = new AE2Settings();

    @Config.Comment("Better With Mods")
    public static BetterWithModsSettings bwm_settings = new BetterWithModsSettings();

    @Config.Comment("Defiled Lands")
    public static DefiledLandsSettings defiled_lands_settings = new DefiledLandsSettings();

    @Config.Comment("Galacticraft Legacy")
    public static GalacticraftSettings galacticraft_settings = new GalacticraftSettings();

    @Config.Comment("Immersive Engineering")
    public static ImmersiveEngineeringSettings ie_settings = new ImmersiveEngineeringSettings();

    @Config.Comment("IndustrialCraft 2")
    public static IC2Settings ic2_settings = new IC2Settings();

    @Config.Comment("Misty World")
    public static MistyWorldSettings misty_world_settings = new MistyWorldSettings();

    @Config.Comment("Project Red Exploration")
    public static ProjectRedSettings project_red_settings = new ProjectRedSettings();

    @Config.Comment("Railcraft")
    public static RailcraftSettings railcraft_settings = new RailcraftSettings();

    @Config.Comment("Thaumcraft")
    public static ThaumcraftSettings thaumcraft_settings = new ThaumcraftSettings();

    public static class GeneralSettings {
        @Config.Name("Melee Blocking Sounds")
        @Config.Comment("Enables extra blocking sounds for battleaxes and katanas [default: true]")
        @Config.RequiresMcRestart
        public boolean MELEE_BLOCKING_SOUNDS = true;
    }

    public static class ModIntegrationSettings {
        @Config.Name("Applied Energistics 2")
        @Config.Comment("Enables Applied Energistics 2 integration [default: true]")
        @Config.RequiresMcRestart
        public boolean AE2_INTEGRATION = true;

        @Config.Name("Better With Mods")
        @Config.Comment("Enables Better With Mods integration [default: true]")
        @Config.RequiresMcRestart
        public boolean BWM_INTEGRATION = true;

        @Config.Name("Defiled Lands")
        @Config.Comment("Enables Defiled Lands integration [default: true]")
        @Config.RequiresMcRestart
        public boolean DL_INTEGRATION = true;

        @Config.Name("Galacticraft Legacy")
        @Config.Comment("Enables Galacticraft Legacy integration [default: true]")
        @Config.RequiresMcRestart
        public boolean GALACTICRAFT_INTEGRATION = true;

        @Config.Name("IndustrialCraft 2")
        @Config.Comment("Enables IndustrialCraft 2 Classic and IndustrialCraft 2 Experimental integration [default: true]")
        @Config.RequiresMcRestart
        public boolean IC2_INTEGRATION = true;

        @Config.Name("Immersive Engineering")
        @Config.Comment("Enables Immersive Engineering integration [default: true]")
        @Config.RequiresMcRestart
        public boolean IE_INTEGRATION = true;

        @Config.Name("Misty World")
        @Config.Comment("Enables Misty World integration [default: true]")
        @Config.RequiresMcRestart
        public boolean MISTY_WORLD_INTEGRATION = true;

        @Config.Name("Project Red Exploration")
        @Config.Comment("Enables Project Red Exploration integration [default: true]")
        @Config.RequiresMcRestart
        public boolean PROJECT_RED_INTEGRATION = true;

        @Config.Name("Railcraft")
        @Config.Comment("Enables Railcraft integration [default: true]")
        @Config.RequiresMcRestart
        public boolean RAILCRAFT_INTEGRATION = true;

        @Config.Name("Thaumcraft")
        @Config.Comment("Enables Thaumcraft integration [default: true]")
        @Config.RequiresMcRestart
        public boolean THAUMCRAFT_INTEGRATION = true;
    }

    public static class AE2Settings {
        @Config.Name("Material: Certus Quartz")
        @Config.Comment("Enables support for the Certus Quartz material [default: true]")
        @Config.RequiresWorldRestart
        public boolean AE2_CERTUS_QUARTZ_MATERIAL = true;

        @Config.Name("Material: Nether Quartz (Applied Energistics 2)")
        @Config.Comment("Enables support for the Nether Quartz material from Applied Energistics 2 [default: true]")
        @Config.RequiresWorldRestart
        public boolean AE2_NETHER_QUARTZ_MATERIAL = true;
    }

    public static class BetterWithModsSettings {
        @Config.Name("Material: Soulforged Steel (Refined)")
        @Config.Comment("Enables support for the Soulforged Steel (Refined) material [default: true]")
        @Config.RequiresWorldRestart
        public boolean BWM_STEEL_MATERIAL = true;
    }

    public static class DefiledLandsSettings {
        @Config.Name("Material: Umbrium")
        @Config.Comment("Enables support for the Umbrium material [default: true]")
        @Config.RequiresWorldRestart
        public boolean DL_UMBRIUM_MATERIAL = true;
    }

    public static class GalacticraftSettings {
        @Config.Name("Material: Desh")
        @Config.Comment("Enables support for the Desh material [default: true]")
        @Config.RequiresWorldRestart
        public boolean GC_DESH_MATERIAL = true;

        @Config.Name("Material: Heavy Duty")
        @Config.Comment("Enables support for the Heavy Duty material [default: true]")
        @Config.RequiresWorldRestart
        public boolean GC_HEAVY_DUTY_MATERIAL = true;

        @Config.Name("Material: Titanium (Galacticraft Legacy)")
        @Config.Comment("Enables support for the Titanium material from Galacticraft Legacy [default: true]")
        @Config.RequiresWorldRestart
        public boolean GC_TITANIUM_MATERIAL = true;
    }

    public static class IC2Settings {
        @Config.Name("Material: Bronze (IC2 Classic and IC2 Experimental)")
        @Config.Comment("Enables support for the Bronze material from IC2 Classic and IC2 Experimental [default: true]")
        @Config.RequiresWorldRestart
        public boolean IC2_BRONZE_MATERIAL = true;
    }

    public static class ImmersiveEngineeringSettings {
        @Config.Name("Material: Steel (Immersive Engineering)")
        @Config.Comment("Enables support for the Steel material from Immersive Engineering [default: true]")
        @Config.RequiresWorldRestart
        public boolean IE_STEEL_MATERIAL = true;
    }

    public static class MistyWorldSettings {
        @Config.Name("Material: Niobium (Misty World)")
        @Config.Comment("Enables support for the Niobium material from Misty World [default: true]")
        @Config.RequiresWorldRestart
        public boolean MW_NIOBIUM_MATERIAL = true;
    }

    public static class ProjectRedSettings {
        @Config.Name("Material: Peridot (Project Red)")
        @Config.Comment("Enables support for the Peridot material from Project Red [default: true]")
        @Config.RequiresWorldRestart
        public boolean PR_PERIDOT_MATERIAL = true;

        @Config.Name("Material: Ruby (Project Red)")
        @Config.Comment("Enables support for the Ruby material from Project Red [default: true]")
        @Config.RequiresWorldRestart
        public boolean PR_RUBY_MATERIAL = true;

        @Config.Name("Material: Sapphire (Project Red)")
        @Config.Comment("Enables support for the Sapphire material from Project Red [default: true]")
        @Config.RequiresWorldRestart
        public boolean PR_SAPPHIRE_MATERIAL = true;
    }

    public static class RailcraftSettings {
        @Config.Name("Material: Steel (Railcraft)")
        @Config.Comment("Enables support for the Steel material from Railcraft [default: true]")
        @Config.RequiresWorldRestart
        public boolean RC_STEEL_MATERIAL = true;
    }

    public static class ThaumcraftSettings {
        @Config.Name("Material: Thaumium")
        @Config.Comment("Enables support for the Thaumium material [default: true]")
        @Config.RequiresWorldRestart
        public boolean TC_THAUMIUM_MATERIAL = true;

        @Config.Name("Material: Void")
        @Config.Comment("Enables support for the Void material [default: true]")
        @Config.RequiresWorldRestart
        public boolean TC_VOID_MATERIAL = true;
    }

    @Mod.EventBusSubscriber(modid = BalkonsExpansion.MOD_ID)
    public static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(BalkonsExpansion.MOD_ID)) {
                ConfigManager.sync(BalkonsExpansion.MOD_ID, Config.Type.INSTANCE);
            }
        }
    }
}
