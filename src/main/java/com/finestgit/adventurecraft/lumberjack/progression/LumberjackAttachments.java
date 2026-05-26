package com.finestgit.adventurecraft.lumberjack.progression;

import java.util.function.Supplier;

import com.finestgit.adventurecraft.lumberjack.AdventureCraftLumberjack;

import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class LumberjackAttachments {
    private static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister
            .create(NeoForgeRegistries.ATTACHMENT_TYPES, AdventureCraftLumberjack.MODID);

    private static final Supplier<AttachmentType<LumberjackData>> LUMBERJACK_DATA = ATTACHMENT_TYPES.register(
            "lumberjack_data", () -> AttachmentType.serializable(() -> new LumberjackData()).build());

    public static void register(IEventBus modEventBus) {
        ATTACHMENT_TYPES.register(modEventBus);
    }

    public static LumberjackData get(Player player) {
        return player.getData(LUMBERJACK_DATA.get());
    }

    public static void set(Player player, LumberjackData data) {
        player.setData(LUMBERJACK_DATA, data);
    }
}
