package net.beyond_horizons.world.feature;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    //Tree
    public static final RegistryKey<PlacedFeature> CRYSTALASPEN_PLACED_KEY = registerKey("crystalaspen_placed");
    public static final RegistryKey<PlacedFeature> DARKFIRE_PLACED_KEY = registerKey("darkfire_placed");
    public static final RegistryKey<PlacedFeature> JUNGLEJADE_PLACED_KEY = registerKey("junglejade_placed");
    public static final RegistryKey<PlacedFeature> NIGHTSHADEGROVE_PLACED_KEY = registerKey("nightshadegrove_placed");
    public static final RegistryKey<PlacedFeature> SHADOWONYXBLOODFLAME_PLACED_KEY = registerKey("shadowonyxbloodflame_placed");

    //Ore
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final RegistryKey<PlacedFeature> MYTHRIL_ORE_PLACED_KEY = registerKey("mythril_ore_placed");
    public static final RegistryKey<PlacedFeature> PHOENIXITE_ORE_PLACED_KEY = registerKey("phoenixite_ore_placed");
    public static final RegistryKey<PlacedFeature> ENDERITE_ORE_PLACED_KEY = registerKey("enderite_ore_placed");
    public static final RegistryKey<PlacedFeature> ENDERITE_COAL_ORE_PLACED_KEY = registerKey("enderite_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> CELESTITE_ORE_PLACED_KEY = registerKey("celestite_ore_placed");


    //TERRAIN //BIOME
    public static final RegistryKey<PlacedFeature> MAGMA_PLACED_KEY = registerKey("magma_placed");
    public static final RegistryKey<PlacedFeature> OBSIDIAN_PLACED_KEY = registerKey("obsidian_placed");
    public static final RegistryKey<PlacedFeature> CRYING_OBSIDIAN_PLACED_KEY = registerKey("crying_obsidian_placed");


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, CRYSTALASPEN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CRYSTALASPEN_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 2)
                        , ModBlocks.CRYSTALASPEN_SAPLING));
        register(context, DARKFIRE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.DARKFIRE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 2)
                        , ModBlocks.DARKFIRE_SAPLING));
        register(context, JUNGLEJADE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.JUNGLEJADE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 2)
                        , ModBlocks.JUNGLEJADE_SAPLING));
        register(context, NIGHTSHADEGROVE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NIGHTSHADEGROVE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 2)
                        , ModBlocks.NIGHTSHADEGROVE_SAPLING));
        register(context, SHADOWONYXBLOODFLAME_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SHADOWONYXBLOODFLAME_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.1F, 2)
                        , ModBlocks.SHADOWONYXBLOODFLAME_SAPLING));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(9, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(45))));
        register(context, COBALT_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.COBALT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-30), YOffset.fixed(30))));
        register(context, MYTHRIL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MYTHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-40), YOffset.fixed(20))));
        register(context, PHOENIXITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PHOENIXITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(6), YOffset.fixed(40))));
        register(context, ENDERITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENDERITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(45))));
        register(context, ENDERITE_COAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ENDERITE_COAL_RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(80))));
        register(context, CELESTITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CELESTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(50))));


        //TERRAIN //BIOME //COLDENASPEN
        //SHADOWLANDS
        register(context, MAGMA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAGMA_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(123))));
        //DARKHOTMEADOW
        register(context, OBSIDIAN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.OBSIDIAN_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(123))));
        register(context, CRYING_OBSIDIAN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CRYING_OBSIDIAN_KEY),
                ModOrePlacement.modifiersWithCount(6, // Veins per Chunk
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(123))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(BeyondHorizons.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
