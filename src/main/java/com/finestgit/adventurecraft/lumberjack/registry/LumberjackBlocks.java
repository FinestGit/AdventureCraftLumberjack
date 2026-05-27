package com.finestgit.adventurecraft.lumberjack.registry;

import com.finestgit.adventurecraft.lumberjack.block.LumberjackLogBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class LumberjackBlocks {
        // Block Registration
        public static final DeferredBlock<LumberjackLogBlock> LUMBERJACK_OAK_LOG = ModRegistry.BLOCKS
                        .registerBlock(
                                        "lumberjack_oak_log",
                                        properties -> new LumberjackLogBlock(properties, 1, 10, true),
                                        () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG)
                                                        .mapColor(MapColor.WOOD)
                                                        .sound(SoundType.WOOD)
                                                        .strength(2.0f, 2.0f));

        // Block Item Registration
        public static final DeferredItem<BlockItem> LUMBERJACK_OAK_LOG_ITEM = ModRegistry.ITEMS
                        .registerSimpleBlockItem("lumberjack_oak_log", LUMBERJACK_OAK_LOG);

        public static void register() {
        }
}
