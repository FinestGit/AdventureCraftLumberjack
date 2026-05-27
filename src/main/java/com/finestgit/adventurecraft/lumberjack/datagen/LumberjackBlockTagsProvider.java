package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.concurrent.CompletableFuture;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

public class LumberjackBlockTagsProvider extends BlockTagsProvider {
    public static final TagKey<Block> WOODCUTTING_XP = TagKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(AdventureCraftLumberjack.MODID, "woodcutting_xp"));

    public LumberjackBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, AdventureCraftLumberjack.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider lookupProvider) {
        tag(WOODCUTTING_XP).add(LumberjackBlocks.LUMBERJACK_OAK_LOG.get());
        tag(WOODCUTTING_XP).add(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG.get());
    }
}
