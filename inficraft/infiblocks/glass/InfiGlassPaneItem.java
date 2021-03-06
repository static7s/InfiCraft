package inficraft.infiblocks.glass;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class InfiGlassPaneItem extends ItemBlock
{
	public static final String blockType[] =
	    {
			"clear", "soul", "clearSoul"
	    };

    public InfiGlassPaneItem(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }
    
    public int getMetadata(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("GlassPane").toString();
    }
}
