package net.beyond_horizons.items.custom;

import net.beyond_horizons.utils.ModTags;
import net.beyond_horizons.utils.veinMiner;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.ToolMaterial;

import java.util.List;

public class ModCelestiteMultiToolItem extends MiningToolItem {
    public ModCelestiteMultiToolItem(ToolMaterial material, Settings settings) {
        super(material, ModTags.Blocks.MULTITOOL, settings);
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
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);

        // Add custom tooltips here
        tooltip.add(Text.literal("Has vein miner that works on: Ores, Leaves, Logs").formatted(Formatting.YELLOW));

        int fortuneLevel = EnchantmentHelper.getLevel((RegistryEntry<Enchantment>) Enchantments.FORTUNE, stack);
        if (fortuneLevel > 0) {
            tooltip.add(Text.literal("Currently fortune only works with the first connected block.").formatted(Formatting.RED));
        }
    }
}
