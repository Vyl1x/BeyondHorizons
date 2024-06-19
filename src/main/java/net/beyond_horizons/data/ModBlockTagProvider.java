package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider{
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.ORES)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE)
                .add(ModBlocks.PHOENIXITE_ORE)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.ENDERITE_COAL_ORE)
                .add(ModBlocks.CELESTITE_ORE)

                .forceAddTag(BlockTags.GOLD_ORES)
                .forceAddTag(BlockTags.EMERALD_ORES)
                .forceAddTag(BlockTags.REDSTONE_ORES)
                .forceAddTag(BlockTags.LAPIS_ORES)
                .forceAddTag(BlockTags.DIAMOND_ORES)
                .forceAddTag(BlockTags.IRON_ORES)
                .forceAddTag(BlockTags.COPPER_ORES)
                .forceAddTag(BlockTags.COAL_ORES);

        getOrCreateTagBuilder(ModTags.Blocks.LOGS)
                .add(ModBlocks.NIGHTSHADEGROVE_LOG)
                .add(ModBlocks.JUNGLEJADE_LOG)
                .add(ModBlocks.CRYSTALASPEN_LOG)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .add(ModBlocks.DARKFIRE_LOG)
                .forceAddTag(BlockTags.LOGS);

        getOrCreateTagBuilder(ModTags.Blocks.PLANKS)
                .add(ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .add(ModBlocks.JUNGLEJADE_PLANKS)
                .add(ModBlocks.CRYSTALASPEN_PLANKS)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .add(ModBlocks.DARKFIRE_PLANKS)
                .forceAddTag(BlockTags.PLANKS);

        getOrCreateTagBuilder(ModTags.Blocks.SLABS)
                .add(ModBlocks.NIGHTSHADEGROVE_SLAB)
                .add(ModBlocks.JUNGLEJADE_SLAB)
                .add(ModBlocks.CRYSTALASPEN_SLAB)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB)
                .add(ModBlocks.DARKFIRE_SLAB)
                .forceAddTag(BlockTags.SLABS);

        getOrCreateTagBuilder(ModTags.Blocks.LEAVES)
                .add(ModBlocks.NIGHTSHADEGROVE_LEAVES)
                .add(ModBlocks.JUNGLEJADE_LEAVES)
                .add(ModBlocks.CRYSTALASPEN_LEAVES)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES)
                .add(ModBlocks.DARKFIRE_LEAVES)
                .forceAddTag(BlockTags.LEAVES);

        getOrCreateTagBuilder(ModTags.Blocks.MULTITOOL)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NIGHTSHADEGROVE_END_STONE)

                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.CELESTITE_BLOCK)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.ENDERITE_COAL_BLOCK)
                .add(ModBlocks.PHOENIXITE_BLOCK)
                .add(ModBlocks.COBALT_BLOCK)

                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.ENDERITE_COAL_ORE)
                .add(ModBlocks.CELESTITE_ORE)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.PHOENIXITE_ORE)
                .add(ModBlocks.MYTHRIL_ORE)

                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.NIGHTSHADEGROVE_LEAVES)
                .add(ModBlocks.CRYSTALASPEN_LEAVES)
                .add(ModBlocks.JUNGLEJADE_LEAVES)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES)
                .add(ModBlocks.DARKFIRE_LEAVES);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.NIGHTSHADEGROVE_LOG)
                .add(ModBlocks.JUNGLEJADE_LOG)
                .add(ModBlocks.CRYSTALASPEN_LOG)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .add(ModBlocks.DARKFIRE_LOG)
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG)
                .add(ModBlocks.STRIPPED_JUNGLEJADE_LOG)
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG)
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG)
                .add(ModBlocks.STRIPPED_DARKFIRE_LOG)
                .add(ModBlocks.NIGHTSHADEGROVE_WOOD)
                .add(ModBlocks.JUNGLEJADE_WOOD)
                .add(ModBlocks.CRYSTALASPEN_WOOD)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD)
                .add(ModBlocks.DARKFIRE_WOOD)
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD)
                .add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD)
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD)
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD)
                .add(ModBlocks.STRIPPED_DARKFIRE_WOOD)
                .add(ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .add(ModBlocks.JUNGLEJADE_PLANKS)
                .add(ModBlocks.CRYSTALASPEN_PLANKS)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .add(ModBlocks.DARKFIRE_PLANKS)
                .add(ModBlocks.NIGHTSHADEGROVE_SLAB)
                .add(ModBlocks.JUNGLEJADE_SLAB)
                .add(ModBlocks.CRYSTALASPEN_SLAB)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB)
                .add(ModBlocks.DARKFIRE_SLAB)
                .add(ModBlocks.NIGHTSHADEGROVE_DOOR)
                .add(ModBlocks.JUNGLEJADE_DOOR)
                .add(ModBlocks.CRYSTALASPEN_DOOR)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR)
                .add(ModBlocks.DARKFIRE_DOOR)
                .add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR)
                .add(ModBlocks.JUNGLEJADE_TRAPDOOR)
                .add(ModBlocks.CRYSTALASPEN_TRAPDOOR)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR)
                .add(ModBlocks.DARKFIRE_TRAPDOOR)
                .add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR)
                .add(ModBlocks.JUNGLEJADE_TRAPDOOR)
                .add(ModBlocks.CRYSTALASPEN_TRAPDOOR)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR)
                .add(ModBlocks.DARKFIRE_TRAPDOOR)
                .add(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE)
                .add(ModBlocks.JUNGLEJADE_PRESSURE_PLATE)
                .add(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE)
                .add(ModBlocks.DARKFIRE_PRESSURE_PLATE)
                .add(ModBlocks.NIGHTSHADEGROVE_BUTTON)
                .add(ModBlocks.JUNGLEJADE_BUTTON)
                .add(ModBlocks.CRYSTALASPEN_BUTTON)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON)
                .add(ModBlocks.DARKFIRE_BUTTON)
                .add(ModBlocks.NIGHTSHADEGROVE_FENCE)
                .add(ModBlocks.JUNGLEJADE_FENCE)
                .add(ModBlocks.CRYSTALASPEN_FENCE)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE)
                .add(ModBlocks.DARKFIRE_FENCE)
                .add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE)
                .add(ModBlocks.JUNGLEJADE_FENCE_GATE)
                .add(ModBlocks.CRYSTALASPEN_FENCE_GATE)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE)
                .add(ModBlocks.DARKFIRE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.NIGHTSHADEGROVE_END_STONE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

                .add(ModBlocks.ENDERITE_COAL_BLOCK)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.ENDERITE_COAL_ORE)
                .add(ModBlocks.COBALT_ORE)
                .add(ModBlocks.DEEPSLATE_COBALT_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.ENDERITE_BLOCK)
                .add(ModBlocks.PHOENIXITE_BLOCK)
                .add(ModBlocks.CELESTITE_BLOCK)
                .add(ModBlocks.MYTHRIL_BLOCK)
                .add(ModBlocks.ENDERITE_ORE)
                .add(ModBlocks.CELESTITE_ORE)
                .add(ModBlocks.PHOENIXITE_ORE)
                .add(ModBlocks.MYTHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.NIGHTSHADEGROVE_FENCE)
                .add(ModBlocks.JUNGLEJADE_FENCE)
                .add(ModBlocks.CRYSTALASPEN_FENCE)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE)
                .add(ModBlocks.DARKFIRE_FENCE)

                .add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE)
                .add(ModBlocks.JUNGLEJADE_FENCE_GATE)
                .add(ModBlocks.CRYSTALASPEN_FENCE_GATE)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE)
                .add(ModBlocks.DARKFIRE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.NIGHTSHADEGROVE_LOG)
                .add(ModBlocks.JUNGLEJADE_LOG)
                .add(ModBlocks.CRYSTALASPEN_LOG)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .add(ModBlocks.DARKFIRE_LOG)
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG)
                .add(ModBlocks.STRIPPED_JUNGLEJADE_LOG)
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG)
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG)
                .add(ModBlocks.STRIPPED_DARKFIRE_LOG)
                .add(ModBlocks.NIGHTSHADEGROVE_WOOD)
                .add(ModBlocks.JUNGLEJADE_WOOD)
                .add(ModBlocks.CRYSTALASPEN_WOOD)
                .add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD)
                .add(ModBlocks.DARKFIRE_WOOD)
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD)
                .add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD)
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD)
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD)
                .add(ModBlocks.STRIPPED_DARKFIRE_WOOD);
    }

}