package net.beyond_horizons.mixin;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.beyond_horizons.items.custom.ModMultiToolItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Mixin(Block.class)
public class VeinMinerMixin {
    @Unique
    private static final int MAX_BLOCKS_TO_BREAK = 5;

    @Inject(method = "onBreak", at = @At("HEAD"), cancellable = true)
    private void onBlockBreak(World world, BlockPos pos, BlockState state, PlayerEntity player, CallbackInfoReturnable<BlockState> cir) {
        ItemStack heldItem = player.getMainHandStack();

        veinMine(world, pos, state, player, heldItem, new HashSet<>(), false);
        /*
        // Check if the player has a multi-tool and any enchantments
        if (heldItem.getItem() instanceof ModMultiToolItem && EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, heldItem) > 0) {
            veinMine(world, pos, state, player, heldItem, new HashSet<>(), true);
        } else if (heldItem.getItem() instanceof ModMultiToolItem) {
            veinMine(world, pos, state, player, heldItem, new HashSet<>(), false);
        }

         */
    }
    private void veinMine(World world, BlockPos pos, BlockState state, PlayerEntity player, ItemStack tool, Set<BlockPos> visited, boolean silkTouch) {
        if (visited.contains(pos) || visited.size() >= MAX_BLOCKS_TO_BREAK) return;
        visited.add(pos);

        // Break the block and damage the tool
        if (silkTouch) {
            // If Silk Touch is present, drop the block itself
            Block.dropStacks(state, world, pos, null, player, tool);
        } else {
            // Otherwise, break normally
            world.breakBlock(pos, true, player);
        }
        tool.damage(1, player, EquipmentSlot.MAINHAND);

        // Check all adjacent blocks
        for (Direction direction : Direction.values()) {
            BlockPos adjacentPos = pos.offset(direction);
            BlockState adjacentState = world.getBlockState(adjacentPos);
            if (adjacentState.isOf(state.getBlock())) {
                veinMine(world, adjacentPos, adjacentState, player, tool, visited, silkTouch);
            }
        }
    }
}