
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.new_crops.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.new_crops.block.TomatoPlantBlock;
import net.mcreator.new_crops.block.TomatoPlantAge4Block;
import net.mcreator.new_crops.block.TomatoPlantAge3Block;
import net.mcreator.new_crops.block.TomatoPlantAge2Block;
import net.mcreator.new_crops.block.TomatoPlantAge1Block;
import net.mcreator.new_crops.block.CropSupportTopBlock;
import net.mcreator.new_crops.block.CropSupportBlock;
import net.mcreator.new_crops.NewCropsMod;

public class NewCropsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewCropsMod.MODID);
	public static final RegistryObject<Block> TOMATO_PLANT = REGISTRY.register("tomato_plant", () -> new TomatoPlantBlock());
	public static final RegistryObject<Block> CROP_SUPPORT = REGISTRY.register("crop_support", () -> new CropSupportBlock());
	public static final RegistryObject<Block> CROP_SUPPORT_TOP = REGISTRY.register("crop_support_top", () -> new CropSupportTopBlock());
	public static final RegistryObject<Block> TOMATO_PLANT_AGE_2 = REGISTRY.register("tomato_plant_age_2", () -> new TomatoPlantAge2Block());
	public static final RegistryObject<Block> TOMATO_PLANT_AGE_1 = REGISTRY.register("tomato_plant_age_1", () -> new TomatoPlantAge1Block());
	public static final RegistryObject<Block> TOMATO_PLANT_AGE_3 = REGISTRY.register("tomato_plant_age_3", () -> new TomatoPlantAge3Block());
	public static final RegistryObject<Block> TOMATO_PLANT_AGE_4 = REGISTRY.register("tomato_plant_age_4", () -> new TomatoPlantAge4Block());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TomatoPlantBlock.registerRenderLayer();
			CropSupportBlock.registerRenderLayer();
			CropSupportTopBlock.registerRenderLayer();
			TomatoPlantAge2Block.registerRenderLayer();
			TomatoPlantAge1Block.registerRenderLayer();
			TomatoPlantAge3Block.registerRenderLayer();
			TomatoPlantAge4Block.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			TomatoPlantBlock.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			TomatoPlantBlock.itemColorLoad(event);
		}
	}
}
