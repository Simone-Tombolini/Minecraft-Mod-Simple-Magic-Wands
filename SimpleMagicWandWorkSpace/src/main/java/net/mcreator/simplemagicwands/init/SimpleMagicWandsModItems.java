
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplemagicwands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.simplemagicwands.item.WindForceWandItem;
import net.mcreator.simplemagicwands.item.WandItem;
import net.mcreator.simplemagicwands.item.NatureForceWandItem;
import net.mcreator.simplemagicwands.item.LigthWandItem;
import net.mcreator.simplemagicwands.item.ForceOfSeaWandItem;
import net.mcreator.simplemagicwands.item.FireBreathWandItem;
import net.mcreator.simplemagicwands.item.ExplodingWandItem;
import net.mcreator.simplemagicwands.item.DragonBreathWandItem;
import net.mcreator.simplemagicwands.SimpleMagicWandsMod;

public class SimpleMagicWandsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleMagicWandsMod.MODID);
	public static final RegistryObject<Item> DRAGON_BREATH_WAND = REGISTRY.register("dragon_breath_wand", () -> new DragonBreathWandItem());
	public static final RegistryObject<Item> FIRE_BREATH_WAND = REGISTRY.register("fire_breath_wand", () -> new FireBreathWandItem());
	public static final RegistryObject<Item> NATURE_FORCE_WAND = REGISTRY.register("nature_force_wand", () -> new NatureForceWandItem());
	public static final RegistryObject<Item> FORCE_OF_SEA_WAND = REGISTRY.register("force_of_sea_wand", () -> new ForceOfSeaWandItem());
	public static final RegistryObject<Item> EXPLODING_WAND = REGISTRY.register("exploding_wand", () -> new ExplodingWandItem());
	public static final RegistryObject<Item> LIGTH_WISP_BLOCK = block(SimpleMagicWandsModBlocks.LIGTH_WISP_BLOCK, SimpleMagicWandsModTabs.TAB_WANDS);
	public static final RegistryObject<Item> LIGTH_WAND = REGISTRY.register("ligth_wand", () -> new LigthWandItem());
	public static final RegistryObject<Item> WIND_FORCE_WAND = REGISTRY.register("wind_force_wand", () -> new WindForceWandItem());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
