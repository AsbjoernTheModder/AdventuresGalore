package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuresgalore.entity.CreeperDummyEntity;

public class CreeperDummyHitPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isHurt = false;
		isHurt = entity instanceof CreeperDummyEntity;
		LivingEntity liv_ = (LivingEntity) entity;
		return liv_.hurtTime > 0;
	}
}