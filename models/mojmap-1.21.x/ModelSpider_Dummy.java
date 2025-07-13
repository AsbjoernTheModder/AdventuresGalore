// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSpider_Dummy<T extends Spider Dummy> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spider_dummy"), "main");
	private final ModelPart SpiderDummy;
	private final ModelPart body0;
	private final ModelPart leg0;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;
	private final ModelPart leg5;
	private final ModelPart leg6;
	private final ModelPart leg7;
	private final ModelPart body1;
	private final ModelPart head;

	public ModelSpider_Dummy(ModelPart root) {
		this.SpiderDummy = root.getChild("SpiderDummy");
		this.body0 = this.SpiderDummy.getChild("body0");
		this.leg0 = this.body0.getChild("leg0");
		this.leg1 = this.body0.getChild("leg1");
		this.leg2 = this.body0.getChild("leg2");
		this.leg3 = this.body0.getChild("leg3");
		this.leg4 = this.body0.getChild("leg4");
		this.leg5 = this.body0.getChild("leg5");
		this.leg6 = this.body0.getChild("leg6");
		this.leg7 = this.body0.getChild("leg7");
		this.body1 = this.body0.getChild("body1");
		this.head = this.body0.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition SpiderDummy = partdefinition.addOrReplaceChild("SpiderDummy", CubeListBuilder.create(),
				PartPose.offset(0.0F, 15.0F, -3.0F));

		PartDefinition body0 = SpiderDummy.addOrReplaceChild("body0", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition leg0 = body0.addOrReplaceChild("leg0",
				CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 2.0F, 0.0F, 0.7854F, -0.7854F));

		PartDefinition leg1 = body0.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 2.0F, 0.0F, -0.7854F, 0.7854F));

		PartDefinition leg2 = body0.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 1.0F, 0.0F, 0.2618F, -0.6109F));

		PartDefinition leg3 = body0.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 1.0F, 0.0F, -0.2618F, 0.6109F));

		PartDefinition leg4 = body0.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, 0.0F, -0.2618F, -0.6109F));

		PartDefinition leg5 = body0.addOrReplaceChild("leg5",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.6109F));

		PartDefinition leg6 = body0.addOrReplaceChild("leg6",
				CubeListBuilder.create().texOffs(18, 0).addBox(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -1.0F, 0.0F, -0.7854F, -0.7854F));

		PartDefinition leg7 = body0.addOrReplaceChild("leg7",
				CubeListBuilder.create().texOffs(18, 0).addBox(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -1.0F, 0.0F, 0.7854F, 0.7854F));

		PartDefinition body1 = body0.addOrReplaceChild("body1", CubeListBuilder.create().texOffs(0, 12).addBox(-5.0F,
				-4.0F, 0.0F, 10.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 3.0F));

		PartDefinition head = body0.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 4).addBox(-4.0F,
				-4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		SpiderDummy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}