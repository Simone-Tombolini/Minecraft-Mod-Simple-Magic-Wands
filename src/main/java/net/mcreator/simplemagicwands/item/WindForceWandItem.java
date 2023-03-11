
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.simplemagicwands.procedures.WindForceWandLivingEntityIsHitWithItemProcedure;
import net.mcreator.simplemagicwands.procedures.WindForceWandItemInHandTickProcedure;
import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class WindForceWandItem extends Item {
	public WindForceWandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WindForceWandLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			WindForceWandItemInHandTickProcedure.execute(entity);
	}
}
