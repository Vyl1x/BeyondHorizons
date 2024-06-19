package net.beyond_horizons.utils;

import net.beyond_horizons.BeyondHorizonsClient;
import net.beyond_horizons.config.bhserver.BHConfig;
import net.beyond_horizons.items.custom.ModCelestiteMultiToolItem;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class veinMiner {

    public static boolean veinMine(BlockPos pos, World world, Block block, PlayerEntity player, int count) {
        if (count >= 8) { return true; }
        ItemStack tool = player.getStackInHand(Hand.MAIN_HAND);
        if (tool.isEmpty() || !(tool.getItem() instanceof ModCelestiteMultiToolItem)) {
            return true;
        }
        boolean continueMining = true;
        for (Direction dir : Direction.values()) {
            BlockPos neighborPos = pos.offset(dir);
            BlockState neighborState = world.getBlockState(neighborPos);

            if (neighborState.isOf(block)) {
                world.breakBlock(neighborPos, true, player);
                tool.damage(1, player, (p) -> p.sendToolBreakStatus(Hand.MAIN_HAND));
                //veinMine(neighborPos, world, block, player, count + 1);  // Increment counter
                if(count < 8){
                    continueMining &= veinMine(pos.up(), world, block, player, count + 1);
                    continueMining &= veinMine(pos.down(), world, block, player, count + 1);
                    continueMining &= veinMine(pos.north(), world, block, player, count + 1);
                    continueMining &= veinMine(pos.south(), world, block, player, count + 1);
                    continueMining &= veinMine(pos.west(), world, block, player, count + 1);
                    continueMining &= veinMine(pos.east(), world, block, player, count + 1);
                }
            }
        }
        return continueMining;
    }
}
