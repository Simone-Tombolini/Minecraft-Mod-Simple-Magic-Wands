
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.simplemagicwands.procedures.FireBreathWandLivingEntityIsHitWithItemProcedure;
import net.mcreator.simplemagicwands.procedures.FireBreathWandEntitySwingsItemProcedure;
import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class FireBreathWandItem extends Item {
	public FireBreathWandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		FireBreathWandLivingEntityIsHitWithItemProcedure.execute(entity);
		return retval;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		FireBreathWandEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
