package net.beyond_horizons;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeyondHorizonsServer implements DedicatedServerModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("beyond-horizons");

    public void onInitializeServer() {
        LOGGER.info("Beyond Horizons Server Fabric mod!");
    }
}
