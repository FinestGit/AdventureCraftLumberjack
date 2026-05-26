package com.finestgit.adventurecraft.lumberjack.progression;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent.PlayerLoggedInEvent;

@EventBusSubscriber(modid = AdventureCraftLumberjack.MODID)
public class LumberjackServerEvents {
    @SubscribeEvent
    public static void onPlayerJoined(PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        LumberjackData data = LumberjackAttachments.get(player);
        AdventureCraftLumberjack.LOGGER.info("Player Experience: {}", data.getTotalExperience());
        AdventureCraftLumberjack.LOGGER.info("Player Level: {}", data.getLevel());
    }
}
