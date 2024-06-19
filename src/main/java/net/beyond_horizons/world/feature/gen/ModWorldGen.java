package net.beyond_horizons.world.feature.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        ModOreGen.generateOres();
        //ModTreeGen.generateTrees();
        ModEntityGen.addSpawns();
    }
}
