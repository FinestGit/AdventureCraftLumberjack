package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.Optional;
import java.util.function.Consumer;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackItems;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.AdvancementRequirements;
import net.minecraft.advancements.AdvancementType;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.advancements.criterion.LootTableTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootTable;

public class LumberjackAdvancementGenerator implements AdvancementSubProvider {

    @Override
    public void generate(HolderLookup.Provider provider, Consumer<AdvancementHolder> saver) {
        firstChop(saver);
    }

    /**
     * "First Chop" - break any lumberjack log that awards woodcutting XP.
     */
    private void firstChop(Consumer<AdvancementHolder> saver) {
        Advancement.Builder builder = Advancement.Builder.advancement()
                .display(
                        LumberjackItems.LUMBERJACK_OAK_TIMBER.get(),
                        Component.translatable("advancements.adventurecraftlumberjack.lumberjack.first_chop.title"),
                        Component
                                .translatable(
                                        "advancements.adventurecraftlumberjack.lumberjack.first_chop.description"),
                        Identifier.fromNamespaceAndPath("minecraft", "gui/advancements/backgrounds/husbandry"),
                        AdvancementType.TASK,
                        true,
                        true,
                        false)
                .requirements(AdvancementRequirements.Strategy.OR);

        builder.addCriterion("got_oak_timber",
                InventoryChangeTrigger.TriggerInstance.hasItems(LumberjackItems.LUMBERJACK_OAK_TIMBER.get()));
        builder.addCriterion("got_copper_timber",
                InventoryChangeTrigger.TriggerInstance.hasItems(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get()));

        saver.accept(builder
                .build(Identifier.fromNamespaceAndPath(AdventureCraftLumberjack.MODID, "lumberjack/first_chop")));
    }
}
