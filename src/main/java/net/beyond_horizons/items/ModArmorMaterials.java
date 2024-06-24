package net.beyond_horizons.items;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials {
    public static final ModArmorMaterial Celestite = new ModArmorMaterial(
            ModArmorMaterial.Celestite,
            EntityAttributes.GENERIC_MAX_HEALTH,
            EntityAttributeModifier.Operation.ADD_VALUE,
            Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 2.0);
                map.put(ArmorItem.Type.LEGGINGS, 2.75);
                map.put(ArmorItem.Type.CHESTPLATE, 3.0);
                map.put(ArmorItem.Type.HELMET, 2.25);
                map.put(ArmorItem.Type.BODY, 10.0);
            })
    );
}
