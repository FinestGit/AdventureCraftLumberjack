package com.finestgit.adventurecraft.lumberjack.block;

import net.minecraft.world.level.block.RotatedPillarBlock;

public class LumberjackLogBlock extends RotatedPillarBlock {
    private int tier;
    private long baseXpReward;
    private boolean allowHandBreak;

    public LumberjackLogBlock(Properties properties, int tier, long baseXpReward, boolean allowHandBreak) {
        super(properties);
        this.tier = tier;
        this.baseXpReward = baseXpReward;
        this.allowHandBreak = allowHandBreak;
    }

    public int getTier() {
        return this.tier;
    }

    public long getBaseXpReward() {
        return this.baseXpReward;
    }

    public boolean getAllowHandBreak() {
        return this.allowHandBreak;
    }
}
