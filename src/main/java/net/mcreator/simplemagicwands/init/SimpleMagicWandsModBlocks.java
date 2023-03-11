
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.simplemagicwands.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.simplemagicwands.block.LigthWispBlockBlock;
import net.mcreator.simplemagicwands.SimpleMagicWandsMod;

public class SimpleMagicWandsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleMagicWandsMod.MODID);
	public static final RegistryObject<Block> LIGTH_WISP_BLOCK = REGISTRY.register("ligth_wisp_block", () -> new LigthWispBlockBlock());
}
