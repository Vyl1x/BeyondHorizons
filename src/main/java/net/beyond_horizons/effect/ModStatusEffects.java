package net.beyond_horizons.effect;

import net.beyond_horizons.BeyondHorizons;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModStatusEffects {

    public static StatusEffect EFFECT_OF_THE_CAT;
    public static StatusEffect EFFECT_OF_THE_TIGER;

    public static StatusEffect registerEffectofCats(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(BeyondHorizons.MOD_ID, name),
                new EffectOfTheCat(StatusEffectCategory.NEUTRAL, 16753920));
    }
    public static StatusEffect registerEffectofTiger(String name){
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(BeyondHorizons.MOD_ID, name),
                new EffectOfTheTiger(StatusEffectCategory.NEUTRAL, 16738740));
    }
    public static void registerEffects() {
        EFFECT_OF_THE_CAT = registerEffectofCats("effect_of_the_cat");
        EFFECT_OF_THE_TIGER = registerEffectofTiger("effect_of_the_tiger");
    }
}
