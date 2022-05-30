
package irronet.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class BarkPlankItem extends Item {
	public BarkPlankItem() {
		super(new Item.Properties().tab(null).stacksTo(4).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
