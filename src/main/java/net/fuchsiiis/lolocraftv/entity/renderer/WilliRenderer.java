
package net.fuchsiiis.lolocraftv.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.fuchsiiis.lolocraftv.entity.WilliEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class WilliRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WilliEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelbobv(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("lolocraftv:textures/entities/texture.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.5.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelbobv extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer headwear;
		private final ModelRenderer headwear2;
		private final ModelRenderer rotation;
		private final ModelRenderer nose;
		private final ModelRenderer body;
		private final ModelRenderer bodywear;
		private final ModelRenderer arms;
		private final ModelRenderer arms_rotation;
		private final ModelRenderer arms_flipped;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public Modelbobv() {
			textureWidth = 128;
			textureHeight = 128;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			head.setTextureOffset(0, 34).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
			headwear = new ModelRenderer(this);
			headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
			headwear.setTextureOffset(20, 16).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.5F, false);
			headwear2 = new ModelRenderer(this);
			headwear2.setRotationPoint(0.0F, 0.0F, 0.0F);
			rotation = new ModelRenderer(this);
			rotation.setRotationPoint(0.0F, 0.0F, 0.0F);
			headwear2.addChild(rotation);
			setRotationAngle(rotation, -1.5708F, 0.0F, 0.0F);
			nose = new ModelRenderer(this);
			nose.setRotationPoint(0.0F, -2.0F, 0.0F);
			nose.setTextureOffset(0, 24).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.setTextureOffset(32, 34).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);
			bodywear = new ModelRenderer(this);
			bodywear.setRotationPoint(0.0F, 0.0F, 0.0F);
			bodywear.setTextureOffset(0, 0).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.25F, false);
			arms = new ModelRenderer(this);
			arms.setRotationPoint(0.0F, 3.5F, 0.3F);
			arms_rotation = new ModelRenderer(this);
			arms_rotation.setRotationPoint(0.0F, -2.0F, 0.05F);
			arms.addChild(arms_rotation);
			setRotationAngle(arms_rotation, -0.7505F, 0.0F, 0.0F);
			arms_rotation.setTextureOffset(16, 52).addBox(-8.0F, 0.0F, -2.05F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			arms_rotation.setTextureOffset(44, 16).addBox(-4.0F, 4.0F, -2.05F, 8.0F, 4.0F, 4.0F, 0.0F, false);
			arms_flipped = new ModelRenderer(this);
			arms_flipped.setRotationPoint(0.0F, 24.0F, 0.0F);
			arms_rotation.addChild(arms_flipped);
			arms_flipped.setTextureOffset(0, 52).addBox(4.0F, -24.0F, -2.05F, 4.0F, 8.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 12.0F, 0.0F);
			right_leg.setTextureOffset(44, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 12.0F, 0.0F);
			left_leg.setTextureOffset(28, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			headwear.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			headwear2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			nose.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bodywear.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arms.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}

}
