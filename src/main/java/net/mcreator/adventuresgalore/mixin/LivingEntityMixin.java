package net.mcreator.adventuresgalore.mixin;

import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    /**
     * Remove health clamp in LivingEntity#setHealth
     * This makes it so setHealth will not limit the health to max health.
     */
    @Redirect(
        method = "setHealth",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/util/Mth;clamp(FFF)F"
        )
    )
    private float adventuresgalore$unclampedHealth(float health, float min, float max) {
        // Just return the health directly, ignoring the clamp.
        return health;
    }
}
