
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.new_crops.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.item.Items;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewCropsModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(NewCropsModItems.TOMATO.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(Items.ROTTEN_FLESH, 0.5f);
		ComposterBlock.COMPOSTABLES.put(NewCropsModItems.TOMATO_RIPE.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(NewCropsModItems.TOMATO_UN_RIPE.get(), 0.65f);
	}
}
