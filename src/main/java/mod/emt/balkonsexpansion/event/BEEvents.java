package mod.emt.balkonsexpansion.event;

import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.ItemShooter;
import ckathode.weaponmod.item.MeleeCompBoomerang;
import ckathode.weaponmod.item.MeleeComponent;
import mod.emt.balkonsexpansion.BEConfig;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = BalkonsExpansion.MOD_ID)
public class BEEvents {
    @SubscribeEvent
    public static void onBlockMelee(LivingAttackEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer && !event.getEntityLiving().getEntityWorld().isRemote) {
            DamageSource source = event.getSource();
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();

            if (!source.isUnblockable() && player.isActiveItemStackBlocking()) {
                ItemStack stack = player.getActiveItemStack();
                Item item = stack.getItem();
                MeleeComponent meleeComp = ((IItemWeapon) stack.getItem()).getMeleeComponent();

                // Additional blocking sound for battleaxes and katanas.
                if (item instanceof ItemMelee && !(meleeComp instanceof MeleeCompBoomerang) && BEConfig.general_settings.MELEE_BLOCKING_SOUNDS) {
                    player.getEntityWorld().playSound(null, player.getPosition(), SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.PLAYERS, 0.6F, 3.0F + player.getEntityWorld().rand.nextFloat() * 0.4F);
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onBlockRanged(LivingAttackEvent event) {
        EntityLivingBase entity = event.getEntityLiving();

        if (entity instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack stack = player.getActiveItemStack();
            Item item = stack.getItem();

            // Skips unwanted items and null values to prevent crashes.
            if (!(item instanceof IItemWeapon)) return;

            MeleeComponent meleeComp = ((IItemWeapon) stack.getItem()).getMeleeComponent();

            // Disables blocking with ranged weapons because this is mainly unintentional behavior.
            if (item instanceof ItemShooter || item instanceof ItemMelee && meleeComp instanceof MeleeCompBoomerang) {
                if (BEConfig.general_settings.NO_RANGED_BLOCKING) {
                    player.resetActiveHand();
                }
            }
        }
    }
}
