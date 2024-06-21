package net.beyond_horizons.data;

import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

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
        /*
        offerSmelting(exporter, List.of(ModItems.COBALT_INGOT), RecipeCategory.MISC, ModItems.CRYSTAL,
                2.0F, 200, "crystal");
        offerSmelting(exporter, List.of(ModItems.CRYSTAL), RecipeCategory.MISC, Blocks.GLASS,
                2.0F, 200, "glass");

         */
        
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
        
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CRYSTAL, RecipeCategory.DECORATIONS, ModBlocks.CRYSTAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ENDERITE_COAL, RecipeCategory.DECORATIONS, ModBlocks.ENDERITE_COAL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RUBY, RecipeCategory.DECORATIONS, ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CELESTITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.CELESTITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.COBALT_INGOT, RecipeCategory.DECORATIONS, ModBlocks.COBALT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.MYTHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MYTHRIL_BLOCK);

        /*offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CITRINE, RecipeCategory.DECORATIONS,
                ModBlocks.CITRINE_BLOCK);

        // JUST AN EXAMPLE
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_CITRINE)
                .pattern("SSS")
                .pattern("SCS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('C', ModItems.CITRINE)
                .criterion(FabricRecipeProvider.hasItem(Items.STONE),
                        FabricRecipeProvider.conditionsFromItem(Items.STONE))
                .criterion(FabricRecipeProvider.hasItem(ModItems.CITRINE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CITRINE))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RAW_CITRINE))); */

        /** DOOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_DOOR, 3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_DOOR)));

        /** PLANKS **/
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_PLANKS, 4)
                .input(ModBlocks.CRYSTALASPEN_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_PLANKS, 4)
                .input(ModBlocks.JUNGLEJADE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_PLANKS, 4)
                .input(ModBlocks.NIGHTSHADEGROVE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_PLANKS, 4)
                .input(ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_PLANKS, 4)
                .input(ModBlocks.DARKFIRE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_PLANKS)));

        /** WOOD **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_WOOD)));

        /** STRIPPED WOOD **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_CRYSTALASPEN_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_CRYSTALASPEN_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_CRYSTALASPEN_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_CRYSTALASPEN_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_CRYSTALASPEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_JUNGLEJADE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_JUNGLEJADE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_JUNGLEJADE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_JUNGLEJADE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_JUNGLEJADE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_NIGHTSHADEGROVE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_NIGHTSHADEGROVE_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_SHADOWONYXBLOODFLAME_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_DARKFIRE_WOOD, 3)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.STRIPPED_DARKFIRE_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_DARKFIRE_LOG), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_DARKFIRE_LOG))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.STRIPPED_DARKFIRE_WOOD)));

        /** STAIRS **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_STAIRS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_STAIRS, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_STAIRS)));

        /** SLABS **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRYSTALASPEN_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_SLAB)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_SLAB, 6)
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_SLAB)));

        /** FENCE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_FENCE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_FENCE, 3)
                .pattern("#x#")
                .pattern("#x#")
                .input('x', Items.STICK)
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_FENCE)));

        /** FENCE GATE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_FENCE_GATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_FENCE_GATE, 1)
                .pattern("x#x")
                .pattern("x#x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_FENCE_GATE)));

        /** TRAPDOOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_TRAPDOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_TRAPDOOR, 2)
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_TRAPDOOR)));

        /** PRESSURE PLATE **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.JUNGLEJADE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_PRESSURE_PLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.DARKFIRE_PRESSURE_PLATE, 1)
                .pattern("##")
                .input('#', ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_PRESSURE_PLATE)));

        /** BUTTON **/
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.CRYSTALASPEN_BUTTON, 1)
                .input(ModBlocks.CRYSTALASPEN_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRYSTALASPEN_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRYSTALASPEN_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTALASPEN_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLEJADE_BUTTON, 1)
                .input(ModBlocks.JUNGLEJADE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JUNGLEJADE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.JUNGLEJADE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.JUNGLEJADE_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NIGHTSHADEGROVE_BUTTON, 1)
                .input(ModBlocks.NIGHTSHADEGROVE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.NIGHTSHADEGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.NIGHTSHADEGROVE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.NIGHTSHADEGROVE_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SHADOWONYXBLOODFLAME_BUTTON, 1)
                .input(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SHADOWONYXBLOODFLAME_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.SHADOWONYXBLOODFLAME_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARKFIRE_BUTTON, 1)
                .input(ModBlocks.DARKFIRE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARKFIRE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARKFIRE_PLANKS))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.DARKFIRE_BUTTON)));

        /** TOOLS **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_AXE, 1)
                .pattern("##")
                .pattern("#x").pattern(" x")
                .input('x', Items.STICK).input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK).input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.RUBY_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CELESTITE_AXE, 1)
                .pattern("##")
                .pattern("#x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CELESTITE_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CELESTITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CELESTITE_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.CELESTITE_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_AXE, 1)
                .pattern("##")
                .pattern("#x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.COBALT_MULTI_TOOL, 1)
                .pattern("#o#")
                .pattern("#x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('o', Items.AMETHYST_SHARD)
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(Items.AMETHYST_SHARD), FabricRecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_MULTI_TOOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_AXE, 1)
                .pattern("##")
                .pattern("#x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SWORD, 1)
                .pattern("#")
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_PICKAXE, 1)
                .pattern("###")
                .pattern(" x ")
                .pattern(" x ")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_HOE, 1)
                .pattern("##")
                .pattern(" x")
                .pattern(" x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MYTHRIL_SHOVEL, 1)
                .pattern("#")
                .pattern("x")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_SHOVEL)));

        /** ARMOR **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.RUBY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUBY), FabricRecipeProvider.conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.RUBY_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CELESTITE_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CELESTITE_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CELESTITE_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.CELESTITE_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.CELESTITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CELESTITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CELESTITE_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.CELESTITE_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.COBALT_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.COBALT_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBALT_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.COBALT_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.COBALT_BOOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_HELMET)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_CHESTPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_LEGGINGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.MYTHRIL_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.MYTHRIL_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MYTHRIL_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.MYTHRIL_INGOT))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.MYTHRIL_BOOTS)));

        /** TOOLS **/
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.ENDERITE_SHOVEL);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.ENDERITE_AXE);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_SWORD, RecipeCategory.TOOLS, ModItems.ENDERITE_SWORD);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.ENDERITE_PICKAXE);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.ENDERITE_HOE);

        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_SHOVEL, RecipeCategory.TOOLS, ModItems.PHOENIXITE_SHOVEL);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_AXE, RecipeCategory.TOOLS, ModItems.PHOENIXITE_AXE);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_SWORD, RecipeCategory.TOOLS, ModItems.PHOENIXITE_SWORD);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.PHOENIXITE_PICKAXE);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_HOE, RecipeCategory.TOOLS, ModItems.PHOENIXITE_HOE);

        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_SHOVEL, RecipeCategory.TOOLS, Items.NETHERITE_SHOVEL);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_AXE, RecipeCategory.TOOLS, Items.NETHERITE_AXE);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_SWORD, RecipeCategory.TOOLS, Items.NETHERITE_SWORD);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_PICKAXE, RecipeCategory.TOOLS, Items.NETHERITE_PICKAXE);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_HOE, RecipeCategory.TOOLS, Items.NETHERITE_HOE);

        /** ARMOR **/
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.ENDERITE_HELMET);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.ENDERITE_CHESTPLATE);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.ENDERITE_LEGGINGS);
        offerEnderiteUpgradeRecipe(exporter, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.ENDERITE_BOOTS);
        
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_HELMET, RecipeCategory.COMBAT, ModItems.PHOENIXITE_HELMET);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.PHOENIXITE_CHESTPLATE);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_LEGGINGS, RecipeCategory.COMBAT, ModItems.PHOENIXITE_LEGGINGS);
        offerPhoenixiteUpgradeRecipe(exporter, Items.NETHERITE_BOOTS, RecipeCategory.COMBAT, ModItems.PHOENIXITE_BOOTS);
        
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_HELMET, RecipeCategory.COMBAT, Items.NETHERITE_HELMET);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_CHESTPLATE, RecipeCategory.COMBAT, Items.NETHERITE_CHESTPLATE);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_LEGGINGS, RecipeCategory.COMBAT, Items.NETHERITE_LEGGINGS);
        offerDimTempNetheriteUpgradeRecipe(exporter, Items.DIAMOND_BOOTS, RecipeCategory.COMBAT, Items.NETHERITE_BOOTS);

        /** OTHER **/
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TOTEM_OF_UNDYING, 1)
                .pattern("x#x")
                .pattern("ooo")
                .pattern(" o ")
                .input('o', Blocks.GOLD_BLOCK)
                .input('#', ModBlocks.RUBY_BLOCK)
                .input('x', Blocks.EMERALD_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Blocks.GOLD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.GOLD_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RUBY_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(Blocks.EMERALD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(Items.TOTEM_OF_UNDYING)));
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
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.AMULET_OF_THE_TIGER)));
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
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.AMULET_OF_THE_CATS)));
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
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.ENDERITE_INGOT)));
        /*
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTAL_LAMP, 1)
                .pattern(" o ")
                .pattern("o#o")
                .pattern(" o ")
                .input('o', ModItems.CRYSTAL)
                .input('#', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CRYSTAL), FabricRecipeProvider.conditionsFromItem(ModItems.CRYSTAL))
                .criterion(FabricRecipeProvider.hasItem(Items.REDSTONE), FabricRecipeProvider.conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTAL_LAMP)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRYSTAL_BRICKS, 1)
                .pattern("##")
                .pattern("##")
                .input('#', ModItems.CRYSTAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CRYSTAL), FabricRecipeProvider.conditionsFromItem(ModItems.CRYSTAL))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModBlocks.CRYSTAL_BRICKS)));

         */
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PHOENIXITE_INGOT, 1)
                .pattern("xxx")
                .pattern("x##")
                .pattern("##o")
                .input('o', Items.GOLD_INGOT)
                .input('x', ModBlocks.RUBY_BLOCK)
                .input('#', ModItems.PHOENIXITE_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(Items.GOLD_INGOT), FabricRecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RUBY_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.PHOENIXITE_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.PHOENIXITE_SCRAP))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.PHOENIXITE_INGOT)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIMENSIONAL_TEMPLATE, 1)
                .pattern("#e#")
                .pattern("#e#")
                .pattern("###")
                .input('#', ModItems.CELESTITE_INGOT)
                .input('e', Blocks.EMERALD_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CELESTITE_INGOT), FabricRecipeProvider.conditionsFromItem(ModItems.CELESTITE_INGOT))
                .criterion(FabricRecipeProvider.hasItem(Blocks.EMERALD_BLOCK), FabricRecipeProvider.conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(ModItems.DIMENSIONAL_TEMPLATE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TORCH, 4)
                .pattern("#")
                .pattern("x")
                .input('x', Items.STICK)
                .input('#', ModItems.ENDERITE_COAL)
                .criterion(FabricRecipeProvider.hasItem(Items.STICK), FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(FabricRecipeProvider.hasItem(ModItems.ENDERITE_COAL), FabricRecipeProvider.conditionsFromItem(ModItems.ENDERITE_COAL))
                .offerTo(exporter, Identifier.of(FabricRecipeProvider.getRecipeName(Items.TORCH)));
    }

    public static void offerEnderiteUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DIMENSIONAL_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.ENDERITE_INGOT), category, result).criterion("has_dimensional_trim", RecipeProvider.conditionsFromItem(ModItems.ENDERITE_INGOT)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing_trim");
    }
    
    public static void offerPhoenixiteUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DIMENSIONAL_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.PHOENIXITE_INGOT), category, result).criterion("has_dimensional_trim", RecipeProvider.conditionsFromItem(ModItems.PHOENIXITE_INGOT)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing_trim");
    }
    
    public static void offerDimTempNetheriteUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.DIMENSIONAL_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(Items.NETHERITE_INGOT), category, result).criterion("has_dimensional_trim", RecipeProvider.conditionsFromItem(Items.NETHERITE_INGOT)).offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing_trim");
    }
}
