package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

        /** LOG TYPES **/
        this.addDrop(ModBlocks.CRYSTALASPEN_SAPLING);
        this.addDrop(ModBlocks.CRYSTALASPEN_BUTTON);
        this.doorDrops(ModBlocks.CRYSTALASPEN_DOOR);
        this.addDrop(ModBlocks.CRYSTALASPEN_FENCE);
        this.addDrop(ModBlocks.CRYSTALASPEN_FENCE_GATE);
        this.addDrop(ModBlocks.CRYSTALASPEN_LOG);
        this.addDrop(ModBlocks.CRYSTALASPEN_PLANKS);
        this.slabDrops(ModBlocks.CRYSTALASPEN_SLAB);
        this.addDrop(ModBlocks.CRYSTALASPEN_STAIRS);
        this.addDrop(ModBlocks.CRYSTALASPEN_TRAPDOOR);
        this.addDrop(ModBlocks.CRYSTALASPEN_WOOD);
        this.addDrop(ModBlocks.STRIPPED_CRYSTALASPEN_LOG);
        this.addDrop(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD);

        this.addDrop(ModBlocks.JUNGLEJADE_SAPLING);
        this.addDrop(ModBlocks.JUNGLEJADE_BUTTON);
        this.doorDrops(ModBlocks.JUNGLEJADE_DOOR);
        this.addDrop(ModBlocks.JUNGLEJADE_FENCE);
        this.addDrop(ModBlocks.JUNGLEJADE_FENCE_GATE);
        this.addDrop(ModBlocks.JUNGLEJADE_LOG);
        this.addDrop(ModBlocks.JUNGLEJADE_PLANKS);
        this.slabDrops(ModBlocks.JUNGLEJADE_SLAB);
        this.addDrop(ModBlocks.JUNGLEJADE_STAIRS);
        this.addDrop(ModBlocks.JUNGLEJADE_TRAPDOOR);
        this.addDrop(ModBlocks.JUNGLEJADE_WOOD);
        this.addDrop(ModBlocks.STRIPPED_JUNGLEJADE_LOG);
        this.addDrop(ModBlocks.STRIPPED_JUNGLEJADE_WOOD);

        this.addDrop(ModBlocks.NIGHTSHADEGROVE_SAPLING);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_BUTTON);
        this.doorDrops(ModBlocks.NIGHTSHADEGROVE_DOOR);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_FENCE);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_LOG);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_PLANKS);
        this.slabDrops(ModBlocks.NIGHTSHADEGROVE_SLAB);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_STAIRS);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR);
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_WOOD);
        this.addDrop(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG);
        this.addDrop(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD);

        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON);
        this.doorDrops(ModBlocks.SHADOWONYXBLOODFLAME_DOOR);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_FENCE);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_LOG);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS);
        this.slabDrops(ModBlocks.SHADOWONYXBLOODFLAME_SLAB);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR);
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_WOOD);
        this.addDrop(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG);
        this.addDrop(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD);

        this.addDrop(ModBlocks.DARKFIRE_SAPLING);
        this.addDrop(ModBlocks.DARKFIRE_BUTTON);
        this.doorDrops(ModBlocks.DARKFIRE_DOOR);
        this.addDrop(ModBlocks.DARKFIRE_FENCE);
        this.addDrop(ModBlocks.DARKFIRE_FENCE_GATE);
        this.addDrop(ModBlocks.DARKFIRE_LOG);
        this.addDrop(ModBlocks.DARKFIRE_PLANKS);
        this.slabDrops(ModBlocks.DARKFIRE_SLAB);
        this.addDrop(ModBlocks.DARKFIRE_STAIRS);
        this.addDrop(ModBlocks.DARKFIRE_TRAPDOOR);
        this.addDrop(ModBlocks.DARKFIRE_WOOD);
        this.addDrop(ModBlocks.STRIPPED_DARKFIRE_LOG);
        this.addDrop(ModBlocks.STRIPPED_DARKFIRE_WOOD);

        /** BLOCKS **/
        this.addDrop(ModBlocks.ENDERITE_BLOCK);
        this.addDrop(ModBlocks.ENDERITE_COAL_BLOCK);
        this.addDrop(ModBlocks.RUBY_BLOCK);
        this.addDrop(ModBlocks.CELESTITE_BLOCK);
        this.addDrop(ModBlocks.COBALT_BLOCK);
        this.addDrop(ModBlocks.MYTHRIL_BLOCK);
        /** END STONE **/
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_END_STONE);

        /** ORES v1 **/
        this.addDrop(ModBlocks.RUBY_ORE, this.oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        this.addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, this.oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        this.addDrop(ModBlocks.COBALT_ORE, this.oreDrops(ModBlocks.COBALT_ORE, ModItems.COBALT_INGOT));
        this.addDrop(ModBlocks.DEEPSLATE_COBALT_ORE, this.oreDrops(ModBlocks.DEEPSLATE_COBALT_ORE, ModItems.COBALT_INGOT));
        this.addDrop(ModBlocks.MYTHRIL_ORE, this.oreDrops(ModBlocks.MYTHRIL_ORE, ModItems.MYTHRIL_INGOT));
        this.addDrop(ModBlocks.DEEPSLATE_MYTHRIL_ORE, this.oreDrops(ModBlocks.DEEPSLATE_MYTHRIL_ORE, ModItems.MYTHRIL_INGOT));
        this.addDrop(ModBlocks.CELESTITE_ORE, this.oreDrops(ModBlocks.ENDERITE_ORE, ModItems.RAW_CELESTITE));
        this.addDrop(ModBlocks.ENDERITE_COAL_ORE, this.oreDrops(ModBlocks.ENDERITE_COAL_ORE, ModItems.ENDERITE_COAL));

        /** ORES v2 **/
        this.addDrop(ModBlocks.ENDERITE_ORE);
        this.addDrop(ModBlocks.PHOENIXITE_ORE);

        /** LEAVES **/
        this.addDrop(ModBlocks.CRYSTALASPEN_LEAVES, (Block block) -> this.leavesDrops(block, ModBlocks.CRYSTALASPEN_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.JUNGLEJADE_LEAVES, (Block block) -> this.leavesDrops(block, ModBlocks.JUNGLEJADE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.NIGHTSHADEGROVE_LEAVES, (Block block) -> this.leavesDrops(block, ModBlocks.NIGHTSHADEGROVE_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES, (Block block) -> this.leavesDrops(block, ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, SAPLING_DROP_CHANCE));
        this.addDrop(ModBlocks.DARKFIRE_LEAVES, (Block block) -> this.leavesDrops(block, ModBlocks.DARKFIRE_SAPLING, SAPLING_DROP_CHANCE));
    }
}
