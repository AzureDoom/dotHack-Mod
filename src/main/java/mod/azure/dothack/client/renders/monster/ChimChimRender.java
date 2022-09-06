package mod.azure.dothack.client.renders.monster;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import mod.azure.dothack.client.models.ChimChimModel;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ChimChimRender extends GeoEntityRenderer<ChimChimEntity> {

	public ChimChimRender(Context ctx) {
		super(ctx, new ChimChimModel());
		this.shadowRadius = 0.3F;
	}

	@Override
	public RenderType getRenderType(ChimChimEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(ChimChimEntity entityLivingBaseIn) {
		return 0.0F;
	}

	@Override
	public ResourceLocation getTextureLocation(ChimChimEntity var1) {
		return this.getTextureResource(var1);
	}

}
