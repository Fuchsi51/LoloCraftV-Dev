
package net.fuchsiiis.lolocraftv.command;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;

import net.minecraft.command.CommandSource;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

@Mod.EventBusSubscriber
public class LcvinfoCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("lcv-info")

		);
	}
}
