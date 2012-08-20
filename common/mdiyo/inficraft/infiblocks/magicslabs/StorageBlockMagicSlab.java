package mdiyo.inficraft.infiblocks.magicslabs;

import java.util.ArrayList;

import mdiyo.inficraft.infiblocks.InfiBlocks;
import net.minecraft.src.Block;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class StorageBlockMagicSlab extends MagicSlabBase
{
    public StorageBlockMagicSlab(int i, int j)
    {
        super(i, j, Material.rock);
    }
    
    public float getHardness(int md) {
    	switch(md) {
    	case 0: return 3F;
        case 1: return 3F; 
        case 2: return 3F;
        case 3: return 3F;
        case 4: return 3F;
        case 5: return 0.5F;
        case 12: return 1.5F; //Netherrack
        case 13: return Block.sandStone.getBlockHardness(null, 0, 0, 0) * 2F;
        case 14: return Block.stoneBrick.getBlockHardness(null, 0, 0, 0);
        case 15: return Block.brick.getBlockHardness(null, 0, 0, 0);
        default: return 0;
    	}
    }
    
    public int getBlockTextureFromSideAndMetadata(int side, int md)
    {
        return blockIndexInTexture+md;
    }
    
    public String getTextureFile()
    {
        return InfiBlocks.blocksImage;
    }
    
    public void addCreativeItems(ArrayList arraylist)
    {
    	for (int iter = 0; iter < 5; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().magicSlabStone, 1, 0));
    	}
    	for (int iter = 12; iter < 16; iter++)
    	{
    		arraylist.add(new ItemStack(InfiBlocks.getContentInstance().magicSlabStone, 1, 0));
    	}
    }
}
