
package net.mcreator.new_crops.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.new_crops.init.NewCropsModTabs;

public class TomatoUnRipeItem extends Item {
	public TomatoUnRipeItem() {
		super(new Item.Properties().tab(NewCropsModTabs.TAB_NEW_CRODS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.1f)

				.build()));
	}
}
