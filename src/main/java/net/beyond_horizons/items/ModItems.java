package net.beyond_horizons.items;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.items.custom.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item BEYONDHORIZONS = registerItem("beyondhorizons",
            new Item(new Item.Settings()));

    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));
    public static final Item PHOENIXITE_INGOT = registerItem("phoenixite_ingot",
            new Item(new Item.Settings()));

    public static final Item ENDERITE_INGOT = registerItem("enderite_ingot",
            new Item(new Item.Settings()));
    public static final Item CELESTITE_INGOT = registerItem("celestite_ingot",
            new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new Item.Settings()));

    public static final Item COBALT_INGOT = registerItem("cobalt_ingot",
            new Item(new Item.Settings()));


    public static final Item ENDERITE_SCRAP = registerItem("enderite_scrap",
            new Item(new Item.Settings()));
    public static final Item PHOENIXITE_SCRAP = registerItem("phoenixite_scrap",
            new Item(new Item.Settings()));

    public static final Item ENDERITE_COAL = registerItem("enderite_coal",
            new Item(new Item.Settings()));

    public static final Item RAW_CELESTITE = registerItem("raw_celestite",
            new Item(new Item.Settings()));

    public static final Item DIMENSIONAL_TEMPLATE = registerItem("dimensional_template",
            new Item(new Item.Settings()));

    public static final Item AMULET_OF_THE_TIGER = registerItem("amulet_of_the_tiger",
            new AmuletOfTheTiger(new Item.Settings()));
    public static final Item AMULET_OF_THE_CATS = registerItem("amulet_of_the_cat",
            new AmuletOfTheCat(new Item.Settings()));

    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new ModSwordItem(ModToolMaterials.Ruby, (new Item.Settings())
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Ruby, 4, -2.25F))));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Ruby, (new Item.Settings())
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Ruby, 2.0F, -2.65F))));
    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterials.Ruby, (new Item.Settings())
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Ruby, 6.0F, -2.85F))));
    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ModShovelItem(ModToolMaterials.Ruby, (new Item.Settings())
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Ruby, 3.0F, -2.85F))));
    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterials.Ruby, (new Item.Settings())
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Ruby, -2.4F, 0.2F))));

    public static final Item MYTHRIL_SWORD = registerItem("mythril_sword",
            new ModSwordItem(ModToolMaterials.Mythril, (new Item.Settings())
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Mythril, 4, -2.25F))));
    public static final Item MYTHRIL_PICKAXE = registerItem("mythril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Mythril, (new Item.Settings())
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Mythril, 2.0F, -2.65F))));
    public static final Item MYTHRIL_AXE = registerItem("mythril_axe",
            new ModAxeItem(ModToolMaterials.Mythril, (new Item.Settings())
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Mythril, 6.0F, -2.85F))));
    public static final Item MYTHRIL_SHOVEL = registerItem("mythril_shovel",
            new ModShovelItem(ModToolMaterials.Mythril, (new Item.Settings())
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Mythril, 3.0F, -2.85F))));
    public static final Item MYTHRIL_HOE = registerItem("mythril_hoe",
            new ModHoeItem(ModToolMaterials.Mythril, (new Item.Settings())
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Mythril, -2.4F, 0.2F))));

    public static final Item COBALT_SWORD = registerItem("cobalt_sword",
            new ModSwordItem(ModToolMaterials.Cobalt, (new Item.Settings())
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Cobalt, 4, -2.25F))));
    public static final Item COBALT_PICKAXE = registerItem("cobalt_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Cobalt, (new Item.Settings())
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Cobalt, 2.0F, -2.65F))));
    public static final Item COBALT_AXE = registerItem("cobalt_axe",
            new ModAxeItem(ModToolMaterials.Cobalt, (new Item.Settings())
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Cobalt, 6.0F, -2.85F))));
    public static final Item COBALT_SHOVEL = registerItem("cobalt_shovel",
            new ModShovelItem(ModToolMaterials.Cobalt, (new Item.Settings())
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Cobalt, 3.0F, -2.85F))));
    public static final Item COBALT_HOE = registerItem("cobalt_hoe",
            new ModHoeItem(ModToolMaterials.Cobalt, (new Item.Settings())
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Cobalt, -2.4F, 0.2F))));
    public static final Item COBALT_BOW = registerItem("cobalt_bow",
            new BowItem(new Item.Settings().maxDamage(640)));

    //Multi Tool
    public static final Item RUBY_MULTI_TOOL = registerItem("ruby_multi_tool",
            new ModMultiToolItem(ModToolMaterials.RubyMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.RubyMT, 5.0F, -2.3F))));
    public static final Item ENDERITE_MULTI_TOOL = registerItem("enderite_multi_tool",
            new ModMultiToolItem(ModToolMaterials.EnderiteMT, (new Item.Settings()).fireproof()
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.EnderiteMT, 10.0F, -1.4F))));
    public static final Item PHOENIXITE_MULTI_TOOL = registerItem("phoenixite_multi_tool",
            new ModMultiToolItem(ModToolMaterials.PhoenixiteMT, (new Item.Settings()).fireproof()
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.PhoenixiteMT, 8.5F, -1.6F))));
    public static final Item CELESTITE_MULTI_TOOL = registerItem("celestite_multi_tool",
            new ModMultiToolItem(ModToolMaterials.CelestiteMT, (new Item.Settings()).fireproof()
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.CelestiteMT, 11.0F, -1.2F))));
    public static final Item COBALT_MULTI_TOOL = registerItem("cobalt_multi_tool",
            new ModMultiToolItem(ModToolMaterials.CobaltMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.CobaltMT, 6.0F, -2.1F))));
    public static final Item MYTHRIL_MULTI_TOOL = registerItem("mythril_multi_tool",
            new ModMultiToolItem(ModToolMaterials.MythrilMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.MythrilMT, 6.5F, -2.0F))));

    //Vanilla
    public static final Item WOODEN_MULTI_TOOL = registerItem("wooden_multi_tool",
            new ModMultiToolItem(ModToolMaterials.WoodenMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.WoodenMT, 2.0F, -2.8F))));
    public static final Item STONE_MULTI_TOOL = registerItem("stone_multi_tool",
            new ModMultiToolItem(ModToolMaterials.StoneMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.StoneMT, 3.5F, -2.65F))));
    public static final Item GOLD_MULTI_TOOL = registerItem("gold_multi_tool",
            new ModMultiToolItem(ModToolMaterials.GoldMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.GoldMT, 3.0F, -2.2F))));
    public static final Item IRON_MULTI_TOOL = registerItem("iron_multi_tool",
            new ModMultiToolItem(ModToolMaterials.IronMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.IronMT, 4.5F, -2.5F))));
    public static final Item DIAMOND_MULTI_TOOL = registerItem("diamond_multi_tool",
            new ModMultiToolItem(ModToolMaterials.DiamondMT, (new Item.Settings())
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.DiamondMT, 6.0F, -2.25F))));
    public static final Item NETHERITE_MULTI_TOOL = registerItem("netherite_multi_tool",
            new ModMultiToolItem(ModToolMaterials.NetheriteMT, (new Item.Settings()).fireproof()
                    .attributeModifiers(MiningToolItem.createAttributeModifiers(ModToolMaterials.NetheriteMT, 7.0F, -1.9F))));


    public static final Item ENDERITE_SWORD = registerItem("enderite_sword",
            new ModSwordItem(ModToolMaterials.Enderite, (new Item.Settings()).fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Enderite, 5, -2.3F))));
    public static final Item ENDERITE_PICKAXE = registerItem("enderite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Enderite, (new Item.Settings()).fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Enderite, 5.0F, -2.7F))));
    public static final Item ENDERITE_AXE = registerItem("enderite_axe",
            new ModAxeItem(ModToolMaterials.Enderite, (new Item.Settings()).fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Enderite, 9.0F, -2.9F))));
    public static final Item ENDERITE_SHOVEL = registerItem("enderite_shovel",
            new ModShovelItem(ModToolMaterials.Enderite, (new Item.Settings()).fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Enderite, 3.5F, -2.9F))));
    public static final Item ENDERITE_HOE = registerItem("enderite_hoe",
            new ModHoeItem(ModToolMaterials.Enderite, (new Item.Settings()).fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Enderite, -2.4F, 0.1F))));

    public static final Item PHOENIXITE_SWORD = registerItem("phoenixite_sword",
            new ModSwordItem(ModToolMaterials.Phoenixite, (new Item.Settings()).fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Phoenixite, 6, -2.35F))));
    public static final Item PHOENIXITE_PICKAXE = registerItem("phoenixite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Phoenixite, (new Item.Settings()).fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Phoenixite, 5.0F, -2.75F))));
    public static final Item PHOENIXITE_AXE = registerItem("phoenixite_axe",
            new ModAxeItem(ModToolMaterials.Phoenixite, (new Item.Settings()).fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Phoenixite, 10.0F, -2.95F))));
    public static final Item PHOENIXITE_SHOVEL = registerItem("phoenixite_shovel",
            new ModShovelItem(ModToolMaterials.Phoenixite, (new Item.Settings()).fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Phoenixite, 3.4F, -2.95F))));
    public static final Item PHOENIXITE_HOE = registerItem("phoenixite_hoe",
            new ModHoeItem(ModToolMaterials.Phoenixite, (new Item.Settings()).fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Phoenixite, -2.5F, 0.1F))));

    public static final Item CELESTITE_SWORD = registerItem("celestite_sword",
            new ModSwordItem(ModToolMaterials.Celestite, (new Item.Settings()).fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.Celestite, 7, -2.45F))));
    public static final Item CELESTITE_PICKAXE = registerItem("celestite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.Celestite, (new Item.Settings()).fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.Celestite, 6.0F, -2.95F))));
    public static final Item CELESTITE_AXE = registerItem("celestite_axe",
            new ModAxeItem(ModToolMaterials.Celestite, (new Item.Settings()).fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.Celestite, 11.0F, -3.15F))));
    public static final Item CELESTITE_SHOVEL = registerItem("celestite_shovel",
            new ModShovelItem(ModToolMaterials.Celestite, (new Item.Settings()).fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.Celestite, 4.4F, -3.15F))));
    public static final Item CELESTITE_HOE = registerItem("celestite_hoe",
            new ModHoeItem(ModToolMaterials.Celestite, (new Item.Settings()).fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.Celestite,-1.5F, 0.1F))));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(ModArmorMaterial.Ruby, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(22))));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.Ruby, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(22))));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.Ruby, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(22))));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.Ruby, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(22))));
    public static final Item ENDERITE_HELMET = registerItem("enderite_helmet",
            new ArmorItem(ModArmorMaterial.Enderite, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(43))));
    public static final Item ENDERITE_CHESTPLATE = registerItem("enderite_chestplate",
            new ArmorItem(ModArmorMaterial.Enderite, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(43))));
    public static final Item ENDERITE_LEGGINGS = registerItem("enderite_leggings",
            new ArmorItem(ModArmorMaterial.Enderite, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(43))));
    public static final Item ENDERITE_BOOTS = registerItem("enderite_boots",
            new ArmorItem(ModArmorMaterial.Enderite, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(43))));
    public static final Item PHOENIXITE_HELMET = registerItem("phoenixite_helmet",
            new ArmorItem(ModArmorMaterial.Phoenixite, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(43))));
    public static final Item PHOENIXITE_CHESTPLATE = registerItem("phoenixite_chestplate",
            new ArmorItem(ModArmorMaterial.Phoenixite, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(43))));
    public static final Item PHOENIXITE_LEGGINGS = registerItem("phoenixite_leggings",
            new ArmorItem(ModArmorMaterial.Phoenixite, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(43))));
    public static final Item PHOENIXITE_BOOTS = registerItem("phoenixite_boots",
            new ArmorItem(ModArmorMaterial.Phoenixite, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(43))));
    public static final Item CELESTITE_HELMET = registerItem("celestite_helmet",
            new ModCelestiteArmorItem(ModArmorMaterials.Celestite, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(46))));
    public static final Item CELESTITE_CHESTPLATE = registerItem("celestite_chestplate",
            new ModCelestiteArmorItem(ModArmorMaterials.Celestite, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(46))));
    public static final Item CELESTITE_LEGGINGS = registerItem("celestite_leggings",
            new ModCelestiteArmorItem(ModArmorMaterials.Celestite, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(46))));
    public static final Item CELESTITE_BOOTS = registerItem("celestite_boots",
            new ModCelestiteArmorItem(ModArmorMaterials.Celestite, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(46))));
    public static final Item COBALT_HELMET = registerItem("cobalt_helmet",
            new ArmorItem(ModArmorMaterial.Cobalt, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(36))));
    public static final Item COBALT_CHESTPLATE = registerItem("cobalt_chestplate",
            new ArmorItem(ModArmorMaterial.Cobalt, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(36))));
    public static final Item COBALT_LEGGINGS = registerItem("cobalt_leggings",
            new ArmorItem(ModArmorMaterial.Cobalt, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(36))));
    public static final Item COBALT_BOOTS = registerItem("cobalt_boots",
            new ArmorItem(ModArmorMaterial.Cobalt, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(36))));
    public static final Item MYTHRIL_HELMET = registerItem("mythril_helmet",
            new ArmorItem(ModArmorMaterial.Mythril, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(39))));
    public static final Item MYTHRIL_CHESTPLATE = registerItem("mythril_chestplate",
            new ArmorItem(ModArmorMaterial.Mythril, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(39))));
    public static final Item MYTHRIL_LEGGINGS = registerItem("mythril_leggings",
            new ArmorItem(ModArmorMaterial.Mythril, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(39))));
    public static final Item MYTHRIL_BOOTS = registerItem("mythril_boots",
            new ArmorItem(ModArmorMaterial.Mythril, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(39))));

    public static void addItemsToItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(PHOENIXITE_INGOT);
        entries.add(PHOENIXITE_SCRAP);
        entries.add(ENDERITE_INGOT);
        entries.add(MYTHRIL_INGOT);
        entries.add(ENDERITE_SCRAP);
        entries.add(ENDERITE_COAL);

        entries.add(COBALT_INGOT);

        entries.add(RAW_CELESTITE);
        entries.add(CELESTITE_INGOT);
        entries.add(DIMENSIONAL_TEMPLATE);
        entries.add(AMULET_OF_THE_TIGER);
        entries.add(AMULET_OF_THE_CATS);

        entries.add(ENDERITE_SWORD);
        entries.add(ENDERITE_AXE);
        entries.add(ENDERITE_PICKAXE);
        entries.add(ENDERITE_SHOVEL);
        entries.add(ENDERITE_HOE);
        entries.add(RUBY_SWORD);
        entries.add(RUBY_AXE);
        entries.add(RUBY_PICKAXE);
        entries.add(RUBY_SHOVEL);
        entries.add(RUBY_HOE);
        entries.add(PHOENIXITE_SWORD);
        entries.add(PHOENIXITE_AXE);
        entries.add(PHOENIXITE_PICKAXE);
        entries.add(PHOENIXITE_SHOVEL);
        entries.add(PHOENIXITE_HOE);
        entries.add(CELESTITE_SWORD);
        entries.add(CELESTITE_AXE);
        entries.add(CELESTITE_PICKAXE);
        entries.add(CELESTITE_SHOVEL);
        entries.add(CELESTITE_HOE);
        entries.add(MYTHRIL_SWORD);
        entries.add(MYTHRIL_AXE);
        entries.add(MYTHRIL_PICKAXE);
        entries.add(MYTHRIL_SHOVEL);
        entries.add(MYTHRIL_HOE);

        entries.add(COBALT_MULTI_TOOL);

        entries.add(ENDERITE_HELMET);
        entries.add(ENDERITE_CHESTPLATE);
        entries.add(ENDERITE_LEGGINGS);
        entries.add(ENDERITE_BOOTS);
        entries.add(RUBY_HELMET);
        entries.add(RUBY_CHESTPLATE);
        entries.add(RUBY_LEGGINGS);
        entries.add(RUBY_BOOTS);
        entries.add(PHOENIXITE_HELMET);
        entries.add(PHOENIXITE_CHESTPLATE);
        entries.add(PHOENIXITE_LEGGINGS);
        entries.add(PHOENIXITE_BOOTS);
        entries.add(CELESTITE_HELMET);
        entries.add(CELESTITE_CHESTPLATE);
        entries.add(CELESTITE_LEGGINGS);
        entries.add(CELESTITE_BOOTS);
        entries.add(MYTHRIL_HELMET);
        entries.add(MYTHRIL_CHESTPLATE);
        entries.add(MYTHRIL_LEGGINGS);
        entries.add(MYTHRIL_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BeyondHorizons.MOD_ID, name), item);
    }
    public static void registerModItems() {
        BeyondHorizons.LOGGER.info("Registering Mod Items for " + BeyondHorizons.MOD_ID);
    }
}
