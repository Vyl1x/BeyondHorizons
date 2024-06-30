package net.beyond_horizons.world.biome.biomes;

import com.mojang.datafixers.util.Pair;
import net.beyond_horizons.world.biome.ModBiomes;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.ParameterUtils;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class ColdenAspen extends Region {
    public ColdenAspen(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper)
    {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.span(ParameterUtils.Temperature.FROZEN, ParameterUtils.Temperature.NEUTRAL))
                .humidity(ParameterUtils.Humidity.span(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.FULL_RANGE))
                .continentalness(ParameterUtils.Continentalness.INLAND, ParameterUtils.Continentalness.FAR_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_0, ParameterUtils.Erosion.EROSION_1)
                .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.SURFACE)
                .weirdness(ParameterUtils.Weirdness.VALLEY, ParameterUtils.Weirdness.LOW_SLICE_VARIANT_ASCENDING)
                .build().forEach(point -> builder.add(point, ModBiomes.COLDENASPEN_BIOME));

        // Add our points to the mapper
        builder.build().forEach(mapper);
    }
}
