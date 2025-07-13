package net.mcreator.adventuresgalore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.adventuresgalore.entity.SpiderDummyEntity;
import net.mcreator.adventuresgalore.client.model.animations.Spider_DummyAnimation;
import net.mcreator.adventuresgalore.client.model.ModelSpider_Dummy;

public class SpiderDummyRenderer extends MobRenderer<SpiderDummyEntity, LivingEntityRenderState, ModelSpider_Dummy> {
	private SpiderDummyEntity entity = null;

	public SpiderDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSpider_Dummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SpiderDummyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("adventures_galore:textures/entities/spider_dummy.png");
	}

	private static final class AnimatedModel extends ModelSpider_Dummy {
		private SpiderDummyEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(SpiderDummyEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, Spider_DummyAnimation.SpiderDummyHit, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}