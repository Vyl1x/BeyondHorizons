package net.beyond_horizons.data;

import net.beyond_horizons.BeyondHorizons;
import net.beyond_horizons.block.ModBlocks;
import net.beyond_horizons.items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.*;

import java.util.function.Consumer;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModAdvancementGenerator extends FabricAdvancementProvider {

    public ModAdvancementGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<AdvancementEntry> consumer) {
        /** BEYOND HORIZONS PARENT **/
        AdvancementEntry BeyondHorizonsAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.BEYONDHORIZONS, // The display icon
                        Text.literal("Beyond Horizons Mod"), // The title
                        Text.literal("Beyond Horizons Mod"), // The description
                        new Identifier("beyond-horizons:textures/block/darkfire_planks.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        false, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("beyond-horizons", TickCriterion.Conditions.createTick())
                .build(consumer, BeyondHorizons.MOD_ID + "beyond-horizons");

        /** AMULET **/
        AdvancementEntry AmuletsAdvancement = Advancement.Builder.create().parent(BeyondHorizonsAdvancement)
                .display(
                        ModItems.AMULET_OF_THE_TIGER,
                        Text.literal("Collect all types of Amulets"),
                        Text.literal("The Amulets comes with effects!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("amulets", InventoryChangedCriterion.Conditions.items(ModItems.AMULET_OF_THE_TIGER, ModItems.AMULET_OF_THE_CATS))
                .build(consumer, BeyondHorizons.MOD_ID + "/amulets");

        /** ORES **/
        AdvancementEntry OresAdvancement = Advancement.Builder.create().parent(BeyondHorizonsAdvancement)
                .display(
                        ModBlocks.ENDERITE_ORE,
                        Text.literal("Collect all types of ores"),
                        Text.literal("The ores come last!! [Use Silk Touch]"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("ores", InventoryChangedCriterion.Conditions.items(ModBlocks.ENDERITE_ORE,
                        ModBlocks.ENDERITE_COAL_ORE/* , ModBlocks.CRYSTAL_ORE */, ModBlocks.PHOENIXITE_ORE, ModBlocks.CELESTITE_ORE, ModBlocks.RUBY_ORE))
                .build(consumer, BeyondHorizons.MOD_ID + "/ores");
        /** MINE **/
        AdvancementEntry MineCelestiteAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.CELESTITE_ORE,
                        Text.literal("Celestite Ore"),
                        Text.literal("One Celestite ahead!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-celestite", InventoryChangedCriterion.Conditions.items(ModItems.RAW_CELESTITE))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-celestite");
        AdvancementEntry MineRubyAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.RUBY_ORE,
                        Text.literal("Ruby Ore"),
                        Text.literal("The first of many"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-ruby", InventoryChangedCriterion.Conditions.items(ModItems.RUBY))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-ruby");
        AdvancementEntry MineCobaltAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.COBALT_ORE,
                        Text.literal("Cobalt Ore"),
                        Text.literal("The power of the Crystal is coming to you"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-cobalt", InventoryChangedCriterion.Conditions.items(ModItems.COBALT_INGOT))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-cobalt");
        /*
        AdvancementEntry MineCrystalAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.CRYSTAL_ORE,
                        Text.literal("Crystal Ore"),
                        Text.literal("The power of the Crystal is yours"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-crystal", InventoryChangedCriterion.Conditions.items(ModItems.CRYSTAL))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-crystal");
        */
        AdvancementEntry MineEnderiteAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.ENDERITE_ORE,
                        Text.literal("Enderite Ore"),
                        Text.literal("The power of The End"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-enderite", InventoryChangedCriterion.Conditions.items(ModItems.ENDERITE_SCRAP))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-enderite");
        AdvancementEntry MineMythrilAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.MYTHRIL_ORE,
                        Text.literal("Mythril Ore"),
                        Text.literal("Mythril is green"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-mythril", InventoryChangedCriterion.Conditions.items(ModItems.MYTHRIL_INGOT))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-mythril");
        AdvancementEntry MinePhoenixiteAdvancement = Advancement.Builder.create().parent(OresAdvancement)
                .display(
                        ModBlocks.CELESTITE_ORE,
                        Text.literal("Phoenixite Ore"),
                        Text.literal("The fire power is almost yours"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("mine-phoenixite", InventoryChangedCriterion.Conditions.items(ModItems.PHOENIXITE_SCRAP))
                .build(consumer, BeyondHorizons.MOD_ID + "/mine-phoenixite");

        /** SMELT **/
        AdvancementEntry SmeltRawCelestiteAdvancement = Advancement.Builder.create().parent(MineCelestiteAdvancement)
                .display(
                        ModItems.RAW_CELESTITE,
                        Text.literal("Celestite"),
                        Text.literal("The Celestite power is yours"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("smelt-celestite", InventoryChangedCriterion.Conditions.items(ModItems.CELESTITE_INGOT))
                .build(consumer, BeyondHorizons.MOD_ID + "/smelt-celestite");
        AdvancementEntry SmeltScrapPhoenixiteAdvancement = Advancement.Builder.create().parent(MinePhoenixiteAdvancement)
                .display(
                        ModItems.PHOENIXITE_INGOT,
                        Text.literal("Phoenixite"),
                        Text.literal("The fire power is yours"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("smelt-phoenixite", InventoryChangedCriterion.Conditions.items(ModItems.PHOENIXITE_INGOT))
                .build(consumer, BeyondHorizons.MOD_ID + "/smelt-phoenixite");
        AdvancementEntry SmeltScrapEnderiteAdvancement = Advancement.Builder.create().parent(MineEnderiteAdvancement)
                .display(
                        ModItems.ENDERITE_INGOT,
                        Text.literal("Enderite Ingot"),
                        Text.literal("The power of The End comes to you"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("smelt-enderite", InventoryChangedCriterion.Conditions.items(ModItems.ENDERITE_INGOT))
                .build(consumer, BeyondHorizons.MOD_ID + "/smelt-enderite");

        /** ARMOR **/
        AdvancementEntry CelestiteArmorAdvancement = Advancement.Builder.create().parent(SmeltRawCelestiteAdvancement)
                .display(
                        ModItems.CELESTITE_CHESTPLATE,
                        Text.literal("Get Full Celestite Armor"),
                        Text.literal("THIS IS MUCH MORE CELESTITEFULL!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(175))
                .criterion("equip-celestite", InventoryChangedCriterion.Conditions.items(ModItems.CELESTITE_HELMET, ModItems.CELESTITE_CHESTPLATE,
                        ModItems.CELESTITE_LEGGINGS, ModItems.CELESTITE_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-celestite");
        AdvancementEntry RubyArmorAdvancement = Advancement.Builder.create().parent(MineRubyAdvancement)
                .display(
                        ModItems.RUBY_CHESTPLATE,
                        Text.literal("Get Full Ruby Armor"),
                        Text.literal("Good start!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(100))
                .criterion("equip-ruby", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_HELMET, ModItems.RUBY_CHESTPLATE,
                        ModItems.RUBY_LEGGINGS, ModItems.RUBY_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-ruby");
        AdvancementEntry PhoenixiteArmorAdvancement = Advancement.Builder.create().parent(SmeltScrapPhoenixiteAdvancement)
                .display(
                        ModItems.PHOENIXITE_CHESTPLATE,
                        Text.literal("Get Full Phoenixite Armor"),
                        Text.literal("THIS IS POWERFULL!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(125))
                .criterion("equip-phoenixite", InventoryChangedCriterion.Conditions.items(ModItems.PHOENIXITE_HELMET, ModItems.PHOENIXITE_CHESTPLATE,
                        ModItems.PHOENIXITE_LEGGINGS, ModItems.PHOENIXITE_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-phoenixite");
        AdvancementEntry MythrilArmorAdvancement = Advancement.Builder.create().parent(MineMythrilAdvancement)
                .display(
                        ModItems.MYTHRIL_CHESTPLATE,
                        Text.literal("Get Full Mythril Armor"),
                        Text.literal("This is Mythril!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(10))
                .criterion("equip-mythril", InventoryChangedCriterion.Conditions.items(ModItems.MYTHRIL_HELMET, ModItems.MYTHRIL_CHESTPLATE,
                        ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-mythril");
        AdvancementEntry CobaltArmorAdvancement = Advancement.Builder.create().parent(MineCobaltAdvancement)
                .display(
                        ModItems.COBALT_CHESTPLATE,
                        Text.literal("Get Full Cobalt Armor"),
                        Text.literal("This is Cobalt!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(10))
                .criterion("equip-cobalt", InventoryChangedCriterion.Conditions.items(ModItems.COBALT_HELMET, ModItems.COBALT_CHESTPLATE,
                        ModItems.COBALT_LEGGINGS, ModItems.COBALT_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-cobalt");
        AdvancementEntry EnderiteArmorAdvancement = Advancement.Builder.create().parent(SmeltScrapEnderiteAdvancement)
                .display(
                        ModItems.ENDERITE_CHESTPLATE,
                        Text.literal("Get Full Enderite Armor"),
                        Text.literal("THIS IS INCREDIBLE!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(125))
                .criterion("equip-enderite", InventoryChangedCriterion.Conditions.items(ModItems.ENDERITE_HELMET, ModItems.ENDERITE_CHESTPLATE,
                        ModItems.ENDERITE_LEGGINGS, ModItems.ENDERITE_BOOTS))
                .build(consumer, BeyondHorizons.MOD_ID + "/equip-enderite");

        /** FIRST PICKAXE **/
        AdvancementEntry FirstCelestitePickaxeAdvancement = Advancement.Builder.create().parent(SmeltRawCelestiteAdvancement)
                .display(
                        ModItems.CELESTITE_PICKAXE,
                        Text.literal("Get your first Celestite Pickaxe"),
                        Text.literal("THIS IS CELESTIALLL!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(75))
                .criterion("first-/-pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.CELESTITE_PICKAXE))
                .build(consumer, BeyondHorizons.MOD_ID + "/first-celestite-pickaxe");
        AdvancementEntry FirstEnderitePickaxeAdvancement = Advancement.Builder.create().parent(SmeltScrapEnderiteAdvancement)
                .display(
                        ModItems.ENDERITE_PICKAXE,
                        Text.literal("Get your first Enderite Pickaxe"),
                        Text.literal("THIS IS BEAUTIFUL!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(50))
                .criterion("first-enderite-pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.ENDERITE_PICKAXE))
                .build(consumer, BeyondHorizons.MOD_ID + "/first-enderite-pickaxe");
        AdvancementEntry FirstPhoenixitePickaxeAdvancement = Advancement.Builder.create().parent(SmeltScrapPhoenixiteAdvancement)
                .display(
                        ModItems.PHOENIXITE_PICKAXE,
                        Text.literal("Get your first Phoenixite Pickaxe"),
                        Text.literal("THIS IS FIREEEEEE!!!!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(50))
                .criterion("first-phoenixite-pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.PHOENIXITE_PICKAXE))
                .build(consumer, BeyondHorizons.MOD_ID + "/first-phoenixite-pickaxe");
        AdvancementEntry FirstRubyPickaxeAdvancement = Advancement.Builder.create().parent(MineRubyAdvancement)
                .display(
                        ModItems.RUBY_PICKAXE,
                        Text.literal("Get your first Ruby Pickaxe"),
                        Text.literal("The faster you go the better!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.CHALLENGE,
                        true,
                        true,
                        false
                )
                .rewards(AdvancementRewards.Builder.experience(25))
                .criterion("first-ruby-pickaxe", InventoryChangedCriterion.Conditions.items(ModItems.RUBY_PICKAXE))
                .build(consumer, BeyondHorizons.MOD_ID + "/first-ruby-pickaxe");

        /** GET LOGS **/
        AdvancementEntry GetLogsAdvancement = Advancement.Builder.create().parent(BeyondHorizonsAdvancement)
                .display(
                        ModBlocks.DARKFIRE_LOG,
                        Text.literal("Collect all types of Logs"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-logs", InventoryChangedCriterion.Conditions.items(ModBlocks.DARKFIRE_LOG, ModBlocks.NIGHTSHADEGROVE_LOG,
                        ModBlocks.CRYSTALASPEN_LOG, ModBlocks.JUNGLEJADE_LOG, ModBlocks.SHADOWONYXBLOODFLAME_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-logs");
        AdvancementEntry GetCrystalaspenLogAdvancement = Advancement.Builder.create().parent(GetLogsAdvancement)
                .display(
                        ModBlocks.CRYSTALASPEN_LOG,
                        Text.literal("Adventures with cold and crystals to Crystal Aspen log is yours"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-crystalaspen-log", InventoryChangedCriterion.Conditions.items(ModBlocks.CRYSTALASPEN_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-crystalaspen-log");
        AdvancementEntry GetDarkfireLogAdvancement = Advancement.Builder.create().parent(GetLogsAdvancement)
                .display(
                        ModBlocks.DARKFIRE_LOG,
                        Text.literal("The darkness rises from the logs!"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-darkfire-log", InventoryChangedCriterion.Conditions.items(ModBlocks.DARKFIRE_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-darkfire-log");
        AdvancementEntry GetShadowLogAdvancement = Advancement.Builder.create().parent(GetLogsAdvancement)
                .display(
                        ModBlocks.SHADOWONYXBLOODFLAME_LOG,
                        Text.literal("The Shadow log is combining with your soul!"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-shadowonyxbloodflame-log", InventoryChangedCriterion.Conditions.items(ModBlocks.SHADOWONYXBLOODFLAME_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-shadowonyxbloodflame-log");
        AdvancementEntry GetNightshadeGroveLogAdvancement = Advancement.Builder.create().parent(GetLogsAdvancement)
                .display(
                        ModBlocks.NIGHTSHADEGROVE_LOG,
                        Text.literal("Night Groves trough your heart from collecting that Nightshade Grove log"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-nightshadegrove-log", InventoryChangedCriterion.Conditions.items(ModBlocks.NIGHTSHADEGROVE_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-nightshadegrove-log");
        AdvancementEntry GetJungleJadeLogAdvancement = Advancement.Builder.create().parent(GetLogsAdvancement)
                .display(
                        ModBlocks.JUNGLEJADE_LOG,
                        Text.literal("You are becoming the master of climbing green trees"),
                        Text.literal("The logs come first!!"),
                        null, // children to parent advancements don't need a background set
                        AdvancementFrame.GOAL,
                        true,
                        true,
                        false
                )
                .criterion("get-junglejade-log", InventoryChangedCriterion.Conditions.items(ModBlocks.JUNGLEJADE_LOG))
                .build(consumer, BeyondHorizons.MOD_ID + "/get-junglejade-log");
    }
}