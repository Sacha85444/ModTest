
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.liminalspace.block.PoolTileBlock;
import net.mcreator.liminalspace.block.LiminalSpacePortalBlock;
import net.mcreator.liminalspace.block.DamagedPoolTileBlock;
import net.mcreator.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LiminalSpaceMod.MODID);
	public static final RegistryObject<Block> POOL_TILE = REGISTRY.register("pool_tile", () -> new PoolTileBlock());
	public static final RegistryObject<Block> DAMAGED_POOL_TILE = REGISTRY.register("damaged_pool_tile", () -> new DamagedPoolTileBlock());
	public static final RegistryObject<Block> LIMINAL_SPACE_PORTAL = REGISTRY.register("liminal_space_portal", () -> new LiminalSpacePortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
