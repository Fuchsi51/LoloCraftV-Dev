package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.world.LcfastadminGameRule;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class TurnfastadminoddProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Turnfastadminodd!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure Turnfastadminodd!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("[LC FastAdmin Info] LoloCraft FastAdmin was set to \"False\""),
					(false));
		}
		if (world instanceof World) {
			((World) world).getGameRules().get(LcfastadminGameRule.gamerule).set((false), ((World) world).getServer());
		}
	}
}
