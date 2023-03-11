
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplemagicwands.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SimpleMagicWandsModTabs {
	public static CreativeModeTab TAB_WANDS;

	public static void load() {
		TAB_WANDS = new CreativeModeTab("tabwands") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SimpleMagicWandsModItems.WAND.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
