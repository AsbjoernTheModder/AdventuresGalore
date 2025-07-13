package net.mcreator.adventuresgalore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.adventuresgalore.entity.ZombieDummyEntity;
import net.mcreator.adventuresgalore.client.model.animations.Zombie_DummyAnimation;
import net.mcreator.adventuresgalore.client.model.ModelZombie_Dummy;

public class ZombieDummyRenderer extends MobRenderer<ZombieDummyEntity, LivingEntityRenderState, ModelZombie_Dummy> {
	private ZombieDummyEntity entity = null;

	public ZombieDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelZombie_Dummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ZombieDummyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("adventures_galore:textures/entities/zombie_dummy.png");
	}

	private static final class AnimatedModel extends ModelZombie_Dummy {
		private ZombieDummyEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(ZombieDummyEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, Zombie_DummyAnimation.NormalHit, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}