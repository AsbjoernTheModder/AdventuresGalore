package net.mcreator.adventuresgalore.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.adventuresgalore.procedures.CreeperDummyItemSummonProcedure;

public class CreeperDummyItemItem extends Item {
	public CreeperDummyItemItem(Item.Properties properties) {
		super(properties.durability(1));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		CreeperDummyItemSummonProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}