package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.world.LcinfomessageGameRule;
import net.fuchsiiis.lolocraftv.world.LcfastadminGameRule;
import net.fuchsiiis.lolocraftv.world.LcdebugGameRule;
import net.fuchsiiis.lolocraftv.world.LcbombwarningGameRule;
import net.fuchsiiis.lolocraftv.world.BetamenuGameRule;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;
import java.util.HashMap;

public class StartinfoProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Startinfo!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure Startinfo!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcinfomessageGameRule.gamerule) == true) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("---------------------------------------------"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A75\u00A7lLoloCraft V by Fuchsiii"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Mod is \u00A72activ"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("LoloCraft V Version: \u00A715.1.0"), (false));
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("LoloCraft FastAdmin Version: \u00A710.2"), (false));
			}
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == true) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC-V Debug Info] Debug is \"TRUE\""), (false));
				}
			} else if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == false) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC-V Debug Info] Debug is \"FALSE\""), (false));
				}
			}
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(BetamenuGameRule.gamerule) == true) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC-V BETA Info] Beta Menu is set to \"TRUE\""), (false));
				}
			} else if (world.getWorldInfo().getGameRulesInstance().getBoolean(BetamenuGameRule.gamerule) == false) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC-V BETA Info] Beta Menu is set to \"FALSE\""), (false));
				}
			}
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcfastadminGameRule.gamerule) == true) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC FastAdmin Info] FastAdmin is \"TRUE\""), (false));
				}
			} else if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcfastadminGameRule.gamerule) == false) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC FastAdmin Info] FastAdmin is \"FALSE\""), (false));
				}
			}
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcbombwarningGameRule.gamerule) == true) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC BombWarning Info] BombWarning is \"TRUE\""), (false));
				}
			} else if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcbombwarningGameRule.gamerule) == false) {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC BombWarning Info] BombWarning is \"FALSE\""), (false));
				}
			}
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("---------------------------------------------"), (false));
			}
		}
	}
}
