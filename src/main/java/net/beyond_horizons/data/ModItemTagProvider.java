package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.beyond_horizons.utils.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider{
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Items.COALS)
                .add(ModItems.ENDERITE_COAL)
                .forceAddTag(ItemTags.COALS);

        getOrCreateTagBuilder(ModTags.Items.ORES)
                .add(ModBlocks.RUBY_ORE.asItem())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.asItem())
                .add(ModBlocks.COBALT_ORE.asItem())
                .add(ModBlocks.DEEPSLATE_COBALT_ORE.asItem())
                .add(ModBlocks.MYTHRIL_ORE.asItem())
                .add(ModBlocks.DEEPSLATE_MYTHRIL_ORE.asItem())
                .add(ModBlocks.PHOENIXITE_ORE.asItem())
                .add(ModBlocks.ENDERITE_ORE.asItem())
                .add(ModBlocks.ENDERITE_COAL_ORE.asItem())
                .add(ModBlocks.CELESTITE_ORE.asItem())

                .forceAddTag(ItemTags.GOLD_ORES)
                .forceAddTag(ItemTags.EMERALD_ORES)
                .forceAddTag(ItemTags.REDSTONE_ORES)
                .forceAddTag(ItemTags.LAPIS_ORES)
                .forceAddTag(ItemTags.DIAMOND_ORES)
                .forceAddTag(ItemTags.IRON_ORES)
                .forceAddTag(ItemTags.COPPER_ORES)
                .forceAddTag(ItemTags.COAL_ORES);

        getOrCreateTagBuilder(ModTags.Items.LOGS)
                .add(ModBlocks.NIGHTSHADEGROVE_LOG.asItem())
                .add(ModBlocks.JUNGLEJADE_LOG.asItem())
                .add(ModBlocks.CRYSTALASPEN_LOG.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LOG.asItem())
                .add(ModBlocks.DARKFIRE_LOG.asItem())
                .forceAddTag(ItemTags.LOGS);

        getOrCreateTagBuilder(ModTags.Items.PLANKS)
                .add(ModBlocks.NIGHTSHADEGROVE_PLANKS.asItem())
                .add(ModBlocks.JUNGLEJADE_PLANKS.asItem())
                .add(ModBlocks.CRYSTALASPEN_PLANKS.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS.asItem())
                .add(ModBlocks.DARKFIRE_PLANKS.asItem())
                .forceAddTag(ItemTags.PLANKS);

        getOrCreateTagBuilder(ModTags.Items.SLABS)
                .add(ModBlocks.NIGHTSHADEGROVE_SLAB.asItem())
                .add(ModBlocks.JUNGLEJADE_SLAB.asItem())
                .add(ModBlocks.CRYSTALASPEN_SLAB.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_SLAB.asItem())
                .add(ModBlocks.DARKFIRE_SLAB.asItem())
                .forceAddTag(ItemTags.SLABS);

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.NIGHTSHADEGROVE_FENCE.asItem())
                .add(ModBlocks.JUNGLEJADE_FENCE.asItem())
                .add(ModBlocks.CRYSTALASPEN_FENCE.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE.asItem())
                .add(ModBlocks.DARKFIRE_FENCE.asItem())

                .add(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE.asItem())
                .add(ModBlocks.JUNGLEJADE_FENCE_GATE.asItem())
                .add(ModBlocks.CRYSTALASPEN_FENCE_GATE.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE.asItem())
                .add(ModBlocks.DARKFIRE_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.NIGHTSHADEGROVE_LOG.asItem())
                .add(ModBlocks.JUNGLEJADE_LOG.asItem())
                .add(ModBlocks.CRYSTALASPEN_LOG.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_LOG.asItem())
                .add(ModBlocks.DARKFIRE_LOG.asItem())
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG.asItem())
                .add(ModBlocks.STRIPPED_JUNGLEJADE_LOG.asItem())
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_LOG.asItem())
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG.asItem())
                .add(ModBlocks.STRIPPED_DARKFIRE_LOG.asItem())
                .add(ModBlocks.NIGHTSHADEGROVE_WOOD.asItem())
                .add(ModBlocks.JUNGLEJADE_WOOD.asItem())
                .add(ModBlocks.CRYSTALASPEN_WOOD.asItem())
                .add(ModBlocks.SHADOWONYXBLOODFLAME_WOOD.asItem())
                .add(ModBlocks.DARKFIRE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_JUNGLEJADE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DARKFIRE_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS)
                .add(ModItems.ENDERITE_HELMET, ModItems.ENDERITE_CHESTPLATE, ModItems.ENDERITE_LEGGINGS, ModItems.ENDERITE_BOOTS)
                .add(ModItems.PHOENIXITE_HELMET, ModItems.PHOENIXITE_CHESTPLATE, ModItems.PHOENIXITE_LEGGINGS, ModItems.PHOENIXITE_BOOTS)
                .add(ModItems.CELESTITE_HELMET, ModItems.CELESTITE_CHESTPLATE, ModItems.CELESTITE_LEGGINGS, ModItems.CELESTITE_BOOTS)
                .add(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE, ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS)
                .add(ModItems.MYTHRIL_HELMET, ModItems.MYTHRIL_CHESTPLATE, ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_BOOTS);
    }
}