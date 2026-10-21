package mod.icarus.balkonsexpansion.compat.iceandfire;

import mod.icarus.balkonsexpansion.BEMaterialHelper;
import mod.icarus.balkonsexpansion.BEMaterialTooltipHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.TextFormatting;

public class IAFMaterialTooltips {
    public static void registerMaterialTooltips() {
        // Flamed Dragon Bone - +8 damage against ice dragons and ignites targets for 5 seconds
        if (BEMaterialHelper.iafFireDragonboneMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafFireDragonboneMaterial(), TextFormatting.GREEN + I18n.format("dragon_sword_fire.hurt1"));
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafFireDragonboneMaterial(), TextFormatting.DARK_RED + I18n.format("dragon_sword_fire.hurt2"));
        }

        // Fire Dragonsteel - Ignites targets for 15 seconds
        if (BEMaterialHelper.iafFireDragonsteelMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafFireDragonsteelMaterial(), TextFormatting.DARK_RED + I18n.format("dragon_sword_fire.hurt2"));
        }

        // Iced Dragon Bone - +8 damage against fire dragons, applies Mining Fatigue III and Slowness III for 5 seconds
        if (BEMaterialHelper.iafIceDragonboneMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafIceDragonboneMaterial(), TextFormatting.GREEN + I18n.format("dragon_sword_ice.hurt1"));
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafIceDragonboneMaterial(), TextFormatting.AQUA + I18n.format("dragon_sword_ice.hurt2"));
        }

        // Ice Dragonsteel - Applies Slowness III for 15 seconds
        if (BEMaterialHelper.iafIceDragonsteelMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafIceDragonsteelMaterial(), TextFormatting.AQUA + I18n.format("dragon_sword_ice.hurt2"));
        }

        // Silver - +2 damage against undead
        if (BEMaterialHelper.iafSilverMaterial() != null) {
            BEMaterialTooltipHelper.registerTooltip(BEMaterialHelper.iafSilverMaterial(), TextFormatting.GREEN + I18n.format("silvertools.hurt"));
        }
    }
}
