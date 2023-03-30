
package net.mcreator.tutorial.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.tutorial.init.TutorialModTabs;

public class TomatoItem extends Item {
	public TomatoItem() {
		super(new Item.Properties().tab(TutorialModTabs.TAB_NEW_CRODS).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.3f)

				.build()));
	}
}
