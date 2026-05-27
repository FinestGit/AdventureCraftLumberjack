package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.stream.Stream;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackItems;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class LumberjackModelProvider extends ModelProvider {

    public LumberjackModelProvider(PackOutput output) {
        super(output, AdventureCraftLumberjack.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        // Block models
        blockModels.woodProvider(LumberjackBlocks.LUMBERJACK_OAK_LOG.get())
                .log(LumberjackBlocks.LUMBERJACK_OAK_LOG.get());
        blockModels.woodProvider(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG.get())
                .log(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG.get());

        // Item models
        blockModels.registerSimpleFlatItemModel(LumberjackItems.LUMBERJACK_OAK_TIMBER.get());
        blockModels.registerSimpleFlatItemModel(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get());
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return Stream.of(LumberjackBlocks.LUMBERJACK_OAK_LOG, LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG);
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return Stream.of(LumberjackBlocks.LUMBERJACK_OAK_LOG_ITEM, LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG_ITEM,
                LumberjackItems.LUMBERJACK_OAK_TIMBER, LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER);
    }
}
