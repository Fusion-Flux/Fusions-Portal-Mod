package com.fusionflux.portalcubed.predicates;

import com.fusionflux.portalcubed.accessor.EntityExt;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParam;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class InFunnelCondition implements LootItemCondition {
    private final Boolean inFunnel;
    private final Boolean inCfg;

    public InFunnelCondition(Boolean inFunnel, Boolean inCfg) {
        this.inFunnel = inFunnel;
        this.inCfg = inCfg;
    }

    @NotNull
    @Override
    public LootItemConditionType getType() {
        return PortalCubedConditions.FUNNEL;
    }

    @NotNull
    @Override
    public Set<LootContextParam<?>> getReferencedContextParams() {
        return ImmutableSet.of(LootContextParams.THIS_ENTITY);
    }

    @Override
    public boolean test(LootContext lootContext) {
        if (inFunnel != null && ((EntityExt)lootContext.getParam(LootContextParams.THIS_ENTITY)).isInFunnel() != inFunnel) {
            return false;
        }
        //noinspection RedundantIfStatement
        if (inCfg != null && ((EntityExt)lootContext.getParam(LootContextParams.THIS_ENTITY)).cfg() != inCfg) {
            return false;
        }
        return true;
    }

    public static class Serializer implements net.minecraft.world.level.storage.loot.Serializer<InFunnelCondition> {
        @Override
        public void serialize(JsonObject json, InFunnelCondition value, JsonSerializationContext serializationContext) {
            json.addProperty("in_funnel", value.inFunnel);
        }

        @NotNull
        @Override
        public InFunnelCondition deserialize(JsonObject json, JsonDeserializationContext serializationContext) {
            if (!json.has("in_funnel") && !json.has("in_cfg")) {
                throw new JsonSyntaxException("portalcubed:funnel condition must have either in_funnel or in_cfg");
            }
            return new InFunnelCondition(
                getAsOptionalBoolean(json, "in_funnel"),
                getAsOptionalBoolean(json, "in_cfg")
            );
        }

        private static Boolean getAsOptionalBoolean(JsonObject json, String name) {
            return json.has(name) ? GsonHelper.convertToBoolean(json.get(name), name) : null;
        }
    }
}
