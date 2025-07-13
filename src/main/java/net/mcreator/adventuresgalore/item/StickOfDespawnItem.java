package net.mcreator.adventuresgalore.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class StickOfDespawnItem extends Item {
	public StickOfDespawnItem(Item.Properties properties) {
		super(properties.durability(1));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}
}