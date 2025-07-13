package net.mcreator.adventuresgalore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;

import net.mcreator.adventuresgalore.entity.SkeletonDummyEntity;
import net.mcreator.adventuresgalore.client.model.animations.Skeleton_DummyAnimation;
import net.mcreator.adventuresgalore.client.model.ModelSkeleton_Dummy;

public class SkeletonDummyRenderer extends MobRenderer<SkeletonDummyEntity, LivingEntityRenderState, ModelSkeleton_Dummy> {
	private SkeletonDummyEntity entity = null;

	public SkeletonDummyRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSkeleton_Dummy.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SkeletonDummyEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("adventures_galore:textures/entities/skeleton_dummy.png");
	}

	private static final class AnimatedModel extends ModelSkeleton_Dummy {
		private SkeletonDummyEntity entity = null;

		public AnimatedModel(ModelPart root) {
			super(root);
		}

		public void setEntity(SkeletonDummyEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.animate(entity.animationState0, Skeleton_DummyAnimation.Hit, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}