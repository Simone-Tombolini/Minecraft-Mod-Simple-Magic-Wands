package net.mcreator.simplemagicwands.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.simplemagicwands.init.SimpleMagicWandsModBlocks;
import net.mcreator.simplemagicwands.SimpleMagicWandsMod;

public class LigthWandRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), SimpleMagicWandsModBlocks.LIGTH_WISP_BLOCK.get().defaultBlockState(), 3);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CRIT, x, y, z, 5, 3, 3, 3, 1);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.hit")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.amethyst_cluster.hit")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		SimpleMagicWandsMod.queueServerWork(60, () -> {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SimpleMagicWandsModBlocks.LIGTH_WISP_BLOCK.get()) {
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
