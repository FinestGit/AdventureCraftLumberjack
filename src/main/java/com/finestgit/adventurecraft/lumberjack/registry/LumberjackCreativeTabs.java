package com.finestgit.adventurecraft.lumberjack.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;

public class LumberjackCreativeTabs {
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> LUMBERJACK_LOGS_TAB = ModRegistry.CREATIVE_MODE_TABS
            .register("lumberjack_logs", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.adventurecraftlumberjack.lumberjack_logs"))
                    .icon(() -> LumberjackBlocks.LUMBERJACK_OAK_LOG_ITEM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(LumberjackBlocks.LUMBERJACK_OAK_LOG_ITEM.get());
                        output.accept(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG_ITEM.get());
                    })
                    .build());

    public static void register() {

    }
}
