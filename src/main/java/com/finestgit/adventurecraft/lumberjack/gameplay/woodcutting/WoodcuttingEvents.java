package com.finestgit.adventurecraft.lumberjack.gameplay.woodcutting;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.block.LumberjackBlock;
import com.finestgit.adventurecraft.lumberjack.datagen.LumberjackBlockTagsProvider;
import com.finestgit.adventurecraft.lumberjack.progression.LumberjackAttachments;

import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.block.BreakBlockEvent;

@EventBusSubscriber(modid = AdventureCraftLumberjack.MODID)
public class WoodcuttingEvents {
    @SubscribeEvent
    public static void onBlockBreakEvent(BreakBlockEvent event) {
        // If the event is a client side event, ignore it.
        if (event.getLevel().isClientSide()) {
            return;
        }
        // If the event has been cancelled somehow, ignore it.
        if (event.isCanceled()) {
            return;
        }
        // If the player is not a server player, ignore it.
        if (!(event.getPlayer() instanceof ServerPlayer serverPlayer)) {
            return;
        }
        // If the block is not a Lumberjack Block ignore it.
        if (!(event.getState().getBlock() instanceof LumberjackBlock lumberjackBlock)) {
            return;
        }
        // If it cannot award XP we can ignore it.
        if (!(event.getState().is(LumberjackBlockTagsProvider.WOODCUTTING_XP))) {
            return;
        }
        long baseXpReward = lumberjackBlock.getBaseXpReward();
        // TODO: Handle the case where we need an axe or reward 0 XP
        LumberjackAttachments.get(serverPlayer).addExperience(baseXpReward);
    }
}
