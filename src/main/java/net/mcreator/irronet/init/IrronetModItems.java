
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.irronet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.irronet.item.WetBarkPlankBundleItem;
import net.mcreator.irronet.item.WetBarkBundleItem;
import net.mcreator.irronet.item.SugarStringItem;
import net.mcreator.irronet.item.HardenedBarkBundleItem;
import net.mcreator.irronet.item.Flintd3Item;
import net.mcreator.irronet.item.Flintd2Item;
import net.mcreator.irronet.item.Flintd1Item;
import net.mcreator.irronet.item.BarkPlankItem;
import net.mcreator.irronet.item.BarkPlankBundleItem;
import net.mcreator.irronet.item.BarkItem;
import net.mcreator.irronet.item.BarkBundleItem;
import net.mcreator.irronet.IrronetMod;

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

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
