package net.beyond_horizons.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModOverworldRegion extends Region {
    public ModOverworldRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube,
            RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder -> {
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.FOREST, ModBiomes.JADESFOREST_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, ModBiomes.SHADOWLANDS_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.MEADOW, ModBiomes.DARKHOTMEADOW_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.BIRCH_FOREST, ModBiomes.COLDENASPEN_BIOME);
            modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.JUNGLE, ModBiomes.SHADYNIGHT_BIOME);
        });
    }
}