package net.mcreator.adventuresgalore.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuresgalore.init.AdventuresGaloreModAttributes;

public class PlayerBluntResistanceAttributeReturnTextProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##.##").format(entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(AdventuresGaloreModAttributes.BLUNT_DAMAGE_ATTRIBUTE)
				? _livingEntity0.getAttribute(AdventuresGaloreModAttributes.BLUNT_DAMAGE_ATTRIBUTE).getValue()
				: 0);
	}
}