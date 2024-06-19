package net.beyond_horizons.world.feature.gen;

import net.beyond_horizons.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGen {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS, BiomeKeys.END_BARRENS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.NIGHTSHADEGROVE_PLACED_KEY);
    }
}
