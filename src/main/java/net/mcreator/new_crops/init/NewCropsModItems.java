
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.new_crops.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.new_crops.item.TomatoUnRipeItem;
import net.mcreator.new_crops.item.TomatoSeedItem;
import net.mcreator.new_crops.item.TomatoRipeItem;
import net.mcreator.new_crops.item.TomatoItem;
import net.mcreator.new_crops.NewCropsMod;

public class NewCropsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewCropsMod.MODID);
	public static final RegistryObject<Item> TOMATO_PLANT = block(NewCropsModBlocks.TOMATO_PLANT, NewCropsModTabs.TAB_NEW_CRODS);
	public static final RegistryObject<Item> TOMATO_SEED = REGISTRY.register("tomato_seed", () -> new TomatoSeedItem());
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> TOMATO_RIPE = REGISTRY.register("tomato_ripe", () -> new TomatoRipeItem());
	public static final RegistryObject<Item> TOMATO_UN_RIPE = REGISTRY.register("tomato_un_ripe", () -> new TomatoUnRipeItem());
	public static final RegistryObject<Item> CROP_SUPPORT = block(NewCropsModBlocks.CROP_SUPPORT, NewCropsModTabs.TAB_NEW_CRODS);
	public static final RegistryObject<Item> CROP_SUPPORT_TOP = block(NewCropsModBlocks.CROP_SUPPORT_TOP, null);
	public static final RegistryObject<Item> TOMATO_PLANT_AGE_2 = block(NewCropsModBlocks.TOMATO_PLANT_AGE_2, null);
	public static final RegistryObject<Item> TOMATO_PLANT_AGE_1 = block(NewCropsModBlocks.TOMATO_PLANT_AGE_1, null);
	public static final RegistryObject<Item> TOMATO_PLANT_AGE_3 = block(NewCropsModBlocks.TOMATO_PLANT_AGE_3, null);
	public static final RegistryObject<Item> TOMATO_PLANT_AGE_4 = block(NewCropsModBlocks.TOMATO_PLANT_AGE_4, null);
	public static final RegistryObject<Item> TOMATO_PLANT_TOP_AGE_4 = block(NewCropsModBlocks.TOMATO_PLANT_TOP_AGE_4, null);
	public static final RegistryObject<Item> TOMATO_PLANT_AGE_5 = block(NewCropsModBlocks.TOMATO_PLANT_AGE_5, null);
	public static final RegistryObject<Item> TOMATO_PLANT_TOP_AGE_5 = block(NewCropsModBlocks.TOMATO_PLANT_TOP_AGE_5, null);
	public static final RegistryObject<Item> TOMATO_PLANT_FILL_1 = block(NewCropsModBlocks.TOMATO_PLANT_FILL_1, null);
	public static final RegistryObject<Item> TOMATO_PLANT_FILL_2 = block(NewCropsModBlocks.TOMATO_PLANT_FILL_2, null);
	public static final RegistryObject<Item> TOMATO_PLANT_FILL_3 = block(NewCropsModBlocks.TOMATO_PLANT_FILL_3, null);
	public static final RegistryObject<Item> TOMATO_PLANT_TOP_FILL_1 = block(NewCropsModBlocks.TOMATO_PLANT_TOP_FILL_1, null);
	public static final RegistryObject<Item> TOMATO_PLANT_TOP_FILL_2 = block(NewCropsModBlocks.TOMATO_PLANT_TOP_FILL_2, null);
	public static final RegistryObject<Item> TOMATO_PLANT_TOP_FILL_3 = block(NewCropsModBlocks.TOMATO_PLANT_TOP_FILL_3, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
