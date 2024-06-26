package net.beyond_horizons.items;

import com.google.common.base.Suppliers;
import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.utils.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Lazy;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    Ruby(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL, 784, 3, 2F, 21, () ->
            Ingredient.ofItems(ModItems.RUBY)),

    Enderite(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL, 1974, 4, 2.5F, 27, () ->
            Ingredient.ofItems(ModItems.ENDERITE_INGOT)),

    Phoenixite(ModTags.Blocks.INCORRECT_FOR_PHOENIXITE_TOOL, 1841, 4, 3.0F, 27, () ->
            Ingredient.ofItems(ModItems.PHOENIXITE_INGOT)),

    Celestite(ModTags.Blocks.INCORRECT_FOR_CELESTITE_TOOL, 2133, 4, 3.0F, 27, () ->
            Ingredient.ofItems(ModBlocks.CELESTITE_BLOCK)),

    Cobalt(ModTags.Blocks.INCORRECT_FOR_COBALT_TOOL, 1306, 4, 2.0F, 24, () ->
            Ingredient.ofItems(ModItems.COBALT_INGOT)),

    Mythril(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL, 1923, 4, 2.0F, 24, () ->
            Ingredient.ofItems(ModItems.MYTHRIL_INGOT)),

    CobaltMT(ModTags.Blocks.INCORRECT_FOR_COBALTMT_TOOL, 5000, 5, 3.0F, 27, () ->
            Ingredient.ofItems(ModBlocks.COBALT_BLOCK));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(final TagKey inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
