package mod.icarus.balkonsexpansion.item;

import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.MeleeComponent;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class BEItemFlail extends ItemFlail {
    private final EnumRarity rarity;

    public BEItemFlail(String modId, String id, MeleeComponent component, EnumRarity rarity) {
        super(modId, id, component);
        this.rarity = rarity;
    }

    // Flails are not enchantable but these checks are here just in case.
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        if (rarity == EnumRarity.RARE) {
            return stack.isItemEnchanted() ? EnumRarity.EPIC : rarity;
        } else if (rarity == EnumRarity.UNCOMMON || rarity == EnumRarity.COMMON) {
            return stack.isItemEnchanted() ? EnumRarity.RARE : rarity;
        } else {
            return rarity;
        }
    }
}
