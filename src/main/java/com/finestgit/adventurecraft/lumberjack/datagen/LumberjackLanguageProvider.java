package com.finestgit.adventurecraft.lumberjack.datagen;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackItems;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class LumberjackLanguageProvider extends LanguageProvider {

    public LumberjackLanguageProvider(PackOutput output) {
        super(output, AdventureCraftLumberjack.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Blocks
        addBlock(LumberjackBlocks.LUMBERJACK_OAK_LOG, "Lumberjack Oak Log");
        addBlock(LumberjackBlocks.LUMBERJACK_COPPER_OAK_LOG, "Lumberjack Copper Oak Log");

        // Items
        addItem(LumberjackItems.LUMBERJACK_OAK_TIMBER, "Oak Timber");
        addItem(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER, "Copper Oak Timber");

        // Creative Tabs
        add("itemGroup.adventurecraftlumberjack.lumberjack_logs", "AdventureCraft Lumberjack Logs");
        add("itemGroup.adventurecraftlumberjack.lumberjack_items", "AdventureCraft Lumberjack Items");

        // Advancements
        add("advancements.adventurecraftlumberjack.lumberjack.first_chop.title", "First Chop");
        add("advancements.adventurecraftlumberjack.lumberjack.first_chop.description",
                "Break a Lumberjack Log and collect timber.");
    }
}
