package net.beyond_horizons.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class EffectOfTheCat extends StatusEffect {

    public EffectOfTheCat(StatusEffectCategory category, int color) {
        super(category, 16738740); // Custom effect color
        addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "ecfbb92a-70a5-45b5-aa43-6f0638e2562a", 0.2D, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
        addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "1f8cc9e9-73d9-4df4-8b64-bb7a063f5484", 4.0D, EntityAttributeModifier.Operation.ADDITION);
        addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "d34db33f-5a5a-4e30-96f1-0a7d2c24fd61", 4.0D, EntityAttributeModifier.Operation.ADDITION);
        addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "11d8007a-26c6-45f6-a9c9-3e3b6402c5a7", 2.0D, EntityAttributeModifier.Operation.ADDITION);
        addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "f15917a7-6b20-4859-9e1b-fd659edfe26e", 2.0D, EntityAttributeModifier.Operation.ADDITION);
        addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "12a8f6d4-42b7-4b44-9bfa-ee50291ad47c", 0.5D, EntityAttributeModifier.Operation.ADDITION);
        setDuration(45 * 20); // 45 seconds duration
        setBeneficial(); // Set the effect as beneficial
    }

    private void setBeneficial() {

    }

    private void setDuration(int i) {

    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
