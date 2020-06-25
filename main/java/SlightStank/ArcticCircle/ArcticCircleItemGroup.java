package SlightStank.ArcticCircle;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ArcticCircleItemGroup extends ItemGroup {

	public ArcticCircleItemGroup() {
		super("Arctic Circle");
		
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.ICE);
	}

}
