package net.beyond_horizons.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class EffectOfTheTiger extends StatusEffect {
    public EffectOfTheTiger(StatusEffectCategory category, int color) {
        super(category, 0xFFA500); // Custom effect color
        addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, Identifier.of("9fe493f5-14d5-4963-9a83-6a464d697ab3"), 2.0D, EntityAttributeModifier.Operation.ADD_VALUE);
        addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, Identifier.of("df88fbd5-afab-43a6-af48-dcf846ebb993"), 0.2D, EntityAttributeModifier.Operation.ADD_VALUE);
        addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, Identifier.of("e2a6f483-d714-48ab-89e1-6c917a6a99c6"), 2.0D, EntityAttributeModifier.Operation.ADD_VALUE);
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
