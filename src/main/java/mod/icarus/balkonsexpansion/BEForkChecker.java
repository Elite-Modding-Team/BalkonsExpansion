package mod.icarus.balkonsexpansion;

import net.minecraftforge.fml.common.Loader;

public class BEForkChecker {
    public static boolean isIAFRLCraftEdition() {
        return Loader.instance().getIndexedModList().get("iceandfire").getMetadata().getAuthorList().contains("Kotlin-Programmer");
    }

    public static boolean isIAFRotNEdition() {
        return Loader.instance().getIndexedModList().get("iceandfire").getName().equals("Ice And Fire: RotN Edition");
    }
}
