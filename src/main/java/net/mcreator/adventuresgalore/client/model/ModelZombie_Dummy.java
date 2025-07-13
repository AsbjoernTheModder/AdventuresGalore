package net.mcreator.adventuresgalore.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelZombie_Dummy extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("adventures_galore", "model_zombie_dummy"), "main");
	public final ModelPart Dummy;
	public final ModelPart DummyBase;
	public final ModelPart DummyStick;
	public final ModelPart Torso;
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Head;

	public ModelZombie_Dummy(ModelPart root) {
		super(root);
		this.Dummy = root.getChild("Dummy");
		this.DummyBase = this.Dummy.getChild("DummyBase");
		this.DummyStick = this.DummyBase.getChild("DummyStick");
		this.Torso = this.DummyStick.getChild("Torso");
		this.LeftArm = this.Torso.getChild("LeftArm");
		this.RightArm = this.Torso.getChild("RightArm");
		this.Head = this.Torso.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Dummy = partdefinition.addOrReplaceChild("Dummy", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 0.0F));
		PartDefinition DummyBase = Dummy.addOrReplaceChild("DummyBase", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition DummyStick = DummyBase.addOrReplaceChild("DummyStick", CubeListBuilder.create().texOffs(8, 19).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));
		PartDefinition Torso = DummyStick.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, -23.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));
		PartDefinition LeftArm = Torso.addOrReplaceChild("LeftArm", CubeListBuilder.create(), PartPose.offset(-4.0F, -21.0F, 1.0F));
		PartDefinition LeftArm_r1 = LeftArm.addOrReplaceChild("LeftArm_r1", CubeListBuilder.create().texOffs(40, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition RightArm = Torso.addOrReplaceChild("RightArm", CubeListBuilder.create(), PartPose.offset(4.0F, -21.0F, 0.0F));
		PartDefinition RightArm_r1 = RightArm.addOrReplaceChild("RightArm_r1", CubeListBuilder.create().texOffs(40, 16).addBox(0.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition Head = Torso.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -22.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}
}