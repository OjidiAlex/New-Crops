
package net.mcreator.tutorial.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.tutorial.init.TutorialModTabs;

public class TomatoSeedItem extends Item {
	public TomatoSeedItem() {
		super(new Item.Properties().tab(TutorialModTabs.TAB_NEW_CRODS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
