
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.liminalspace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.liminalspace.item.PoolHeartItem;
import net.mcreator.liminalspace.item.LiminalSpaceItem;
import net.mcreator.liminalspace.item.BathroomtilesItem;
import net.mcreator.liminalspace.LiminalSpaceMod;

public class LiminalSpaceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LiminalSpaceMod.MODID);
	public static final RegistryObject<Item> POOL_TILE = block(LiminalSpaceModBlocks.POOL_TILE);
	public static final RegistryObject<Item> DAMAGED_POOL_TILE = block(LiminalSpaceModBlocks.DAMAGED_POOL_TILE);
	public static final RegistryObject<Item> LIMINAL_SPACE = REGISTRY.register("liminal_space", () -> new LiminalSpaceItem());
	public static final RegistryObject<Item> BATHROOMTILES = REGISTRY.register("bathroomtiles", () -> new BathroomtilesItem());
	public static final RegistryObject<Item> POOL_HEART = REGISTRY.register("pool_heart", () -> new PoolHeartItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
