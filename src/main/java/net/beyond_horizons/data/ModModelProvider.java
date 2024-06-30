package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHOENIXITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PHOENIXITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_COAL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ENDERITE_COAL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CELESTITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBALT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_COBALT_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CELESTITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYTHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MYTHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MYTHRIL_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.NIGHTSHADEGROVE_LOG).log(ModBlocks.NIGHTSHADEGROVE_LOG).wood(ModBlocks.NIGHTSHADEGROVE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG).log(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG).wood(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NIGHTSHADEGROVE_PLANKS);
        blockStateModelGenerator.registerDoor(ModBlocks.NIGHTSHADEGROVE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.NIGHTSHADEGROVE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.NIGHTSHADEGROVE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.NIGHTSHADEGROVE_SAPLING);

        blockStateModelGenerator.registerLog(ModBlocks.JUNGLEJADE_LOG).log(ModBlocks.JUNGLEJADE_LOG).wood(ModBlocks.JUNGLEJADE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_JUNGLEJADE_LOG).log(ModBlocks.STRIPPED_JUNGLEJADE_LOG).wood(ModBlocks.STRIPPED_JUNGLEJADE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.JUNGLEJADE_PLANKS);
        blockStateModelGenerator.registerDoor(ModBlocks.JUNGLEJADE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.JUNGLEJADE_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.JUNGLEJADE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.JUNGLEJADE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.JUNGLEJADE_SAPLING);

        blockStateModelGenerator.registerLog(ModBlocks.CRYSTALASPEN_LOG).log(ModBlocks.CRYSTALASPEN_LOG).wood(ModBlocks.CRYSTALASPEN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CRYSTALASPEN_LOG).log(ModBlocks.STRIPPED_CRYSTALASPEN_LOG).wood(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CRYSTALASPEN_PLANKS);
        blockStateModelGenerator.registerDoor(ModBlocks.CRYSTALASPEN_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CRYSTALASPEN_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.CRYSTALASPEN_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CRYSTALASPEN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.CRYSTALASPEN_SAPLING);

        blockStateModelGenerator.registerLog(ModBlocks.SHADOWONYXBLOODFLAME_LOG).log(ModBlocks.SHADOWONYXBLOODFLAME_LOG).wood(ModBlocks.SHADOWONYXBLOODFLAME_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG).log(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG).wood(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS);
        blockStateModelGenerator.registerDoor(ModBlocks.SHADOWONYXBLOODFLAME_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING);

        blockStateModelGenerator.registerLog(ModBlocks.DARKFIRE_LOG).log(ModBlocks.DARKFIRE_LOG).wood(ModBlocks.DARKFIRE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DARKFIRE_LOG).log(ModBlocks.STRIPPED_DARKFIRE_LOG).wood(ModBlocks.STRIPPED_DARKFIRE_WOOD);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARKFIRE_PLANKS);
        blockStateModelGenerator.registerDoor(ModBlocks.DARKFIRE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DARKFIRE_TRAPDOOR);
        blockStateModelGenerator.registerSingleton(ModBlocks.DARKFIRE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.DARKFIRE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerItemModel(ModBlocks.DARKFIRE_SAPLING);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.PHOENIXITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PHOENIXITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDERITE_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CELESTITE_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRIL_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_CELESTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIMENSIONAL_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEYONDHORIZONS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_THE_TIGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMULET_OF_THE_CATS, Models.GENERATED);

        itemModelGenerator.register(ModItems.ENDERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ENDERITE_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PHOENIXITE_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.CELESTITE_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRIL_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_MULTI_TOOL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_MULTI_TOOL, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.ENDERITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.RUBY_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PHOENIXITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PHOENIXITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PHOENIXITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PHOENIXITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CELESTITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CELESTITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CELESTITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.CELESTITE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.MYTHRIL_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.COBALT_BOOTS));
    }
}
