/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.EntityAttributeModificationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.adventuresgalore.AdventuresGaloreMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AdventuresGaloreModAttributes {
	public static final DeferredRegister<Attribute> REGISTRY = DeferredRegister.create(BuiltInRegistries.ATTRIBUTE, AdventuresGaloreMod.MODID);
	public static final DeferredHolder<Attribute, Attribute> BLUNT_DAMAGE_ATTRIBUTE = REGISTRY.register("blunt_damage_attribute", () -> new RangedAttribute("attribute.adventures_galore.blunt_damage_attribute", 0, 0, 1000).setSyncable(true));
	public static final DeferredHolder<Attribute, Attribute> BLUNT_RESISTANCE_ATTRIBUTE = REGISTRY.register("blunt_resistance_attribute",
			() -> new RangedAttribute("attribute.adventures_galore.blunt_resistance_attribute", 0, 0, 1000).setSyncable(true));

	@SubscribeEvent
	public static void addAttributes(EntityAttributeModificationEvent event) {
		event.getTypes().forEach(entity -> event.add(entity, BLUNT_DAMAGE_ATTRIBUTE));
		event.getTypes().forEach(entity -> event.add(entity, BLUNT_RESISTANCE_ATTRIBUTE));
	}
}