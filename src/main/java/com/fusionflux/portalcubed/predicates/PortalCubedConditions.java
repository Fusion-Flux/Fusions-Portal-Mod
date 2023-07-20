package com.fusionflux.portalcubed.predicates;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

import static com.fusionflux.portalcubed.PortalCubed.id;

public class PortalCubedConditions {
    public static final LootItemConditionType FUNNEL = new LootItemConditionType(new InFunnelCondition.Serializer());

    public static void register() {
        Registry.register(BuiltInRegistries.LOOT_CONDITION_TYPE, id("funnel"), FUNNEL);
    }
}
