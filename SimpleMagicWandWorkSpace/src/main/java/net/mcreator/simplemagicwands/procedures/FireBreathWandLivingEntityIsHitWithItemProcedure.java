package net.mcreator.simplemagicwands.procedures;

import net.minecraft.world.entity.Entity;

public class FireBreathWandLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
