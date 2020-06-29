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
	
}
