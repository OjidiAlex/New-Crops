
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

import net.mcreator.new_crops.item.TomatoSeedItem;
import net.mcreator.new_crops.item.TomatoItem;
import net.mcreator.new_crops.NewCropsMod;

public class NewCropsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewCropsMod.MODID);
	public static final RegistryObject<Item> TOMATO_PLANT = block(NewCropsModBlocks.TOMATO_PLANT, NewCropsModTabs.TAB_NEW_CRODS);
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> TOMATO_SEED = REGISTRY.register("tomato_seed", () -> new TomatoSeedItem());
	public static final RegistryObject<Item> CROP_SUPPORT = block(NewCropsModBlocks.CROP_SUPPORT, NewCropsModTabs.TAB_NEW_CRODS);
	public static final RegistryObject<Item> TOMATO_CROP_AGE_1 = block(NewCropsModBlocks.TOMATO_CROP_AGE_1, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
