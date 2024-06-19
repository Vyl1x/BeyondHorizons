package net.beyond_horizons;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.block.ModFlammableBlockRegistry;
import net.beyond_horizons.block.ModStrippableBlocks;
import net.beyond_horizons.effect.ModStatusEffects;
import net.beyond_horizons.items.ModItemGroup;
import net.beyond_horizons.items.ModItems;
import net.beyond_horizons.sounds.ModSounds;
import net.beyond_horizons.utils.ModFuelRegistries;
import net.beyond_horizons.world.feature.gen.ModWorldGen;
import net.beyond_horizons.world.feature.tree.ModFoliagePlacerTypes;
import net.beyond_horizons.world.feature.tree.ModTrunkPlacerTypes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondHorizons implements ModInitializer {
    public static final String MOD_ID = "beyond-horizons";
    public static final Logger LOGGER = LoggerFactory.getLogger("beyond-horizons");

    public void onInitialize() {

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModWorldGen.generateModWorldGen();
        ModTrunkPlacerTypes.register();
        ModFoliagePlacerTypes.register();

        ModStatusEffects.registerEffects();
        ModSounds.registerSounds();

        ModFuelRegistries.registerModStuffs();

        ModItemGroup.registerItemGroups();

        ModFlammableBlockRegistry.registerFlammableBlocks();
        ModStrippableBlocks.resiterStrippables();

        LOGGER.info("Beyond Horizons Fabric Mod!");
    }
}