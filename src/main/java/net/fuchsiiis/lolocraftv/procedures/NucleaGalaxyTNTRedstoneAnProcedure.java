package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Util;
import net.minecraft.state.Property;
import net.minecraft.server.MinecraftServer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.fuchsiiis.lolocraftv.world.LcdebugGameRule;
import net.fuchsiiis.lolocraftv.world.LcbombwarningGameRule;
import net.fuchsiiis.lolocraftv.block.MegagalaxydustbombBlock;
import net.fuchsiiis.lolocraftv.block.GalaxydirtmainBlock;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class NucleaGalaxyTNTRedstoneAnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure NucleaGalaxyTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure NucleaGalaxyTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure NucleaGalaxyTNTRedstoneAn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure NucleaGalaxyTNTRedstoneAn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			BlockPos _bp = new BlockPos(x, y, z);
			BlockState _bs = GalaxydirtmainBlock.block.getDefaultState();
			BlockState _bso = world.getBlockState(_bp);
			for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
				Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
				if (_property != null && _bs.get(_property) != null)
					try {
						_bs = _bs.with(_property, (Comparable) entry.getValue());
					} catch (Exception e) {
					}
			}
			world.setBlockState(_bp, _bs, 3);
		}
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcbombwarningGameRule.gamerule) == true) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(
							new StringTextComponent((new TranslationTextComponent("bombwarning.nuclea-tnt.start").getString())), ChatType.SYSTEM,
							Util.DUMMY_UUID);
			}
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(
							new StringTextComponent((new TranslationTextComponent("bombwarning.nuclea-tnt.30").getString())), ChatType.SYSTEM,
							Util.DUMMY_UUID);
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
					if (!world.isRemote()) {
						MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
						if (mcserv != null)
							mcserv.getPlayerList().func_232641_a_(
									new StringTextComponent((new TranslationTextComponent("bombwarning.nuclea-tnt.20").getString())), ChatType.SYSTEM,
									Util.DUMMY_UUID);
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
							if (!world.isRemote()) {
								MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
								if (mcserv != null)
									mcserv.getPlayerList().func_232641_a_(
											new StringTextComponent((new TranslationTextComponent("bombwarning.nuclea-tnt.10").getString())),
											ChatType.SYSTEM, Util.DUMMY_UUID);
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
									if (!world.isRemote()) {
										MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
										if (mcserv != null)
											mcserv.getPlayerList().func_232641_a_(
													new StringTextComponent((new TranslationTextComponent("bombwarning.nuclea-tnt.0").getString())),
													ChatType.SYSTEM, Util.DUMMY_UUID);
									}
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 200);
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 200);
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
				world.setBlockState(new BlockPos(x, y, z), MegagalaxydustbombBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, y + 1, z), MegagalaxydustbombBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, y + 2, z), MegagalaxydustbombBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, y + 3, z), MegagalaxydustbombBlock.block.getDefaultState(), 3);
				for (int index0 = 0; index0 < (int) (20); index0++) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 1), (int) (y + 1), (int) (z + 1), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 2), (int) (y + 1), (int) (z + 2), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 3), (int) (y + 1), (int) (z + 3), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 4), (int) (y + 1), (int) (z + 4), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 5), (int) (y + 1), (int) (z + 5), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 6), (int) (y + 1), (int) (z + 6), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 7), (int) (y + 1), (int) (z + 7), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 8), (int) (y + 1), (int) (z + 8), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 9), (int) (y + 1), (int) (z + 9), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 10), (int) (y + 1), (int) (z + 10), (float) 50, Explosion.Mode.BREAK);
				}
				if (world instanceof World && !((World) world).isRemote) {
					((World) world).createExplosion(null, (int) (x + 11), (int) (y + 1), (int) (z + 11), (float) 50, Explosion.Mode.BREAK);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 600);
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == true) {
			LolocraftvMod.LOGGER.info("[LC-V Debug INFO] Galaxy Nuclea TNT was explode ");
		}
	}
}
