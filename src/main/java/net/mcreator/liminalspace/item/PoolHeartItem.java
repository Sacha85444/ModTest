
package net.mcreator.liminalspace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PoolHeartItem extends Item {
	public PoolHeartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
