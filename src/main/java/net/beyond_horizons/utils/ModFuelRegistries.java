package net.beyond_horizons.utils;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModFuelRegistries {

    public ModFuelRegistries() {
    }

    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        BeyondHorizons.LOGGER.info("Registering Fuels for beyond-horizons");
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ENDERITE_COAL, 1600);

        registry.add(ModBlocks.ENDERITE_COAL_BLOCK, 16000);

        registry.add(ModBlocks.CRYSTALASPEN_PLANKS, 300);
        registry.add(ModBlocks.JUNGLEJADE_PLANKS, 300);
        registry.add(ModBlocks.NIGHTSHADEGROVE_PLANKS, 300);
        registry.add(ModBlocks.DARKFIRE_PLANKS, 300);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, 300);

        registry.add(ModBlocks.CRYSTALASPEN_SLAB, 150);
        registry.add(ModBlocks.JUNGLEJADE_SLAB, 150);
        registry.add(ModBlocks.NIGHTSHADEGROVE_SLAB, 150);
        registry.add(ModBlocks.DARKFIRE_SLAB, 150);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB, 150);

        registry.add(ModBlocks.CRYSTALASPEN_STAIRS, 300);
        registry.add(ModBlocks.JUNGLEJADE_STAIRS, 300);
        registry.add(ModBlocks.NIGHTSHADEGROVE_STAIRS, 300);
        registry.add(ModBlocks.DARKFIRE_STAIRS, 300);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, 300);

        registry.add(ModBlocks.CRYSTALASPEN_BUTTON, 100);
        registry.add(ModBlocks.JUNGLEJADE_BUTTON, 100);
        registry.add(ModBlocks.NIGHTSHADEGROVE_BUTTON, 100);
        registry.add(ModBlocks.DARKFIRE_BUTTON, 100);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, 100);

        registry.add(ModBlocks.CRYSTALASPEN_TRAPDOOR, 300);
        registry.add(ModBlocks.JUNGLEJADE_TRAPDOOR, 300);
        registry.add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, 300);
        registry.add(ModBlocks.DARKFIRE_TRAPDOOR, 300);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, 300);

        registry.add(ModBlocks.CRYSTALASPEN_FENCE, 300);
        registry.add(ModBlocks.JUNGLEJADE_FENCE, 300);
        registry.add(ModBlocks.NIGHTSHADEGROVE_FENCE, 300);
        registry.add(ModBlocks.DARKFIRE_FENCE, 300);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE, 300);

        registry.add(ModBlocks.CRYSTALASPEN_FENCE_GATE, 300);
        registry.add(ModBlocks.JUNGLEJADE_FENCE_GATE, 300);
        registry.add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, 300);
        registry.add(ModBlocks.DARKFIRE_FENCE_GATE, 300);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, 300);

        registry.add(ModBlocks.CRYSTALASPEN_DOOR, 200);
        registry.add(ModBlocks.JUNGLEJADE_DOOR, 200);
        registry.add(ModBlocks.NIGHTSHADEGROVE_DOOR, 200);
        registry.add(ModBlocks.DARKFIRE_DOOR, 200);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR, 200);

        registry.add(ModBlocks.CRYSTALASPEN_SAPLING, 100);
        registry.add(ModBlocks.JUNGLEJADE_SAPLING, 100);
        registry.add(ModBlocks.NIGHTSHADEGROVE_SAPLING, 100);
        registry.add(ModBlocks.DARKFIRE_SAPLING, 100);
        registry.add(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, 100);
    }
}
