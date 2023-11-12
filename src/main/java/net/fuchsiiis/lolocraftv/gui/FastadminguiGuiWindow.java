
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
public class FastadminguiGuiWindow extends ContainerScreen<FastadminguiGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = FastadminguiGui.guistate;

	public FastadminguiGuiWindow(FastadminguiGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 295;
		this.ySize = 205;
	}

	private static final ResourceLocation texture = new ResourceLocation("lolocraftv:textures/screens/fastadmingui.png");

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
		this.font.drawString(ms, "LoloCraft FastAdmin", 98, 3, -12829636);
		this.font.drawString(ms, "Gamemode", 54, 26, -12829636);
		this.font.drawString(ms, "World", 213, 27, -12829636);
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
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 59, 150, 20, new StringTextComponent("Change Gamemode to gm1"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(0, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 81, 150, 20, new StringTextComponent("Change Gamemode to gm2"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(1, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 103, 150, 20, new StringTextComponent("Change Gamemode to gm3"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(2, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 37, 150, 20, new StringTextComponent("Change Gamemode to gm0"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(3, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 162, this.guiTop + 37, 129, 20, new StringTextComponent("Change Time to Day"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(4, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 157, this.guiTop + 59, 139, 20, new StringTextComponent("Change Time to Night"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(5, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 241, this.guiTop + 202, 119, 20, new StringTextComponent("Turn off FastAdmin"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new FastadminguiGui.ButtonPressedMessage(6, x, y, z));
				FastadminguiGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
	}
}
