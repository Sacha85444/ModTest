
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.liminalspace.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.liminalspace.LiminalSpaceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LiminalSpaceModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LiminalSpaceMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {

			tabData.accept(LiminalSpaceModBlocks.POOL_TILE.get().asItem());
			tabData.accept(LiminalSpaceModBlocks.DAMAGED_POOL_TILE.get().asItem());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(LiminalSpaceModItems.BATHROOMTILES.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(LiminalSpaceModItems.LIMINAL_SPACE.get());

		}
	}
}
