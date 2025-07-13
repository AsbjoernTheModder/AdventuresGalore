package net.mcreator.adventuresgalore.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.mcreator.adventuresgalore.mixin.AttributeUncapMixin;

import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RangedAttribute.class)
public interface AttributeUncapMixin {
    @Accessor("maxValue")
    void setMaxValue(double value);

    @Accessor("minValue")
    void setMinValue(double value);
}
