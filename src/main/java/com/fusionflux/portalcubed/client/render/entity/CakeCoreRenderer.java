package com.fusionflux.portalcubed.client.render.entity;

import com.fusionflux.portalcubed.PortalCubed;
import com.fusionflux.portalcubed.client.render.EmissiveFeatureRenderer;
import com.fusionflux.portalcubed.client.render.entity.model.CakeCoreModel;
import com.fusionflux.portalcubed.entity.CakeCoreEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CakeCoreRenderer extends MobEntityRenderer<CakeCoreEntity, CakeCoreModel> {

    private static final Identifier TEXTURE = new Identifier(PortalCubed.MOD_ID, "textures/entity/portal_1_cores.png");

    public CakeCoreRenderer(EntityRendererFactory.Context context) {
        super(context, new CakeCoreModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(CakeCoreModel.CAKE_CORE_LAYER)), 0.5f);
        this.addFeature(new EmissiveFeatureRenderer<>(this) {

            private static final Identifier EMISSIVE_TEXTURE = new Identifier(PortalCubed.MOD_ID, "textures/entity/portal_1_cores_e.png");

            @Override
            public Identifier getEmissiveTexture(CakeCoreEntity entity) {
                return EMISSIVE_TEXTURE;
            }

        });
    }

    @Override
    public Identifier getTexture(CakeCoreEntity entity) {
        return TEXTURE;
    }

}