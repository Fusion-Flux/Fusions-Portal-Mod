// Made with Blockbench 4.0.4
// Exported for Minecraft version 1.17
// Paste this class into your mod and generate all required imports

package com.fusionflux.portalcubed.client.render.entity.model;

import com.fusionflux.portalcubed.entity.MugEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

import static com.fusionflux.portalcubed.PortalCubed.id;

public class MugModel extends FizzleableModel<MugEntity> {
    public static final ModelLayerLocation MUG_LAYER = new ModelLayerLocation(id("mug"), "main");
    @SuppressWarnings("checkstyle:MemberName")
    private final ModelPart bb_main;

    public MugModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition getTexturedModelData() {
        MeshDefinition modelData = new MeshDefinition();
        PartDefinition modelPartData = modelData.getRoot();
        PartDefinition bone = modelPartData.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -2.0F, -1.25F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.01F))
                .texOffs(2, 2).mirror().addBox(1.5F, 2.0F, 0.25F, -3.0F, -4.0F, -3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 22.0F, -0.25F, 0.0F, 3.1416F, 0.0F));

        bone.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 7).addBox(0.5F, -1.5F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.25F, 0.0F, 1.5708F, 0.0F));
        return LayerDefinition.create(modelData, 16, 16);
    }

    @Override
    public void renderFizzled(PoseStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

}
