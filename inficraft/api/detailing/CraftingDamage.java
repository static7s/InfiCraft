package inficraft.api.detailing;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;

public class CraftingDamage implements ICraftingHandler
{
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,
			IInventory craftMatrix) {
		for (int i = 0; i < craftMatrix.getSizeInventory(); i++)
        {
            ItemStack itemstack1 = craftMatrix.getStackInSlot(i);
            if (itemstack1 == null || !DetailManager.damageOnCraft.contains(Integer.valueOf(itemstack1.itemID)))
            {
                continue;
            }
            itemstack1.stackSize++;
            itemstack1.damageItem(1, player);
            if (itemstack1.stackSize != 1)
            {
                continue;
            }
            Integer integer = (Integer)DetailManager.damageContainer.get(Integer.valueOf(itemstack1.itemID));
            if (integer != null)
            {
                craftMatrix.setInventorySlotContents(i, new ItemStack(integer.intValue(), 1, itemstack1.getItemDamage()));
            }
        }		
	}

	@Override
	public void onSmelting(EntityPlayer player, ItemStack item) 
	{
		
	}
}
