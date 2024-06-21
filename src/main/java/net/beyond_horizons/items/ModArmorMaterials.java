package net.beyond_horizons.items;

import com.mojang.datafixers.util.Either;
import net.beyond_horizons.BeyondHorizons;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryOwner;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Lazy;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum ModArmorMaterials implements RegistryEntry<ArmorMaterial> {
    Ruby("ruby", 22, new int[]{3, 8, 6, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 0.5F, 0.05F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.RUBY});
    }),
    Enderite("enderite", 43, new int[]{4, 10, 7, 4}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 2.5F, 0.25F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.ENDERITE_INGOT});
    }),
    Phoenixite("phoenixite", 43, new int[]{5, 11, 8, 5}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 2.5F, 0.45F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.PHOENIXITE_INGOT});
    }),
    Celestite("celestite", 46, new int[]{6, 12, 9, 6}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 2.5F, 0.65F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.CELESTITE_INGOT});
    }),
    Cobalt("cobalt", 36, new int[]{5, 10, 8, 4}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 1.5F, 0.05F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.COBALT_INGOT});
    }),
    Mythril("mythril", 39, new int[]{5, 12, 9, 5}, 21, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC.value(), 2.0F, 0.15F, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{ModItems.MYTHRIL_INGOT});
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }
    public int getProtection(ArmorItem.Type type) {
        return (Integer)this.protectionAmounts[type.ordinal()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return BeyondHorizons.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public ArmorMaterial value() {
        return null;
    }

    @Override
    public boolean hasKeyAndValue() {
        return false;
    }

    @Override
    public boolean matchesId(Identifier id) {
        return false;
    }

    @Override
    public boolean matchesKey(RegistryKey<ArmorMaterial> key) {
        return false;
    }

    @Override
    public boolean matches(Predicate<RegistryKey<ArmorMaterial>> predicate) {
        return false;
    }

    @Override
    public boolean isIn(TagKey<ArmorMaterial> tag) {
        return false;
    }

    @Override
    public boolean matches(RegistryEntry<ArmorMaterial> entry) {
        return false;
    }

    @Override
    public Stream<TagKey<ArmorMaterial>> streamTags() {
        return null;
    }

    @Override
    public Either<RegistryKey<ArmorMaterial>, ArmorMaterial> getKeyOrValue() {
        return null;
    }

    @Override
    public Optional<RegistryKey<ArmorMaterial>> getKey() {
        return Optional.empty();
    }

    @Override
    public Type getType() {
        return null;
    }

    @Override
    public boolean ownerEquals(RegistryEntryOwner<ArmorMaterial> owner) {
        return false;
    }
}
