
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.tutorial.item.TomatoSeedItem;
import net.mcreator.tutorial.item.TomatoItem;
import net.mcreator.tutorial.TutorialMod;

public class TutorialModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);
	public static final RegistryObject<Item> TOMATO_PLANT = block(TutorialModBlocks.TOMATO_PLANT, TutorialModTabs.TAB_NEW_CRODS);
	public static final RegistryObject<Item> TOMATO = REGISTRY.register("tomato", () -> new TomatoItem());
	public static final RegistryObject<Item> TOMATO_SEED = REGISTRY.register("tomato_seed", () -> new TomatoSeedItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
