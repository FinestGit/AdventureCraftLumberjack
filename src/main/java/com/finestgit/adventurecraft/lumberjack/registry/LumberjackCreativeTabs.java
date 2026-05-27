package com.finestgit.adventurecraft.lumberjack.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;

public class LumberjackCreativeTabs {
    // Holds all our Log Items
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LUMBERJACK_LOGS_TAB = ModRegistry.CREATIVE_MODE_TABS
            .register("lumberjack_logs", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.adventurecraftlumberjack.lumberjack_logs"))
                    .icon(() -> LumberjackBlocks.LUMBERJACK_OAK_LOG_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(LumberjackBlocks.LUMBERJACK_OAK_LOG_ITEM.get());
                        output.accept(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG_ITEM.get());
                    })
                    .build());

    // Holds all of our normal Items
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LUMBERJACK_ITEMS_TAB = ModRegistry.CREATIVE_MODE_TABS
            .register("lumberjack_items", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.adventurecraftlumberjack.lumberjack_items"))
                    .icon(() -> LumberjackItems.LUMBERJACK_OAK_TIMBER.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(LumberjackItems.LUMBERJACK_OAK_TIMBER.get());
                        output.accept(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get());
                    })
                    .build());

    public static void register() {

    }
}
