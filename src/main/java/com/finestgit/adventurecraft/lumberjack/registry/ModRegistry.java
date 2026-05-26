package com.finestgit.adventurecraft.lumberjack.registry;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AdventureCraftLumberjack.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AdventureCraftLumberjack.MODID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, AdventureCraftLumberjack.MODID);

    public static void register(IEventBus modEventBus) {
        LumberjackBlocks.register();
        LumberjackCreativeTabs.register();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
