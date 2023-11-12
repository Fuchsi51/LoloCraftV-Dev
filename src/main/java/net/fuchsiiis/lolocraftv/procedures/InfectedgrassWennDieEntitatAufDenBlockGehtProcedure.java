package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class InfectedgrassWennDieEntitatAufDenBlockGehtProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure InfectedgrassWennDieEntitatAufDenBlockGeht!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1000);
	}
}
