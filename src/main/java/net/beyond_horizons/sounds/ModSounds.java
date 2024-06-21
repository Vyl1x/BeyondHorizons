package net.beyond_horizons.sounds;


import net.beyond_horizons.BeyondHorizons;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static SoundEvent TIGER_ROAR = register("tiger_roar");
    public static SoundEvent TIGER_WALK = register("tiger_walk");

    public static SoundEvent DRAGON_ROAR = register("dragon_roar");
    public static SoundEvent DRAGON_WINGS = register("dragon_wings");
    public static SoundEvent DRAGON_WALK = register("dragon_walk");

    private static SoundEvent register(String name) {
        return register(Identifier.of(BeyondHorizons.MOD_ID, name));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    public static void registerSounds() {
        System.out.println("Registering Mod Sounds for beyond-horizons");
    }
}
