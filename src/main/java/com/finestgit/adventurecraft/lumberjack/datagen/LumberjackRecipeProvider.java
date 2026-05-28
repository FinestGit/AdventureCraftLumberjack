package com.finestgit.adventurecraft.lumberjack.datagen;

import java.util.concurrent.CompletableFuture;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackBlocks;
import com.finestgit.adventurecraft.lumberjack.registry.LumberjackItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Recipe;

public class LumberjackRecipeProvider extends RecipeProvider {
    ResourceKey<Recipe<?>> timber_to_planks_id = ResourceKey.create(Registries.RECIPE,
            Identifier.fromNamespaceAndPath(AdventureCraftLumberjack.MODID, "oak_planks_from_timber"));

    protected LumberjackRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        shapeless(RecipeCategory.BUILDING_BLOCKS, Items.OAK_PLANKS, 4)
                .requires(LumberjackItems.LUMBERJACK_OAK_TIMBER.get())
                .unlockedBy("has_oak_timber", has(LumberjackItems.LUMBERJACK_OAK_TIMBER.get()))
                .save(output, timber_to_planks_id);
        shapeless(RecipeCategory.BUILDING_BLOCKS, LumberjackBlocks.COPPER_OAK_PLANK, 4)
                .requires(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get())
                .unlockedBy("has_copper_timber", has(LumberjackItems.LUMBERJACK_COPPER_OAK_TIMBER.get()))
                .save(output, timber_to_planks_id);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
            super(output, lookupProvider);
        }

        @Override
        public String getName() {
            return "Lumberjack Recipes";
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new LumberjackRecipeProvider(registries, output);
        }
    }
}
