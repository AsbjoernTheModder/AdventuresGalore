/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.adventuresgalore.client.renderer.ZombieDummyRenderer;
import net.mcreator.adventuresgalore.client.renderer.SpiderDummyRenderer;
import net.mcreator.adventuresgalore.client.renderer.SkeletonDummyRenderer;
import net.mcreator.adventuresgalore.client.renderer.EndermanDummyRenderer;
import net.mcreator.adventuresgalore.client.renderer.DamageDisplayParticleEntityRenderer;
import net.mcreator.adventuresgalore.client.renderer.CreeperDummyRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AdventuresGaloreModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AdventuresGaloreModEntities.ZOMBIE_DUMMY.get(), ZombieDummyRenderer::new);
		event.registerEntityRenderer(AdventuresGaloreModEntities.SPIDER_DUMMY.get(), SpiderDummyRenderer::new);
		event.registerEntityRenderer(AdventuresGaloreModEntities.SKELETON_DUMMY.get(), SkeletonDummyRenderer::new);
		event.registerEntityRenderer(AdventuresGaloreModEntities.CREEPER_DUMMY.get(), CreeperDummyRenderer::new);
		event.registerEntityRenderer(AdventuresGaloreModEntities.ENDERMAN_DUMMY.get(), EndermanDummyRenderer::new);
		event.registerEntityRenderer(AdventuresGaloreModEntities.DAMAGE_DISPLAY_PARTICLE_ENTITY.get(), DamageDisplayParticleEntityRenderer::new);
	}
}