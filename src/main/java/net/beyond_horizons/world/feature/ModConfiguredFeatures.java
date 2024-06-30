package net.beyond_horizons.world.feature;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.world.feature.tree.custom.JadesFoliagePlacer;
import net.beyond_horizons.world.feature.tree.custom.JadesTrunkPlacer;
import net.beyond_horizons.world.feature.tree.custom.NightShadesFoliagePlacer;
import net.beyond_horizons.world.feature.tree.custom.NightShadesTrunkPlacer;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    //Tree
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRYSTALASPEN_KEY = registerKey("crystalaspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARKFIRE_KEY = registerKey("darkfire");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNGLEJADE_KEY = registerKey("junglejade");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NIGHTSHADEGROVE_KEY = registerKey("nightshadegrove");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHADOWONYXBLOODFLAME_KEY = registerKey("shadowonyxbloodflame");

    //Ore
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRIL_ORE_KEY = registerKey("mythril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOENIXITE_ORE_KEY = registerKey("phoenixite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERITE_ORE_KEY = registerKey("enderite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENDERITE_COAL_RUBY_ORE_KEY = registerKey("enderite_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CELESTITE_ORE_KEY = registerKey("celestite_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCobaltOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.COBALT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_COBALT_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMythrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MYTHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_MYTHRIL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> NetherPhoenixiteOres =
                List.of(OreFeatureConfig.createTarget(netherrackReplaceables, ModBlocks.PHOENIXITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> EnderiteOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, ModBlocks.ENDERITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> EnderiteCoalOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, ModBlocks.ENDERITE_COAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> CelestiteOres =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, ModBlocks.CELESTITE_ORE.getDefaultState()));

        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 4));
        register(context, COBALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCobaltOres, 4));
        register(context, MYTHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMythrilOres, 4,0.50F));
        register(context, PHOENIXITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(NetherPhoenixiteOres, 2, 0.75F));
        register(context, ENDERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(EnderiteOres, 5, 0.40F));
        register(context, ENDERITE_COAL_RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(EnderiteCoalOres, 7));
        register(context, CELESTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(CelestiteOres, 4, 0.70F));

        //TERRAIN //BIOME
        register(context, CRYSTALASPEN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CRYSTALASPEN_LOG),
                new StraightTrunkPlacer(3, 5, 4),
                BlockStateProvider.of(ModBlocks.CRYSTALASPEN_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, DARKFIRE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.DARKFIRE_LOG),
                new StraightTrunkPlacer(5, 7, 4),
                BlockStateProvider.of(ModBlocks.DARKFIRE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, JUNGLEJADE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.JUNGLEJADE_LOG),
                new JadesTrunkPlacer(4, 5, 12),
                BlockStateProvider.of(ModBlocks.JUNGLEJADE_LEAVES),
                new JadesFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.DIRT)).build());
        register(context, NIGHTSHADEGROVE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.NIGHTSHADEGROVE_LOG),
                new NightShadesTrunkPlacer(11, 8, 14),
                BlockStateProvider.of(ModBlocks.NIGHTSHADEGROVE_LEAVES),
                new NightShadesFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 5),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.END_STONE)).build());
        register(context, SHADOWONYXBLOODFLAME_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SHADOWONYXBLOODFLAME_LOG),
                new StraightTrunkPlacer(5, 7, 4),
                BlockStateProvider.of(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).dirtProvider(BlockStateProvider.of(Blocks.NETHERRACK)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BeyondHorizons.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
