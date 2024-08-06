package mod.emt.balkonsexpansion;

import javax.annotation.Nonnull;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemMelee;
import mod.emt.balkonsexpansion.item.MeleeCompBattleaxeCustom;
import net.minecraft.item.Item;

public class BEItemBuilder {
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, 0.1F, 1.0F));
    }

    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float ignoreArmorAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, knockbackAmount, ignoreArmorAmount));
    }
}
