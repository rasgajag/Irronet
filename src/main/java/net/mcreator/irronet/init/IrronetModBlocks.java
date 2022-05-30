
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.irronet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.irronet.block.BarkPlanksBlock;
import net.mcreator.irronet.IrronetMod;

public class IrronetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IrronetMod.MODID);
	public static final RegistryObject<Block> BARK_PLANKS = REGISTRY.register("bark_planks", () -> new BarkPlanksBlock());
}
