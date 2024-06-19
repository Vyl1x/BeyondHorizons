package net.beyond_horizons.data.language;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.effect.ModStatusEffects;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        /** ITEM GROUP **/
        translationBuilder.add("itemgroup.beyondhorizonsgroup", "Beyond Horizons");

        /** ITEMS **/
        translationBuilder.add(ModItems.BEYONDHORIZONS, "Beyond Horizons");
        translationBuilder.add(ModItems.DIMENSIONAL_TEMPLATE, "Dimensional Template");
        translationBuilder.add(ModItems.RUBY, "Ruby");
        translationBuilder.add(ModItems.COBALT_INGOT, "Cobalt Ingot");
        translationBuilder.add(ModItems.MYTHRIL_INGOT, "Mythril Ingot");
        translationBuilder.add(ModItems.PHOENIXITE_INGOT, "Phoenixite Ingot");
        translationBuilder.add(ModItems.PHOENIXITE_SCRAP, "Phoenixite Scrap");
        translationBuilder.add(ModItems.ENDERITE_INGOT, "Enderite Ingot");
        translationBuilder.add(ModItems.ENDERITE_SCRAP, "Enderite Scrap");
        translationBuilder.add(ModItems.ENDERITE_COAL, "Enderite Coal");
        translationBuilder.add(ModItems.RAW_CELESTITE, "Raw Celestite");
        translationBuilder.add(ModItems.CELESTITE_INGOT, "Celestite Ingot");

        /** AMULETS **/
        translationBuilder.add(ModItems.AMULET_OF_THE_CATS, "Amulet of the Cat");
        translationBuilder.add(ModItems.AMULET_OF_THE_TIGER, "Amulet of the Tiger");

        /** EFFECTS **/
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_CAT, "Cat");
        translationBuilder.add(ModStatusEffects.EFFECT_OF_THE_TIGER, "Tiger");

        /** TOOLS **/
        translationBuilder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        translationBuilder.add(ModItems.RUBY_AXE, "Ruby Axe");
        translationBuilder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        translationBuilder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        translationBuilder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        translationBuilder.add(ModItems.MYTHRIL_SWORD, "Mythril Sword");
        translationBuilder.add(ModItems.MYTHRIL_AXE, "Mythril Axe");
        translationBuilder.add(ModItems.MYTHRIL_HOE, "Mythril Hoe");
        translationBuilder.add(ModItems.MYTHRIL_PICKAXE, "Mythril Pickaxe");
        translationBuilder.add(ModItems.MYTHRIL_SHOVEL, "Mythril Shovel");
        translationBuilder.add(ModItems.COBALT_SWORD, "Cobalt Sword");
        translationBuilder.add(ModItems.COBALT_AXE, "Cobalt Axe");
        translationBuilder.add(ModItems.COBALT_HOE, "Cobalt Hoe");
        translationBuilder.add(ModItems.COBALT_PICKAXE, "Cobalt Pickaxe");
        translationBuilder.add(ModItems.COBALT_SHOVEL, "Cobalt Shovel");
        translationBuilder.add(ModItems.COBALT_MULTI_TOOL, "Cobalt Multi Tool");
        translationBuilder.add(ModItems.COBALT_BOW, "Cobalt Bow");
        translationBuilder.add(ModItems.PHOENIXITE_SWORD, "Phoenixite Sword");
        translationBuilder.add(ModItems.PHOENIXITE_AXE, "Phoenixite Axe");
        translationBuilder.add(ModItems.PHOENIXITE_HOE, "Phoenixite Hoe");
        translationBuilder.add(ModItems.PHOENIXITE_PICKAXE, "Phoenixite Pickaxe");
        translationBuilder.add(ModItems.PHOENIXITE_SHOVEL, "Phoenixite Shovel");
        translationBuilder.add(ModItems.CELESTITE_SWORD, "Celestite Sword");
        translationBuilder.add(ModItems.CELESTITE_AXE, "Celestite Axe");
        translationBuilder.add(ModItems.CELESTITE_HOE, "Celestite Hoe");
        translationBuilder.add(ModItems.CELESTITE_PICKAXE, "Celestite Pickaxe");
        translationBuilder.add(ModItems.CELESTITE_SHOVEL, "Celestite Shovel");
        translationBuilder.add(ModItems.ENDERITE_SWORD, "Enderite Sword");
        translationBuilder.add(ModItems.ENDERITE_AXE, "Enderite Axe");
        translationBuilder.add(ModItems.ENDERITE_HOE, "Enderite Hoe");
        translationBuilder.add(ModItems.ENDERITE_PICKAXE, "Enderite Pickaxe");
        translationBuilder.add(ModItems.ENDERITE_SHOVEL, "Enderite Shovel");

        /** ARMOR **/
        translationBuilder.add(ModItems.RUBY_HELMET, "Ruby Helmet");
        translationBuilder.add(ModItems.RUBY_CHESTPLATE, "Ruby Chestplate");
        translationBuilder.add(ModItems.RUBY_LEGGINGS, "Ruby Leggings");
        translationBuilder.add(ModItems.RUBY_BOOTS, "Ruby Boots");
        translationBuilder.add(ModItems.MYTHRIL_HELMET, "Mythril Helmet");
        translationBuilder.add(ModItems.MYTHRIL_CHESTPLATE, "Mythril Chestplate");
        translationBuilder.add(ModItems.MYTHRIL_LEGGINGS, "Mythril Leggings");
        translationBuilder.add(ModItems.MYTHRIL_BOOTS, "Mythril Boots");
        translationBuilder.add(ModItems.COBALT_HELMET, "Cobalt Helmet");
        translationBuilder.add(ModItems.COBALT_CHESTPLATE, "Cobalt Chestplate");
        translationBuilder.add(ModItems.COBALT_LEGGINGS, "Cobalt Leggings");
        translationBuilder.add(ModItems.COBALT_BOOTS, "Cobalt Boots");
        translationBuilder.add(ModItems.PHOENIXITE_HELMET, "Phoenixite Helmet");
        translationBuilder.add(ModItems.PHOENIXITE_CHESTPLATE, "Phoenixite Chestplate");
        translationBuilder.add(ModItems.PHOENIXITE_LEGGINGS, "Phoenixite Leggings");
        translationBuilder.add(ModItems.PHOENIXITE_BOOTS, "Phoenixite Boots");
        translationBuilder.add(ModItems.CELESTITE_HELMET, "Celestite Helmet");
        translationBuilder.add(ModItems.CELESTITE_CHESTPLATE, "Celestite Chestplate");
        translationBuilder.add(ModItems.CELESTITE_LEGGINGS, "Celestite Leggings");
        translationBuilder.add(ModItems.CELESTITE_BOOTS, "Celestite Boots");
        translationBuilder.add(ModItems.ENDERITE_HELMET, "Enderite Helmet");
        translationBuilder.add(ModItems.ENDERITE_CHESTPLATE, "Enderite Chestplate");
        translationBuilder.add(ModItems.ENDERITE_LEGGINGS, "Enderite Leggings");
        translationBuilder.add(ModItems.ENDERITE_BOOTS, "Enderite Boots");

        /** BLOCKS **/
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LOG, "Nightshade Grove Log");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LOG, "Jungle Jade Log");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LOG, "Crystal Aspen Log");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LOG, "Shadowonyx BloodFlame Log");
        translationBuilder.add(ModBlocks.DARKFIRE_LOG, "Darkfire Log");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG, "Stripped Nightshade Grove Log");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_LOG, "Stripped Jungle Jade Log");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG, "Stripped Crystal Aspen Log");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG, "Stripped Shadowonyx BloodFlame Log");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_LOG, "Stripped Darkfire Log");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_WOOD, "Nightshade Grove Wood");
        translationBuilder.add(ModBlocks.JUNGLEJADE_WOOD, "Jungle Jade Wood");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_WOOD, "Crystal Aspen Wood");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD, "Shadowonyx BloodFlame Wood");
        translationBuilder.add(ModBlocks.DARKFIRE_WOOD, "Darkfire Wood");
        translationBuilder.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, "Stripped Nightshade Grove Wood");
        translationBuilder.add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD, "Stripped Jungle Jade Wood");
        translationBuilder.add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, "Stripped Crystal Aspen Wood");
        translationBuilder.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, "Stripped Shadowonyx BloodFlame Wood");
        translationBuilder.add(ModBlocks.STRIPPED_DARKFIRE_WOOD, "Stripped Darkfire Wood");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_STAIRS, "Nightshade Grove Stairs");
        translationBuilder.add(ModBlocks.JUNGLEJADE_STAIRS, "Jungle Jade Stairs");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_STAIRS, "Crystal Aspen Stairs");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, "Shadowonyx BloodFlame Stairs");
        translationBuilder.add(ModBlocks.DARKFIRE_STAIRS, "Darkfire Stairs");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SLAB, "Nightshade Grove Slab");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SLAB, "Jungle Jade Slab");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SLAB, "Crystal Aspen Slab");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB, "Shadowonyx BloodFlame Slab");
        translationBuilder.add(ModBlocks.DARKFIRE_SLAB, "Darkfire Slab");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE, "Nightshade Grove Pressure Plate");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PRESSURE_PLATE, "Jungle Jade Pressure Plate");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE, "Crystal Aspen Pressure Plate");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE, "Shadowonyx BloodFlame Pressure Plate");
        translationBuilder.add(ModBlocks.DARKFIRE_PRESSURE_PLATE, "Darkfire Pressure Plate");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_BUTTON, "Nightshade Grove Button");
        translationBuilder.add(ModBlocks.JUNGLEJADE_BUTTON, "Jungle Jade Button");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_BUTTON, "Crystal Aspen Button");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, "Shadowonyx BloodFlame Button");
        translationBuilder.add(ModBlocks.DARKFIRE_BUTTON, "Darkfire Button");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE, "Nightshade Grove Fence");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE, "Jungle Jade Fence");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE, "Crystal Aspen Fence");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE, "Shadowonyx BloodFlame Fence");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE, "Darkfire Fence");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, "Nightshade Grove Fence Gate");
        translationBuilder.add(ModBlocks.JUNGLEJADE_FENCE_GATE, "Jungle Jade Fence Gate");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_FENCE_GATE, "Crystal Aspen Fence Gate");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, "Shadowonyx BloodFlame Fence Gate");
        translationBuilder.add(ModBlocks.DARKFIRE_FENCE_GATE, "Darkfire Fence Gate");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_PLANKS, "Nightshade Grove Planks");
        translationBuilder.add(ModBlocks.JUNGLEJADE_PLANKS, "Jungle Jade Planks");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_PLANKS, "Crystal Aspen Planks");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, "Shadowonyx BloodFlame Planks");
        translationBuilder.add(ModBlocks.DARKFIRE_PLANKS, "Darkfire Planks");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_DOOR, "Nightshade Grove Door");
        translationBuilder.add(ModBlocks.JUNGLEJADE_DOOR, "Jungle Jade Door");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_DOOR, "Crystal Aspen Door");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR, "Shadowonyx BloodFlame Door");
        translationBuilder.add(ModBlocks.DARKFIRE_DOOR, "Darkfire Door");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, "Nightshade Grove Trapdoor");
        translationBuilder.add(ModBlocks.JUNGLEJADE_TRAPDOOR, "Jungle Jade Trapdoor");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_TRAPDOOR, "Crystal Aspen Trapdoor");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, "Shadowonyx BloodFlame Trapdoor");
        translationBuilder.add(ModBlocks.DARKFIRE_TRAPDOOR, "Darkfire Trapdoor");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_LEAVES, "Nightshade Grove Leaves");
        translationBuilder.add(ModBlocks.JUNGLEJADE_LEAVES, "Jungle Jade Leaves");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_LEAVES, "Crystal Aspen Leaves");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES, "Shadowonyx BloodFlame Leaves");
        translationBuilder.add(ModBlocks.DARKFIRE_LEAVES, "Darkfire Leaves");
        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_SAPLING, "Nightshade Grove Sapling");
        translationBuilder.add(ModBlocks.JUNGLEJADE_SAPLING, "Jungle Jade Sapling");
        translationBuilder.add(ModBlocks.CRYSTALASPEN_SAPLING, "Crystal Aspen Sapling");
        translationBuilder.add(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, "Shadowonyx BloodFlame Sapling");
        translationBuilder.add(ModBlocks.DARKFIRE_SAPLING, "Darkfire Sapling");

        translationBuilder.add(ModBlocks.NIGHTSHADEGROVE_END_STONE, "Nightshade Grove End Stone");

        translationBuilder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        translationBuilder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        translationBuilder.add(ModBlocks.PHOENIXITE_ORE, "Phoenixite Ore");
        translationBuilder.add(ModBlocks.ENDERITE_ORE, "Enderite Ore");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_ORE, "Enderite coal Ore");
        translationBuilder.add(ModBlocks.CELESTITE_ORE, "Celestite Ore");
        translationBuilder.add(ModBlocks.COBALT_ORE, "Cobalt Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_COBALT_ORE, "Deepslate Cobalt Ore");
        translationBuilder.add(ModBlocks.MYTHRIL_ORE, "Mythril Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE, "Deepslate Mythril Ore");

        translationBuilder.add(ModBlocks.RUBY_BLOCK, "Ruby Block");
        translationBuilder.add(ModBlocks.COBALT_BLOCK, "Cobalt Block");
        translationBuilder.add(ModBlocks.PHOENIXITE_BLOCK, "Phoenixite Block");
        translationBuilder.add(ModBlocks.ENDERITE_BLOCK, "Enderite Block");
        translationBuilder.add(ModBlocks.ENDERITE_COAL_BLOCK, "Enderite coal Block");
        translationBuilder.add(ModBlocks.CELESTITE_BLOCK, "Celestite Block");
        translationBuilder.add(ModBlocks.MYTHRIL_BLOCK, "Mythril Block");
        //translationBuilder.add(ModBlocks., "");

        // Load an existing language file.
        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/beyond-horizons/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}