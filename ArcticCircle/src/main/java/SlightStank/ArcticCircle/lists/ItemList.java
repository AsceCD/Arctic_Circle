package SlightStank.ArcticCircle.lists;

import SlightStank.ArcticCircle.ArcticCircle;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = ArcticCircle.MOD_ID, bus = Bus.MOD)
@ObjectHolder(ArcticCircle.MOD_ID)
public class ItemList {

	//Items
	public static Item snow_powder;
	public static Item impure_steel;
	public static Item cold_steel;
	public static Item ice_pop;
	
	//Item Blocks
	public static Item snow_powder_ore;
	public static Item snow_powder_block;
	public static Item impure_steel_block;
	public static Item cold_steel_block;
	
	//Tools
	public static Item cold_steel_pick;
	public static Item cold_steel_axe;
	public static Item cold_steel_shovel;
	public static Item cold_steel_hoe;
	public static Item cold_steel_sword;
	
	//Armor
	public static Item cold_steel_helmet;
	public static Item cold_steel_chestplate;
	public static Item cold_steel_leggings;
	public static Item cold_steel_boots;
		
}
