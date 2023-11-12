
package net.fuchsiiis.lolocraftv.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BetaguiGuiWindow extends ContainerScreen<BetaguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BetaguiGui.guistate;

	public BetaguiGuiWindow(BetaguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 277;
		this.ySize = 179;
	}

	private static final ResourceLocation texture = new ResourceLocation("lolocraftv:textures/screens/betagui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("lolocraftv:textures/screens/beta_gui.png"));
		this.blit(ms, this.guiLeft + -26, this.guiTop + -29, 0, 0, 6, 22, 6, 22);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("lolocraftv:textures/screens/beta_gui.png"));
		this.blit(ms, this.guiLeft + 293, this.guiTop + -28, 0, 0, 6, 22, 6, 22);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "LoloCraftV Beta Menu", 87, 3, -12829636);
		this.font.drawString(ms, "Beta Stuff", 112, 26, -12829636);
		this.font.drawString(ms, "Danger. The items on this list may have texture/game errors.", -19, -24, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 88, this.guiTop + 58, 103, 20, new StringTextComponent("Get Virus Block"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new BetaguiGui.ButtonPressedMessage(0, x, y, z));
				BetaguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
