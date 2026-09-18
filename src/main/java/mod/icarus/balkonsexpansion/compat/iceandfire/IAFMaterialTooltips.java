package mod.icarus.balkonsexpansion.compat.iceandfire;

import mod.icarus.balkonsexpansion.BEMaterialHelper;
import mod.icarus.balkonsexpansion.BEMaterialTooltipHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;

public class IAFMaterialTooltips {
    public static void registerMaterialTooltips() {
        // Silver - +2 damage against undead
        if (BEMaterialHelper.iafSilverMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafSilverMaterial(), TextFormatting.GREEN + I18n.format("silvertools.hurt"));
        }
        // Flamed Dragon Bone - +8 damage against ice dragons and ignites targets for 5 seconds
        if (BEMaterialHelper.iafFireDragonboneMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafFireDragonboneMaterial(), TextFormatting.GREEN + I18n.format("dragon_sword_fire.hurt1"));
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafFireDragonboneMaterial(), TextFormatting.DARK_RED + I18n.format("dragon_sword_fire.hurt2"));
        }
    }
}
