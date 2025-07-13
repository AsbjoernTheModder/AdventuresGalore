// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSkeleton_Dummy<T extends Skeleton Dummy> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "skeleton_dummy"), "main");
	private final ModelPart SkeletonDummy;
	private final ModelPart waist;
	private final ModelPart Body;
	private final ModelPart Head;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart leftItem;
	private final ModelPart LeftLeg;

	public ModelSkeleton_Dummy(ModelPart root) {
		this.SkeletonDummy = root.getChild("SkeletonDummy");
		this.waist = this.SkeletonDummy.getChild("waist");
		this.Body = this.waist.getChild("Body");
		this.Head = this.SkeletonDummy.getChild("Head");
		this.RightArm = this.SkeletonDummy.getChild("RightArm");
		this.LeftArm = this.SkeletonDummy.getChild("LeftArm");
		this.leftItem = this.LeftArm.getChild("leftItem");
		this.LeftLeg = this.SkeletonDummy.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition SkeletonDummy = partdefinition.addOrReplaceChild("SkeletonDummy", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition waist = SkeletonDummy.addOrReplaceChild("waist", CubeListBuilder.create(),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Body = waist.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(-4.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(-4.0F, 9.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(-3.0F, 3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(-3.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(1.0F, 3.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(1.0F, 6.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(1.0F, 0.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(1.0F, 9.0F, -1.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		PartDefinition Head = SkeletonDummy.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition RightArm = SkeletonDummy.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-5.0F, -22.0F, 0.0F));

		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition LeftArm = SkeletonDummy.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(5.0F, -22.0F, 0.0F));

		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(0.0F, -1.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition leftItem = LeftArm.addOrReplaceChild("leftItem", CubeListBuilder.create(),
				PartPose.offset(1.0F, 7.0F, 1.0F));

		PartDefinition LeftLeg = SkeletonDummy.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 16).mirror()
						.addBox(-3.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		SkeletonDummy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}