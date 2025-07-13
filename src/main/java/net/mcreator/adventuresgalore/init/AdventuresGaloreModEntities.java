/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.adventuresgalore.entity.ZombieDummyEntity;
import net.mcreator.adventuresgalore.entity.SpiderDummyEntity;
import net.mcreator.adventuresgalore.entity.SkeletonDummyEntity;
import net.mcreator.adventuresgalore.entity.EndermanDummyEntity;
import net.mcreator.adventuresgalore.entity.DamageDisplayParticleEntityEntity;
import net.mcreator.adventuresgalore.entity.CreeperDummyEntity;
import net.mcreator.adventuresgalore.AdventuresGaloreMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AdventuresGaloreModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, AdventuresGaloreMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ZombieDummyEntity>> ZOMBIE_DUMMY = register("zombie_dummy",
			EntityType.Builder.<ZombieDummyEntity>of(ZombieDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpiderDummyEntity>> SPIDER_DUMMY = register("spider_dummy",
			EntityType.Builder.<SpiderDummyEntity>of(SpiderDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(1f, 0.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<SkeletonDummyEntity>> SKELETON_DUMMY = register("skeleton_dummy",
			EntityType.Builder.<SkeletonDummyEntity>of(SkeletonDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.6f, 1.7f));
	public static final DeferredHolder<EntityType<?>, EntityType<CreeperDummyEntity>> CREEPER_DUMMY = register("creeper_dummy",
			EntityType.Builder.<CreeperDummyEntity>of(CreeperDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EndermanDummyEntity>> ENDERMAN_DUMMY = register("enderman_dummy",
			EntityType.Builder.<EndermanDummyEntity>of(EndermanDummyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3)

					.sized(0.6f, 2.9f));
	public static final DeferredHolder<EntityType<?>, EntityType<DamageDisplayParticleEntityEntity>> DAMAGE_DISPLAY_PARTICLE_ENTITY = register("damage_display_particle_entity",
			EntityType.Builder.<DamageDisplayParticleEntityEntity>of(DamageDisplayParticleEntityEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).fireImmune()

					.sized(0.1f, 0f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(AdventuresGaloreMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ZombieDummyEntity.init(event);
		SpiderDummyEntity.init(event);
		SkeletonDummyEntity.init(event);
		CreeperDummyEntity.init(event);
		EndermanDummyEntity.init(event);
		DamageDisplayParticleEntityEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ZOMBIE_DUMMY.get(), ZombieDummyEntity.createAttributes().build());
		event.put(SPIDER_DUMMY.get(), SpiderDummyEntity.createAttributes().build());
		event.put(SKELETON_DUMMY.get(), SkeletonDummyEntity.createAttributes().build());
		event.put(CREEPER_DUMMY.get(), CreeperDummyEntity.createAttributes().build());
		event.put(ENDERMAN_DUMMY.get(), EndermanDummyEntity.createAttributes().build());
		event.put(DAMAGE_DISPLAY_PARTICLE_ENTITY.get(), DamageDisplayParticleEntityEntity.createAttributes().build());
	}
}