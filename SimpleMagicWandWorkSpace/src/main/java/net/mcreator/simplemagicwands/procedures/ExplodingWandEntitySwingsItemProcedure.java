package net.mcreator.simplemagicwands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;

public class ExplodingWandEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 4, Explosion.BlockInteraction.DESTROY);
	}
}
