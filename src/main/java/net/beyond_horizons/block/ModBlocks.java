package net.beyond_horizons.block;

import com.mojang.serialization.MapCodec;
import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.custom.*;
import net.beyond_horizons.world.feature.ModConfiguredFeatures;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import java.util.Optional;

import static net.minecraft.block.BlockSetType.ActivationRule.EVERYTHING;
import static net.minecraft.block.Blocks.OAK_PLANKS;

public class ModBlocks {

    public static final Block NIGHTSHADEGROVE_LOG = registerBlocks("nightshadegrove_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_LOG = registerBlocks("junglejade_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_LOG = registerBlocks("crystalaspen_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_LOG = registerBlocks("shadowonyxbloodflame_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_LOG = registerBlocks("darkfire_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).strength(2.0F, 4.0F)));

    public static final Block STRIPPED_NIGHTSHADEGROVE_LOG = registerBlocks("stripped_nightshadegrove_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_JUNGLEJADE_LOG = registerBlocks("stripped_junglejade_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_CRYSTALASPEN_LOG = registerBlocks("stripped_crystalaspen_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_SHADOWONYXBLOODFLAME_LOG = registerBlocks("stripped_shadowonyxbloodflame_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_DARKFIRE_LOG = registerBlocks("stripped_darkfire_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_WOOD = registerBlocks("nightshadegrove_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_WOOD = registerBlocks("junglejade_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_WOOD = registerBlocks("crystalaspen_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_WOOD = registerBlocks("shadowonyxbloodflame_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_WOOD = registerBlocks("darkfire_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).strength(2.0F, 4.0F)));

    public static final Block STRIPPED_NIGHTSHADEGROVE_WOOD = registerBlocks("stripped_nightshadegrove_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_JUNGLEJADE_WOOD = registerBlocks("stripped_junglejade_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_CRYSTALASPEN_WOOD = registerBlocks("stripped_crystalaspen_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_SHADOWONYXBLOODFLAME_WOOD = registerBlocks("stripped_shadowonyxbloodflame_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F, 4.0F)));
    public static final Block STRIPPED_DARKFIRE_WOOD = registerBlocks("stripped_darkfire_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_STAIRS = registerBlocks("nightshadegrove_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_STAIRS = registerBlocks("junglejade_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_STAIRS = registerBlocks("crystalaspen_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_STAIRS = registerBlocks("shadowonyxbloodflame_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_STAIRS = registerBlocks("darkfire_stairs",
            new ModStairsBlock(OAK_PLANKS.getDefaultState(),AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_SLAB = registerBlocks("nightshadegrove_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_SLAB = registerBlocks("junglejade_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_SLAB = registerBlocks("crystalaspen_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_SLAB = registerBlocks("shadowonyxbloodflame_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_SLAB = registerBlocks("darkfire_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_PRESSURE_PLATE = registerBlocks("nightshadegrove_pressure_plate",
            new ModPressurePlateBlock(EVERYTHING, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2.0F, 4.0F)
                    .noCollision(), BlockSetType.OAK));
    public static final Block JUNGLEJADE_PRESSURE_PLATE = registerBlocks("junglejade_pressure_plate",
            new ModPressurePlateBlock(EVERYTHING,AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2.0F, 4.0F)
                    .noCollision(), BlockSetType.OAK));
    public static final Block CRYSTALASPEN_PRESSURE_PLATE = registerBlocks("crystalaspen_pressure_plate",
            new ModPressurePlateBlock(EVERYTHING,AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2.0F, 4.0F)
                    .noCollision(), BlockSetType.OAK));
    public static final Block SHADOWONYXBLOODFLAME_PRESSURE_PLATE = registerBlocks("shadowonyxbloodflame_pressure_plate",
            new ModPressurePlateBlock(EVERYTHING,AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2.0F, 4.0F)
                    .noCollision(), BlockSetType.OAK));
    public static final Block DARKFIRE_PRESSURE_PLATE = registerBlocks("darkfire_pressure_plate",
            new ModPressurePlateBlock(EVERYTHING,AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).strength(2.0F, 4.0F)
                    .noCollision(), BlockSetType.OAK));

    public static final Block NIGHTSHADEGROVE_BUTTON = registerBlocks("nightshadegrove_button",
            new ModButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).strength(2.0F, 4.0F),
                    BlockSetType.OAK, 30, true));
    public static final Block JUNGLEJADE_BUTTON = registerBlocks("junglejade_button",
            new ModButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).strength(2.0F, 4.0F),
                    BlockSetType.OAK, 30, true));
    public static final Block CRYSTALASPEN_BUTTON = registerBlocks("crystalaspen_button",
            new ModButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).strength(2.0F, 4.0F),
                    BlockSetType.OAK, 30, true));
    public static final Block SHADOWONYXBLOODFLAME_BUTTON = registerBlocks("shadowonyxbloodflame_button",
            new ModButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).strength(2.0F, 4.0F),
                    BlockSetType.OAK, 30, true));
    public static final Block DARKFIRE_BUTTON = registerBlocks("darkfire_button",
            new ModButtonBlock(AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).strength(2.0F, 4.0F),
                    BlockSetType.OAK, 30, true));

    public static final Block NIGHTSHADEGROVE_FENCE = registerBlocks("nightshadegrove_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_FENCE = registerBlocks("junglejade_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_FENCE = registerBlocks("crystalaspen_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_FENCE = registerBlocks("shadowonyxbloodflame_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_FENCE = registerBlocks("darkfire_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_FENCE_GATE = registerBlocks("nightshadegrove_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_FENCE_GATE = registerBlocks("junglejade_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_FENCE_GATE = registerBlocks("crystalaspen_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_FENCE_GATE = registerBlocks("shadowonyxbloodflame_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_FENCE_GATE = registerBlocks("darkfire_fence_gate",
            new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_PLANKS = registerBlocks("nightshadegrove_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_PLANKS = registerBlocks("junglejade_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_PLANKS = registerBlocks("crystalaspen_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_PLANKS = registerBlocks("shadowonyxbloodflame_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_PLANKS = registerBlocks("darkfire_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_DOOR = registerBlocks("nightshadegrove_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_DOOR = registerBlocks("junglejade_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_DOOR = registerBlocks("crystalaspen_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_DOOR = registerBlocks("shadowonyxbloodflame_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_DOOR = registerBlocks("darkfire_door",
            new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_TRAPDOOR = registerBlocks("nightshadegrove_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).strength(2.0F, 4.0F)));
    public static final Block JUNGLEJADE_TRAPDOOR = registerBlocks("junglejade_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).strength(2.0F, 4.0F)));
    public static final Block CRYSTALASPEN_TRAPDOOR = registerBlocks("crystalaspen_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).strength(2.0F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_TRAPDOOR = registerBlocks("shadowonyxbloodflame_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).strength(2.0F, 4.0F)));
    public static final Block DARKFIRE_TRAPDOOR = registerBlocks("darkfire_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).strength(2.0F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_LEAVES = registerBlocks("nightshadegrove_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(0.2F, 4.0F)));
    public static final Block JUNGLEJADE_LEAVES = registerBlocks("junglejade_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(0.2F, 4.0F)));
    public static final Block CRYSTALASPEN_LEAVES = registerBlocks("crystalaspen_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(0.2F, 4.0F)));
    public static final Block SHADOWONYXBLOODFLAME_LEAVES = registerBlocks("shadowonyxbloodflame_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(0.2F, 4.0F)));
    public static final Block DARKFIRE_LEAVES = registerBlocks("darkfire_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).strength(0.2F, 4.0F)));

    public static final Block NIGHTSHADEGROVE_SAPLING = registerBlocks("nightshadegrove_sapling",
            new ModSaplingBlock(new SaplingGenerator("nightshadegrove", Optional.empty(),
                    Optional.of(ModConfiguredFeatures.NIGHTSHADEGROVE_KEY), Optional.empty()),
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING), () -> ModBlocks.NIGHTSHADEGROVE_END_STONE));
    public static final Block JUNGLEJADE_SAPLING = registerBlocks("junglejade_sapling",
            new SaplingBlock(new SaplingGenerator("junglejade", Optional.empty(),
                    Optional.of(ModConfiguredFeatures.JUNGLEJADE_KEY), Optional.empty()),
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block CRYSTALASPEN_SAPLING = registerBlocks("crystalaspen_sapling",
            new SaplingBlock(new SaplingGenerator("crystalaspen", Optional.empty(),
                    Optional.of(ModConfiguredFeatures.CRYSTALASPEN_KEY), Optional.empty()),
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block SHADOWONYXBLOODFLAME_SAPLING = registerBlocks("shadowonyxbloodflame_sapling",
            new SaplingBlock(new SaplingGenerator("shadowonyxbloodflame", Optional.empty(),
                    Optional.of(ModConfiguredFeatures.SHADOWONYXBLOODFLAME_KEY), Optional.empty()),
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));
    public static final Block DARKFIRE_SAPLING = registerBlocks("darkfire_sapling",
            new SaplingBlock(new SaplingGenerator("darkfire", Optional.empty(),
                    Optional.of(ModConfiguredFeatures.DARKFIRE_KEY), Optional.empty()),
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    /** ENDSTONE **/
    public static final Block NIGHTSHADEGROVE_END_STONE = registerBlocks("nightshadegrove_end_stone",
            new Block(AbstractBlock.Settings.copy(Blocks.END_STONE).strength(0.2F, 4.0F).requiresTool()));


    /** ORES **/
    public static final Block DEEPSLATE_RUBY_ORE = registerBlocks("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(4.5f, 3.0f).requiresTool()));
    public static final Block RUBY_ORE = registerBlocks("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0f, 3.0F).requiresTool()));
    public static final Block PHOENIXITE_ORE = registerBlocks("phoenixite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.NETHERRACK).strength(6.35F, 12000.0F).requiresTool()));
    public static final Block ENDERITE_ORE = registerBlocks("enderite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.END_STONE).strength(6.35F, 12000.0F).requiresTool()));
    public static final Block ENDERITE_COAL_ORE = registerBlocks("enderite_coal_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.END_STONE).strength(3.25F, 3.0F).requiresTool()));
    public static final Block CELESTITE_ORE = registerBlocks("celestite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.END_STONE).strength(12.0F, 12000.0F).requiresTool()));
    public static final Block COBALT_ORE = registerBlocks("cobalt_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.STONE).strength(3.25F, 3.0F).requiresTool()));
    public static final Block DEEPSLATE_COBALT_ORE = registerBlocks("deepslate_cobalt_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(3.25F, 3.0F).requiresTool()));
    public static final Block MYTHRIL_ORE = registerBlocks("mythril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.STONE).strength(5.0F, 12.0F).requiresTool()));
    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlocks("deepslate_mythril_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 6),
                    AbstractBlock.Settings.copy(Blocks.DEEPSLATE).strength(6.0F, 12.0F).requiresTool()));

    /** BLOCKS **/
    public static final Block RUBY_BLOCK = registerBlocks("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(4.0F, 4.0F).requiresTool()));
    public static final Block COBALT_BLOCK = registerBlocks("cobalt_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(4.0F, 4.0F).requiresTool()));
    public static final Block PHOENIXITE_BLOCK = registerBlocks("phoenixite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(6.0F, 4.0F).requiresTool()));
    public static final Block ENDERITE_BLOCK = registerBlocks("enderite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(6.0F, 4.0F).requiresTool()));
    public static final Block ENDERITE_COAL_BLOCK = registerBlocks("enderite_coal_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(4.0F, 4.0F).requiresTool()));
    public static final Block CELESTITE_BLOCK = registerBlocks("celestite_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(12.0F, 4.0F).requiresTool()));
    public static final Block MYTHRIL_BLOCK = registerBlocks("mythril_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).nonOpaque().strength(6.0F, 4.0F).requiresTool()));

    private static Block registerBlocks(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BeyondHorizons.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(BeyondHorizons.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        BeyondHorizons.LOGGER.info("Registering ModBlocks for " + BeyondHorizons.MOD_ID);
    }

}
