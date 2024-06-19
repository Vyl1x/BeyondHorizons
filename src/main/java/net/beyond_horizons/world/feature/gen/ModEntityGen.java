package net.beyond_horizons.world.feature.gen;

import net.beyond_horizons.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;

public class ModEntityGen {
    public static void addSpawns() {
        /*
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(ModBiomes.JADESFOREST_BIOME), SpawnGroup.CREATURE,
                ModEntities.JADES_TIGER, 35, 1, 15);

        SpawnRestriction.register(ModEntities.JADES_TIGER, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);

         */
    }
}
