package irronet.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import irronet.init.IrronetModItems;

public class HardenedBarkBundleResProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (false == (Blocks.WATER == (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock())) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (false == (Blocks.WATER == (world.getFluidState(new BlockPos(x, y, z)).createLegacyBlock()).getBlock())) {
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(IrronetModItems.WET_BARK_BUNDLE.get());
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(IrronetModItems.HARDENED_BARK_BUNDLE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 80);
		}
	}
}
