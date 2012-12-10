package mDiyo;

import mDiyo.inficraft.armory.ArmorStandEntity;
import mDiyo.simplebackground.SimpleBGM;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityItem;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

/*
 * mDiyo's development testing mod
 * Does everything on right-click!
 */

public class XinStick extends Item
{
	public XinStick(int id) { super(id); }

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		System.out.println("Click");
		//SimpleBGM.instance.playBGM();
		world.playSoundEffect(player.posX, player.posY, player.posZ, "day.bgm", 1f, 1f);
		spawnEntity(player.posX, player.posY, player.posZ, new ArmorStandEntity(world), world);
        return stack;
    }
	
	public static void spawnItem(double x, double y, double z, ItemStack stack, World world)
    {
    	if (!world.isRemote)
    	{
	        EntityItem entityitem = new EntityItem(world, x + 0.5D, y + 0.5D, z + 0.5D, stack);
	        entityitem.delayBeforeCanPickup = 10;
	        world.spawnEntityInWorld(entityitem);
    	}
    }
	
	public static void spawnEntity(double x, double y, double z, Entity entity, World world)
    {
    	if (!world.isRemote)
    	{
	        world.spawnEntityInWorld(entity);
    	}
    }
}