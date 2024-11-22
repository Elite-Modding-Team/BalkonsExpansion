package mod.icarus.balkonsexpansion.compat.thaumcraft;

import javax.annotation.Nonnull;
import ckathode.weaponmod.item.MeleeCompNone;
import ckathode.weaponmod.item.MeleeComponent;
import mod.icarus.balkonsexpansion.BalkonsExpansion;
import mod.icarus.balkonsexpansion.compat.thaumcraft.item.BEItemFlailVoid;
import mod.icarus.balkonsexpansion.compat.thaumcraft.item.BEItemMeleeVoid;
import mod.icarus.balkonsexpansion.item.MeleeCompBattleaxeCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompBoomerangCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompHalberdCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompKatanaCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompKnifeCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompSpearCustom;
import mod.icarus.balkonsexpansion.item.MeleeCompWarhammerCustom;
import net.minecraft.item.Item;

public class ThaumcraftItemBuilder {
    // ==================================================================== //
    // Custom builders used for void weapons
    // ==================================================================== //
    public static BEItemMeleeVoid createVoidBattleaxe(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float ignoreArmorAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBattleaxeCustom(material, knockbackAmount, ignoreArmorAmount));
    }

    public static BEItemMeleeVoid createVoidBoomerang(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompBoomerangCustom(material, knockbackAmount));
    }

    public static BEItemFlailVoid createVoidFlail(String id, @Nonnull Item.ToolMaterial material) {
        return createVoidItemFlail(BalkonsExpansion.MOD_ID, id, new MeleeCompNone(material));
    }

    public static BEItemMeleeVoid createVoidHalberd(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompHalberdCustom(material, knockbackAmount, reachAmount));
    }

    public static BEItemMeleeVoid createVoidKatana(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKatanaCustom(material, knockbackAmount));
    }

    public static BEItemMeleeVoid createVoidKnife(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount));
    }

    /*public static ItemMusket createCustomMusketBayonet(String id, @Nonnull Item.ToolMaterial material, @Nonnull Item bayonetItem, float knockbackAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompKnifeCustom(material, knockbackAmount), bayonetItem, EnumRarity.COMMON);
    }*/

    public static BEItemMeleeVoid createVoidSpear(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount, float reachAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompSpearCustom(material, knockbackAmount, reachAmount));
    }

    public static BEItemMeleeVoid createVoidWarhammer(String id, @Nonnull Item.ToolMaterial material, float knockbackAmount) {
        return createVoidItemMelee(BalkonsExpansion.MOD_ID, id, new MeleeCompWarhammerCustom(material, knockbackAmount));
    }

    // ==================================================================== //
    // Custom ItemClass Builders for void weapons
    // ==================================================================== //

    public static BEItemFlailVoid createVoidItemFlail(String modId, String id, MeleeComponent meleeComponent) {
        return new BEItemFlailVoid(modId, id, meleeComponent);
    }

    public static BEItemMeleeVoid createVoidItemMelee(String modId, String id, MeleeComponent meleeComponent) {
        return new BEItemMeleeVoid(modId, id, meleeComponent);
    }
}
