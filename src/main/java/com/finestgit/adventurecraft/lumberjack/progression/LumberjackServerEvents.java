package com.finestgit.adventurecraft.lumberjack.progression;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.minecraft.server.level.ServerPlayer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.server.ServerStartedEvent;

@EventBusSubscriber(modid = AdventureCraftLumberjack.MODID)
public class LumberjackServerEvents {
    @SubscribeEvent
    public static void onServerStarting(ServerStartedEvent event) {
        AdventureCraftLumberjack.LOGGER.info("Server started; players online: {}",
                event.getServer().getPlayerList().getPlayerCount());
        for (ServerPlayer player : event.getServer().getPlayerList().getPlayers()) {
            LumberjackData data = LumberjackAttachments.get(player);
            AdventureCraftLumberjack.LOGGER.info("Player Experience: {}", data.getTotalExperience());
            AdventureCraftLumberjack.LOGGER.info("Player Level: {}", data.getLevel());
        }
    }
}
