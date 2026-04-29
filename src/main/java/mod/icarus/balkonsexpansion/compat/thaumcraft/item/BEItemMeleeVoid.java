package mod.icarus.balkonsexpansion.compat.thaumcraft.item;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.MeleeComponent;
import mod.icarus.balkonsexpansion.item.BEItemMelee;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thaumcraft.api.items.IWarpingGear;

public class BEItemMeleeVoid extends BEItemMelee implements IItemWeapon, IWarpingGear {
    public BEItemMeleeVoid(String modId, String id, MeleeComponent component) {
        super(modId, id, component, EnumRarity.UNCOMMON);
    }

    @Override
    public void onUpdate(@Nonnull ItemStack stack, @Nonnull World world, @Nonnull Entity entity, int itemSlot, boolean isSelected) {
        super.onUpdate(stack, world, entity, itemSlot, isSelected);

        if (stack.isItemDamaged() && entity != null && entity.ticksExisted % 20 == 0) {
            stack.attemptDamageItem(-1, world.rand, entity instanceof EntityPlayerMP ? (EntityPlayerMP) entity : null);
        }
    }

    @Override
    public int getWarp(ItemStack itemstack, EntityPlayer player) {
        return 1;
    }

    @Override
    public boolean shouldCauseReequipAnimation(@Nonnull ItemStack oldStack, @Nonnull ItemStack newStack, boolean slotChanged) {
        return slotChanged || oldStack.getItem() != newStack.getItem();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(@Nonnull ItemStack stack, @Nullable World world, List<String> tooltip, @Nonnull ITooltipFlag flag) {
        tooltip.add(new TextComponentTranslation("enchantment.special.sapless").setStyle(new Style().setColor(TextFormatting.GOLD)).getFormattedText());
        super.addInformation(stack, world, tooltip, flag);
    }
}
