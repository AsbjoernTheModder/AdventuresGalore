package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.adventuresgalore.AdventuresGaloreMod;

import java.util.Comparator;

public class DamageDisplayParticleEntityTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.noPhysics = true;
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo((entity.getX()), (entity.getY() + 10), (entity.getZ()), 100);
		entity.setCustomName(Component.literal((new java.text.DecimalFormat("\u00A79##.##").format((findEntityInWorldRange(world, LivingEntity.class, x, y, z, 5)).getPersistentData().getDouble("newHealth")))));
		entity.setCustomNameVisible(true);
		AdventuresGaloreMod.queueServerWork(40, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
		});
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}