package mod.emt.balkonsexpansion;

import javax.annotation.Nonnull;

import ckathode.weaponmod.WMItemBuilder;
import ckathode.weaponmod.item.ItemFlail;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemMusket;
import ckathode.weaponmod.item.MeleeCompNone;
import mod.emt.balkonsexpansion.item.MeleeCompBattleaxeCustom;
import mod.emt.balkonsexpansion.item.MeleeCompBoomerangCustom;
import mod.emt.balkonsexpansion.item.MeleeCompHalberdCustom;
import mod.emt.balkonsexpansion.item.MeleeCompKatanaCustom;
import mod.emt.balkonsexpansion.item.MeleeCompKnifeCustom;
import mod.emt.balkonsexpansion.item.MeleeCompSpearCustom;
import mod.emt.balkonsexpansion.item.MeleeCompWarhammerCustom;
import net.minecraft.item.Item;

public class BEItemBuilder {
    // ==================================================================== //
    // Custom builders used to specify a custom attribute amount
    // ==================================================================== //
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float ignoreArmorAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, knockbackAmount, ignoreArmorAmount));
    }

    public static ItemMelee createCustomBoomerang(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, knockbackAmount));
    }

    public static ItemMelee createCustomHalberd(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, knockbackAmount, reachAmount));
    }

    public static ItemMelee createCustomKatana(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, knockbackAmount));
    }

    public static ItemMelee createCustomKnife(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount));
    }

    public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem, float knockbackAmount) {
        return WMItemBuilder.createItemMusket(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), bayonetItem);
    }

    public static ItemMelee createCustomSpear(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, knockbackAmount, reachAmount));
    }

    public static ItemMelee createCustomWarhammer(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, knockbackAmount));
    }

    // ==================================================================== //
    // More basic builders that are mainly just used to register the items more easily
    // ==================================================================== //
    public static ItemMelee createCustomBattleaxe(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, 0.1F, 1.0F));
    }

    public static ItemMelee createCustomBoomerang(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, 0.0F));
    }

    public static ItemFlail createCustomFlail(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemFlail(BalkonsExpansion.MOD_ID, id, new MeleeCompNone(material));
    }

    public static ItemMelee createCustomHalberd(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, 0.2F, 1.0F));
    }

    public static ItemMelee createCustomKatana(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, -0.4F));
    }

    public static ItemMelee createCustomKnife(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, -0.2F));
    }

    public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem) {
        return WMItemBuilder.createItemMusket(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, -0.2F), bayonetItem);
    }

    public static ItemMelee createCustomSpear(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, -0.2F, 1.0F));
    }

    public static ItemMelee createCustomWarhammer(String id, @Nonnull Item.ToolMaterial material) {
        return WMItemBuilder.createItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, 0.3F));
    }
}
