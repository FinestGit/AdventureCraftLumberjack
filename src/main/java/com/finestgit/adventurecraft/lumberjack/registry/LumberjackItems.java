package com.finestgit.adventurecraft.lumberjack.registry;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class LumberjackItems {
    public static final DeferredItem<Item> LUMBERJACK_OAK_TIMBER = ModRegistry.ITEMS
            .registerSimpleItem("lumberjack_oak_timber", () -> new Item.Properties());
    public static final DeferredItem<Item> LUMBERJACK_COPPER_OAK_TIMBER = ModRegistry.ITEMS
            .registerSimpleItem("lumberjack_copper_oak_timber", () -> new Item.Properties());

    public static void register() {

    }
}
