
package net.mcreator.new_crops.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.new_crops.init.NewCropsModTabs;

public class TomatoRipeItem extends Item {
	public TomatoRipeItem() {
		super(new Item.Properties().tab(NewCropsModTabs.TAB_NEW_CRODS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationMod(0.3f)

				.build()));
	}
}
