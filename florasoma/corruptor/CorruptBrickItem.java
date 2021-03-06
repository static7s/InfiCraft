package florasoma.corruptor;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class CorruptBrickItem extends ItemBlock
{
    public static final String blockType[] =
    {
        "blood", "azure", "envy", "amber", "heart", "dark", "bright", "pure", "bloodbrick", "azurebrick",
        "envybrick", "amberbrick", "heartbrick", "darkbrick", "brightbrick", "purebrick"
    };

    public CorruptBrickItem(int id)
    {
        super(id);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int meta)
    {
        return meta;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(blockType[itemstack.getItemDamage()]).append("corrupted").toString();
    }
}
