package net.beyond_horizons.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public ModStrippableBlocks() {
    }

    public static void resiterStrippables() {
        StrippableBlockRegistry.register(ModBlocks.NIGHTSHADEGROVE_LOG, ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG);
        StrippableBlockRegistry.register(ModBlocks.JUNGLEJADE_LOG, ModBlocks.STRIPPED_JUNGLEJADE_LOG);
        StrippableBlockRegistry.register(ModBlocks.CRYSTALASPEN_LOG, ModBlocks.STRIPPED_CRYSTALASPEN_LOG);
        StrippableBlockRegistry.register(ModBlocks.DARKFIRE_LOG, ModBlocks.STRIPPED_DARKFIRE_LOG);
        StrippableBlockRegistry.register(ModBlocks.SHADOWONYXBLOODFLAME_LOG, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG);
        StrippableBlockRegistry.register(ModBlocks.NIGHTSHADEGROVE_WOOD, ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.JUNGLEJADE_WOOD, ModBlocks.STRIPPED_JUNGLEJADE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.CRYSTALASPEN_WOOD, ModBlocks.STRIPPED_CRYSTALASPEN_WOOD);
        StrippableBlockRegistry.register(ModBlocks.DARKFIRE_WOOD, ModBlocks.STRIPPED_DARKFIRE_WOOD);
        StrippableBlockRegistry.register(ModBlocks.SHADOWONYXBLOODFLAME_WOOD, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD);
    }
}
