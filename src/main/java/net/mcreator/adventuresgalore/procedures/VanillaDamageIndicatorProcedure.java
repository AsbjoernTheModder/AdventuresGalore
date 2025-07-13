package net.mcreator.adventuresgalore.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VanillaDamageIndicatorProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource(), event.getEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity entity) {
		execute(null, damagesource, entity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		double posY = 0;
		double posX = 0;
		double posZ = 0;
		double newHealth = 0;
		double oldHealth = 0;
		double damageDealt = 0;
		entity.getPersistentData().putDouble("newHealth", (entity.getPersistentData().getDouble("previousHealth") - (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
		if ((damagesource.getEntity()) instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal((new java.text.DecimalFormat("##.##").format(entity.getPersistentData().getDouble("newHealth")))), true);
	}
}