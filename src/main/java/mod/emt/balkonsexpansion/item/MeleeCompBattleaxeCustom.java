package mod.emt.balkonsexpansion.item;

import com.google.common.collect.Multimap;

import ckathode.weaponmod.WeaponModAttributes;
import ckathode.weaponmod.item.IExtendedReachItem;
import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.MeleeCompBattleaxe;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

// Allows us to set custom attribute amount for our battleaxes.
public class MeleeCompBattleaxeCustom extends MeleeCompBattleaxe {
    private float knockbackAmount;
    private float ignoreArmorAmount;

    public MeleeCompBattleaxeCustom(ToolMaterial material, float knockbackAmount, float ignoreArmorAmount) {
        super(material);
        this.knockbackAmount = knockbackAmount;
        this.ignoreArmorAmount = ignoreArmorAmount;
    }

    @Override
    public float getKnockBack(ItemStack itemstack, EntityLivingBase entityliving, EntityLivingBase attacker) {
        // Must include (+ 0.4F), otherwise it'll calculate wrong.
        return knockbackAmount + 0.4F;
    }

    @Override
    public float getIgnoreArmorAmount(ToolMaterial material) {
        return ignoreArmorAmount;
    }

    @Override
    public void addItemAttributeModifiers(Multimap<String, AttributeModifier> multimap) {
        float dmg = getEntityDamage();

        if (dmg > 0.0f || meleeSpecs.damageMult > 0.0f) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(IItemWeapon.ATTACK_DAMAGE_MODIFIER, "Weapon attack damage modifier", dmg, 0));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(IItemWeapon.ATTACK_SPEED_MODIFIER, "Weapon attack speed modifier", -meleeSpecs.attackDelay, 0));
        }

        if (knockbackAmount != 0.0f) {
            multimap.put(WeaponModAttributes.WEAPON_KNOCKBACK.getName(),
                    new AttributeModifier(IItemWeapon.KNOCKBACK_MODIFIER, "Weapon knockback modifier", this.knockbackAmount, 0));
        }

        if (this instanceof IExtendedReachItem) {
            try {
                multimap.put(WeaponModAttributes.WEAPON_REACH.getName(), new AttributeModifier(IItemWeapon.REACH_MODIFIER, "Weapon reach modifier",
                        ((IExtendedReachItem) this).getExtendedReach(null, null, null) - 3.0f, 0));
            } catch (NullPointerException ignored) {
            }
        }

        if (getIgnoreArmorAmount(weaponMaterial) != 0.0f) {
            multimap.put(WeaponModAttributes.IGNORE_ARMOUR_DAMAGE.getName(),
                    new AttributeModifier(IItemWeapon.IGNORE_ARMOUR_MODIFIER, "Weapon ignore armour modifier", getIgnoreArmorAmount(weaponMaterial), 0));
        }
    }
}
