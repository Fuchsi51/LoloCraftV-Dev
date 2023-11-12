package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.item.GalaxyexplodeswordItem;
import net.fuchsiiis.lolocraftv.item.Fox_CoinItem;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;

public class BUYGESProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure BUYGES!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure BUYGES!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double Amount_Of_Item_Needed = 0;
		boolean ItemBought = false;
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Fox_CoinItem.block)) : false) {
			{
				AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
				entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
				if (_iitemhandlerref.get() != null) {
					for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
						ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
						if (Fox_CoinItem.block == itemstackiterator.getItem()) {
							Amount_Of_Item_Needed = (Amount_Of_Item_Needed + (itemstackiterator).getCount());
						}
						if (Amount_Of_Item_Needed > 15) {
							if (ItemBought == false) {
								ItemBought = (true);
								if (entity instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(Fox_CoinItem.block);
									((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 15,
											((PlayerEntity) entity).container.func_234641_j_());
								}
								if (entity instanceof PlayerEntity) {
									ItemStack _setstack = new ItemStack(GalaxyexplodeswordItem.block);
									_setstack.setCount((int) 1);
									ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
								}
								if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
									((PlayerEntity) entity).sendStatusMessage(
											new StringTextComponent((new TranslationTextComponent("trader.buy").getString())), (false));
								}
							}
						}
					}
				}
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((new TranslationTextComponent("trader.error").getString())),
						(false));
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
