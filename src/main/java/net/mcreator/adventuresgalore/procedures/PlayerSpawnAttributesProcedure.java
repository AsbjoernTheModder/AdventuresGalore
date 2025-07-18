package net.mcreator.adventuresgalore.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.adventuresgalore.init.AdventuresGaloreModAttributes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerSpawnAttributesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livingEntity0 && _livingEntity0.getAttributes().hasAttribute(AdventuresGaloreModAttributes.BLUNT_DAMAGE_ATTRIBUTE))
			_livingEntity0.getAttribute(AdventuresGaloreModAttributes.BLUNT_DAMAGE_ATTRIBUTE).setBaseValue(2);
	}
}