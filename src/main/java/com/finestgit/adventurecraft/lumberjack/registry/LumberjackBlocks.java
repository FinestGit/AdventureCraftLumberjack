package com.finestgit.adventurecraft.lumberjack.registry;

import com.finestgit.adventurecraft.lumberjack.block.LumberjackBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

public class LumberjackBlocks {
        // Block Registration
        public static final DeferredBlock<LumberjackBlock> LUMBERJACK_OAK_LOG = ModRegistry.BLOCKS
                        .register("lumberjack_oak_log",
                                        () -> new LumberjackBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD)
                                                        .sound(SoundType.WOOD).destroyTime(5f).strength(5f), 1, 10,
                                                        true));

        // Block Item Registration
        public static final DeferredItem<BlockItem> LUMBERJACK_OAK_LOG_ITEM = ModRegistry.ITEMS
                        .registerSimpleBlockItem("lumberjack_oak_log", LUMBERJACK_OAK_LOG);

        public static void register() {
        }
}
