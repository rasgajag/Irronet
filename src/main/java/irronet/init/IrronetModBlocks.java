
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package irronet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import irronet.block.BarkPlanksBlock;

import irronet.IrronetMod;

public class IrronetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IrronetMod.MODID);
	public static final RegistryObject<Block> BARK_PLANKS = REGISTRY.register("bark_planks", () -> new BarkPlanksBlock());
}
