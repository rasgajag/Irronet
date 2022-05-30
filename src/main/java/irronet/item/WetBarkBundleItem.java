
package irronet.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import irronet.procedures.HardenedBarkBundleResProcedure;

public class WetBarkBundleItem extends Item {
	public WetBarkBundleItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HardenedBarkBundleResProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
