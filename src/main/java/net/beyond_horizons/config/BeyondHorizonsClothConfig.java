package net.beyond_horizons.config;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.beyond_horizons.BeyondHorizonsClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

@Config(name = "beyond-horizons-config")
public class BeyondHorizonsClothConfig extends BeyondHorizonsConfig implements ConfigData {

    public static Screen buildScreen(Screen parent) {
        ConfigBuilder configBuilder = ConfigBuilder.create().setParentScreen(parent).setTitle(text("title"));
        configBuilder.setSavingRunnable(() -> AutoConfig.getConfigHolder(BeyondHorizonsClothConfig.class).save());
        ConfigCategory general = configBuilder.getOrCreateCategory(text("general"));
        ConfigEntryBuilder entryBuilder = configBuilder.entryBuilder();
        BeyondHorizonsClothConfig.setupEntries(general, entryBuilder);
        return configBuilder.build();
    }

    private static void setupEntries(ConfigCategory category, ConfigEntryBuilder entryBuilder){

        /** COMING SOON **/
        /*
        var config = BeyondHorizonsClient.config;

        // Vein Miner
        category.addEntry(entryBuilder.startBooleanToggle(text("option.veinminer"), config.veinMinerActivation)
                .setDefaultValue(true)
                .setSaveConsumer(newValue -> config.veinMinerActivation = newValue)
                .build());

        //Vein Miner limit
        category.addEntry(entryBuilder.startIntSlider(text("option.veinminerlimit"), config.veinMinerLimit, 1, 16)
                .setDefaultValue(8)
                .setSaveConsumer(newValue -> config.veinMinerLimit = newValue)
                .build());

        // Radius
        category.addEntry(entryBuilder.startBooleanToggle(text("option.radius"), config.radiusActivation)
                .setDefaultValue(false)
                .setSaveConsumer(newValue -> config.radiusActivation = newValue)
                .build());

        //Vein Miner limit
        category.addEntry(entryBuilder.startIntSlider(text("option.veinminerlimit"), config.miningArea, 1, 6)
                .setDefaultValue(1)
                .setSaveConsumer(newValue -> config.miningArea = newValue)
                .build());

         */
    }

    private static Text text(String key) {
        return Text.translatable("config.beyond-horizons." + key);
    }

    public static BeyondHorizonsClothConfig init() {
        AutoConfig.register(BeyondHorizonsClothConfig.class, GsonConfigSerializer::new);
        return AutoConfig.getConfigHolder(BeyondHorizonsClothConfig.class).getConfig();
    }
}
