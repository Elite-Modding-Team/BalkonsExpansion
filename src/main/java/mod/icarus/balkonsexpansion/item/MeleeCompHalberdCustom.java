package mod.icarus.balkonsexpansion.item;

import com.google.common.collect.Multimap;

import ckathode.weaponmod.WeaponModAttributes;
import ckathode.weaponmod.item.IExtendedReachItem;
import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.MeleeCompHalberd;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

// Allows us to set custom attribute amounts for our halberds.
public class MeleeCompHalberdCustom extends MeleeCompHalberd implements IExtendedReachItem {
    private float knockbackAmount;
    private float reachAmount;

    public MeleeCompHalberdCustom(ToolMaterial material, float knockbackAmount, float reachAmount) {
        super(material);
        this.knockbackAmount = knockbackAmount;
        this.reachAmount = reachAmount;
    }

    @Override
    public float getKnockBack(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase attacker) {
        // Must include (+ 0.4F), otherwise it'll calculate wrong.
    	float kb = knockbackAmount + 0.4F;
        return getHalberdState(itemstack) ? (kb / 2.0f) : kb;
    }

    @Override
    public void addItemAttributeModifiers(Multimap<String, AttributeModifier> multimap) {
        float dmg = getEntityDamage();

        if (dmg > 0.0F || meleeSpecs.damageMult > 0.0F) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(IItemWeapon.ATTACK_DAMAGE_MODIFIER, "Weapon attack damage modifier", dmg, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(IItemWeapon.ATTACK_SPEED_MODIFIER, "Weapon attack speed modifier", -meleeSpecs.attackDelay, 0));
        }

        if (knockbackAmount != 0.0F) {
            multimap.put(WeaponModAttributes.WEAPON_KNOCKBACK.getName(),
                    new AttributeModifier(IItemWeapon.KNOCKBACK_MODIFIER, "Weapon knockback modifier", this.knockbackAmount, 0));
        }

        if (this instanceof IExtendedReachItem) {
            try {
                multimap.put(WeaponModAttributes.WEAPON_REACH.getName(), new AttributeModifier(IItemWeapon.REACH_MODIFIER, "Weapon reach modifier",
                        ((IExtendedReachItem) this).getExtendedReach(null, null, null) - 3.0F, 0));
            } catch (NullPointerException ignored) {
            }
        }
    }

    @Override
    public float getExtendedReach(World world, EntityLivingBase living, ItemStack itemstack) {
        // Must include (+ 3.0F), otherwise it'll calculate wrong.
        return reachAmount + 3.0F;
    }
}
