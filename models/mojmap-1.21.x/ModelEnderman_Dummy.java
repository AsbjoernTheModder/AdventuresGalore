// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEnderman_Dummy<T extends Enderman Dummy> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "enderman_dummy"), "main");
	private final ModelPart EndermanDummy;
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;

	public ModelEnderman_Dummy(ModelPart root) {
		this.EndermanDummy = root.getChild("EndermanDummy");
		this.Head = this.EndermanDummy.getChild("Head");
		this.Body = this.EndermanDummy.getChild("Body");
		this.RightArm = this.EndermanDummy.getChild("RightArm");
		this.LeftArm = this.EndermanDummy.getChild("LeftArm");
		this.RightLeg = this.EndermanDummy.getChild("RightLeg");
		this.LeftLeg = this.EndermanDummy.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition EndermanDummy = partdefinition.addOrReplaceChild("EndermanDummy", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = EndermanDummy.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-4.0F, -22.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)),
				PartPose.offset(0.0F, -27.5F, 0.0F));

		PartDefinition Body = EndermanDummy.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(32, 16).addBox(
				-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -42.0F, 0.0F));

		PartDefinition RightArm = EndermanDummy.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(56, 0)
				.addBox(-3.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, -40.0F, 0.0F));

		PartDefinition LeftArm = EndermanDummy.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(56, 0).mirror()
						.addBox(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(5.0F, -40.0F, 0.0F));

		PartDefinition RightLeg = EndermanDummy.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(56, 0)
				.addBox(1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, -30.0F, 0.0F));

		PartDefinition LeftLeg = EndermanDummy.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(2.0F, -30.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		EndermanDummy.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}