package com.finestgit.adventurecraft.lumberjack.gameplay.woodcutting;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.block.BreakBlockEvent;

@EventBusSubscriber(modid = AdventureCraftLumberjack.MODID)
public class WoodcuttingEvents {
    @SubscribeEvent
    public static void onBlockBreakEvent(BreakBlockEvent event) {
    }
}
