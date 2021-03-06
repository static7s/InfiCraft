package inficraft.infiblocks.bricks;

import inficraft.infiblocks.InfiBlocks;
import inficraft.infiblocks.magicslabs.MagicSlabBase;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BrickIceMagicSlab extends MagicSlabBase
{
    public BrickIceMagicSlab(int i, int j)
    {
        super(i, j, Material.ice);
    }
    
    public int getRenderBlockPass()
    {
        return 1;
    }
    
    public int getMobilityFlag()
    {
        return 0;
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture+md;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    @Override
    public void getSubBlocks(int id, CreativeTabs tab, List list)
    {
    	for (int iter = 0; iter < 3; iter++)
    	{
    		list.add(new ItemStack(id, 1, iter));
    	}
    }
}
