package net.beyond_horizons.world.feature.tree;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.mixin.TrunkPlacerTypeInvoker;
import net.beyond_horizons.world.feature.tree.custom.JadesTrunkPlacer;
import net.beyond_horizons.world.feature.tree.custom.NightShadesTrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> JADES_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("jades_trunk_placer", JadesTrunkPlacer.CODEC);
    public static final TrunkPlacerType<?> NIGHTSHADES_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("nightshades_trunk_placer", NightShadesTrunkPlacer.CODEC);

    public static void register() {
        BeyondHorizons.LOGGER.info("Registering Trunk Placers for " + BeyondHorizons.MOD_ID);
    }
}
