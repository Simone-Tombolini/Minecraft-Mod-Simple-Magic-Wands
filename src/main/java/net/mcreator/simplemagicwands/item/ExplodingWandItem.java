
package net.mcreator.simplemagicwands.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.simplemagicwands.procedures.ExplodingWandEntitySwingsItemProcedure;
import net.mcreator.simplemagicwands.init.SimpleMagicWandsModTabs;

public class ExplodingWandItem extends Item {
	public ExplodingWandItem() {
		super(new Item.Properties().tab(SimpleMagicWandsModTabs.TAB_WANDS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ExplodingWandEntitySwingsItemProcedure.execute(world, x, y, z);
		return ar;
	}
}
