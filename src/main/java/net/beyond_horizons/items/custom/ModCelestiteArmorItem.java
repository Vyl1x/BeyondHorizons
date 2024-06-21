package net.beyond_horizons.items.custom;

import net.beyond_horizons.items.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModCelestiteArmorItem extends ArmorItem {

    /*
    public static final int MAX_CHARGES = 1;
    public static int charges = MAX_CHARGES;
    public static int rechargeTimer;
    public static int MAX_CHARGE_TIME = 8;
    public static int remainingTimeSeconds;
    public static long lastTeleportTime = 0;
    public static long teleportCooldown = 500; // 0.5 seconds in milliseconds
    public static long lastCooldownEndTime;
    public static boolean isTimerRunning = false;
    public static boolean isReadytoCharge = false;
    public static boolean isEffectEnabled = true;
    public static boolean isSoundEnabled = true;
    */


    public ModCelestiteArmorItem(ModArmorMaterials material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        /*
        if (charges < MAX_CHARGES && rechargeTimer == 0 && !isTimerRunning) {
            rechargeTimer = 16 * MAX_CHARGE_TIME * 10; // Set recharge timer to MAX_CHARGE_TIME seconds in ticks
            isTimerRunning = true;
            isReadytoCharge = false;
            BeyondHorizons.LOGGER.info("Recharge timer set to " + rechargeTimer + " ticks (" + MAX_CHARGE_TIME + " seconds)");
        }

        // Decrement the recharge timer every tick
        if (rechargeTimer > 0 && isTimerRunning) {
            rechargeTimer--;
            if (rechargeTimer == 0) {
                BeyondHorizons.LOGGER.info("Recharge timer finished");
                isTimerRunning = false;
                isReadytoCharge = true;
            }
        }
        // Calculate the remaining time in seconds
        remainingTimeSeconds = rechargeTimer / 155;

        // Increment charges when ready to charge
        if (charges < MAX_CHARGES && isReadytoCharge && !isTimerRunning) {
            charges = Math.min(charges + 1, MAX_CHARGES);
            BeyondHorizons.LOGGER.info("Charge given");
        }
        */

        if (!(entity instanceof PlayerEntity)) {
            return;
        }
        PlayerEntity player = (PlayerEntity) entity;

        if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() instanceof ModCelestiteArmorItem) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 1));
        }

        /*
        int maxTeleportDistance = 7;
        if (player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof ModCelestiteArmorItem) {
            if (!world.isClient && entity instanceof PlayerEntity) {
                if (ModHudHandler.isArmorAbilityModeEnabled() && charges == 1 && !isTimerRunning) {
                    if (MinecraftClient.getInstance().options.jumpKey.isPressed()) {
                        long currentTime = System.currentTimeMillis();
                        if (currentTime - lastTeleportTime >= teleportCooldown && currentTime - lastCooldownEndTime >= teleportCooldown) { // check if at least 0.5 seconds have passed since last teleportation and last cooldown end
                            lastTeleportTime = currentTime;
                            double currentY = player.getY();
                            player.setVelocity(player.getVelocity().x, 0.0D, player.getVelocity().z);

                            // Check if there is a solid block up to 3 blocks from the player's forward position
                            int currentDistance = 0;
                            BlockPos targetPos = null;
                            for (int i = 1; i <= maxTeleportDistance; i++) {
                                BlockPos checkPos = player.getBlockPos().offset(player.getHorizontalFacing(), i);
                                if (world.getBlockState(checkPos).isSolidBlock(world, checkPos.up()) && world.getBlockState(checkPos.down()).isAir()) {
                                    targetPos = checkPos;
                                    currentDistance = i;
                                    break;
                                }
                            }

                            if (targetPos != null) {
                                if (currentDistance > maxTeleportDistance) {
                                    player.sendMessage(Text.literal("Teleport distance too far"), true);
                                } else {
                                    int teleportDistance = currentDistance - 1;
                                    BlockPos pos = new BlockPos((int) (player.getX() + player.getRotationVector().x * teleportDistance), (int) currentY, (int) (player.getZ() + player.getRotationVector().z * teleportDistance));
                                    if (!world.getBlockState(pos).isSolidBlock(world, pos)) {
                                        // Teleport above the block
                                        while (!world.getBlockState(pos).isSolidBlock(world, pos)) {
                                            pos = pos.down();
                                        }
                                        pos = pos.up();
                                    }
                                    BlockPos checkPos = pos.down();
                                    if (!world.getBlockState(checkPos).isSolidBlock(world, checkPos.up())) {
                                        player.teleport(pos.getX() + 0.5, pos.getY() + 1.0, pos.getZ() + 0.5);
                                        charges--;
                                        lastCooldownEndTime = currentTime + teleportCooldown; // set the end time of the cooldown period
                                    } else {
                                        player.sendMessage(Text.literal("Cannot teleport to a solid block"), true);
                                    }
                                }
                            } else {
                                int teleportDistance = maxTeleportDistance;
                                BlockPos pos = new BlockPos((int) (player.getX() + player.getRotationVector().x * teleportDistance), (int) currentY, (int) (player.getZ() + player.getRotationVector().z * teleportDistance));
                                if (!world.getBlockState(pos).isSolidBlock(world, pos)) {
                                    // Teleport above the block
                                    while (!world.getBlockState(pos).isSolidBlock(world, pos)) {
                                        pos = pos.down();
                                    }
                                    pos = pos.up();
                                }
                                BlockPos checkPos = pos.down();
                                if (!world.getBlockState(checkPos).isSolidBlock(world, checkPos.up())) {
                                    player.teleport(pos.getX() + 0.5, pos.getY() + 1.0,
                                            pos.getZ() + 0.5);
                                    charges--;
                                    lastCooldownEndTime = currentTime + teleportCooldown; // set the end time of the cooldown period
                                } else {
                                    player.sendMessage(Text.literal("Teleport location blocked"), true);
                                }
                            }
                        }
                    }
                }
            }
        }
        */
    }

    /*
    public static int getCurrentChargeTime() {
        if (charges < MAX_CHARGES) {
            int elapsedTicks = 16 * MAX_CHARGE_TIME * 10 - rechargeTimer;
            return (int) (elapsedTicks / 20.0); // 20 ticks per second
        } else {
            return 200;
        }
    }

     */
}