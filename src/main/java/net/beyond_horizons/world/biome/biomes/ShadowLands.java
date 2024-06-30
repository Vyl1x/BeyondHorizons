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

public class ShadowLands extends Region {
    public ShadowLands(Identifier name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper)
    {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();
        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.span(ParameterUtils.Temperature.NEUTRAL, ParameterUtils.Temperature.WARM))
                .humidity(ParameterUtils.Humidity.span(ParameterUtils.Humidity.HUMID, ParameterUtils.Humidity.FULL_RANGE))
                .continentalness(ParameterUtils.Continentalness.NEAR_INLAND, ParameterUtils.Continentalness.MID_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_1, ParameterUtils.Erosion.EROSION_4)
                .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.SURFACE)
                .weirdness(ParameterUtils.Weirdness.VALLEY, ParameterUtils.Weirdness.VALLEY)
                .build().forEach(point -> builder.add(point, ModBiomes.SHADOWLANDS_BIOME));

        // Add our points to the mapper
        builder.build().forEach(mapper);
    }
}
