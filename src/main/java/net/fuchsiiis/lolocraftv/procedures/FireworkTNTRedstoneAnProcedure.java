package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class FireworkTNTRedstoneAnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure FireworkTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure FireworkTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure FireworkTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure FireworkTNTRedstoneAn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 1), y, (z + 1)), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (world instanceof ServerWorld) {
							((World) world).getServer().getCommandManager().handleCommand(
									new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 5), y, (z + 5)), Vector2f.ZERO, (ServerWorld) world, 4,
											"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
									"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;

							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if (world instanceof ServerWorld) {
									((World) world).getServer().getCommandManager().handleCommand(
											new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 10), y, (z + 10)), Vector2f.ZERO,
													(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(), null)
													.withFeedbackDisabled(),
											"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;

									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if (world instanceof ServerWorld) {
											((World) world).getServer().getCommandManager().handleCommand(
													new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 15), y, (z + 15)), Vector2f.ZERO,
															(ServerWorld) world, 4, "", new StringTextComponent(""), ((World) world).getServer(),
															null).withFeedbackDisabled(),
													"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;

											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 1), y, (z + 1)), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
												}
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d((x - 1), y, (z - 1)), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
												}
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d(x, (y + 4), z), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"summon firework_rocket ~ ~1 ~ {LifeTime:60,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Flight:3,Explosions:[{Type:1,Flicker:1,Trail:1,Colors:[I;11743532],FadeColors:[I;1973019]}]}}}}");
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 100);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 100);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 100);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 100);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 100);
	}
}
