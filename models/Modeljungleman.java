// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeljungleman extends EntityModel<Entity> {
	private final ModelRenderer SchulterLinks;
	private final ModelRenderer SchulterRechts;
	private final ModelRenderer ArmLinks;
	private final ModelRenderer BlockLinks;
	private final ModelRenderer ArmRechts;
	private final ModelRenderer BlockRechts;
	private final ModelRenderer BeinLinks;
	private final ModelRenderer BeinRechts;
	private final ModelRenderer Bauch;
	private final ModelRenderer Kopf;
	private final ModelRenderer OhrRechts;
	private final ModelRenderer Ohrlinks;

	public Modeljungleman() {
		textureWidth = 16;
		textureHeight = 16;

		SchulterLinks = new ModelRenderer(this);
		SchulterLinks.setRotationPoint(0.0F, -15.0F, 7.0F);
		SchulterLinks.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		SchulterRechts = new ModelRenderer(this);
		SchulterRechts.setRotationPoint(0.0F, -15.0F, -6.0F);
		SchulterRechts.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		ArmLinks = new ModelRenderer(this);
		ArmLinks.setRotationPoint(0.0F, -15.0F, 9.0F);
		ArmLinks.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 27.0F, 2.0F, 0.0F, false);

		BlockLinks = new ModelRenderer(this);
		BlockLinks.setRotationPoint(0.0F, 25.0F, -2.0F);
		ArmLinks.addChild(BlockLinks);
		BlockLinks.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		ArmRechts = new ModelRenderer(this);
		ArmRechts.setRotationPoint(0.0F, -15.0F, -9.0F);
		ArmRechts.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 27.0F, 2.0F, 0.0F, false);

		BlockRechts = new ModelRenderer(this);
		BlockRechts.setRotationPoint(1.0F, 25.0F, 2.0F);
		ArmRechts.addChild(BlockRechts);
		BlockRechts.setTextureOffset(0, 0).addBox(-1.9086F, -1.0198F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		BeinLinks = new ModelRenderer(this);
		BeinLinks.setRotationPoint(0.0F, 6.0F, -4.0F);
		BeinLinks.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 19.0F, 2.0F, 0.0F, false);

		BeinRechts = new ModelRenderer(this);
		BeinRechts.setRotationPoint(0.0F, 6.0F, 4.0F);
		BeinRechts.setTextureOffset(8, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 19.0F, 2.0F, 0.0F, false);

		Bauch = new ModelRenderer(this);
		Bauch.setRotationPoint(0.0F, 3.0F, 0.0F);
		Bauch.setTextureOffset(0, 0).addBox(-3.0F, -22.0F, -5.0F, 6.0F, 24.0F, 10.0F, 0.0F, false);

		Kopf = new ModelRenderer(this);
		Kopf.setRotationPoint(0.0F, -24.0F, 0.0F);
		Kopf.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		OhrRechts = new ModelRenderer(this);
		OhrRechts.setRotationPoint(0.0F, -28.0F, -2.0F);
		OhrRechts.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		Ohrlinks = new ModelRenderer(this);
		Ohrlinks.setRotationPoint(0.0F, -28.0F, 2.0F);
		Ohrlinks.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		SchulterLinks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		SchulterRechts.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmLinks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmRechts.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BeinLinks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		BeinRechts.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Bauch.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Kopf.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		OhrRechts.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Ohrlinks.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}