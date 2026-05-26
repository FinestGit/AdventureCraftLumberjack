package com.finestgit.adventurecraft.lumberjack.progression;

import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.neoforged.neoforge.common.util.ValueIOSerializable;

public class LumberjackData implements ValueIOSerializable {
    private long totalExperience;

    public LumberjackData() {

    }

    public long getTotalExperience() {
        return totalExperience;
    }

    public int getLevel() {
        int level = 1;
        long remaining = totalExperience;
        while (level < 999 && remaining >= (long) LumberjackLeveling.costToReachNextLevel(level)) {
            remaining -= (long) LumberjackLeveling.costToReachNextLevel(level);
            level++;
        }
        return level;
    }

    public void addExperience(long amount) {
        totalExperience += amount;
    }

    @Override
    public void serialize(ValueOutput output) {
        output.putLong("experience", totalExperience);
    }

    @Override
    public void deserialize(ValueInput input) {
        totalExperience = input.getLongOr("experience", 0L);
    }
}
