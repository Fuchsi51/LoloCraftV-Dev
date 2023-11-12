package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;
import java.util.Collections;

public class SERVERSTARTProcedure {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.DEDICATED_SERVER})
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void init(FMLDedicatedServerSetupEvent event) {
			executeProcedure(Collections.emptyMap());
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		LolocraftvMod.LOGGER.info("--------------------------------------------------");
		LolocraftvMod.LOGGER.info("----------LoloCraft INFO----------");
		LolocraftvMod.LOGGER.info("LoloCraftV 5.1.0");
		LolocraftvMod.LOGGER.info("LoloCraft Series by Fuchsiiis");
		LolocraftvMod.LOGGER.info("Developer: Fuchsiii");
		LolocraftvMod.LOGGER.info("Copyright 2023 Fuchsiiis");
		LolocraftvMod.LOGGER.info("--------------------------------------------------");
	}
}
