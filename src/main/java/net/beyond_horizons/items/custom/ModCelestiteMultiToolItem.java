package net.beyond_horizons.items.custom;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation.Nullable;
import net.beyond_horizons.utils.ModTags;
import net.beyond_horizons.utils.veinMiner;
import net.minecraft.block.BlockState;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.ToolMaterial;

import java.util.List;

public class ModCelestiteMultiToolItem extends MiningToolItem {
    public ModCelestiteMultiToolItem(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.MULTITOOL, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (state.isIn(ModTags.Blocks.ORES) || state.isIn(ModTags.Blocks.LOGS) || state.isIn(ModTags.Blocks.LEAVES)) {
            veinMiner.veinMine(pos, world, state.getBlock(), (PlayerEntity) miner, 1);
        }
        //if (config.radiusActivation){
            //radiusMiner.radiusMine(stack, pos, world, miner);
        //}
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);

        // Add custom tooltips here
        tooltip.add(Text.literal("Has vein miner that works on: Ores, Leaves, Logs").formatted(Formatting.YELLOW));

        int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack);
        if (fortuneLevel > 0) {
            tooltip.add(Text.literal("Currently fortune only works with the first connected block.").formatted(Formatting.RED));
        }
    }
}
