package mod.emt.balkonsexpansion.compat;

import mod.emt.balkonsexpansion.BalkonsExpansion;
import mod.emt.balkonsexpansion.compat.galacticraft.GalacticraftMaterialColors;
import mod.emt.balkonsexpansion.compat.galacticraft.GalacticraftRegistration;
import net.minecraft.item.Item;
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
        if (Loader.isModLoaded("galacticraftcore") && (Loader.isModLoaded("galacticraftplanets"))) {
            GalacticraftRegistration.registerItems(event);
            GalacticraftMaterialColors.init();
            if (FMLLaunchHandler.side().isClient()) {
                GalacticraftRegistration.registerRenderersItem();
            }
        }
    }
}
