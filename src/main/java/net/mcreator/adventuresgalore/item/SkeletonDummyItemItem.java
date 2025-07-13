package net.mcreator.adventuresgalore.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.adventuresgalore.procedures.SkeletonDummyItemSummonProcedure;

public class SkeletonDummyItemItem extends Item {
	public SkeletonDummyItemItem(Item.Properties properties) {
		super(properties.durability(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		SkeletonDummyItemSummonProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}