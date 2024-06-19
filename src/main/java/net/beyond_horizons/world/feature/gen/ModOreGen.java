package net.beyond_horizons.world.feature.gen;

import net.beyond_horizons.world.biome.ModBiomes;
import net.beyond_horizons.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGen {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SHADOWLANDS_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MAGMA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DARKHOTMEADOW_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.OBSIDIAN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DARKHOTMEADOW_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CRYING_OBSIDIAN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.COBALT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MYTHRIL_ORE_PLACED_KEY);


        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.PHOENIXITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ENDERITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ENDERITE_COAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CELESTITE_ORE_PLACED_KEY);
    }
}
