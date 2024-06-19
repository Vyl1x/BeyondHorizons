package net.beyond_horizons.items.custom;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModSwordItem extends SwordItem {
    public ModSwordItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, (int) attackDamage, attackSpeed, settings);
    }
}
