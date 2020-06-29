package SlightStank.ArcticCircle.init;

import SlightStank.ArcticCircle.ArcticCircle;
import SlightStank.ArcticCircle.ArcticCircleItemGroup;
import SlightStank.ArcticCircle.lists.ArmorMaterialList;
import SlightStank.ArcticCircle.lists.BlockList;
import SlightStank.ArcticCircle.lists.ItemList;
import SlightStank.ArcticCircle.lists.ToolMaterialList;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ArcticCircle.MOD_ID, bus = Bus.MOD)
public class ItemInit {
	
	public static final ItemGroup ARCTICCIRCLE = ArcticCircle.ARCTICCIRCLE;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
	
		event.getRegistry().registerAll(
		
			//Items
			ItemList.snow_powder = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("snow_powder")),
			ItemList.impure_steel = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("impure_steel")),
			ItemList.cold_steel = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("cold_steel")),
			
			//Tools
			ItemList.cold_steel_axe = new AxeItem(ToolMaterialList.cold_steel_material, -1.0f, 6.0f, new Item.Properties().group(ARCTICCIRCLE))
				.setRegistryName(location("cold_steel_axe")),
			ItemList.cold_steel_pick = new PickaxeItem(ToolMaterialList.cold_steel_material, -1, 6.0f, new Item.Properties().group(ARCTICCIRCLE))
				.setRegistryName(location("cold_steel_pick")),
			ItemList.cold_steel_hoe = new HoeItem(ToolMaterialList.cold_steel_material, 6.0f, new Item.Properties().group(ARCTICCIRCLE))
				.setRegistryName(location("cold_steel_hoe")),
			ItemList.cold_steel_shovel = new ShovelItem(ToolMaterialList.cold_steel_material, -1.0f, 6.0f, new Item.Properties().group(ARCTICCIRCLE))
				.setRegistryName(location("cold_steel_shovel")),
			ItemList.cold_steel_sword = new SwordItem(ToolMaterialList.cold_steel_material, 2, 10.0f, new Item.Properties().group(ARCTICCIRCLE))
				.setRegistryName(location("cold_steel_sword")),
				
			//Armor
			ItemList.cold_steel_helmet = new ArmorItem(ArmorMaterialList.cold_steel_material, EquipmentSlotType.HEAD, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(location("cold_steel_helmet")),
			ItemList.cold_steel_chestplate = new ArmorItem(ArmorMaterialList.cold_steel_material, EquipmentSlotType.CHEST, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(location("cold_steel_chestplate")),
			ItemList.cold_steel_leggings = new ArmorItem(ArmorMaterialList.cold_steel_material, EquipmentSlotType.LEGS, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(location("cold_steel_leggings")),
			ItemList.cold_steel_boots = new ArmorItem(ArmorMaterialList.cold_steel_material, EquipmentSlotType.FEET, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(location("cold_steel_boots"))
				
			
		);
		ArcticCircle.LOGGER.info("Items Registered");
	}
	private static ResourceLocation location(String name) {
		return new ResourceLocation(ArcticCircle.MOD_ID, name); 
	}
}
