package net.beyond_horizons.block.custom;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.PressurePlateBlock;

public class ModPressurePlateBlock extends PressurePlateBlock {
    public ModPressurePlateBlock(BlockSetType.ActivationRule type, Settings settings, BlockSetType blockSetType) {
        super(blockSetType, settings);
    }
}
