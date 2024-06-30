package net.beyond_horizons.utils;

import net.beyond_horizons.BeyondHorizons;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORES = createTag("ores");
        public static final TagKey<Block> MULTITOOL = createTag("multitool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_PHOENIXITE_TOOL = createTag("incorrect_for_phoenixite_tool");
        public static final TagKey<Block> INCORRECT_FOR_CELESTITE_TOOL = createTag("incorrect_for_celestite_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALT_TOOL = createTag("incorrect_for_cobalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");

        //Multi Tool
        public static final TagKey<Block> INCORRECT_FOR_RUBY_MULTI_TOOL = createTag("incorrect_for_ruby_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_MULTI_TOOL = createTag("incorrect_for_enderite_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_PHOENIXITE_MULTI_TOOL = createTag("incorrect_for_phoenixite_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_CELESTITE_MULTI_TOOL = createTag("incorrect_for_celestite_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALT_MULTI_TOOL = createTag("incorrect_for_cobalt_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_MULTI_TOOL = createTag("incorrect_for_mythril_multi_tool");

        //Vanilla
        public static final TagKey<Block> INCORRECT_FOR_WOODEN_MULTI_TOOL = createTag("incorrect_for_wooden_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_STONE_MULTI_TOOL = createTag("incorrect_for_stone_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_GOLD_MULTI_TOOL = createTag("incorrect_for_gold_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_IRON_MULTI_TOOL = createTag("incorrect_for_iron_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_DIAMOND_MULTI_TOOL = createTag("incorrect_for_diamond_multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_NETHERITE_MULTI_TOOL = createTag("incorrect_for_netherite_multi_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registries.BLOCK.getKey(), Identifier.of(BeyondHorizons.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ORES = createTag("ores");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), Identifier.of(BeyondHorizons.MOD_ID, name));
        }
    }
}
