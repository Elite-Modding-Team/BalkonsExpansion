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

    public static class GeneralSettings {
        @Config.Name("Galacticraft Legacy Integration")
        @Config.Comment("Enables Galacticraft Legacy integration [default: true]")
        @Config.RequiresMcRestart
        public boolean GALACTICRAFT_INTEGRATION = true;
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
