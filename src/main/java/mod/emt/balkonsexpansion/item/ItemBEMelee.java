package mod.emt.balkonsexpansion.item;

import ckathode.weaponmod.item.IItemWeapon;
import ckathode.weaponmod.item.ItemMelee;
import ckathode.weaponmod.item.MeleeComponent;
import mod.emt.balkonsexpansion.BalkonsExpansion;
import net.minecraft.util.ResourceLocation;

public class ItemBEMelee extends ItemMelee implements IItemWeapon {
    public ItemBEMelee(String id, MeleeComponent meleecomponent) {
        super(id, meleecomponent);
        setRegistryName(new ResourceLocation(BalkonsExpansion.MOD_ID, id));
    }
}
