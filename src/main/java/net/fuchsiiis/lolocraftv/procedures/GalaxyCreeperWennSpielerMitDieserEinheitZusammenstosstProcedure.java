package net.fuchsiiis.lolocraftv.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.Entity;

import net.fuchsiiis.lolocraftv.world.LcdebugGameRule;
import net.fuchsiiis.lolocraftv.world.BiggalaxycreeperexplosionGameRule;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosstProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosst!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosst!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosst!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosst!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency entity for procedure GalaxyCreeperWennSpielerMitDieserEinheitZusammenstosst!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		entity.extinguish();
		if (world.getWorldInfo().getGameRulesInstance().getBoolean(BiggalaxycreeperexplosionGameRule.gamerule) == true) {
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == true) {
				LolocraftvMod.LOGGER.debug("[LC-V Debug INFO] Galaxy Creeper explosion \"BIG\" was triggert");
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
						((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 20, Explosion.Mode.DESTROY);
					}
					for (int index0 = 0; index0 < (int) (5); index0++) {
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 50, 3, 3, 3, 1);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 40);
		} else {
			if (world.getWorldInfo().getGameRulesInstance().getBoolean(LcdebugGameRule.gamerule) == true) {
				LolocraftvMod.LOGGER.debug("[LC-V Debug INFO] Galaxy Creeper explosion \"SMALL\" was triggert");
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
						((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 1, 3, 3, 3, 1);
					}
					if (world instanceof World && !((World) world).isRemote) {
						((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 5, Explosion.Mode.DESTROY);
					}
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.LARGE_SMOKE, x, y, z, (int) 1, 3, 3, 3, 1);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 40);
		}
	}
}
