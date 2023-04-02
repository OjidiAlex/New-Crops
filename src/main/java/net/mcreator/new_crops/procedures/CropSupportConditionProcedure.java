package net.mcreator.new_crops.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class CropSupportConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("forge:crop_support_top")))) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FARMLAND)) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
						"summon item ~ ~ ~ {Item:{id:\"new_crops:crop_support\",Count:1b}}");
		}
	}
}
