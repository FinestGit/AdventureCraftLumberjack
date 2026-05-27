package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

public class LumberjackLootTableProvider extends LootTableProvider {

    public LumberjackLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, Set.of(), List.of(new SubProviderEntry(LumberjackBlockLoot::new, LootContextParamSets.BLOCK)),
                lookupProvider);
    }
}
