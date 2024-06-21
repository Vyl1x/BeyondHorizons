package net.beyond_horizons.items.custom;

import net.beyond_horizons.effect.ModStatusEffects;
import net.beyond_horizons.sounds.ModSounds;
import net.minecraft.entity.Entity;
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

public class AmuletOfTheTiger extends Item {
    int Time = 100; //5 seconds in ticks (5 * 20)
    boolean ActiveTime;
    public AmuletOfTheTiger(Item.Settings fabricItemSettings) {
        super(new Item.Settings().maxCount(1).maxDamage(32));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        user.addStatusEffect(new StatusEffectInstance((RegistryEntry<StatusEffect>) ModStatusEffects.EFFECT_OF_THE_TIGER, 45 * 20, 1), user);
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
        user.playSound(ModSounds.TIGER_ROAR, 0.45F, 1.0f);
        return TypedActionResult.consume(itemStack);
    }


    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(ActiveTime) {
            //Do that later
        }
    }
}