package net.beyond_horizons.items.custom;

import com.google.common.base.Suppliers;
import net.beyond_horizons.items.ModArmorMaterial;
import net.minecraft.block.DispenserBlock;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class ModCelestiteArmorItem extends ArmorItem {

    private final Supplier<AttributeModifiersComponent> trueAttributeModifiers;
    public ModCelestiteArmorItem(ModArmorMaterial material, Type type, Settings settings) {
        super(material.getBaseMaterial(), type, settings);
        DispenserBlock.registerBehavior(this, ArmorItem.DISPENSER_BEHAVIOR);

        this.trueAttributeModifiers = Suppliers.memoize(() -> {
            int protection = material.getProtection(type);
            float toughness = material.getToughness();
            AttributeModifiersComponent.Builder builder = AttributeModifiersComponent.builder();
            AttributeModifierSlot attributeModifierSlot = AttributeModifierSlot.forEquipmentSlot(type.getEquipmentSlot());
            Identifier attributeId = Identifier.ofVanilla("armor." + type.getName());
            builder.add(
                    EntityAttributes.GENERIC_ARMOR,
                    new EntityAttributeModifier(attributeId, protection, EntityAttributeModifier.Operation.ADD_VALUE),
                    attributeModifierSlot
            );
            builder.add(
                    EntityAttributes.GENERIC_ARMOR_TOUGHNESS,
                    new EntityAttributeModifier(attributeId, toughness, EntityAttributeModifier.Operation.ADD_VALUE),
                    attributeModifierSlot
            );

            // Include this just in case dependent mods try to add it.
            float knockbackResistance = material.getBaseMaterial().value().knockbackResistance();
            if (knockbackResistance > 0f) {
                builder.add(
                        EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                        new EntityAttributeModifier(attributeId, knockbackResistance, EntityAttributeModifier.Operation.ADD_VALUE),
                        attributeModifierSlot
                );
            }

            if (material.getAttribute() != null && material.getCustomAttributeValue(type) > 0f) {
                builder.add(
                        material.getAttribute(),
                        new EntityAttributeModifier(attributeId, material.getCustomAttributeValue(type), material.getOperation()),
                        attributeModifierSlot
                );
            }
            return builder.build();
        });
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if (!(entity instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) entity;

        if (player.getEquippedStack(EquipmentSlot.BODY).getItem() instanceof ModCelestiteArmorItem) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 1));
        }
    }

    @Override
    public AttributeModifiersComponent getAttributeModifiers () {
        return trueAttributeModifiers.get();
    }
}