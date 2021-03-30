package io.github.geeleonidas.withery.util;

import io.github.geeleonidas.withery.entity.SoulEntity;
import net.minecraft.server.world.ServerWorld;

public interface WitheryLivingEntity {
    void boundSoul(SoulEntity soulEntity);
    void unboundSoul(SoulEntity soulEntity);
    void onLoad(ServerWorld world);
    float getPotentialHealth();
}
