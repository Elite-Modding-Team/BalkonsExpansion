package mod.icarus.balkonsexpansion.item;

import javax.annotation.Nullable;

import ckathode.weaponmod.item.ItemMusket;
import ckathode.weaponmod.item.MeleeComponent;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BEItemMusket extends ItemMusket {
    private final EnumRarity rarity;

    public BEItemMusket(String modId, String id, MeleeComponent component, @Nullable Item bayonet, EnumRarity rarity) {
        super(modId, id, component, bayonet);
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
