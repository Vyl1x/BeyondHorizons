package net.beyond_horizons.world.biome.surface;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule SNOW_BLOCK = makeStateRule(Blocks.SNOW_BLOCK);
    private static final MaterialRules.MaterialRule BLUE_ICE = makeStateRule(Blocks.BLUE_ICE);
    private static final MaterialRules.MaterialRule MAGMA_BLOCK = makeStateRule(Blocks.MAGMA_BLOCK);
    private static final MaterialRules.MaterialRule BLACKSTONE = makeStateRule(Blocks.BLACKSTONE);
    private static final MaterialRules.MaterialRule NS_END_STONE = makeStateRule(ModBlocks.NIGHTSHADEGROVE_END_STONE);
    private static final MaterialRules.MaterialRule END_STONE = makeStateRule(Blocks.END_STONE);

    // Separate rules for each biome
    private static final MaterialRules.MaterialRule COLDENASPEN_RULE = MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(-63), 1),
                    MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BLUE_ICE),
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING_WITH_SURFACE_DEPTH, SNOW_BLOCK)
                    )
            )
    );

    private static final MaterialRules.MaterialRule SHADOWLANDS_RULE = MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(1), 1),
                    MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, MAGMA_BLOCK)
                    )
            )
    );

    private static final MaterialRules.MaterialRule DARKHOTMEADOW_RULE = MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.aboveY(YOffset.fixed(-63), 1),
                    MaterialRules.sequence(
                            MaterialRules.condition(MaterialRules.STONE_DEPTH_CEILING, BLACKSTONE)
                    )
            )
    );

    private static final MaterialRules.MaterialRule SHADYNIGHT_RULE = MaterialRules.sequence(
            MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, NS_END_STONE), END_STONE
    );

    public static MaterialRules.MaterialRule makeRules() {
        return MaterialRules.sequence(
                MaterialRules.condition(MaterialRules.biome(ModBiomes.COLDENASPEN_BIOME), COLDENASPEN_RULE),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.SHADOWLANDS_BIOME), SHADOWLANDS_RULE),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.SHADYNIGHT_BIOME), SHADYNIGHT_RULE),
                MaterialRules.condition(MaterialRules.biome(ModBiomes.DARKHOTMEADOW_BIOME), DARKHOTMEADOW_RULE)
        );
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}