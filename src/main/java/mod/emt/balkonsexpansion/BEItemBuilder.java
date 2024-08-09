package mod.emt.balkonsexpansion;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import ckathode.weaponmod.item.MeleeCompNone;
import ckathode.weaponmod.item.MeleeComponent;
import mod.emt.balkonsexpansion.item.BEItemFlail;
import mod.emt.balkonsexpansion.item.BEItemMelee;
import mod.emt.balkonsexpansion.item.BEItemMusket;
import mod.emt.balkonsexpansion.item.MeleeCompBattleaxeCustom;
import mod.emt.balkonsexpansion.item.MeleeCompBoomerangCustom;
import mod.emt.balkonsexpansion.item.MeleeCompHalberdCustom;
import mod.emt.balkonsexpansion.item.MeleeCompKatanaCustom;
import mod.emt.balkonsexpansion.item.MeleeCompKnifeCustom;
import mod.emt.balkonsexpansion.item.MeleeCompSpearCustom;
import mod.emt.balkonsexpansion.item.MeleeCompWarhammerCustom;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;

public class BEItemBuilder {
    // ==================================================================== //
    // Custom builders used to specify a custom attribute amount
    // ==================================================================== //
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float ignoreArmorAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, knockbackAmount, ignoreArmorAmount), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomBoomerang(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, knockbackAmount), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomHalberd(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, knockbackAmount, reachAmount), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomKatana(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, knockbackAmount), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomKnife(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), EnumRarity.COMMON);
    }

    public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem, float knockbackAmount) {
        return createCustomItemMusket(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), bayonetItem, EnumRarity.COMMON);
    }

    public static ItemMelee createCustomSpear(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, knockbackAmount, reachAmount), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomWarhammer(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, knockbackAmount), EnumRarity.COMMON);
    }

    // ==================================================================== //
    // Same as above except you can customize the rarity
    // ==================================================================== //
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float ignoreArmorAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, knockbackAmount, ignoreArmorAmount), rarity);
    }

    public static ItemMelee createCustomBoomerang(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, knockbackAmount), rarity);
    }

    public static ItemFlail createCustomFlail(String id, @Nonnull Item.ToolMaterial material, EnumRarity rarity) {
        return createCustomItemFlail(BalkonsExpansion.MOD_ID, id, new MeleeCompNone(material), rarity);
    }

    public static ItemMelee createCustomHalberd(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, knockbackAmount, reachAmount), rarity);
    }

    public static ItemMelee createCustomKatana(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, knockbackAmount), rarity);
    }

    public static ItemMelee createCustomKnife(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), rarity);
    }

    public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem, float knockbackAmount, EnumRarity rarity) {
        return createCustomItemMusket(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), bayonetItem, rarity);
    }

    public static ItemMelee createCustomSpear(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, knockbackAmount, reachAmount), rarity);
    }

    public static ItemMelee createCustomWarhammer(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, EnumRarity rarity) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, knockbackAmount), rarity);
    }

    // ==================================================================== //
    // More basic builders that are mainly used to easily register items
    // ==================================================================== //
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, 0.1F, 1.0F), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomBoomerang(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, 0.0F), EnumRarity.COMMON);
    }

    public static ItemFlail createCustomFlail(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemFlail(BalkonsExpansion.MOD_ID, id, new MeleeCompNone(material), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomHalberd(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, 0.2F, 1.0F), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomKatana(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, -0.4F), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomKnife(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, -0.2F), EnumRarity.COMMON);
    }

    public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem) {
        return createCustomItemMusket(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, -0.2F), bayonetItem, EnumRarity.COMMON);
    }

    public static ItemMelee createCustomSpear(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, -0.2F, 1.0F), EnumRarity.COMMON);
    }

    public static ItemMelee createCustomWarhammer(String id, @Nonnull Item.ToolMaterial material) {
        return createCustomItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, 0.3F), EnumRarity.COMMON);
    }

    // ==================================================================== //
    // Custom ItemClass Builders
    // ==================================================================== //

    public static BEItemFlail createCustomItemFlail(String modId, String id, MeleeComponent meleeComponent, EnumRarity rarity) {
        return new BEItemFlail(modId, id, meleeComponent, rarity);
    }

    public static BEItemMelee createCustomItemMelee(String modId, String id, MeleeComponent meleeComponent, EnumRarity rarity) {
        return new BEItemMelee(modId, id, meleeComponent, rarity);
    }

    public static BEItemMusket createCustomItemMusket(String modId, String id, MeleeComponent meleeComponent, @Nullable Item bayonetItem, EnumRarity rarity) {
        return new BEItemMusket(modId, id, meleeComponent, bayonetItem, rarity);
    }
}
