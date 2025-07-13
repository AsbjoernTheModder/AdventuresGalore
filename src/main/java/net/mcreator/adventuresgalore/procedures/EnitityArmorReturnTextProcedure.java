package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.Comparator;

public class EnitityArmorReturnTextProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		double EntityHealth = 0;
		double ViewDistance = 0;
		entity.getPersistentData().putDouble("EntityDistance", 5);
		entity.getPersistentData().putDouble("EntityArmor",
				((findEntityInWorldRange(world, Mob.class,
						(entity.level()
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
										ClipContext.Fluid.SOURCE_ONLY, entity))
								.getBlockPos().getX()),
						(entity.level()
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
										ClipContext.Fluid.SOURCE_ONLY, entity))
								.getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
								ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
						(entity.getBbHeight() * entity.getBbWidth()))) instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0));
		entity.getPersistentData().putDouble("EntityArmor",
				((findEntityInWorldRange(world, PathfinderMob.class,
						(entity.level()
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
										ClipContext.Fluid.SOURCE_ONLY, entity))
								.getBlockPos().getX()),
						(entity.level()
								.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
										ClipContext.Fluid.SOURCE_ONLY, entity))
								.getBlockPos().getY()),
						(entity.level().clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("EntityDistance")))), ClipContext.Block.VISUAL,
								ClipContext.Fluid.SOURCE_ONLY, entity)).getBlockPos().getZ()),
						(entity.getBbHeight() * entity.getBbWidth()))) instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0));
		return new java.text.DecimalFormat("##.##").format(Math.round(entity.getPersistentData().getDouble("EntityArmor")));
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}