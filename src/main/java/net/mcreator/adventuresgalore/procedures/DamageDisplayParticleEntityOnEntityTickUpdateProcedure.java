package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuresgalore.AdventuresGaloreMod;

public class DamageDisplayParticleEntityOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		AdventuresGaloreMod.queueServerWork(20, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}
}