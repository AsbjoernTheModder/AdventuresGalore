/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.adventuresgalore.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.adventuresgalore.item.ZombieDummyItemItem;
import net.mcreator.adventuresgalore.item.StickOfDespawnItem;
import net.mcreator.adventuresgalore.item.SpiderDummyItemItem;
import net.mcreator.adventuresgalore.item.SkeletonDummyItemItem;
import net.mcreator.adventuresgalore.item.EndermanDummyItemItem;
import net.mcreator.adventuresgalore.item.CreeperDummyItemItem;
import net.mcreator.adventuresgalore.item.BluntTestItem;
import net.mcreator.adventuresgalore.AdventuresGaloreMod;

import java.util.function.Function;

public class AdventuresGaloreModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AdventuresGaloreMod.MODID);
	public static final DeferredItem<Item> INCRUSTED_WOODEN_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_STONE_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_STONE_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_IRON_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_IRON_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_GOLD_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_GOLD_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_DIAMOND_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_NETHERITE_PICKAXE = block(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_PICKAXE);
	public static final DeferredItem<Item> LAYING_WOODEN_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_WOODEN_PICKAXE);
	public static final DeferredItem<Item> LAYING_STONE_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_STONE_PICKAXE);
	public static final DeferredItem<Item> LAYING_IRON_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_IRON_PICKAXE);
	public static final DeferredItem<Item> LAYING_GOLD_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_GOLD_PICKAXE);
	public static final DeferredItem<Item> LAYING_DIAMOND_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_DIAMOND_PICKAXE);
	public static final DeferredItem<Item> LAYING_NETHERITE_PICKAXE = block(AdventuresGaloreModBlocks.LAYING_NETHERITE_PICKAXE);
	public static final DeferredItem<Item> LEANING_WOODEN_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_WOODEN_PICKAXE);
	public static final DeferredItem<Item> LEANING_STONE_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_STONE_PICKAXE);
	public static final DeferredItem<Item> LEANING_IRON_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_IRON_PICKAXE);
	public static final DeferredItem<Item> LEANING_GOLD_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_GOLD_PICKAXE);
	public static final DeferredItem<Item> LEANING_DIAMOND_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_DIAMOND_PICKAXE);
	public static final DeferredItem<Item> LEANING_NETHERITE_PICKAXE = block(AdventuresGaloreModBlocks.LEANING_NETHERITE_PICKAXE);
	public static final DeferredItem<Item> INCRUSTED_WOODEN_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_STONE_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_STONE_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_IRON_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_IRON_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_GOLDEN_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_DIAMOND_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_NETHERITE_SHOVEL = block(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_SHOVEL);
	public static final DeferredItem<Item> LAYING_WOODEN_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_WOODEN_SHOVEL);
	public static final DeferredItem<Item> LAYING_STONE_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_STONE_SHOVEL);
	public static final DeferredItem<Item> LAYING_IRON_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_IRON_SHOVEL);
	public static final DeferredItem<Item> LAYING_GOLDEN_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_GOLDEN_SHOVEL);
	public static final DeferredItem<Item> LAYING_DIAMOND_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_DIAMOND_SHOVEL);
	public static final DeferredItem<Item> LAYING_NETHERITE_SHOVEL = block(AdventuresGaloreModBlocks.LAYING_NETHERITE_SHOVEL);
	public static final DeferredItem<Item> LEANING_WOODEN_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_WOODEN_SHOVEL);
	public static final DeferredItem<Item> LEANING_STONE_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_STONE_SHOVEL);
	public static final DeferredItem<Item> LEANING_IRON_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_IRON_SHOVEL);
	public static final DeferredItem<Item> LEANING_GOLD_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_GOLD_SHOVEL);
	public static final DeferredItem<Item> LEANING_DIAMOND_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_DIAMOND_SHOVEL);
	public static final DeferredItem<Item> LEANING_NETHERITE_SHOVEL = block(AdventuresGaloreModBlocks.LEANING_NETHERITE_SHOVEL);
	public static final DeferredItem<Item> INCRUSTED_WOODEN_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_AXE);
	public static final DeferredItem<Item> INCRUSTED_STONE_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_STONE_AXE);
	public static final DeferredItem<Item> INCRUSTED_IRON_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_IRON_AXE);
	public static final DeferredItem<Item> INCRUSTED_GOLDEN_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_AXE);
	public static final DeferredItem<Item> INCRUSTED_DIAMOND_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_AXE);
	public static final DeferredItem<Item> INCRUSTED_NETHERITE_AXE = block(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_AXE);
	public static final DeferredItem<Item> LAYING_WOODEN_AXE = block(AdventuresGaloreModBlocks.LAYING_WOODEN_AXE);
	public static final DeferredItem<Item> LAYING_STONE_AXE = block(AdventuresGaloreModBlocks.LAYING_STONE_AXE);
	public static final DeferredItem<Item> LAYING_IRON_AXE = block(AdventuresGaloreModBlocks.LAYING_IRON_AXE);
	public static final DeferredItem<Item> LAYING_GOLD_AXE = block(AdventuresGaloreModBlocks.LAYING_GOLD_AXE);
	public static final DeferredItem<Item> LAYING_DIAMOND_AXE = block(AdventuresGaloreModBlocks.LAYING_DIAMOND_AXE);
	public static final DeferredItem<Item> LAYING_NETHERITE_AXE = block(AdventuresGaloreModBlocks.LAYING_NETHERITE_AXE);
	public static final DeferredItem<Item> LEANING_WOODEN_AXE = block(AdventuresGaloreModBlocks.LEANING_WOODEN_AXE);
	public static final DeferredItem<Item> LEANING_STONE_AXE = block(AdventuresGaloreModBlocks.LEANING_STONE_AXE);
	public static final DeferredItem<Item> LEANING_IRON_AXE = block(AdventuresGaloreModBlocks.LEANING_IRON_AXE);
	public static final DeferredItem<Item> LEANING_GOLDEN_AXE = block(AdventuresGaloreModBlocks.LEANING_GOLDEN_AXE);
	public static final DeferredItem<Item> LEANING_DIAMOND_AXE = block(AdventuresGaloreModBlocks.LEANING_DIAMOND_AXE);
	public static final DeferredItem<Item> LEANING_NETHERITE_AXE = block(AdventuresGaloreModBlocks.LEANING_NETHERITE_AXE);
	public static final DeferredItem<Item> INCRUSTED_WOODEN_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_WOODEN_HOE);
	public static final DeferredItem<Item> INCRUSTED_STONE_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_STONE_HOE);
	public static final DeferredItem<Item> INCRUSTED_IRON_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_IRON_HOE);
	public static final DeferredItem<Item> INCRUSTED_GOLDEN_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_GOLDEN_HOE);
	public static final DeferredItem<Item> INCRUSTED_DIAMOND_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_DIAMOND_HOE);
	public static final DeferredItem<Item> INCRUSTED_NETHERITE_HOE = block(AdventuresGaloreModBlocks.INCRUSTED_NETHERITE_HOE);
	public static final DeferredItem<Item> LAYING_WOODEN_HOE = block(AdventuresGaloreModBlocks.LAYING_WOODEN_HOE);
	public static final DeferredItem<Item> LAYING_STONE_HOE = block(AdventuresGaloreModBlocks.LAYING_STONE_HOE);
	public static final DeferredItem<Item> LAYING_IRON_HOE = block(AdventuresGaloreModBlocks.LAYING_IRON_HOE);
	public static final DeferredItem<Item> LAYING_GOLDEN_HOE = block(AdventuresGaloreModBlocks.LAYING_GOLDEN_HOE);
	public static final DeferredItem<Item> LAYING_DIAMOND_HOE = block(AdventuresGaloreModBlocks.LAYING_DIAMOND_HOE);
	public static final DeferredItem<Item> LAYING_NETHERITE_HOE = block(AdventuresGaloreModBlocks.LAYING_NETHERITE_HOE);
	public static final DeferredItem<Item> LEANING_WOODEN_HOE = block(AdventuresGaloreModBlocks.LEANING_WOODEN_HOE);
	public static final DeferredItem<Item> LEANING_STONE_HOE = block(AdventuresGaloreModBlocks.LEANING_STONE_HOE);
	public static final DeferredItem<Item> LEANING_IRON_HOE = block(AdventuresGaloreModBlocks.LEANING_IRON_HOE);
	public static final DeferredItem<Item> LEANING_GOLDEN_HOE = block(AdventuresGaloreModBlocks.LEANING_GOLDEN_HOE);
	public static final DeferredItem<Item> LEANING_DIAMOND_HOE = block(AdventuresGaloreModBlocks.LEANING_DIAMOND_HOE);
	public static final DeferredItem<Item> LEANING_NETHERITE_HOE = block(AdventuresGaloreModBlocks.LEANING_NETHERITE_HOE);
	public static final DeferredItem<Item> BLUNT_TEST = register("blunt_test", BluntTestItem::new);
	public static final DeferredItem<Item> ZOMBIE_DUMMY_ITEM = register("zombie_dummy_item", ZombieDummyItemItem::new);
	public static final DeferredItem<Item> SPIDER_DUMMY_ITEM = register("spider_dummy_item", SpiderDummyItemItem::new);
	public static final DeferredItem<Item> SKELETON_DUMMY_ITEM = register("skeleton_dummy_item", SkeletonDummyItemItem::new);
	public static final DeferredItem<Item> CREEPER_DUMMY_ITEM = register("creeper_dummy_item", CreeperDummyItemItem::new);
	public static final DeferredItem<Item> ENDERMAN_DUMMY_ITEM = register("enderman_dummy_item", EndermanDummyItemItem::new);
	public static final DeferredItem<Item> STICK_OF_DESPAWN = register("stick_of_despawn", StickOfDespawnItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}