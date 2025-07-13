/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.adventuresgalore.AdventuresGaloreMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AdventuresGaloreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AdventuresGaloreMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AG_BLOCKS = REGISTRY.register("ag_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.adventures_galore.ag_blocks")).icon(() -> new ItemStack(Blocks.CHERRY_SAPLING)).displayItems((parameters, tabData) -> {
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_STONE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_IRON_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_GOLD_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_WOODEN_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_STONE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_IRON_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_GOLD_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_DIAMOND_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_NETHERITE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_WOODEN_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_STONE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_IRON_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_GOLD_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_DIAMOND_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_NETHERITE_PICKAXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_STONE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_IRON_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_WOODEN_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_STONE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_IRON_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_GOLDEN_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_DIAMOND_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_NETHERITE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_WOODEN_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_STONE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_IRON_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_GOLD_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_DIAMOND_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_NETHERITE_SHOVEL.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_STONE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_IRON_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_WOODEN_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_STONE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_IRON_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_GOLD_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_DIAMOND_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_NETHERITE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_WOODEN_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_STONE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_IRON_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_GOLDEN_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_DIAMOND_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_NETHERITE_AXE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_STONE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_IRON_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_WOODEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_STONE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_IRON_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_GOLDEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_DIAMOND_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LAYING_NETHERITE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_WOODEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_STONE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_IRON_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_GOLDEN_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_DIAMOND_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModBlocks.LEANING_NETHERITE_HOE.get().asItem());
				tabData.accept(AdventuresGaloreModItems.ZOMBIE_DUMMY_ITEM.get());
				tabData.accept(AdventuresGaloreModItems.SPIDER_DUMMY_ITEM.get());
				tabData.accept(AdventuresGaloreModItems.SKELETON_DUMMY_ITEM.get());
				tabData.accept(AdventuresGaloreModItems.CREEPER_DUMMY_ITEM.get());
				tabData.accept(AdventuresGaloreModItems.ENDERMAN_DUMMY_ITEM.get());
				tabData.accept(AdventuresGaloreModItems.STICK_OF_DESPAWN.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AdventuresGaloreModItems.BLUNT_TEST.get());
		}
	}
}