package mod.icarus.balkonsexpansion.item;

import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.MeleeComponent;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

public class BEItemMelee extends ItemMelee implements IItemWeapon {
    private final EnumRarity rarity;

    public BEItemMelee(String modId, String id, MeleeComponent component, EnumRarity rarity) {
        super(modId, id, component);
        this.rarity = rarity;
    }

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
