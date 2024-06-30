package net.beyond_horizons.items;

import com.google.common.base.Suppliers;
import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.utils.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    Ruby(ModTags.Blocks.INCORRECT_FOR_RUBY_TOOL, 784, 12.5F, 2F, 15, () ->
            Ingredient.ofItems(ModItems.RUBY)),

    Enderite(ModTags.Blocks.INCORRECT_FOR_ENDERITE_TOOL, 1974, 10.5F, 2.5F, 21, () ->
            Ingredient.ofItems(ModItems.ENDERITE_INGOT)),

    Phoenixite(ModTags.Blocks.INCORRECT_FOR_PHOENIXITE_TOOL, 1841, 10.0F, 3.0F, 18, () ->
            Ingredient.ofItems(ModItems.PHOENIXITE_INGOT)),

    Celestite(ModTags.Blocks.INCORRECT_FOR_CELESTITE_TOOL, 2133, 11.0F, 3.0F, 21, () ->
            Ingredient.ofItems(ModBlocks.CELESTITE_BLOCK)),

    Cobalt(ModTags.Blocks.INCORRECT_FOR_COBALT_TOOL, 1306, 10.0F, 2.0F, 15, () ->
            Ingredient.ofItems(ModItems.COBALT_INGOT)),

    Mythril(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_TOOL, 1923, 10.0F, 2.0F, 15, () ->
            Ingredient.ofItems(ModItems.MYTHRIL_INGOT)),

    //Multi Tools
    RubyMT(ModTags.Blocks.INCORRECT_FOR_RUBY_MULTI_TOOL, 2100, 14F, 2.0F, 15, () ->
            Ingredient.ofItems(ModItems.RUBY)),

    EnderiteMT(ModTags.Blocks.INCORRECT_FOR_ENDERITE_MULTI_TOOL, 6500, 13F, 2.0F, 21, () ->
            Ingredient.ofItems(ModItems.ENDERITE_INGOT)),

    PhoenixiteMT(ModTags.Blocks.INCORRECT_FOR_PHOENIXITE_MULTI_TOOL, 4900, 12F, 2.0F, 18, () ->
            Ingredient.ofItems(ModItems.PHOENIXITE_INGOT)),

    CelestiteMT(ModTags.Blocks.INCORRECT_FOR_CELESTITE_MULTI_TOOL, 9500, 14F, 2.0F, 21, () ->
            Ingredient.ofItems(ModItems.CELESTITE_INGOT)),

    CobaltMT(ModTags.Blocks.INCORRECT_FOR_COBALT_MULTI_TOOL, 3150, 11F, 2.0F, 15, () ->
            Ingredient.ofItems(ModItems.COBALT_INGOT)),

    MythrilMT(ModTags.Blocks.INCORRECT_FOR_MYTHRIL_MULTI_TOOL, 3450, 10F, 2.0F, 15, () ->
            Ingredient.ofItems(ModItems.MYTHRIL_INGOT)),

    //Vanilla Multi Tools
    WoodenMT(ModTags.Blocks.INCORRECT_FOR_WOODEN_MULTI_TOOL, 300, 6F, 2.0F, 11, () ->
            Ingredient.fromTag(ItemTags.PLANKS)),
    StoneMT(ModTags.Blocks.INCORRECT_FOR_STONE_MULTI_TOOL, 450, 7F, 2.0F, 13, () ->
            Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    GoldMT(ModTags.Blocks.INCORRECT_FOR_GOLD_MULTI_TOOL, 180, 11F, 2.0F, 8, () ->
            Ingredient.ofItems(Items.GOLD_INGOT)),
    IronMT(ModTags.Blocks.INCORRECT_FOR_IRON_MULTI_TOOL, 700, 8F, 2.0F, 15, () ->
            Ingredient.ofItems(Items.IRON_INGOT)),
    DiamondMT(ModTags.Blocks.INCORRECT_FOR_DIAMOND_MULTI_TOOL, 2000, 9F, 2.0F, 16, () ->
            Ingredient.ofItems(Items.DIAMOND)),
    NetheriteMT(ModTags.Blocks.INCORRECT_FOR_NETHERITE_MULTI_TOOL, 3800, 11F, 2.0F, 17, () ->
            Ingredient.ofItems(Items.NETHERITE_INGOT));

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
