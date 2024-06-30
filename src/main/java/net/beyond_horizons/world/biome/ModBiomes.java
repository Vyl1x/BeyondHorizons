package net.beyond_horizons.world.biome;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.world.feature.ModPlacedFeatures;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.MiscPlacedFeatures;
import net.minecraft.world.gen.feature.NetherPlacedFeatures;
import terrablender.api.EndBiomeRegistry;

import static net.fabricmc.fabric.api.biome.v1.BiomeModifications.addFeature;

public class ModBiomes {
    public static final RegistryKey<Biome> JADESFOREST_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BeyondHorizons.MOD_ID, "jadesforest"));
    public static final RegistryKey<Biome> SHADOWLANDS_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BeyondHorizons.MOD_ID, "shadowlands"));
    public static final RegistryKey<Biome> DARKHOTMEADOW_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BeyondHorizons.MOD_ID, "darkhotmeadow"));
    public static final RegistryKey<Biome> COLDENASPEN_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BeyondHorizons.MOD_ID, "coldenaspen"));
    public static final RegistryKey<Biome> SHADYNIGHT_BIOME = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(BeyondHorizons.MOD_ID, "shadynight"));

    public static void boostrap(Registerable<Biome> context) {
        context.register(JADESFOREST_BIOME, JadesForestBiome(context));
        context.register(SHADOWLANDS_BIOME, ShadowLandsBiome(context));
        context.register(DARKHOTMEADOW_BIOME, DarkHotMeadowBiome(context));
        context.register(COLDENASPEN_BIOME, ColdenAspenBiome(context));
        context.register(SHADYNIGHT_BIOME, ShadyNightBiome(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {
        DefaultBiomeFeatures.addLandCarvers(builder);
        DefaultBiomeFeatures.addAmethystGeodes(builder);
        DefaultBiomeFeatures.addDungeons(builder);
        DefaultBiomeFeatures.addMineables(builder);
        DefaultBiomeFeatures.addSprings(builder);
        DefaultBiomeFeatures.addFrozenTopLayer(builder);
    }

    public static Biome JadesForestBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SNIFFER, 3, 1, 2));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.BOGGED, 6, 1, 3));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.JUNGLEJADE_PLACED_KEY);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.5f)
                .temperature(0.7f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x25c7b4)
                        .waterFogColor(0x60b7bf)
                        .skyColor(0x6fd32e)
                        .grassColor(0x1beb60)
                        .foliageColor(0x16a12d)
                        .fogColor(0x86ee6d)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }

    public static Biome ShadowLandsBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIFIED_PIGLIN, 15, 1, 3));
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.BLAZE, 7, 1, 5));
        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.STRIDER, 9, 1, 3));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        biomeBuilder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.GLOWSTONE);
        DefaultBiomeFeatures.addNetherMineables(biomeBuilder);
        biomeBuilder.feature(GenerationStep.Feature.UNDERGROUND_DECORATION, NetherPlacedFeatures.BASALT_PILLAR);
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SHADOWONYXBLOODFLAME_PLACED_KEY);

        return new Biome.Builder()
                .precipitation(false)
                .temperature(2.0f)
                .downfall(0.0f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects(new BiomeEffects.Builder()
                        .skyColor(0xbb1111)
                        .fogColor(0x573333)
                        .waterColor(0x2389da)
                        .waterFogColor(0x2389da)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .build();
    }

    public static Biome DarkHotMeadowBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.DARKFIRE_PLACED_KEY);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.3F)
                .temperature(1.5f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x333c3d)
                        .waterFogColor(0x111c1f)
                        .skyColor(0x280909)
                        .grassColor(0x3d3d3d)
                        .foliageColor(0x090a0a)
                        .fogColor(0x3e2121)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }

    public static Biome ColdenAspenBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.GLOW_SQUID, 6, 2, 6));

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);
        DefaultBiomeFeatures.addMossyRocks(biomeBuilder);
        DefaultBiomeFeatures.addBlueIce(biomeBuilder);
        DefaultBiomeFeatures.addDefaultOres(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CRYSTALASPEN_PLACED_KEY);
        DefaultBiomeFeatures.addForestFlowers(biomeBuilder);
        DefaultBiomeFeatures.addLargeFerns(biomeBuilder);

        DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
        DefaultBiomeFeatures.addDefaultVegetation(biomeBuilder);

        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.7F)
                .temperature(0.2f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(0x9de2f0)
                        .waterFogColor(0xd0eff5)
                        .skyColor(0x6af8ff)
                        .grassColor(0x2eada3)
                        .foliageColor(0x28e0d1)
                        .fogColor(0x74afb3)
                        .moodSound(BiomeMoodSound.CAVE).build())
                .build();
    }

    public static Biome ShadyNightBiome(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();
        spawnBuilder.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        // Assuming you have end-specific features to add, otherwise adapt overworld features as needed
        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.NIGHTSHADEGROVE_PLACED_KEY);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(0.5f)
                .effects(new BiomeEffects.Builder()
                        .skyColor(0x781cdc)
                        .fogColor(0x270546)
                        .waterColor(0x4e158a)
                        .waterFogColor(0x1c0833)
                        .moodSound(BiomeMoodSound.CAVE)
                        .build())
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .build();
    }
}