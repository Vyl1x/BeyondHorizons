package net.beyond_horizons.utils;

import net.beyond_horizons.BeyondHorizons;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> LOGS = createTag("logs");
        public static final TagKey<Block> ORES = createTag("ores");
        public static final TagKey<Block> PLANKS = createTag("planks");
        public static final TagKey<Block> SLABS = createTag("slabs");
        public static final TagKey<Block> LEAVES = createTag("leaves");
        public static final TagKey<Block> MULTITOOL = createTag("multitool");
        public static final TagKey<Block> MULTI_TOOL = createTag("multi_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = createTag("incorrect_for_ruby_tool");
        public static final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createTag("incorrect_for_enderite_tool");
        public static final TagKey<Block> INCORRECT_FOR_PHOENIXITE_TOOL = createTag("incorrect_for_phoenixite_tool");
        public static final TagKey<Block> INCORRECT_FOR_CELESTITE_TOOL = createTag("incorrect_for_celestite_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALT_TOOL = createTag("incorrect_for_cobalt_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRIL_TOOL = createTag("incorrect_for_mythril_tool");
        public static final TagKey<Block> INCORRECT_FOR_COBALTMT_TOOL = createTag("incorrect_for_cobaltmt_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registries.BLOCK.getKey(), Identifier.of(BeyondHorizons.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> COALS = createTag("coals");
        public static final TagKey<Item> LOGS = createTag("logs");
        public static final TagKey<Item> ORES = createTag("ores");
        public static final TagKey<Item> PLANKS = createTag("planks");
        public static final TagKey<Item> SLABS = createTag("slabs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registries.ITEM.getKey(), Identifier.of(BeyondHorizons.MOD_ID, name));
        }
    }
}
