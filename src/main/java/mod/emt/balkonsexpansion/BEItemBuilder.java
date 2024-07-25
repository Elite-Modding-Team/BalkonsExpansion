package mod.emt.balkonsexpansion;

import ckathode.weaponmod.item.MeleeCompHalberd;
import ckathode.weaponmod.item.MeleeCompSpear;
import ckathode.weaponmod.item.MeleeComponent;
import mod.emt.balkonsexpansion.item.ItemBEMelee;
import net.minecraft.item.Item;

import javax.annotation.Nonnull;

public class BEItemBuilder {
    // Item builders
    public static ItemBEMelee createBEHalberd(String id, @Nonnull Item.ToolMaterial material) {
        return createBEItemMelee(id, new MeleeCompHalberd(material));
    }

    public static ItemBEMelee createBESpear(String id, @Nonnull Item.ToolMaterial material) {
        return createBEItemMelee(id, new MeleeCompSpear(material));
    }

    // Item class builders
    public static ItemBEMelee createBEItemMelee(String id, MeleeComponent meleeComponent) {
        return new ItemBEMelee(id, meleeComponent);
    }
}
