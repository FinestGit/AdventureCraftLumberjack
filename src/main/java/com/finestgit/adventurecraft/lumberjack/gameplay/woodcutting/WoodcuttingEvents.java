package com.finestgit.adventurecraft.lumberjack.gameplay.woodcutting;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.progression.LumberjackAttachments;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;

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
        // If it is not a Lumberjack Block we ignore it
        if (!(event.getState().is(LumberjackBlocks.LUMBERJACK_OAK_LOG.get()))) {
            return;
        }
        LumberjackAttachments.get(serverPlayer).addExperience(10L);
    }
}
