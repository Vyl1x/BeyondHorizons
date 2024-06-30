package net.beyond_horizons.items.custom;

import net.beyond_horizons.utils.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import static net.beyond_horizons.items.ModItems.CELESTITE_MULTI_TOOL;

public class ModMultiToolItem extends MiningToolItem {
    public ModMultiToolItem(ToolMaterial material, Settings settings) {
        super(material, ModTags.Blocks.MULTITOOL, settings);
    }
}