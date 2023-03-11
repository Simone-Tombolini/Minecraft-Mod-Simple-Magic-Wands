
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class WandItem extends Item {
	public WandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}
}
