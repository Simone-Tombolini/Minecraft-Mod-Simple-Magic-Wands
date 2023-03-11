package net.mcreator.simplemagicwands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.simplemagicwands.init.SimpleMagicWandsModBlocks;
import net.mcreator.simplemagicwands.SimpleMagicWandsMod;

public class LigthWispBlockBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SimpleMagicWandsMod.queueServerWork(60, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SimpleMagicWandsModBlocks.LIGTH_WISP_BLOCK.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
