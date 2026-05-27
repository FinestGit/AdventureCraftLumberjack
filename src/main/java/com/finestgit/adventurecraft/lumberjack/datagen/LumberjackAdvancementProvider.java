package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.advancements.AdvancementProvider;

public class LumberjackAdvancementProvider extends AdvancementProvider {
    public LumberjackAdvancementProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, List.of(new LumberjackAdvancementGenerator()));
    }
}
