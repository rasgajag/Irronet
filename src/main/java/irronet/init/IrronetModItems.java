
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package irronet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import irronet.item.WetBarkPlankBundleItem;
import irronet.item.WetBarkBundleItem;
import irronet.item.SugarStringItem;
import irronet.item.HardenedBarkBundleItem;
import irronet.item.Flintd3Item;
import irronet.item.Flintd2Item;
import irronet.item.Flintd1Item;
import irronet.item.BarkPlankItem;
import irronet.item.BarkPlankBundleItem;
import irronet.item.BarkItem;
import irronet.item.BarkBundleItem;
import irronet.item.BarkAxeItem;

import irronet.IrronetMod;

public class IrronetModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IrronetMod.MODID);
	public static final RegistryObject<Item> BARK = REGISTRY.register("bark", () -> new BarkItem());
	public static final RegistryObject<Item> SUGAR_STRING = REGISTRY.register("sugar_string", () -> new SugarStringItem());
	public static final RegistryObject<Item> BARK_BUNDLE = REGISTRY.register("bark_bundle", () -> new BarkBundleItem());
	public static final RegistryObject<Item> WET_BARK_BUNDLE = REGISTRY.register("wet_bark_bundle", () -> new WetBarkBundleItem());
	public static final RegistryObject<Item> BARK_PLANK = REGISTRY.register("bark_plank", () -> new BarkPlankItem());
	public static final RegistryObject<Item> BARK_PLANK_BUNDLE = REGISTRY.register("bark_plank_bundle", () -> new BarkPlankBundleItem());
	public static final RegistryObject<Item> WET_BARK_PLANK_BUNDLE = REGISTRY.register("wet_bark_plank_bundle", () -> new WetBarkPlankBundleItem());
	public static final RegistryObject<Item> BARK_PLANKS = block(IrronetModBlocks.BARK_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> HARDENED_BARK_BUNDLE = REGISTRY.register("hardened_bark_bundle", () -> new HardenedBarkBundleItem());
	public static final RegistryObject<Item> FLINTD_1 = REGISTRY.register("flintd_1", () -> new Flintd1Item());
	public static final RegistryObject<Item> FLINTD_2 = REGISTRY.register("flintd_2", () -> new Flintd2Item());
	public static final RegistryObject<Item> FLINTD_3 = REGISTRY.register("flintd_3", () -> new Flintd3Item());
	public static final RegistryObject<Item> BARK_STAIRS = block(IrronetModBlocks.BARK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_SLABS = block(IrronetModBlocks.BARK_SLABS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_FENCE = block(IrronetModBlocks.BARK_FENCE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_BUTTON = block(IrronetModBlocks.BARK_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_PRESSUREPLATE = block(IrronetModBlocks.BARK_PRESSUREPLATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_FENCE_GATE = block(IrronetModBlocks.BARK_FENCE_GATE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_TRAPDOOR = block(IrronetModBlocks.BARK_TRAPDOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_DOOR = doubleBlock(IrronetModBlocks.BARK_DOOR, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BARK_AXE = REGISTRY.register("bark_axe", () -> new BarkAxeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
