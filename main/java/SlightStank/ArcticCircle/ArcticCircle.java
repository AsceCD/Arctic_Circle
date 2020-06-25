package SlightStank.ArcticCircle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import SlightStank.ArcticCircle.lists.BlockList;
import SlightStank.ArcticCircle.lists.ItemList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
	
	private static final Logger LOGGER = LogManager.getLogger(MOD_ID);

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
		
		@SubscribeEvent
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
					.setRegistryName(BlockList.cold_steel_block.getRegistryName())
				
			);
			LOGGER.info("Items Registered");
		}
		
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
			
			return new ResourceLocation(MOD_ID, name); 
		}
	}
}
