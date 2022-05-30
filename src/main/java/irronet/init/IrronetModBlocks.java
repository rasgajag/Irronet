
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package irronet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import irronet.block.BarkTrapdoorBlock;
import irronet.block.BarkStairsBlock;
import irronet.block.BarkSlabsBlock;
import irronet.block.BarkPressureplateBlock;
import irronet.block.BarkPlanksBlock;
import irronet.block.BarkFenceGateBlock;
import irronet.block.BarkFenceBlock;
import irronet.block.BarkDoorBlock;
import irronet.block.BarkButtonBlock;

import irronet.IrronetMod;

public class IrronetModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IrronetMod.MODID);
	public static final RegistryObject<Block> BARK_PLANKS = REGISTRY.register("bark_planks", () -> new BarkPlanksBlock());
	public static final RegistryObject<Block> BARK_STAIRS = REGISTRY.register("bark_stairs", () -> new BarkStairsBlock());
	public static final RegistryObject<Block> BARK_SLABS = REGISTRY.register("bark_slabs", () -> new BarkSlabsBlock());
	public static final RegistryObject<Block> BARK_FENCE = REGISTRY.register("bark_fence", () -> new BarkFenceBlock());
	public static final RegistryObject<Block> BARK_BUTTON = REGISTRY.register("bark_button", () -> new BarkButtonBlock());
	public static final RegistryObject<Block> BARK_PRESSUREPLATE = REGISTRY.register("bark_pressureplate", () -> new BarkPressureplateBlock());
	public static final RegistryObject<Block> BARK_FENCE_GATE = REGISTRY.register("bark_fence_gate", () -> new BarkFenceGateBlock());
	public static final RegistryObject<Block> BARK_TRAPDOOR = REGISTRY.register("bark_trapdoor", () -> new BarkTrapdoorBlock());
	public static final RegistryObject<Block> BARK_DOOR = REGISTRY.register("bark_door", () -> new BarkDoorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BarkFenceBlock.registerRenderLayer();
			BarkButtonBlock.registerRenderLayer();
			BarkPressureplateBlock.registerRenderLayer();
			BarkFenceGateBlock.registerRenderLayer();
			BarkTrapdoorBlock.registerRenderLayer();
			BarkDoorBlock.registerRenderLayer();
		}
	}
}
