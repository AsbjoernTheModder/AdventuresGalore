package net.mcreator.adventuresgalore;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.mcreator.adventuresgalore.mixin.AttributeUncapMixin;

public class AttributeUncapper {
    public static void uncapAttributes() {
        // Uncap armor and other attributes
        ((AttributeUncapMixin) (Object) Attributes.ARMOR).setMaxValue(10000.0);
        ((AttributeUncapMixin) (Object) Attributes.ARMOR_TOUGHNESS).setMaxValue(10000.0);
        ((AttributeUncapMixin) (Object) Attributes.MAX_HEALTH).setMaxValue(10000.0);
        ((AttributeUncapMixin) (Object) Attributes.ATTACK_DAMAGE).setMaxValue(10000.0);
        // Add other attributes here if needed!
    }
}