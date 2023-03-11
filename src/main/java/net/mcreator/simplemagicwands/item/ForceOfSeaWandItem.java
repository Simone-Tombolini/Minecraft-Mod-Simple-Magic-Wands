
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.simplemagicwands.procedures.ForceOfSeaWandItemInHandTickProcedure;
import net.mcreator.simplemagicwands.procedures.ForceOfSeaWandEntitySwingsItemProcedure;
import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class ForceOfSeaWandItem extends Item {
	public ForceOfSeaWandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		ForceOfSeaWandEntitySwingsItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			ForceOfSeaWandItemInHandTickProcedure.execute(entity);
	}
}
