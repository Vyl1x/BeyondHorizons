package net.beyond_horizons.world.feature.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModOreGen.generateOres();
        ModEntityGen.addSpawns();
    }
}
