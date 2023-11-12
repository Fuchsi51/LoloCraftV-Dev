package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.IWorld;

import net.fuchsiiis.lolocraftv.world.LcdebugGameRule;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class TemplatedebugProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Templatedebug!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == true) {
			LolocraftvMod.LOGGER.debug("[LC-V Debug Debug] ");
		}
	}
}
