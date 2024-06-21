package net.beyond_horizons.world.biome;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.world.biome.surface.*;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(BeyondHorizons.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, BeyondHorizons.MOD_ID, ModMaterialRules.makeRules());
    }
}