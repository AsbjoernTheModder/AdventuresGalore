package net.mcreator.adventuresgalore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.adventuresgalore.entity.DamageDisplayParticleEntityEntity;
import net.mcreator.adventuresgalore.client.model.ModelDamage_display_particle_entity;

public class DamageDisplayParticleEntityRenderer extends MobRenderer<DamageDisplayParticleEntityEntity, LivingEntityRenderState, ModelDamage_display_particle_entity> {
	private DamageDisplayParticleEntityEntity entity = null;

	public DamageDisplayParticleEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDamage_display_particle_entity(context.bakeLayer(ModelDamage_display_particle_entity.LAYER_LOCATION)), 0f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DamageDisplayParticleEntityEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("adventures_galore:textures/entities/64x64_transparent_png.png");
	}

	@Override
	protected boolean isBodyVisible(LivingEntityRenderState state) {
		return false;
	}
}