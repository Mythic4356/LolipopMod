
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lollipopz.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lollipopz.block.HelloBlock;
import net.mcreator.lollipopz.LollipopzMod;

public class LollipopzModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LollipopzMod.MODID);
	public static final RegistryObject<Block> HELLO = REGISTRY.register("hello", () -> new HelloBlock());
}
