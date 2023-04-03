package net.mcreator.new_crops.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.new_crops.init.NewCropsModBlocks;

public class CropSupportDestroyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), NewCropsModBlocks.CROP_SUPPORT.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y + 1, z), NewCropsModBlocks.CROP_SUPPORT_TOP.get().defaultBlockState(), 3);
	}
}
