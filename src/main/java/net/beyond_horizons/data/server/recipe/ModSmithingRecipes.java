package net.beyond_horizons.data.server.recipe;

import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.beyond_horizons.BeyondHorizons.MOD_ID;

public class ModSmithingRecipes {
    public static void offerUpgradeRecipe(RecipeExporter exporter, Item template, Item input, Item requiredItem, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(requiredItem), category, result)
                .criterion("has_selected_template", RecipeProvider.conditionsFromItem(requiredItem))
                .offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing_trim");
    }
    public static void offerUpgradeRecipe(RecipeExporter exporter, Item template, Item input, Item requiredItem, RecipeCategory category, Item result, String suffix) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(template), Ingredient.ofItems(input), Ingredient.ofItems(requiredItem), category, result)
                .criterion("has_selected_template", RecipeProvider.conditionsFromItem(requiredItem))
                .offerTo(exporter, RecipeProvider.getItemPath(result) + "_smithing_trim" + suffix);
    }

    public static void offerShapelessRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result, int count) {
        ShapelessRecipeJsonBuilder.create(category, result, count)
                .input(input)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(MOD_ID, "shapeless_" + RecipeProvider.getItemPath(result)));
    }
    public static void offerShapedRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        ShapedRecipeJsonBuilder.create(category, result, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', input)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(MOD_ID, "shaped_" + RecipeProvider.getItemPath(result)));
    }
    public static void offerShapedRecipeMultiTool(RecipeExporter exporter, Item input, Item input1, Item input2, RecipeCategory category, Item result) {
        ShapedRecipeJsonBuilder.create(category, result, 1)
                .pattern("#o#")
                .pattern("#x#")
                .pattern(" x ")
                .input('x', input)
                .input('o', input1)
                .input('#', input2)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .criterion(FabricRecipeProvider.hasItem(input1), FabricRecipeProvider.conditionsFromItem(input1))
                .criterion(FabricRecipeProvider.hasItem(input2), FabricRecipeProvider.conditionsFromItem(input2))
                .offerTo(exporter, Identifier.of(MOD_ID, "shaped_" + RecipeProvider.getItemPath(result)));
    }
    public static void offerShapedRecipeMultiTool(RecipeExporter exporter, Item input, Item input1, TagKey<Item> input2, RecipeCategory category, Item result) {
        ShapedRecipeJsonBuilder.create(category, result, 1)
                .pattern("#o#")
                .pattern("#x#")
                .pattern(" x ")
                .input('x', input)
                .input('o', input1)
                .input('#', Ingredient.fromTag(input2))
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .criterion(FabricRecipeProvider.hasItem(input1), FabricRecipeProvider.conditionsFromItem(input1))
                .criterion("has_" + input2.id().getPath(), FabricRecipeProvider.conditionsFromTag(input2))
                .offerTo(exporter, Identifier.of(MOD_ID, "shaped_" + RecipeProvider.getItemPath(result)));
    }
    public static void offerShapedRecipeTemplate(RecipeExporter exporter, Item input, Block input1, Item input2, RecipeCategory category, Item result, int count, String suffix) {
        ShapedRecipeJsonBuilder.create(category, result, count)
                .pattern("#i#")
                .pattern("#e#")
                .pattern("###")
                .input('#', input)
                .input('e', input1)
                .input('i', input2)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .criterion(FabricRecipeProvider.hasItem(input1), FabricRecipeProvider.conditionsFromItem(input1))
                .criterion(FabricRecipeProvider.hasItem(input2), FabricRecipeProvider.conditionsFromItem(input2))
                .offerTo(exporter, Identifier.of(MOD_ID, "shaped_" + RecipeProvider.getItemPath(result) + "_" + suffix));
    }
    public static void offerPlankRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result, int count, String suffix) {
        ShapelessRecipeJsonBuilder.create(category, result, count)
                .input(input)
                .criterion(FabricRecipeProvider.hasItem(input), FabricRecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(MOD_ID, "planks_from_" + RecipeProvider.getItemPath(input) + "_" + suffix));
    }
}
