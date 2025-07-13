package net.mcreator.adventuresgalore.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.adventuresgalore.init.AdventuresGaloreModParticleTypes;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BluntDamageIndicatorParticlesProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getOriginalDamage());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		execute(null, world, x, y, z, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		if (damagesource == null || entity == null)
			return;
		double posY = 0;
		double posX = 0;
		double posZ = 0;
		posY = y + entity.getBbHeight() - 0.5;
		posZ = z + entity.getBbWidth() - 0.2;
		if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("adventures_galore:blunt_damage")))) {
			if (amount == 1 || amount > 1 && amount < 2 || amount > 0 && amount < 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.ONE_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 2 || amount > 2 && amount < 3) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.TWO_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 3 || amount > 3 && amount < 4) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.THREE_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 4 || amount > 4 && amount < 5) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.FOUR_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 5 || amount > 5 && amount < 6) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.FIVE_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 6 || amount > 6 && amount < 7) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.SIX_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 7 || amount > 7 && amount < 8) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.SEVEN_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 8 || amount > 8 && amount < 9) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.EIGHT_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			} else if (amount == 9 || amount > 9 && amount < 10) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (AdventuresGaloreModParticleTypes.NINE_BLUNT_DAMAGE.get()), x, posY, posZ, 1, 1, 1, 1, 0.1);
			}
		}
	}
}