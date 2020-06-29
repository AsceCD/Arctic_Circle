package SlightStank.ArcticCircle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import SlightStank.ArcticCircle.lists.ArmorMaterialList;
import SlightStank.ArcticCircle.lists.BlockList;
import SlightStank.ArcticCircle.lists.ItemList;
import SlightStank.ArcticCircle.lists.ToolMaterialList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
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
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("arcticcircle")
public class ArcticCircle {
	public static ArcticCircle instance;
	public static final String MOD_ID = "arcticcircle";

	public static final ItemGroup ARCTICCIRCLE = new ArcticCircleItemGroup();
	
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	public ArcticCircle() {

		instance = this;
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		LOGGER.info("Setup method Registered");
	}

	private void clientRegistries(final FMLClientSetupEvent event) {
		LOGGER.info("clientRegistries method Registered");
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		/*@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
		
			event.getRegistry().registerAll(
			
				//Items
				ItemList.snow_powder = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("snow_powder")),
				ItemList.impure_steel = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("impure_steel")),
				ItemList.cold_steel = new Item(new Item.Properties().group(ARCTICCIRCLE)).setRegistryName(location("cold_steel")),
				
				//ItemBlocks
				ItemList.snow_powder_ore = new BlockItem(BlockList.snow_powder_ore, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(BlockList.snow_powder_ore.getRegistryName()),
				ItemList.snow_powder_block = new BlockItem(BlockList.snow_powder_block, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(BlockList.snow_powder_block.getRegistryName()),
				ItemList.impure_steel_block = new BlockItem(BlockList.impure_steel_block, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(BlockList.impure_steel_block.getRegistryName()),
				ItemList.cold_steel_block = new BlockItem(BlockList.cold_steel_block, new Item.Properties().group(ARCTICCIRCLE))
					.setRegistryName(BlockList.cold_steel_block.getRegistryName()),
				
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
			LOGGER.info("Items Registered");
		}
		*/
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		
			event.getRegistry().registerAll(
					
				BlockList.snow_powder_ore = new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2)
						.sound(SoundType.STONE)).setRegistryName(location("snow_powder_ore")),
				BlockList.snow_powder_block = new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2)
						.sound(SoundType.METAL)).setRegistryName(location("snow_powder_block")),
				BlockList.impure_steel_block = new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2)
						.sound(SoundType.METAL)).setRegistryName(location("impure_steel_block")),
				BlockList.cold_steel_block = new Block(Block.Properties.create(Material.IRON).harvestTool(ToolType.PICKAXE).harvestLevel(2)
						.sound(SoundType.METAL)).setRegistryName(location("cold_steel_block"))
				
				
			);
			LOGGER.info("Blocks Registered");
		}
		private static ResourceLocation location(String name) {
			return new ResourceLocation(ArcticCircle.MOD_ID, name); 
		}
		
	}
	
}
