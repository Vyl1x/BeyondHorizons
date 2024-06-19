package net.beyond_horizons.config.bhserver;

public class BHConfig {

    public static boolean veinMinerEnabled;
    public static int veinMinerLimit;
    public static boolean radiusMinerEnabled;
    public static int radiusMinerLimit;

    public BHConfig() {
        veinMinerEnabled = true;
        veinMinerLimit = 16;
        radiusMinerEnabled = true;
        radiusMinerLimit = 4;
    }
}
