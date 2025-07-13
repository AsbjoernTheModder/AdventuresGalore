/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.adventuresgalore.client.model.ModelZombie_Dummy;
import net.mcreator.adventuresgalore.client.model.ModelSpider_Dummy;
import net.mcreator.adventuresgalore.client.model.ModelSkeleton_Dummy;
import net.mcreator.adventuresgalore.client.model.ModelEnderman_Dummy;
import net.mcreator.adventuresgalore.client.model.ModelDamage_display_particle_entity;
import net.mcreator.adventuresgalore.client.model.ModelCreeper_Dummy;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AdventuresGaloreModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelSkeleton_Dummy.LAYER_LOCATION, ModelSkeleton_Dummy::createBodyLayer);
		event.registerLayerDefinition(ModelSpider_Dummy.LAYER_LOCATION, ModelSpider_Dummy::createBodyLayer);
		event.registerLayerDefinition(ModelEnderman_Dummy.LAYER_LOCATION, ModelEnderman_Dummy::createBodyLayer);
		event.registerLayerDefinition(ModelDamage_display_particle_entity.LAYER_LOCATION, ModelDamage_display_particle_entity::createBodyLayer);
		event.registerLayerDefinition(ModelZombie_Dummy.LAYER_LOCATION, ModelZombie_Dummy::createBodyLayer);
		event.registerLayerDefinition(ModelCreeper_Dummy.LAYER_LOCATION, ModelCreeper_Dummy::createBodyLayer);
	}
}