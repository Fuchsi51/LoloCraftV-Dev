package net.fuchsiiis.lolocraftv.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.fuchsiiis.lolocraftv.LolocraftvModElements;

import java.lang.reflect.Method;

@LolocraftvModElements.ModElement.Tag
public class BetamenuGameRule extends LolocraftvModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("betamenu", GameRules.Category.MISC, create(false));

	public BetamenuGameRule(LolocraftvModElements instance) {
		super(instance, 114);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
