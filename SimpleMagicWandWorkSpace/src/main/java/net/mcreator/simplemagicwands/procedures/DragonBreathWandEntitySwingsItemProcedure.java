package net.mcreator.simplemagicwands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.DragonFireball;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.simplemagicwands.SimpleMagicWandsMod;

public class DragonBreathWandEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level;
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new DragonFireball(EntityType.DRAGON_FIREBALL, projectileLevel);
				_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
				_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
				SimpleMagicWandsMod.queueServerWork(200, () -> {
					if (!entity.level.isClientSide())
						_entityToSpawn.discard();
					});

			}
		}
		

		entity.hurt(DamageSource.MAGIC, 4);

	}
}
