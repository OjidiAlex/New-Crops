package net.mcreator.new_crops.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.new_crops.init.NewCropsModItems;
import net.mcreator.new_crops.init.NewCropsModBlocks;

public class TomatoSeedPlaceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == NewCropsModBlocks.CROP_SUPPORT.get()) {
			world.setBlock(new BlockPos(x, y, z), NewCropsModBlocks.TOMATO_PLANT_AGE_1.get().defaultBlockState(), 3);
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(NewCropsModItems.TOMATO_SEED.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
