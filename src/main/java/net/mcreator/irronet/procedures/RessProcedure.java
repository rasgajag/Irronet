package net.mcreator.irronet.procedures;

import net.minecraft.world.entity.Entity;

public class RessProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		BarkPlankResProcedure.execute(entity);
	}
}
