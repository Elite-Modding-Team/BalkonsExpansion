package mod.emt.balkonsexpansion;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static mod.emt.balkonsexpansion.BalkonsExpansion.*;

@Mod(modid = MOD_ID, name = NAME, version = VERSION, acceptedMinecraftVersions = ACCEPTED_VERSIONS, dependencies = DEPENDENCIES)
public class BalkonsExpansion {
    public static final String MOD_ID = Tags.MOD_ID;
    public static final String NAME = "Balkon's Expansion";
    public static final String VERSION = Tags.VERSION;
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:weaponmod@[1.22.0,);after:galacticraftcore;after:galacticraftplanets;after:ic2-classic-spmod;after:mocreatures@[12.4.3,);after:railcraft;"
            + "after:projectred-exploration;after:thaumcraft@[1.12.2-6.1.BETA26,);";
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @Mod.Instance
    public static BalkonsExpansion instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        LOGGER.info(NAME + " pre-initialized");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LOGGER.info(NAME + " initialized");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LOGGER.info(NAME + " post-initialized");
    }
}
