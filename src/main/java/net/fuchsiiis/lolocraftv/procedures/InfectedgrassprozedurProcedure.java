package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.fuchsiiis.lolocraftv.block.InfectedgrassBlock;
import net.fuchsiiis.lolocraftv.block.GalaxydirtmainBlock;
import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class InfectedgrassprozedurProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure Infectedgrassprozedur!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure Infectedgrassprozedur!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure Infectedgrassprozedur!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure Infectedgrassprozedur!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x + 1, y, z), GalaxydirtmainBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x + 1, y, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x - 1, y, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x - 1, y, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x, y, z - 1), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x, y, z - 1), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x, y, z + 1), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x, y, z - 1), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x, y + 1, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
				world.setBlockState(new BlockPos(x, y - 1, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x, y - 1, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT) {
				world.setBlockState(new BlockPos(x, y + 1, z), InfectedgrassBlock.block.getDefaultState(), 3);
			}
		}
	}
}
