package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.concurrent.CompletableFuture;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = AdventureCraftLumberjack.MODID)
public class AdventureCraftLumberjackDatagen {
    // Client: models, blockstates, item models
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Client: models, blockstates, item models
        generator.addProvider(true, new LumberjackModelProvider(generator.getPackOutput()));
        generator.addProvider(true, new LumberjackLanguageProvider(generator.getPackOutput()));

        // Server: loot tables, tags, recipes, advancements
        generator.addProvider(true, new LumberjackBlockTagsProvider(generator.getPackOutput(), lookupProvider));
        generator.addProvider(true, new LumberjackLootTableProvider(generator.getPackOutput(), lookupProvider));
    }
}
