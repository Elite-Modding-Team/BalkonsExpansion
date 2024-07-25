package mod.emt.balkonsexpansion.compat.galacticraft;

import micdoodle8.mods.galacticraft.planets.mars.items.MarsItems;
import mod.emt.balkonsexpansion.BEItemBuilder;
import mod.emt.balkonsexpansion.item.ItemBEMelee;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class GalacticraftRegistration {
    public static ItemBEMelee halberdDesh;

    public static ItemBEMelee spearDesh;

    public static void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(spearDesh = BEItemBuilder.createBESpear("spear.desh", MarsItems.TOOLDESH));

        registry.register(halberdDesh = BEItemBuilder.createBEHalberd("halberd.desh", MarsItems.TOOLDESH));
    }
}
