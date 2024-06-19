package net.beyond_horizons.items;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup BEYONDHORIZONSGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BeyondHorizons.MOD_ID, "beyondhorizonsgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.beyondhorizonsgroup"))
                    .icon(() -> new ItemStack(ModItems.BEYONDHORIZONS)).entries((displayContext, entries) -> {

                        //Items
                        entries.add(ModItems.AMULET_OF_THE_TIGER);
                        entries.add(ModItems.AMULET_OF_THE_CATS);
                        entries.add(ModItems.DIMENSIONAL_TEMPLATE);

                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.COBALT_INGOT);
                        entries.add(ModItems.MYTHRIL_INGOT);
                        entries.add(ModItems.PHOENIXITE_INGOT);
                        entries.add(ModItems.PHOENIXITE_SCRAP);
                        entries.add(ModItems.ENDERITE_INGOT);
                        entries.add(ModItems.ENDERITE_SCRAP);
                        entries.add(ModItems.ENDERITE_COAL);
                        entries.add(ModItems.CELESTITE_INGOT);
                        entries.add(ModItems.RAW_CELESTITE);

                        //Armor
                        entries.add(ModItems.RUBY_HELMET);
                        entries.add(ModItems.RUBY_CHESTPLATE);
                        entries.add(ModItems.RUBY_LEGGINGS);
                        entries.add(ModItems.RUBY_BOOTS);
                        entries.add(ModItems.COBALT_HELMET);
                        entries.add(ModItems.COBALT_CHESTPLATE);
                        entries.add(ModItems.COBALT_LEGGINGS);
                        entries.add(ModItems.COBALT_BOOTS);
                        entries.add(ModItems.MYTHRIL_HELMET);
                        entries.add(ModItems.MYTHRIL_CHESTPLATE);
                        entries.add(ModItems.MYTHRIL_LEGGINGS);
                        entries.add(ModItems.MYTHRIL_BOOTS);
                        entries.add(ModItems.PHOENIXITE_HELMET);
                        entries.add(ModItems.PHOENIXITE_CHESTPLATE);
                        entries.add(ModItems.PHOENIXITE_LEGGINGS);
                        entries.add(ModItems.PHOENIXITE_BOOTS);
                        entries.add(ModItems.ENDERITE_HELMET);
                        entries.add(ModItems.ENDERITE_CHESTPLATE);
                        entries.add(ModItems.ENDERITE_LEGGINGS);
                        entries.add(ModItems.ENDERITE_BOOTS);
                        entries.add(ModItems.CELESTITE_HELMET);
                        entries.add(ModItems.CELESTITE_CHESTPLATE);
                        entries.add(ModItems.CELESTITE_LEGGINGS);
                        entries.add(ModItems.CELESTITE_BOOTS);

                        //Tools
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.COBALT_MULTI_TOOL);
                        entries.add(ModItems.COBALT_SWORD);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.COBALT_BOW);
                        entries.add(ModItems.MYTHRIL_SWORD);
                        entries.add(ModItems.MYTHRIL_AXE);
                        entries.add(ModItems.MYTHRIL_PICKAXE);
                        entries.add(ModItems.MYTHRIL_SHOVEL);
                        entries.add(ModItems.MYTHRIL_HOE);
                        entries.add(ModItems.PHOENIXITE_SWORD);
                        entries.add(ModItems.PHOENIXITE_AXE);
                        entries.add(ModItems.PHOENIXITE_PICKAXE);
                        entries.add(ModItems.PHOENIXITE_SHOVEL);
                        entries.add(ModItems.PHOENIXITE_HOE);
                        entries.add(ModItems.ENDERITE_SWORD);
                        entries.add(ModItems.ENDERITE_AXE);
                        entries.add(ModItems.ENDERITE_PICKAXE);
                        entries.add(ModItems.ENDERITE_SHOVEL);
                        entries.add(ModItems.ENDERITE_HOE);
                        entries.add(ModItems.CELESTITE_SWORD);
                        entries.add(ModItems.CELESTITE_AXE);
                        entries.add(ModItems.CELESTITE_PICKAXE);
                        entries.add(ModItems.CELESTITE_SHOVEL);
                        entries.add(ModItems.CELESTITE_HOE);

                        //Blocks
                        entries.add(ModBlocks.NIGHTSHADEGROVE_LOG);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_WOOD);
                        entries.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG);
                        entries.add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_PLANKS);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_STAIRS);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_SLAB);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_FENCE);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_DOOR);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_BUTTON);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_LEAVES);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_SAPLING);

                        entries.add(ModBlocks.JUNGLEJADE_LOG);
                        entries.add(ModBlocks.JUNGLEJADE_WOOD);
                        entries.add(ModBlocks.STRIPPED_JUNGLEJADE_LOG);
                        entries.add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD);
                        entries.add(ModBlocks.JUNGLEJADE_PLANKS);
                        entries.add(ModBlocks.JUNGLEJADE_STAIRS);
                        entries.add(ModBlocks.JUNGLEJADE_SLAB);
                        entries.add(ModBlocks.JUNGLEJADE_FENCE);
                        entries.add(ModBlocks.JUNGLEJADE_FENCE_GATE);
                        entries.add(ModBlocks.JUNGLEJADE_DOOR);
                        entries.add(ModBlocks.JUNGLEJADE_TRAPDOOR);
                        entries.add(ModBlocks.JUNGLEJADE_PRESSURE_PLATE);
                        entries.add(ModBlocks.JUNGLEJADE_BUTTON);
                        entries.add(ModBlocks.JUNGLEJADE_LEAVES);
                        entries.add(ModBlocks.JUNGLEJADE_SAPLING);

                        entries.add(ModBlocks.CRYSTALASPEN_LOG);
                        entries.add(ModBlocks.CRYSTALASPEN_WOOD);
                        entries.add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG);
                        entries.add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD);
                        entries.add(ModBlocks.CRYSTALASPEN_PLANKS);
                        entries.add(ModBlocks.CRYSTALASPEN_STAIRS);
                        entries.add(ModBlocks.CRYSTALASPEN_SLAB);
                        entries.add(ModBlocks.CRYSTALASPEN_FENCE);
                        entries.add(ModBlocks.CRYSTALASPEN_FENCE_GATE);
                        entries.add(ModBlocks.CRYSTALASPEN_DOOR);
                        entries.add(ModBlocks.CRYSTALASPEN_TRAPDOOR);
                        entries.add(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE);
                        entries.add(ModBlocks.CRYSTALASPEN_BUTTON);
                        entries.add(ModBlocks.CRYSTALASPEN_LEAVES);
                        entries.add(ModBlocks.CRYSTALASPEN_SAPLING);

                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_LOG);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD);
                        entries.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG);
                        entries.add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_DOOR);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_LEAVES);
                        entries.add(ModBlocks.SHADOWONYXBLOODFLAME_SAPLING);

                        entries.add(ModBlocks.DARKFIRE_LOG);
                        entries.add(ModBlocks.DARKFIRE_WOOD);
                        entries.add(ModBlocks.STRIPPED_DARKFIRE_LOG);
                        entries.add(ModBlocks.STRIPPED_DARKFIRE_WOOD);
                        entries.add(ModBlocks.DARKFIRE_PLANKS);
                        entries.add(ModBlocks.DARKFIRE_STAIRS);
                        entries.add(ModBlocks.DARKFIRE_SLAB);
                        entries.add(ModBlocks.DARKFIRE_FENCE);
                        entries.add(ModBlocks.DARKFIRE_FENCE_GATE);
                        entries.add(ModBlocks.DARKFIRE_DOOR);
                        entries.add(ModBlocks.DARKFIRE_TRAPDOOR);
                        entries.add(ModBlocks.DARKFIRE_PRESSURE_PLATE);
                        entries.add(ModBlocks.DARKFIRE_BUTTON);
                        entries.add(ModBlocks.DARKFIRE_LEAVES);
                        entries.add(ModBlocks.DARKFIRE_SAPLING);

                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.COBALT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_COBALT_ORE);
                        entries.add(ModBlocks.MYTHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRIL_ORE);

                        entries.add(ModBlocks.PHOENIXITE_ORE);

                        entries.add(ModBlocks.ENDERITE_ORE);
                        entries.add(ModBlocks.ENDERITE_COAL_ORE);
                        entries.add(ModBlocks.CELESTITE_ORE);

                        entries.add(ModBlocks.COBALT_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.MYTHRIL_BLOCK);
                        entries.add(ModBlocks.PHOENIXITE_BLOCK);
                        entries.add(ModBlocks.ENDERITE_BLOCK);
                        entries.add(ModBlocks.ENDERITE_COAL_BLOCK);
                        entries.add(ModBlocks.CELESTITE_BLOCK);
                        entries.add(ModBlocks.NIGHTSHADEGROVE_END_STONE);

                    }).build());


    public static void registerItemGroups() {
        BeyondHorizons.LOGGER.info("Registering Item Groups for " + BeyondHorizons.MOD_ID);
    }
}
