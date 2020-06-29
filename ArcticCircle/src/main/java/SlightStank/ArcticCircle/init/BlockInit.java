package SlightStank.ArcticCircle.init;

import SlightStank.ArcticCircle.ArcticCircle;
import SlightStank.ArcticCircle.ArcticCircleItemGroup;
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
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = ArcticCircle.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	
	public static final ItemGroup ARCTICCIRCLE = ArcticCircle.ARCTICCIRCLE;
	
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
		ArcticCircle.LOGGER.info("Blocks Registered");
	}
	private static ResourceLocation location(String name) {
		return new ResourceLocation(ArcticCircle.MOD_ID, name); 
	}
}
