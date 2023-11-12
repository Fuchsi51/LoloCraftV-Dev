package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.world.LcfastadminGameRule;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class Gm2prodProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Gm2prod!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure Gm2prod!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcfastadminGameRule.gamerule) == true) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).setGameType(GameType.ADVENTURE);
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Set you Gamemode to \"Adventure\""), (true));
			}
		} else {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC FastAdmin Info] FastAdmin is not Active"), (false));
			}
		}
	}
}
