
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tutorial.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TutorialModTabs {
	public static CreativeModeTab TAB_NEW_CRODS;

	public static void load() {
		TAB_NEW_CRODS = new CreativeModeTab("tabnew_crods") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TutorialModItems.TOMATO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
