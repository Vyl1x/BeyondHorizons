package net.beyond_horizons.mixin;

import net.beyond_horizons.items.custom.ModMultiToolItem;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.beyond_horizons.items.ModItems.CELESTITE_MULTI_TOOL;

@Mixin(MiningToolItem.class)
public class MiningToolItemMixin {

    @Inject(method = "postHit", at = @At("HEAD"), cancellable = true)
    private void onPostHit(ItemStack stack, LivingEntity target, LivingEntity attacker, CallbackInfoReturnable<Boolean> cir) {
        if (stack.getItem() instanceof ModMultiToolItem) {
            PlayerEntity player = (PlayerEntity) attacker;
            World world = attacker.getWorld();

            if (stack.getItem() == CELESTITE_MULTI_TOOL && player.isSneaking()) {
                BlockPos pos = target.getBlockPos();
                breakSurroundingBlocks(world, pos, player, stack);

                // Optionally, cancel default behavior if needed
                cir.setReturnValue(true);
            }
        }
    }

    @Unique
    private void breakSurroundingBlocks(World world, BlockPos origin, PlayerEntity player, ItemStack tool) {
        Direction facing = player.getHorizontalFacing();
        Direction verticalFacing = player.getPitch() < -45 ? Direction.UP : (player.getPitch() > 45 ? Direction.DOWN : null);

        if (verticalFacing != null) {
            facing = verticalFacing;
        }

        for (int horizontalOffset1 = -1; horizontalOffset1 <= 1; horizontalOffset1++) {
            for (int horizontalOffset2 = -1; horizontalOffset2 <= 1; horizontalOffset2++) {
                BlockPos targetPos = getTargetPos(origin, facing, horizontalOffset1, horizontalOffset2);
                BlockState targetState = world.getBlockState(targetPos);

                if (!targetPos.equals(origin) && targetState.getHardness(world, targetPos) >= 0.0f) {
                    world.breakBlock(targetPos, true, player);
                    tool.damage(1, player, EquipmentSlot.MAINHAND);
                }
            }
        }
    }

    @Unique
    private BlockPos getTargetPos(BlockPos origin, Direction facing, int horizontalOffset1, int horizontalOffset2) {
        switch (facing) {
            case NORTH:
            case SOUTH:
                return origin.add(horizontalOffset1, horizontalOffset2, 0);
            case EAST:
            case WEST:
                return origin.add(0, horizontalOffset2, horizontalOffset1);
            case UP:
            case DOWN:
                return origin.add(horizontalOffset1, 0, horizontalOffset2);
            default:
                return origin;
        }
    }
}
