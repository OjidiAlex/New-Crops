
package net.mcreator.new_crops.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.new_crops.procedures.TomatoSeedPlaceProcedure;
import net.mcreator.new_crops.init.NewCropsModTabs;

public class TomatoSeedItem extends Item {
	public TomatoSeedItem() {
		super(new Item.Properties().tab(NewCropsModTabs.TAB_NEW_CRODS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		TomatoSeedPlaceProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
