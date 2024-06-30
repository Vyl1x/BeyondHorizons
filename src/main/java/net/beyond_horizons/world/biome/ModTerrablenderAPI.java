package net.beyond_horizons.world.biome;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.world.biome.biomes.ColdenAspen;
import net.beyond_horizons.world.biome.biomes.DarkhotMeadow;
import net.beyond_horizons.world.biome.biomes.JadesForest;
import net.beyond_horizons.world.biome.biomes.ShadowLands;
import net.beyond_horizons.world.biome.surface.*;
import net.minecraft.util.Identifier;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ColdenAspen(Identifier.of(BeyondHorizons.MOD_ID, "coldenaspen_overworld"), 8));
        Regions.register(new DarkhotMeadow(Identifier.of(BeyondHorizons.MOD_ID, "darkhotmeadow_overworld"), 7));
        Regions.register(new JadesForest(Identifier.of(BeyondHorizons.MOD_ID, "jadesforest_overworld"), 7));
        Regions.register(new ShadowLands(Identifier.of(BeyondHorizons.MOD_ID, "shadowlands_overworld"), 8));
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.SHADYNIGHT_BIOME, 4);

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, BeyondHorizons.MOD_ID, ModMaterialRules.makeRules());
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.NETHER, BeyondHorizons.MOD_ID, ModMaterialRules.makeRules());
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, BeyondHorizons.MOD_ID, ModMaterialRules.makeRules());
    }
}