package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuresgalore.entity.EndermanDummyEntity;

public class EndermanDummyHitPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean isHurt = false;
		isHurt = entity instanceof EndermanDummyEntity;
		LivingEntity liv_ = (LivingEntity) entity;
		return liv_.hurtTime > 0;
	}
}