package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.screen.Screen;

import net.fuchsiiis.lolocraftv.item.GalaxyexplodeswordItem;
import net.fuchsiiis.lolocraftv.item.GalaxySwordItem;
import net.fuchsiiis.lolocraftv.item.Fox_CoinItem;
import net.fuchsiiis.lolocraftv.block.TestchestBlock;
import net.fuchsiiis.lolocraftv.block.GalaxyMegaNuceBlock;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class ToolTippsProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@OnlyIn(Dist.CLIENT)
		@SubscribeEvent
		public static void onItemTooltip(ItemTooltipEvent event) {
			if (event != null && event.getPlayer() != null) {
				Entity entity = event.getPlayer();
				ItemStack itemStack = event.getItemStack();
				List<ITextComponent> tooltip = event.getToolTip();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("tooltip", tooltip);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				dependencies.put("itemstack", itemStack);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency itemstack for procedure ToolTipps!");
			return;
		}
		if (dependencies.get("tooltip") == null) {
			if (!dependencies.containsKey("tooltip"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency tooltip for procedure ToolTipps!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		List<ITextComponent> tooltip = (List<ITextComponent>) dependencies.get("tooltip");
		if (itemstack.getItem() == GalaxyexplodeswordItem.block) {
			if (Screen.hasShiftDown()) {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.explodesword.1").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.explodesword.2").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.explodesword.3").getString())));
			} else {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.pess").getString())));
			}
		}
		if (itemstack.getItem() == TestchestBlock.block.asItem()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxychest.1").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxychest.2").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxychest.3").getString())));
			} else {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.pess").getString())));
			}
		}
		if (itemstack.getItem() == GalaxyMegaNuceBlock.block.asItem()) {
			if (Screen.hasShiftDown()) {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.meganuke.1").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.meganuke.2").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.meganuke.3").getString())));
			} else {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.pess").getString())));
			}
		}
		if (itemstack.getItem() == GalaxySwordItem.block) {
			if (Screen.hasShiftDown()) {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxysword.1").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxysword.2").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.galaxysword.3").getString())));
			} else {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.pess").getString())));
			}
		}
		if (itemstack.getItem() == Fox_CoinItem.block) {
			if (Screen.hasShiftDown()) {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.foxcoin.1").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.foxcoin.2").getString())));
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.foxcoin.3").getString())));
			} else {
				tooltip.add(new StringTextComponent((new TranslationTextComponent("translation.tooltip.pess").getString())));
			}
		}
	}
}
