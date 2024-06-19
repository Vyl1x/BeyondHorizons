package net.beyond_horizons.world.feature.tree;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.mixin.FoliagePlacerTypeInvoker;
import net.beyond_horizons.world.feature.tree.custom.JadesFoliagePlacer;
import net.beyond_horizons.world.feature.tree.custom.NightShadesFoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;

public class ModFoliagePlacerTypes {
    public static final FoliagePlacerType<?> JADES_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("jades_foliage_placer", JadesFoliagePlacer.CODEC);
    public static final FoliagePlacerType<?> NIGHTSHADES_FOLIAGE_PLACER = FoliagePlacerTypeInvoker.callRegister("nightshades_foliage_placer", NightShadesFoliagePlacer.CODEC);

    public static void register() {
        BeyondHorizons.LOGGER.info("Registering Foliage Placer for " + BeyondHorizons.MOD_ID);
    }
}