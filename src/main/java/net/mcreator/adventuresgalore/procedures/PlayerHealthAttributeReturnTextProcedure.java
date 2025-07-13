package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class PlayerHealthAttributeReturnTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(Math.round(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1));
	}
}