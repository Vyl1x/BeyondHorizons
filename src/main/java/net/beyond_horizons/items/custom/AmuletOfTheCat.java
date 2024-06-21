package net.beyond_horizons.items.custom;

import net.beyond_horizons.effect.ModStatusEffects;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AmuletOfTheCat extends Item {
    public AmuletOfTheCat(Item.Settings fabricItemSettings) {
        super(new Item.Settings().maxCount(8).maxDamage(16));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance((RegistryEntry<StatusEffect>) ModStatusEffects.EFFECT_OF_THE_CAT, 45 * 20, 1), user);
        if (!user.getAbilities().creativeMode) {
            if (itemStack.getDamage() >= itemStack.getMaxDamage()) {
                // Item has reached maximum damage, destroy it
                itemStack.decrement(1);
                user.playSound(SoundEvents.ENTITY_ITEM_BREAK, 1.0f, 1.0f);
                return TypedActionResult.consume(ItemStack.EMPTY);
            } else {
                // Decrement durability
                itemStack.damage(1, user, EquipmentSlot.MAINHAND);
            }
        }
        user.playSound(SoundEvents.ENTITY_CAT_STRAY_AMBIENT, 1.0f, 1.0f);
        return TypedActionResult.consume(itemStack);
    }
}
