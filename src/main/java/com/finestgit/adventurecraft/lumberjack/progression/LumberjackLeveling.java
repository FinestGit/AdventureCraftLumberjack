package com.finestgit.adventurecraft.lumberjack.progression;

public class LumberjackLeveling {
    private static int BASE = 100;
    private static float LEVELING_EXPONENT = 1.5f;

    public static int costToReachNextLevel(int level) {
        return BASE * ((int) Math.pow(level, LEVELING_EXPONENT));
    }
}
