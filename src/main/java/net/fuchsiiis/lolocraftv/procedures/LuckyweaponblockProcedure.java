package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.fuchsiiis.lolocraftv.item.GalaxyingotItem;
import net.fuchsiiis.lolocraftv.item.GalaxyexplodeswordItem;
import net.fuchsiiis.lolocraftv.item.GalaxySwordItem;
import net.fuchsiiis.lolocraftv.item.Fox_CoinItem;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class LuckyweaponblockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Luckyweaponblock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure Luckyweaponblock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure Luckyweaponblock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure Luckyweaponblock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.1) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.SUNFLOWER));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		} else {
			if (Math.random() < 0.12) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.WOODEN_SWORD));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (Math.random() < 0.13) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.STONE_SWORD));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else {
					if (Math.random() < 0.14) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_SWORD));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (Math.random() < 0.15) {
							if (world instanceof World && !world.isRemote()) {
								ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.GOLDEN_SWORD));
								entityToSpawn.setPickupDelay((int) 10);
								world.addEntity(entityToSpawn);
							}
						} else {
							if (Math.random() < 0.16) {
								if (world instanceof World && !world.isRemote()) {
									ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.DIAMOND_SWORD));
									entityToSpawn.setPickupDelay((int) 10);
									world.addEntity(entityToSpawn);
								}
							} else {
								if (Math.random() < 0.17) {
									if (world instanceof World && !world.isRemote()) {
										ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.NETHERITE_SWORD));
										entityToSpawn.setPickupDelay((int) 10);
										world.addEntity(entityToSpawn);
									}
								} else {
									if (Math.random() < 0.18) {
										if (world instanceof World && !world.isRemote()) {
											ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
													new ItemStack(GalaxyexplodeswordItem.block));
											entityToSpawn.setPickupDelay((int) 10);
											world.addEntity(entityToSpawn);
										}
									} else {
										if (Math.random() < 0.19) {
											if (world instanceof World && !world.isRemote()) {
												ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
														new ItemStack(GalaxySwordItem.block));
												entityToSpawn.setPickupDelay((int) 10);
												world.addEntity(entityToSpawn);
											}
										} else {
											if (Math.random() < 0.2) {
												if (world instanceof World && !world.isRemote()) {
													ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
															new ItemStack(GalaxyingotItem.block));
													entityToSpawn.setPickupDelay((int) 10);
													world.addEntity(entityToSpawn);
												}
											} else {
												if (Math.random() < 0.21) {
													if (world instanceof World && !world.isRemote()) {
														ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z,
																new ItemStack(Fox_CoinItem.block));
														entityToSpawn.setPickupDelay((int) 10);
														world.addEntity(entityToSpawn);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
