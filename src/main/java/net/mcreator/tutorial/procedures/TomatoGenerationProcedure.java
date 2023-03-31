package net.mcreator.tutorial.procedures;

import net.minecraft.util.Mth;

import java.util.Random;

public class TomatoGenerationProcedure {
	public static boolean execute() {
		if (Mth.nextInt(new Random(), 0, 15) == 15) {
			return true;
		}
		return false;
	}
}
