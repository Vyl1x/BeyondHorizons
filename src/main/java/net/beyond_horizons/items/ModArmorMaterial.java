package net.beyond_horizons.items;

import net.beyond_horizons.BeyondHorizons;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.Map;

import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class ModArmorMaterial {
    public static final RegistryEntry<ArmorMaterial> Ruby = ModArmorMaterial.register(
            BeyondHorizons.identifier("ruby").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 3);
                map.put(ArmorItem.Type.CHESTPLATE, 8);
                map.put(ArmorItem.Type.LEGGINGS, 6);
                map.put(ArmorItem.Type.BOOTS, 3);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            18,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.5F,
            0.05F,
            () -> Ingredient.ofItems(ModItems.RUBY)
    );
    public static final RegistryEntry<ArmorMaterial> Enderite = ModArmorMaterial.register(
            BeyondHorizons.identifier("enderite").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 4);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.LEGGINGS, 7);
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            2.5F,
            0.25F,
            () -> Ingredient.ofItems(ModItems.ENDERITE_INGOT)
    );

    public static final RegistryEntry<ArmorMaterial> Phoenixite = ModArmorMaterial.register(
            BeyondHorizons.identifier("phoenixite").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 11);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            2.5F,
            0.45F,
            () -> Ingredient.ofItems(ModItems.PHOENIXITE_INGOT)
    );
    public static final RegistryEntry<ArmorMaterial> Celestite = ModArmorMaterial.register(
            BeyondHorizons.identifier("celestite").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 6);
                map.put(ArmorItem.Type.CHESTPLATE, 12);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.BOOTS, 6);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            2.5f,
            1.5f,
            () -> Ingredient.ofItems(ModItems.CELESTITE_INGOT)
    );

    public static final RegistryEntry<ArmorMaterial> Cobalt = ModArmorMaterial.register(
            BeyondHorizons.identifier("cobalt").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.BOOTS, 4);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            1.5f,
            0.05f,
            () -> Ingredient.ofItems(ModItems.COBALT_INGOT)
    );

    public static final RegistryEntry<ArmorMaterial> Mythril = ModArmorMaterial.register(
            BeyondHorizons.identifier("mythril").toString(),
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 12);
                map.put(ArmorItem.Type.LEGGINGS, 9);
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.BODY, 11);
            }),
            21,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            2.0f,
            0.15f,
            () -> Ingredient.ofItems(ModItems.MYTHRIL_INGOT)
    );

    private final RegistryEntry<ArmorMaterial> internal;
    private final RegistryEntry<EntityAttribute> attribute;
    private final Map<ArmorItem.Type, Double> attributeValues;
    private final EntityAttributeModifier.Operation operation;

    public ModArmorMaterial(RegistryEntry<ArmorMaterial> baseMaterial, RegistryEntry<EntityAttribute> customAttribute, EntityAttributeModifier.Operation operation, Map<ArmorItem.Type, Double> attributeValues) {
        this.internal = baseMaterial;
        this.attribute = customAttribute;
        this.operation = operation;
        this.attributeValues = attributeValues;
    }

    public RegistryEntry<ArmorMaterial> getBaseMaterial () {
        return this.internal;
    }

    public int getProtection (ArmorItem.Type type) {
        return this.internal.value().getProtection(type);
    }

    public float getToughness () {
        return this.internal.value().toughness();
    }

    public double getCustomAttributeValue (ArmorItem.Type type) {
        return this.attributeValues.get(type);
    }

    public RegistryEntry<EntityAttribute> getAttribute () {
        return this.attribute;
    }

    public EntityAttributeModifier.Operation getOperation () {
        return this.operation;
    }

    public static void register () {}

    private static RegistryEntry<ArmorMaterial> register (String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.of(id)));
        return ModArmorMaterial.register(id, defense, enchantability, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }

    private static RegistryEntry<ArmorMaterial> register (String id, EnumMap<ArmorItem.Type, Integer> defense, int enchantability, RegistryEntry<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient, List<ArmorMaterial.Layer> layers) {
        EnumMap<ArmorItem.Type, Integer> enumMap = new EnumMap<ArmorItem.Type, Integer>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            enumMap.put(type, defense.get(type));
        }
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(id), new ArmorMaterial(enumMap, enchantability, equipSound, repairIngredient, layers, toughness, knockbackResistance));
    }
}
