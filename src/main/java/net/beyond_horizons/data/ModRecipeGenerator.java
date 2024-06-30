package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.data.server.recipe.ModSmithingRecipes;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.beyond_horizons.BeyondHorizons.MOD_ID;
import static net.beyond_horizons.data.server.recipe.ModSmithingRecipes.*;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, List.of(ModBlocks.ENDERITE_ORE), RecipeCategory.MISC, ModItems.ENDERITE_SCRAP,
                2.0F, 200, "enderite");
        offerSmelting(exporter, List.of(ModBlocks.PHOENIXITE_ORE), RecipeCategory.MISC, ModItems.PHOENIXITE_SCRAP,
                2.0F, 200, "phoenixite");
        offerSmelting(exporter, List.of(ModItems.RAW_CELESTITE), RecipeCategory.MISC, ModItems.CELESTITE_INGOT,
                2.0F, 200, "raw_celestite");
        offerBlasting(exporter, List.of(ModBlocks.ENDERITE_ORE), RecipeCategory.MISC, ModItems.ENDERITE_SCRAP,
                2.0F, 100, "enderite");
        offerBlasting(exporter, List.of(ModBlocks.PHOENIXITE_ORE), RecipeCategory.MISC, ModItems.PHOENIXITE_SCRAP,
                2.0F, 100, "phoenixite");
        offerBlasting(exporter, List.of(ModItems.RAW_CELESTITE), RecipeCategory.MISC, ModItems.CELESTITE_INGOT,
                2.0F, 100, "raw_celestite");
        
        offerSmelting(exporter, List.of(ModBlocks.CRYSTALASPEN_LOG), RecipeCategory.MISC, ModBlocks.CRYSTALASPEN_LOG,
                0.15F, 200, "crystalaspen_log");
        offerSmelting(exporter, List.of(ModBlocks.JUNGLEJADE_LOG), RecipeCategory.MISC, ModBlocks.JUNGLEJADE_LOG,
                0.15F, 200, "junglejade_log");
        offerSmelting(exporter, List.of(ModBlocks.NIGHTSHADEGROVE_LOG), RecipeCategory.MISC, ModBlocks.NIGHTSHADEGROVE_LOG,
                0.15F, 200, "nightshadegrove_log");
        offerSmelting(exporter, List.of(ModBlocks.DARKFIRE_LOG), RecipeCategory.MISC, ModBlocks.DARKFIRE_LOG,
                0.15F, 200, "darkfire_log");
        offerSmelting(exporter, List.of(ModBlocks.SHADOWONYXBLOODFLAME_LOG), RecipeCategory.MISC, ModBlocks.SHADOWONYXBLOODFLAME_LOG,
                0.15F, 200, "shadowonyxbloodflame_log");
        
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_CRYSTALASPEN_LOG), RecipeCategory.MISC, ModBlocks.STRIPPED_CRYSTALASPEN_LOG,
                0.15F, 200, "crystalaspen_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_JUNGLEJADE_LOG), RecipeCategory.MISC, ModBlocks.STRIPPED_JUNGLEJADE_LOG,
                0.15F, 200, "junglejade_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG), RecipeCategory.MISC, ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG,
                0.15F, 200, "nightshadegrove_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_DARKFIRE_LOG), RecipeCategory.MISC, ModBlocks.STRIPPED_DARKFIRE_LOG,
                0.15F, 200, "darkfire_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG), RecipeCategory.MISC, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG,
                0.15F, 200, "shadowonyxbloodflame_stripped");
        
        offerSmelting(exporter, List.of(ModBlocks.CRYSTALASPEN_WOOD), RecipeCategory.MISC, ModBlocks.CRYSTALASPEN_WOOD,
                0.15F, 200, "crystalaspen_wood");
        offerSmelting(exporter, List.of(ModBlocks.JUNGLEJADE_WOOD), RecipeCategory.MISC, ModBlocks.JUNGLEJADE_WOOD,
                0.15F, 200, "junglejade_wood");
        offerSmelting(exporter, List.of(ModBlocks.NIGHTSHADEGROVE_WOOD), RecipeCategory.MISC, ModBlocks.NIGHTSHADEGROVE_WOOD,
                0.15F, 200, "nightshadegrove_wood");
        offerSmelting(exporter, List.of(ModBlocks.DARKFIRE_WOOD), RecipeCategory.MISC, ModBlocks.DARKFIRE_WOOD,
                0.15F, 200, "darkfire_wood");
        offerSmelting(exporter, List.of(ModBlocks.SHADOWONYXBLOODFLAME_WOOD), RecipeCategory.MISC, ModBlocks.SHADOWONYXBLOODFLAME_WOOD,
                0.15F, 200, "shadowonyxbloodflame_wood");
        
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD), RecipeCategory.MISC, ModBlocks.STRIPPED_CRYSTALASPEN_WOOD,
                0.15F, 200, "crystalaspen_wood_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_JUNGLEJADE_WOOD), RecipeCategory.MISC, ModBlocks.STRIPPED_JUNGLEJADE_WOOD,
                0.15F, 200, "junglejade_wood_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD), RecipeCategory.MISC, ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD,
                0.15F, 200, "nightshadegrove_wood_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_DARKFIRE_WOOD), RecipeCategory.MISC, ModBlocks.STRIPPED_DARKFIRE_WOOD,
                0.15F, 200, "darkfire_wood_stripped");
        offerSmelting(exporter, List.of(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD), RecipeCategory.MISC, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD,
                0.15F, 200, "shadowonyxbloodflame_wood_stripped");

        // Shaped recipe for cobalt block
        ModSmithingRecipes.offerShapedRecipe(exporter, ModItems.ENDERITE_COAL, RecipeCategory.MISC, ModBlocks.ENDERITE_COAL_BLOCK.asItem());
        ModSmithingRecipes.offerShapelessRecipe(exporter, ModBlocks.ENDERITE_COAL_BLOCK.asItem(), RecipeCategory.BUILDING_BLOCKS, ModItems.ENDERITE_COAL, 9);

        ModSmithingRecipes.offerShapedRecipe(exporter, ModItems.RUBY, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.asItem());
        ModSmithingRecipes.offerShapelessRecipe(exporter, ModBlocks.RUBY_BLOCK.asItem(), RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, 9);

        ModSmithingRecipes.offerShapedRecipe(exporter, ModItems.CELESTITE_INGOT, RecipeCategory.MISC, ModBlocks.CELESTITE_BLOCK.asItem());
        ModSmithingRecipes.offerShapelessRecipe(exporter, ModBlocks.CELESTITE_BLOCK.asItem(), RecipeCategory.BUILDING_BLOCKS, ModItems.CELESTITE_INGOT, 9);

        ModSmithingRecipes.offerShapedRecipe(exporter, ModItems.COBALT_INGOT, RecipeCategory.MISC, ModBlocks.COBALT_BLOCK.asItem());
        ModSmithingRecipes.offerShapelessRecipe(exporter, ModBlocks.COBALT_BLOCK.asItem(), RecipeCategory.BUILDING_BLOCKS, ModItems.COBALT_INGOT, 9);

        ModSmithingRecipes.offerShapedRecipe(exporter, ModItems.MYTHRIL_INGOT, RecipeCategory.MISC, ModBlocks.MYTHRIL_BLOCK.asItem());
        ModSmithingRecipes.offerShapelessRecipe(exporter, ModBlocks.MYTHRIL_BLOCK.asItem(), RecipeCategory.BUILDING_BLOCKS, ModItems.MYTHRIL_INGOT, 9);

        /** DOOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_DOOR)));

        /** PLANKS **/
        offerPlankRecipe(exporter, ModBlocks.CRYSTALASPEN_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_PLANKS.asItem(), 4, "1");
        offerPlankRecipe(exporter, ModBlocks.JUNGLEJADE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_PLANKS.asItem(), 4, "1");
        offerPlankRecipe(exporter, ModBlocks.NIGHTSHADEGROVE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_PLANKS.asItem(), 4, "1");
        offerPlankRecipe(exporter, ModBlocks.SHADOWONYXBLOODFLAME_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_PLANKS.asItem(), 4, "1");
        offerPlankRecipe(exporter, ModBlocks.DARKFIRE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_PLANKS.asItem(), 4, "1");
        offerPlankRecipe(exporter, ModBlocks.CRYSTALASPEN_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_PLANKS.asItem(), 4, "2");
        offerPlankRecipe(exporter, ModBlocks.JUNGLEJADE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_PLANKS.asItem(), 4, "2");
        offerPlankRecipe(exporter, ModBlocks.NIGHTSHADEGROVE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_PLANKS.asItem(), 4, "2");
        offerPlankRecipe(exporter, ModBlocks.SHADOWONYXBLOODFLAME_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_PLANKS.asItem(), 4, "2");
        offerPlankRecipe(exporter, ModBlocks.DARKFIRE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_PLANKS.asItem(), 4, "2");

        // Stripped logs to planks with different suffixes
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_CRYSTALASPEN_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_PLANKS.asItem(), 4, "3");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_JUNGLEJADE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_PLANKS.asItem(), 4, "3");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_PLANKS.asItem(), 4, "3");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_PLANKS.asItem(), 4, "3");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_DARKFIRE_LOG.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_PLANKS.asItem(), 4, "3");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_CRYSTALASPEN_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_PLANKS.asItem(), 4, "4");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_JUNGLEJADE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_PLANKS.asItem(), 4, "4");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_PLANKS.asItem(), 4, "4");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_PLANKS.asItem(), 4, "4");
        offerPlankRecipe(exporter, ModBlocks.STRIPPED_DARKFIRE_WOOD.asItem(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_PLANKS.asItem(), 4, "4");

        /** WOOD **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_WOOD)));

        /** STRIPPED WOOD **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_CRYSTALASPEN_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_CRYSTALASPEN_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_CRYSTALASPEN_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLEJADE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_JUNGLEJADE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_JUNGLEJADE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_JUNGLEJADE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_JUNGLEJADE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARKFIRE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_DARKFIRE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_DARKFIRE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_DARKFIRE_LOG))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_DARKFIRE_WOOD)));

        /** STAIRS **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_STAIRS)));

        /** SLABS **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_SLAB)));

        /** FENCE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_FENCE)));

        /** FENCE GATE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_FENCE_GATE)));

        /** TRAPDOOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_TRAPDOOR)));

        /** PRESSURE PLATE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_PRESSURE_PLATE)));

        /** BUTTON **/
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_BUTTON, 1)
                .input(ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_BUTTON, 1)
                .input(ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_BUTTON, 1)
                .input(ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, 1)
                .input(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_BUTTON, 1)
                .input(ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_BUTTON)));

        /** TOOLS **/
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, ItemTags.PLANKS, RecipeCategory.TOOLS, ModItems.WOODEN_MULTI_TOOL);
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, ItemTags.STONE_TOOL_MATERIALS, RecipeCategory.TOOLS, ModItems.STONE_MULTI_TOOL);
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, Items.GOLD_INGOT, RecipeCategory.TOOLS, ModItems.GOLD_MULTI_TOOL);
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, Items.IRON_INGOT, RecipeCategory.TOOLS, ModItems.IRON_MULTI_TOOL);
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, Items.DIAMOND, RecipeCategory.TOOLS, ModItems.DIAMOND_MULTI_TOOL);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE, 1)
                .pattern("##")
                .pattern("#x").pattern(" x")
                .input('x', Items.STICK).input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK).input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_SHOVEL)));
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, ModItems.RUBY, RecipeCategory.TOOLS, ModItems.RUBY_MULTI_TOOL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_AXE, 1)
                .pattern("##")
                .pattern("#x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_SHOVEL)));

        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, ModItems.COBALT_INGOT, RecipeCategory.TOOLS, ModItems.COBALT_MULTI_TOOL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_BOW, 1)
                .pattern("xo ")
                .pattern("x#o")
                .pattern("xo ")
                .input('x', Items.STICK)
                .input('o', Items.STRING)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(Items.STRING), FabricRecipeProvider.conditionsFromItem(Items.STRING))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_BOW)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_AXE, 1)
                .pattern("##")
                .pattern("#x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_SHOVEL)));
        ModSmithingRecipes.offerShapedRecipeMultiTool(exporter, Items.STICK, Items.AMETHYST_SHARD, ModItems.MYTHRIL_INGOT, RecipeCategory.TOOLS, ModItems.MYTHRIL_MULTI_TOOL);

        /** ARMOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.RUBY_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.COBALT_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_BOOTS)));

        /** TOOLS **/
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_SHOVEL, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_SHOVEL);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_AXE, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_AXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_SWORD, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_SWORD);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_PICKAXE, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_PICKAXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_HOE, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_HOE);

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_SHOVEL, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_SHOVEL, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_AXE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_AXE, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_SWORD, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_SWORD, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_PICKAXE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_PICKAXE, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_HOE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_HOE, "1");

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_SHOVEL, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_SHOVEL);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_AXE, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_AXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_SWORD, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_SWORD);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_PICKAXE, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_PICKAXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_HOE, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_HOE);

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_SHOVEL, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_SHOVEL, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_AXE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_AXE, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_SWORD, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_SWORD, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_PICKAXE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_PICKAXE, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_HOE, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_HOE, "2");

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_SHOVEL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_SHOVEL);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_AXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_AXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_SWORD, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_SWORD);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_PICKAXE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_PICKAXE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_HOE, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, Items.NETHERITE_HOE);

        /** MULTI TOOL **/
        offerUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.COBALT_MULTI_TOOL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MULTI_TOOL, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.COBALT_MULTI_TOOL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MULTI_TOOL, "2");
        offerUpgradeRecipe(exporter, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, ModItems.DIAMOND_MULTI_TOOL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MULTI_TOOL, "3");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.DIAMOND_MULTI_TOOL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.NETHERITE_MULTI_TOOL, "4");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.DIAMOND_MULTI_TOOL, Items.NETHERITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_MULTI_TOOL, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.NETHERITE_MULTI_TOOL, ModItems.PHOENIXITE_INGOT, RecipeCategory.TOOLS, ModItems.PHOENIXITE_MULTI_TOOL, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_MULTI_TOOL, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_MULTI_TOOL, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.NETHERITE_MULTI_TOOL, ModItems.ENDERITE_INGOT, RecipeCategory.TOOLS, ModItems.ENDERITE_MULTI_TOOL, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_MULTI_TOOL, ModItems.CELESTITE_INGOT, RecipeCategory.TOOLS, ModItems.CELESTITE_MULTI_TOOL);

        /** ARMOR **/
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_HELMET, ModItems.ENDERITE_INGOT, RecipeCategory.COMBAT, ModItems.ENDERITE_HELMET);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_CHESTPLATE, ModItems.ENDERITE_INGOT, RecipeCategory.COMBAT, ModItems.ENDERITE_CHESTPLATE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_LEGGINGS, ModItems.ENDERITE_INGOT, RecipeCategory.COMBAT, ModItems.ENDERITE_LEGGINGS);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_BOOTS, ModItems.ENDERITE_INGOT, RecipeCategory.COMBAT, ModItems.ENDERITE_BOOTS);

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_HELMET, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_HELMET, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_CHESTPLATE, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_CHESTPLATE, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_LEGGINGS, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_LEGGINGS, "1");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.ENDERITE_BOOTS, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_BOOTS, "1");

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_HELMET, ModItems.PHOENIXITE_INGOT, RecipeCategory.COMBAT, ModItems.PHOENIXITE_HELMET);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_CHESTPLATE, ModItems.PHOENIXITE_INGOT, RecipeCategory.COMBAT, ModItems.PHOENIXITE_CHESTPLATE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_LEGGINGS, ModItems.PHOENIXITE_INGOT, RecipeCategory.COMBAT, ModItems.PHOENIXITE_LEGGINGS);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.NETHERITE_BOOTS, ModItems.PHOENIXITE_INGOT, RecipeCategory.COMBAT, ModItems.PHOENIXITE_BOOTS);

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_HELMET, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_HELMET, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_CHESTPLATE, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_CHESTPLATE, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_LEGGINGS, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_LEGGINGS, "2");
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, ModItems.PHOENIXITE_BOOTS, ModItems.CELESTITE_INGOT, RecipeCategory.COMBAT, ModItems.CELESTITE_BOOTS, "2");

        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_HELMET, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_HELMET);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_CHESTPLATE, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_LEGGINGS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_LEGGINGS);
        offerUpgradeRecipe(exporter, ModItems.DIMENSIONAL_TEMPLATE, Items.DIAMOND_BOOTS, Items.NETHERITE_INGOT, RecipeCategory.COMBAT, Items.NETHERITE_BOOTS);

        /** OTHER **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMULET_OF_THE_TIGER, 1)
                .pattern("#o#")
                .pattern("xxx")
                .pattern(" x ")
                .input('o', Items.TOTEM_OF_UNDYING)
                .input('#', ModBlocks.RUBY_BLOCK)
                .input('x', Blocks.GOLD_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.TOTEM_OF_UNDYING), FabricRecipeProvider.conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RUBY_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Blocks.GOLD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.AMULET_OF_THE_TIGER)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AMULET_OF_THE_CATS, 1)
                .pattern("#o#")
                .pattern("xxx")
                .pattern(" x ")
                .input('o', Items.TOTEM_OF_UNDYING)
                .input('#', Blocks.EMERALD_BLOCK)
                .input('x', Blocks.GOLD_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.TOTEM_OF_UNDYING), FabricRecipeProvider.conditionsFromItem(Items.TOTEM_OF_UNDYING))
                .criterion(FabricRecipeProvider.hasItem(Blocks.EMERALD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.EMERALD_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Blocks.GOLD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.GOLD_BLOCK))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.AMULET_OF_THE_CATS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ENDERITE_INGOT, 1)
                .pattern("ooo")
                .pattern("o##")
                .pattern("##x")
                .input('o', Items.DIAMOND)
                .input('x', ModBlocks.ENDERITE_COAL_BLOCK)
                .input('#', ModItems.ENDERITE_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(Items.DIAMOND), FabricRecipeProvider.conditionsFromItem(Items.DIAMOND))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ENDERITE_COAL_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.ENDERITE_COAL_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ENDERITE_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.ENDERITE_SCRAP))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.ENDERITE_INGOT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PHOENIXITE_INGOT, 1)
                .pattern("xxx")
                .pattern("x##")
                .pattern("##o")
                .input('o', Items.GOLD_INGOT)
                .input('x', ModItems.RUBY)
                .input('#', ModItems.PHOENIXITE_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.PHOENIXITE_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.PHOENIXITE_SCRAP))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(ModItems.PHOENIXITE_INGOT)));
        offerShapedRecipeTemplate(exporter, ModItems.CELESTITE_INGOT, Blocks.EMERALD_BLOCK, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, RecipeCategory.MISC, ModItems.DIMENSIONAL_TEMPLATE, 1, "1");
        offerShapedRecipeTemplate(exporter, ModItems.CELESTITE_INGOT, Blocks.END_STONE, ModItems.DIMENSIONAL_TEMPLATE, RecipeCategory.MISC, ModItems.DIMENSIONAL_TEMPLATE, 2, "2");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TORCH, 4)
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.ENDERITE_COAL)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ENDERITE_COAL), FabricRecipeProvider.conditionsFromItem(ModItems.ENDERITE_COAL))
                .offerTo(exporter, Identifier.of(MOD_ID, FabricRecipeProvider.getRecipeName(Items.TORCH)));
    }
}
