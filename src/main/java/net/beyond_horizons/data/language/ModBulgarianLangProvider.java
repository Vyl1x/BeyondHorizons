package net.beyond_horizons.data.language;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.effect.ModStatusEffects;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class ModBulgarianLangProvider extends FabricLanguageProvider {
    public ModBulgarianLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "bg_bg");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        /** ITEM GROUP **/
        translationBuilder.add("itemgroup.beyondhorizonsgroup", "Отвъд хоризонтите");

        /** ITEMS **/
        translationBuilder.add(ModItems.BEYONDHORIZONS, "Отвъд Хоризонтите");
        translationBuilder.add(ModItems.DIMENSIONAL_TEMPLATE, "Междинен шаблон"); //Ковачески Шаблон
        translationBuilder.add(ModItems.RUBY, "Рубин");
        translationBuilder.add(ModItems.COBALT_INGOT, "Кобалтов кюлче");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "Митрилов кюлче");
        translationBuilder.add(ModItems.PHOENIXITE_INGOT, "Феникситен кюлче");
        translationBuilder.add(ModItems.PHOENIXITE_SCRAP, "Феникситен късче");
        translationBuilder.add(ModItems.ENDERITE_INGOT, "Ендеритен кюлче");
        translationBuilder.add(ModItems.ENDERITE_SCRAP, "Ендеритен късче");
        translationBuilder.add(ModItems.ENDERITE_COAL, "Ендеритен въглен");
        translationBuilder.add(ModItems.RAW_CELESTITE, "Необработен целестит");
        translationBuilder.add(ModItems.CELESTITE_INGOT, "Целеститено кюлче");

        /** AMULETS **/
        translationBuilder.add(ModItems.AMULET_OF_THE_CATS, "Амулет на котката");
        translationBuilder.add(ModItems.AMULET_OF_THE_TIGER, "Амулет на тигъра");

        /** EFFECTS **/
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_CAT, "Котка");
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_TIGER, "Тигър");

        /** TOOLS **/
        translationBuilder.add(ModItems.RUBY_SWORD, "Рубинен меч");
        translationBuilder.add(ModItems.RUBY_AXE, "Рубинена брадва");
        translationBuilder.add(ModItems.RUBY_HOE, "Рубинена мотика");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Рубинена кирка");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Рубинена лопата");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "Митрилов меч");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "Митрилова брадва");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "Митрилова мотика");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "Митрилова кирка");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "Митрилова лопата");
        translationBuilder.add(ModItems.COBALT_SWORD, "Кобалтов меч");
        translationBuilder.add(ModItems.COBALT_AXE, "Кобалтова брадва");
        translationBuilder.add(ModItems.COBALT_HOE, "Кобалтова мотика");
        translationBuilder.add(ModItems.COBALT_PICKAXE, "Кобалтова кирка");
        translationBuilder.add(ModItems.COBALT_SHOVEL, "Кобалтова лопата");
        translationBuilder.add(ModItems.COBALT_MULTI_TOOL, "Кобалтов многофункционален инструмент");
        translationBuilder.add(ModItems.COBALT_BOW, "Кобалтов лък");
        translationBuilder.add(ModItems.PHOENIXITE_SWORD, "Феникситен меч");
        translationBuilder.add(ModItems.PHOENIXITE_AXE, "Феникситена брадва");
        translationBuilder.add(ModItems.PHOENIXITE_HOE, "Феникситена мотика");
        translationBuilder.add(ModItems.PHOENIXITE_PICKAXE, "Феникситена кирка");
        translationBuilder.add(ModItems.PHOENIXITE_SHOVEL, "Феникситена лопата");
        translationBuilder.add(ModItems.CELESTITE_SWORD, "Целеститен меч");
        translationBuilder.add(ModItems.CELESTITE_AXE, "Целеститена брадва");
        translationBuilder.add(ModItems.CELESTITE_HOE, "Целеститена мотика");
        translationBuilder.add(ModItems.CELESTITE_PICKAXE, "Целеститена кирка");
        translationBuilder.add(ModItems.CELESTITE_SHOVEL, "Целеститена лопата");
        translationBuilder.add(ModItems.ENDERITE_SWORD, "Ендеритен меч");
        translationBuilder.add(ModItems.ENDERITE_AXE, "Ендеритена брадва");
        translationBuilder.add(ModItems.ENDERITE_HOE, "Ендеритена мотика");
        translationBuilder.add(ModItems.ENDERITE_PICKAXE, "Ендеритена кирка");
        translationBuilder.add(ModItems.ENDERITE_SHOVEL, "Ендеритена лопата");

        /** ARMOR **/
        translationBuilder.add(ModItems.RUBY_HELMET, "Шлем от Рубини");
        translationBuilder.add(ModItems.RUBY_CHESTPLATE, "Нагръдник от Рубини");
        translationBuilder.add(ModItems.RUBY_LEGGINGS, "Панталони от Рубини");
        translationBuilder.add(ModItems.RUBY_BOOTS, "Ботуши от Рубини");
        translationBuilder.add(ModItems.MYTHRIL_HELMET, "Шлем от Митрил");
        translationBuilder.add(ModItems.MYTHRIL_CHESTPLATE, "Нагръдник от Митрил");
        translationBuilder.add(ModItems.MYTHRIL_LEGGINGS, "Панталони от Митрил");
        translationBuilder.add(ModItems.MYTHRIL_BOOTS, "Ботуши от Митрил");
        translationBuilder.add(ModItems.COBALT_HELMET, "Шлем от Кобалт");
        translationBuilder.add(ModItems.COBALT_CHESTPLATE, "Нагръдник от Кобалт");
        translationBuilder.add(ModItems.COBALT_LEGGINGS, "Панталони от Кобалт");
        translationBuilder.add(ModItems.COBALT_BOOTS, "Ботуши от Кобалт");
        translationBuilder.add(ModItems.PHOENIXITE_HELMET, "Шлем от Фениксит");
        translationBuilder.add(ModItems.PHOENIXITE_CHESTPLATE, "Нагръдник от Фениксит");
        translationBuilder.add(ModItems.PHOENIXITE_LEGGINGS, "Панталони от Фениксит");
        translationBuilder.add(ModItems.PHOENIXITE_BOOTS, "Ботуши от Фениксит");
        translationBuilder.add(ModItems.CELESTITE_HELMET, "Шлем от Целестит");
        translationBuilder.add(ModItems.CELESTITE_CHESTPLATE, "Нагръдник от Целестит");
        translationBuilder.add(ModItems.CELESTITE_LEGGINGS, "Панталони от Целестит");
        translationBuilder.add(ModItems.CELESTITE_BOOTS, "Ботуши от Целестит");
        translationBuilder.add(ModItems.ENDERITE_HELMET, "Шлем от Ендерит");
        translationBuilder.add(ModItems.ENDERITE_CHESTPLATE, "Нагръдник от Ендерит");
        translationBuilder.add(ModItems.ENDERITE_LEGGINGS, "Панталони от Ендерит");
        translationBuilder.add(ModItems.ENDERITE_BOOTS, "Ботуши от Ендерит");

        /** BLOCKS **/
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LOG, "Дънер от нощната сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LOG, "Дънер от джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LOG, "Дънер от кристалната трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LOG, "Дънер от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_LOG, "Дънер от тъмния огън");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG, "Оголен дънер от нощната сянка");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_LOG, "Оголен дънер от джунглата");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG, "Оголен дънер от кристалната трепетлика");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG, "Оголен дънер от сенчестия оникс");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_LOG, "Оголен дънер от тъмния огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_WOOD, "Дървесина от нощна сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_WOOD, "Дървесина от джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_WOOD, "Дървесина от кристална трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD, "Дървесина от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_WOOD, "Дървесина от тъмен огън");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, "Оголена дървесина от нощна сянка");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD, "Оголена дървесина от джунглата");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, "Оголена дървесина от кристална трепетлика");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, "Оголена дървесина от сенчестия оникс");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_WOOD, "Оголена дървесина от тъмен огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_STAIRS, "Стъпала от нощна сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_STAIRS, "Стъпала от джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_STAIRS, "Стъпала от кристална трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, "Стъпала от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_STAIRS, "Стъпала от тъмен огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SLAB, "Плоча от нощна сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SLAB, "Плоча от джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SLAB, "Плоча от кристална трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB, "Плоча от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_SLAB, "Плоча от тъмен огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LEAVES, "Листа от нощна сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LEAVES, "Листа от джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LEAVES, "Листа от кристална трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES, "Листа от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_LEAVES, "Листа от тъмен огън");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SAPLING, "Фиданка от кристална трепетлика");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SAPLING, "Фиданка от нощна сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SAPLING, "Фиданка от джунглата");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, "Фиданка от сенчестия оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_SAPLING, "Фиданка от тъмен огън");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PLANKS, "Дъски от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_PLANKS, "Дъски от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PLANKS, "Дъски от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PLANKS, "Дъски от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, "Дъски от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE, "Ограда от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE, "Ограда от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE, "Ограда от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE, "Ограда от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE, "Ограда от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE_GATE, "Порта от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE_GATE, "Порта от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE_GATE, "Порта от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, "Порта от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, "Порта от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE, "Претегляща сигнална плоча от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_PRESSURE_PLATE, "Претегляща сигнална плоча от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PRESSURE_PLATE, "Претегляща сигнална плоча от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE, "Претегляща сигнална плоча от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE, "Претегляща сигнална плоча от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_BUTTON, "Копче от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_BUTTON, "Копче от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_BUTTON, "Копче от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_BUTTON, "Копче от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, "Копче от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_DOOR, "Врата от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_DOOR, "Врата от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_DOOR, "Врата от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_DOOR, "Врата от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR, "Врата от сенчестия оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_TRAPDOOR, "Люк от кристална трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_TRAPDOOR, "Люк от тъмен огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_TRAPDOOR, "Люк от джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, "Люк от нощна сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, "Люк от сенчестия оникс");

        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_END_STONE, "Нощна сянка на камък от края");

        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Шистова рубинова руда");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Руда на рубин");
        translationBuilder.add(ModBlocks.PHOENIXITE_ORE, "Феникситова руда");
        translationBuilder.add(ModBlocks.ENDERITE_ORE, "Руда на ендерит");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_ORE, "Руда на ендеритови въглища");
        translationBuilder.add(ModBlocks.CELESTITE_ORE, "Руда на целестит");
        translationBuilder.add(ModBlocks.COBALT_ORE, "Кобалтова руда");
        translationBuilder.add(ModBlocks.DEEPSLATE_COBALT_ORE, "Шистова кобалтова руда");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "Митрилова руда");
        translationBuilder.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE, "Шистова митрилова руда");

        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Блок от рубин");
        translationBuilder.add(ModBlocks.COBALT_BLOCK, "Блок от кобалт");
        translationBuilder.add(ModBlocks.PHOENIXITE_BLOCK, "Блок от фениксит");
        translationBuilder.add(ModBlocks.ENDERITE_BLOCK, "Блок от ендерит");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_BLOCK, "Блок от ендеритови въглища");
        translationBuilder.add(ModBlocks.CELESTITE_BLOCK, "Блок от целестит");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "Блок от митрил");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/beyond-horizons/lang/bg_bg.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
