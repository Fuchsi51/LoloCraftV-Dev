
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
public class WeapontradebuyGuiWindow extends ContainerScreen<WeapontradebuyGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = WeapontradebuyGui.guistate;

	public WeapontradebuyGuiWindow(WeapontradebuyGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 338;
		this.ySize = 220;
	}

	private static final ResourceLocation texture = new ResourceLocation("lolocraftv:textures/screens/weapontradebuy.png");

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
		this.font.drawString(ms, "Buy some Stuff", 131, 4, -12829636);
		this.font.drawString(ms, "Weapons", 2, 28, -12829636);
		this.font.drawString(ms, "Tools", 2, 96, -12829636);
		this.font.drawString(ms, "You Inventory", 170, 129, -12829636);
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
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 39, 134, 20, new StringTextComponent("Explode Sword (15 FC)"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new WeapontradebuyGui.ButtonPressedMessage(0, x, y, z));
				WeapontradebuyGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 62, 124, 20, new StringTextComponent("Galaxy Sword (7 FC)"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new WeapontradebuyGui.ButtonPressedMessage(1, x, y, z));
				WeapontradebuyGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 152, 113, 20, new StringTextComponent("Galaxy Axe (5 FC)"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new WeapontradebuyGui.ButtonPressedMessage(2, x, y, z));
				WeapontradebuyGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 106, 134, 20, new StringTextComponent("Galaxy Pickaxe (6 FC)"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new WeapontradebuyGui.ButtonPressedMessage(3, x, y, z));
				WeapontradebuyGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 2, this.guiTop + 129, 129, 20, new StringTextComponent("Galaxy Shovel (4 FC)"), e -> {
			if (true) {
				LolocraftvMod.PACKET_HANDLER.sendToServer(new WeapontradebuyGui.ButtonPressedMessage(4, x, y, z));
				WeapontradebuyGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
