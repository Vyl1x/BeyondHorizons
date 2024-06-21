package net.beyond_horizons.items;

import net.beyond_horizons.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {

    Ruby(3, 784, 12.5F, 2.0F, 21, () -> {
        return Ingredient.ofItems(ModItems.RUBY);
    }),

    Enderite(4, 1974, 10.5F, 2.5F, 27, () -> {
        return Ingredient.ofItems(ModItems.ENDERITE_INGOT);
    }),

    Phoenixite(4, 1841, 10.0F, 2.7F, 27, () -> {
        return Ingredient.ofItems(ModItems.PHOENIXITE_INGOT);
    }),

    Celestite(4, 2133, 11.0F, 3.0F, 27, () -> {
        return Ingredient.ofItems(ModBlocks.CELESTITE_BLOCK);
    }),

    Cobalt(4, 1306, 10.0F, 2.0F, 24, () -> {
        return Ingredient.ofItems(ModItems.COBALT_INGOT);
    }),

    Mythril(4, 1923, 11.0F, 2.0F, 24, () -> {
        return Ingredient.ofItems(ModItems.MYTHRIL_INGOT);
    }),

    CobaltMT(5, 5000, 13.0F, 1.0F, 27, () -> {
        return Ingredient.ofItems(ModBlocks.COBALT_BLOCK);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
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

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
