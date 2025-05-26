package com.unusualmodding.opposing_force.client.models.entity;

import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;

@OnlyIn(Dist.CLIENT)
@SuppressWarnings("FieldCanBeLocal, unused")
public class EmeraldfishModel <T extends Entity> extends HierarchicalModel<T> {

    private static final int BODY_COUNT = 7;
    private final ModelPart root;
    private final ModelPart[] bodyParts = new ModelPart[7];
    private final ModelPart[] bodyLayers = new ModelPart[3];
    private static final int[][] BODY_SIZES = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] BODY_TEXS = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public EmeraldfishModel(ModelPart pRoot) {
        this.root = pRoot;
        Arrays.setAll(this.bodyParts, (p_170939_) -> pRoot.getChild(getSegmentName(p_170939_)));
        Arrays.setAll(this.bodyLayers, (p_170933_) -> pRoot.getChild(getLayerName(p_170933_)));
    }

    private static String getLayerName(int pIndex) {
        return "layer" + pIndex;
    }

    private static String getSegmentName(int pIndex) {
        return "segment" + pIndex;
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshDefinition = new MeshDefinition();
        PartDefinition partDefinition = meshDefinition.getRoot();
        float[] $$2 = new float[7];
        float $$3 = -3.5F;

        for(int $$4 = 0; $$4 < 7; ++$$4) {
            partDefinition.addOrReplaceChild(getSegmentName($$4), CubeListBuilder.create().texOffs(BODY_TEXS[$$4][0], BODY_TEXS[$$4][1]).addBox((float)BODY_SIZES[$$4][0] * -0.5F, 0.0F, (float)BODY_SIZES[$$4][2] * -0.5F, (float)BODY_SIZES[$$4][0], (float)BODY_SIZES[$$4][1], (float)BODY_SIZES[$$4][2]), PartPose.offset(0.0F, (float)(24 - BODY_SIZES[$$4][1]), $$3));
            $$2[$$4] = $$3;
            if ($$4 < 6) {
                $$3 += (float)(BODY_SIZES[$$4][2] + BODY_SIZES[$$4 + 1][2]) * 0.5F;
            }
        }
        partDefinition.addOrReplaceChild(getLayerName(0), CubeListBuilder.create().texOffs(20, 0).addBox(-5.0F, 0.0F, (float)BODY_SIZES[2][2] * -0.5F, 10.0F, 8.0F, (float)BODY_SIZES[2][2]), PartPose.offset(0.0F, 16.0F, $$2[2]));
        partDefinition.addOrReplaceChild(getLayerName(1), CubeListBuilder.create().texOffs(20, 11).addBox(-3.0F, 0.0F, (float)BODY_SIZES[4][2] * -0.5F, 6.0F, 4.0F, (float)BODY_SIZES[4][2]), PartPose.offset(0.0F, 20.0F, $$2[4]));
        partDefinition.addOrReplaceChild(getLayerName(2), CubeListBuilder.create().texOffs(20, 18).addBox(-3.0F, 0.0F, (float)BODY_SIZES[4][2] * -0.5F, 6.0F, 5.0F, (float)BODY_SIZES[1][2]), PartPose.offset(0.0F, 19.0F, $$2[1]));
        return LayerDefinition.create(meshDefinition, 64, 32);
    }

    public ModelPart root() {
        return this.root;
    }

    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        for (int $$6 = 0; $$6 < this.bodyParts.length; ++$$6) {
            this.bodyParts[$$6].yRot = Mth.cos(pAgeInTicks * 0.9F + (float)$$6 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.05F * (float)(1 + Math.abs($$6 - 2));
            this.bodyParts[$$6].x = Mth.sin(pAgeInTicks * 0.9F + (float)$$6 * 0.15F * (float)Math.PI) * (float)Math.PI * 0.2F * (float)Math.abs($$6 - 2);
        }

        this.bodyLayers[0].yRot = this.bodyParts[2].yRot;
        this.bodyLayers[1].yRot = this.bodyParts[4].yRot;
        this.bodyLayers[1].x = this.bodyParts[4].x;
        this.bodyLayers[2].yRot = this.bodyParts[1].yRot;
        this.bodyLayers[2].x = this.bodyParts[1].x;
    }
}
