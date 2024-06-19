package net.beyond_horizons;

import net.beyond_horizons.data.*;
import net.beyond_horizons.data.language.ModBulgarianLangProvider;
import net.beyond_horizons.data.language.ModEnglishLangProvider;
import net.beyond_horizons.world.biome.ModBiomes;
import net.beyond_horizons.world.feature.ModConfiguredFeatures;
import net.beyond_horizons.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BeyondHorizonsModDataGenerator implements DataGeneratorEntrypoint {
    public void onInitializeDataGenerator(FabricDataGenerator DataGenerator) {
        FabricDataGenerator.Pack pack = DataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModWorldGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModEnglishLangProvider::new);
        pack.addProvider(ModBulgarianLangProvider::new);
        pack.addProvider(ModAdvancementGenerator::new);
    }

    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.BIOME, ModBiomes::boostrap);
    }
}
