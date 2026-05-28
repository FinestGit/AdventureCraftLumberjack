package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.List;

import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

public class LumberjackBlockLoot extends BlockLootSubProvider {

    protected LumberjackBlockLoot(HolderLookup.Provider registries) {
        super(java.util.Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }

    @Override
    protected void generate() {
        dropOther(LumberjackBlocks.LUMBERJACK_OAK_LOG.get(), LumberjackItems.LUMBERJACK_OAK_TIMBER.get());
        dropOther(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG.get(), LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get());
        dropSelf(LumberjackBlocks.COPPER_OAK_PLANK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return List.of(
                LumberjackBlocks.LUMBERJACK_OAK_LOG.get(),
                LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG.get(),
                LumberjackBlocks.COPPER_OAK_PLANK.get());
    }
}
