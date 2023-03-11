
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.simplemagicwands.procedures.DragonBreathWandEntitySwingsItemProcedure;
import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class DragonBreathWandItem extends Item {
	public DragonBreathWandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		DragonBreathWandEntitySwingsItemProcedure.execute(entity.level, entity);
		return retval;
	}
}
