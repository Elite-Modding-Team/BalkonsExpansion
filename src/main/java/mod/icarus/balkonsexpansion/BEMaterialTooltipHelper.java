package mod.icarus.balkonsexpansion;

import ckathode.weaponmod.item.IItemWeapon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Adds tooltips to Balkon's tools, useful if the material it's supporting is adding them
@Mod.EventBusSubscriber(modid = BalkonsExpansion.MOD_ID, value = Side.CLIENT)
public class BEMaterialTooltipHelper {
    private static final Map<Item.ToolMaterial, List<String>> REGISTRY = new HashMap<>();

    public static void registerTooltip(Item.ToolMaterial material, String tooltip) {
        if (material == null || tooltip == null || tooltip.isEmpty()) {
            return;
        }

        List<String> tooltips = REGISTRY.get(material);
        if (tooltips == null) {
            tooltips = new ArrayList<>();
            REGISTRY.put(material, tooltips);
        }

        tooltips.add(tooltip);
    }

    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        if (stack.isEmpty() || !(stack.getItem() instanceof IItemWeapon)) {
            return;
        }

        IItemWeapon weapon = (IItemWeapon) stack.getItem();
        if (weapon.getMeleeComponent() == null || weapon.getMeleeComponent().weaponMaterial == null) {
            return;
        }

        Item.ToolMaterial material = weapon.getMeleeComponent().weaponMaterial;
        List<String> tooltips = REGISTRY.get(material);
        if (tooltips == null || tooltips.isEmpty()) {
            return;
        }

        event.getToolTip().addAll(1, tooltips);
    }
}