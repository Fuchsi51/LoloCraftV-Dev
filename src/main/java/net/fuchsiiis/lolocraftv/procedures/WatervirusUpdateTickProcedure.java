package net.fuchsiiis.lolocraftv.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.fuchsiiis.lolocraftv.LolocraftvMod;

import java.util.Map;

public class WatervirusUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency world for procedure WatervirusUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency x for procedure WatervirusUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency y for procedure WatervirusUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LolocraftvMod.LOGGER.warn("Failed to load dependency z for procedure WatervirusUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x + 1, y, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x + 1, y, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x - 1, y, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x - 1, y, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y, z - 1), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y, z - 1), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y, z + 1), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y, z - 1), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y + 1, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
		if (Math.random() < 0.5) {
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlockState(new BlockPos(x, y + 1, z), Blocks.AIR.getDefaultState(), 3);
			}
		}
	}
}
