package mod.icarus.balkonsexpansion.event;

import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.MeleeCompBoomerang;
import ckathode.weaponmod.item.MeleeComponent;
import mod.icarus.balkonsexpansion.BEConfig;
import mod.icarus.balkonsexpansion.BalkonsExpansion;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.Mod;
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

                // Skips unwanted items and null values to prevent crashes.
                if (!(item instanceof IItemWeapon)) return;

                MeleeComponent meleeComp = ((IItemWeapon) stack.getItem()).getMeleeComponent();

                // Additional blocking sound for battleaxes and katanas.
                if (item instanceof ItemMelee && !(meleeComp instanceof MeleeCompBoomerang) && BEConfig.general_settings.MELEE_BLOCKING_SOUNDS) {
                    player.getEntityWorld().playSound(null, player.getPosition(), SoundEvents.ENTITY_ZOMBIE_ATTACK_IRON_DOOR, SoundCategory.PLAYERS, 0.6F, 3.0F + player.getEntityWorld().rand.nextFloat() * 0.4F);
                }
            }
        }
    }
}
