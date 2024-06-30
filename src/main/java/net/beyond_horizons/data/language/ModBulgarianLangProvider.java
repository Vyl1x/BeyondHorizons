package net.beyond_horizons.data.language;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.effect.ModStatusEffects;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ModBulgarianLangProvider extends FabricLanguageProvider {
    public ModBulgarianLangProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "bg_bg", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        /** ITEM GROUP **/
        translationBuilder.add("itemgroup.beyondhorizonsgroup", "Отвъд хоризонтите");

        /** ITEMS **/
        translationBuilder.add(ModItems.BEYONDHORIZONS, "Отвъд Хоризонтите");
        translationBuilder.add(ModItems.DIMENSIONAL_TEMPLATE, "Междинен Шаблон");
        translationBuilder.add(ModItems.RUBY, "Рубин");
        translationBuilder.add(ModItems.COBALT_INGOT, "Кобалтов Кюлче");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "Митрилов Кюлче");
        translationBuilder.add(ModItems.PHOENIXITE_INGOT, "Феникситен Кюлче");
        translationBuilder.add(ModItems.PHOENIXITE_SCRAP, "Феникситен Късче");
        translationBuilder.add(ModItems.ENDERITE_INGOT, "Ендеритен Кюлче");
        translationBuilder.add(ModItems.ENDERITE_SCRAP, "Ендеритен Късче");
        translationBuilder.add(ModItems.ENDERITE_COAL, "Ендеритен Въглен");
        translationBuilder.add(ModItems.RAW_CELESTITE, "Необработен Целестит");
        translationBuilder.add(ModItems.CELESTITE_INGOT, "Целеститено Кюлче");

        /** AMULETS **/
        translationBuilder.add(ModItems.AMULET_OF_THE_CATS, "Амулет на Котката");
        translationBuilder.add(ModItems.AMULET_OF_THE_TIGER, "Амулет на Тигъра");

        /** EFFECTS **/
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_CAT, "Котка");
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_TIGER, "Тигър");

        /** TOOLS **/
        translationBuilder.add(ModItems.WOODEN_MULTI_TOOL, "Дървен Многофункционален Инструмент");
        translationBuilder.add(ModItems.STONE_MULTI_TOOL, "Каменен Многофункционален Инструмент");
        translationBuilder.add(ModItems.GOLD_MULTI_TOOL, "Железен Многофункционален Инструмент");
        translationBuilder.add(ModItems.IRON_MULTI_TOOL, "Златен Многофункционален Инструмент");
        translationBuilder.add(ModItems.DIAMOND_MULTI_TOOL, "Диамантен Многофункционален Инструмент");
        translationBuilder.add(ModItems.NETHERITE_MULTI_TOOL, "Многофункционален Инструмент от Недърайт");
        translationBuilder.add(ModItems.RUBY_SWORD, "Рубинен Меч");
        translationBuilder.add(ModItems.RUBY_AXE, "Рубинена Брадва");
        translationBuilder.add(ModItems.RUBY_HOE, "Рубинена Мотика");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Рубинена Кирка");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Рубинена Лопата");
        translationBuilder.add(ModItems.RUBY_MULTI_TOOL, "Рубинена Многофункционален Инструмент");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "Митрилов Меч");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "Митрилова Брадва");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "Митрилова Мотика");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "Митрилова Кирка");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "Митрилова Лопата");
        translationBuilder.add(ModItems.MYTHRIL_MULTI_TOOL, "Митрилова Многофункционален Инструмент");
        translationBuilder.add(ModItems.COBALT_SWORD, "Кобалтов Меч");
        translationBuilder.add(ModItems.COBALT_AXE, "Кобалтова Брадва");
        translationBuilder.add(ModItems.COBALT_HOE, "Кобалтова Мотика");
        translationBuilder.add(ModItems.COBALT_PICKAXE, "Кобалтова Кирка");
        translationBuilder.add(ModItems.COBALT_SHOVEL, "Кобалтова Лопата");
        translationBuilder.add(ModItems.COBALT_MULTI_TOOL, "Кобалтов Многофункционален Инструмент");
        translationBuilder.add(ModItems.COBALT_BOW, "Кобалтов Лък");
        translationBuilder.add(ModItems.PHOENIXITE_SWORD, "Феникситен Меч");
        translationBuilder.add(ModItems.PHOENIXITE_AXE, "Феникситена Брадва");
        translationBuilder.add(ModItems.PHOENIXITE_HOE, "Феникситена Мотика");
        translationBuilder.add(ModItems.PHOENIXITE_PICKAXE, "Феникситена Кирка");
        translationBuilder.add(ModItems.PHOENIXITE_SHOVEL, "Феникситена Лопата");
        translationBuilder.add(ModItems.PHOENIXITE_MULTI_TOOL, "Феникситена Многофункционален Инструмент");
        translationBuilder.add(ModItems.CELESTITE_SWORD, "Целеститен Меч");
        translationBuilder.add(ModItems.CELESTITE_AXE, "Целеститена Брадва");
        translationBuilder.add(ModItems.CELESTITE_HOE, "Целеститена Мотика");
        translationBuilder.add(ModItems.CELESTITE_PICKAXE, "Целеститена Кирка");
        translationBuilder.add(ModItems.CELESTITE_SHOVEL, "Целеститена Лопата");
        translationBuilder.add(ModItems.CELESTITE_MULTI_TOOL, "Целеститена Многофункционален Инструмент");
        translationBuilder.add(ModItems.ENDERITE_SWORD, "Ендеритен Меч");
        translationBuilder.add(ModItems.ENDERITE_AXE, "Ендеритена Брадва");
        translationBuilder.add(ModItems.ENDERITE_HOE, "Ендеритена Мотика");
        translationBuilder.add(ModItems.ENDERITE_PICKAXE, "Ендеритена Кирка");
        translationBuilder.add(ModItems.ENDERITE_SHOVEL, "Ендеритена Лопата");
        translationBuilder.add(ModItems.ENDERITE_MULTI_TOOL, "Ендеритена Многофункционален Инструмент");

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
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LOG, "Дънер от Нощната Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LOG, "Дънер от Джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LOG, "Дънер от Кристалната Трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LOG, "Дънер от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_LOG, "Дънер от Тъмнен Огън");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG, "Оголен дънер от Нощната Сянка");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_LOG, "Оголен дънер от Джунглата");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG, "Оголен дънер от Кристалната Трепетлика");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG, "Оголен дънер от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_LOG, "Оголен дънер от Тъмнен Огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_WOOD, "Дървесина от Нощна Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_WOOD, "Дървесина от Джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_WOOD, "Дървесина от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD, "Дървесина от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_WOOD, "Дървесина от Тъмен Огън");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, "Оголена дървесина от Нощна Сянка");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD, "Оголена дървесина от Джунглата");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, "Оголена дървесина от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, "Оголена дървесина от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_WOOD, "Оголена дървесина от Тъмен Огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_STAIRS, "Стъпала от Нощна Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_STAIRS, "Стъпала от Джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_STAIRS, "Стъпала от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, "Стъпала от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_STAIRS, "Стъпала от Тъмен Огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SLAB, "Плоча от Нощна Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SLAB, "Плоча от Джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SLAB, "Плоча от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB, "Плоча от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_SLAB, "Плоча от Тъмен Огън");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LEAVES, "Листа от Нощна Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LEAVES, "Листа от Джунглата");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LEAVES, "Листа от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES, "Листа от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_LEAVES, "Листа от Тъмен Огън");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SAPLING, "Фиданка от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SAPLING, "Фиданка от Нощна Сянка");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SAPLING, "Фиданка от Джунглата");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, "Фиданка от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.DARKFIRE_SAPLING, "Фиданка от Тъмен Огън");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PLANKS, "Дъски от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_PLANKS, "Дъски от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PLANKS, "Дъски от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PLANKS, "Дъски от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, "Дъски от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE, "Ограда от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE, "Ограда от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE, "Ограда от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE, "Ограда от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE, "Ограда от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE_GATE, "Порта от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE_GATE, "Порта от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE_GATE, "Порта от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, "Порта от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, "Порта от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE, "Претегляща сигнална плоча от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_PRESSURE_PLATE, "Претегляща сигнална плоча от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PRESSURE_PLATE, "Претегляща сигнална плоча от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE, "Претегляща сигнална плоча от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE, "Претегляща сигнална плоча от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_BUTTON, "Копче от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_BUTTON, "Копче от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_BUTTON, "Копче от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_BUTTON, "Копче от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, "Копче от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_DOOR, "Врата от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_DOOR, "Врата от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_DOOR, "Врата от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_DOOR, "Врата от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR, "Врата от Сенчестия Оникс");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_TRAPDOOR, "Люк от Кристална Трепетлика");
        translationBuilder.add(ModBlocks.DARKFIRE_TRAPDOOR, "Люк от Тъмен Огън");
        translationBuilder.add(ModBlocks.JUNGLEJADE_TRAPDOOR, "Люк от Джунглата");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, "Люк от Нощна Сянка");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, "Люк от Сенчестия Оникс");

        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_END_STONE, "Камък от Края Нощна Сянка");

        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Шистова Рубинова руда");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Руда на Рубин");
        translationBuilder.add(ModBlocks.PHOENIXITE_ORE, "Феникситова Руда");
        translationBuilder.add(ModBlocks.ENDERITE_ORE, "Руда на Ендерит");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_ORE, "Руда на Ендеритови Въглища");
        translationBuilder.add(ModBlocks.CELESTITE_ORE, "Руда на Целестит");
        translationBuilder.add(ModBlocks.COBALT_ORE, "Кобалтова Руда");
        translationBuilder.add(ModBlocks.DEEPSLATE_COBALT_ORE, "Шистова Кобалтова Руда");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "Митрилова руда");
        translationBuilder.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE, "Шистова Митрилова Руда");

        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Блок от Рубин");
        translationBuilder.add(ModBlocks.COBALT_BLOCK, "Блок от Кобалт");
        translationBuilder.add(ModBlocks.PHOENIXITE_BLOCK, "Блок от Фениксит");
        translationBuilder.add(ModBlocks.ENDERITE_BLOCK, "Блок от Ендерит");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_BLOCK, "Блок от Ендеритови Въглища");
        translationBuilder.add(ModBlocks.CELESTITE_BLOCK, "Блок от Целестит");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "Блок от Митрил");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/beyond-horizons/lang/bg_bg.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
