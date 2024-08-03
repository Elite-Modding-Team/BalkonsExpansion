package mod.emt.balkonsexpansion;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = BalkonsExpansion.MOD_ID, name = BalkonsExpansion.NAME)
public class BEConfig {
    @Config.Comment("General")
    public static GeneralSettings general_settings = new GeneralSettings();

    @Config.Comment("Galacticraft Legacy")
    public static GalacticraftSettings galacticraft_settings = new GalacticraftSettings();

    @Config.Comment("Industrial Craft 2 Classic")
    public static IC2ClassicSettings ic2_classic_settings = new IC2ClassicSettings();

    @Config.Comment("Project Red Exploration")
    public static ProjectRedSettings project_red_settings = new ProjectRedSettings();

    @Config.Comment("Railcraft")
    public static RailcraftSettings railcraft_settings = new RailcraftSettings();

    @Config.Comment("Thaumcraft")
    public static ThaumcraftSettings thaumcraft_settings = new ThaumcraftSettings();

    public static class GeneralSettings {
        @Config.Name("Galacticraft Legacy Integration")
        @Config.Comment("Enables Galacticraft Legacy integration [default: true]")
        @Config.RequiresMcRestart
        public boolean GALACTICRAFT_INTEGRATION = true;

        @Config.Name("Industrial Craft 2 Classic Integration")
        @Config.Comment("Enables Industrial Craft 2 Classic integration [default: true]")
        @Config.RequiresMcRestart
        public boolean IC2_CLASSIC_INTEGRATION = true;

        @Config.Name("Project Red Exploration Integration")
        @Config.Comment("Enables Project Red Exploration integration [default: true]")
        @Config.RequiresMcRestart
        public boolean PROJECT_RED_INTEGRATION = true;

        @Config.Name("Railcraft Integration")
        @Config.Comment("Enables Railcraft integration [default: true]")
        @Config.RequiresMcRestart
        public boolean RAILCRAFT_INTEGRATION = true;

        @Config.Name("Thaumcraft Integration")
        @Config.Comment("Enables Thaumcraft integration [default: true]")
        @Config.RequiresMcRestart
        public boolean THAUMCRAFT_INTEGRATION = true;
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

        @Config.Name("Material: Titanium")
        @Config.Comment("Enables support for the Titanium material [default: true]")
        @Config.RequiresWorldRestart
        public boolean GC_TITANIUM_MATERIAL = true;
    }

    public static class IC2ClassicSettings {
        @Config.Name("Material: Bronze (IC2 Classic)")
        @Config.Comment("Enables support for the Bronze material from IC2 Classic [default: true]")
        @Config.RequiresWorldRestart
        public boolean IC2C_BRONZE_MATERIAL = true;
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
