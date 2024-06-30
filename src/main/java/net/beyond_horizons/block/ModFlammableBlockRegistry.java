package net.beyond_horizons.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public ModFlammableBlockRegistry() {
    }

    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.CRYSTALASPEN_LOG, 5, 5);
        registry.add(ModBlocks.CRYSTALASPEN_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, 5, 5);
        registry.add(ModBlocks.CRYSTALASPEN_LEAVES, 30, 60);
        registry.add(ModBlocks.CRYSTALASPEN_PLANKS, 5, 20);

        registry.add(ModBlocks.NIGHTSHADEGROVE_LOG, 5, 5);
        registry.add(ModBlocks.NIGHTSHADEGROVE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, 5, 5);
        registry.add(ModBlocks.NIGHTSHADEGROVE_LEAVES, 30, 60);
        registry.add(ModBlocks.NIGHTSHADEGROVE_PLANKS, 5, 20);

        registry.add(ModBlocks.JUNGLEJADE_LOG, 5, 5);
        registry.add(ModBlocks.JUNGLEJADE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_JUNGLEJADE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD, 5, 5);
        registry.add(ModBlocks.JUNGLEJADE_LEAVES, 30, 60);
        registry.add(ModBlocks.JUNGLEJADE_PLANKS, 5, 20);

        registry.add(ModBlocks.DARKFIRE_LOG, 5, 5);
        registry.add(ModBlocks.DARKFIRE_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_DARKFIRE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_DARKFIRE_WOOD, 5, 5);
        registry.add(ModBlocks.DARKFIRE_LEAVES, 30, 60);
        registry.add(ModBlocks.DARKFIRE_PLANKS, 5, 20);

        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, 5, 5);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, 5, 20);
    }
}
