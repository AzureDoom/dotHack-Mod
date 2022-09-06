package mod.azure.dothack.client.renders.boss;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import mod.azure.dothack.client.models.SkiethModel;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SkeithRender extends GeoEntityRenderer<SkeithEntity> {

	public SkeithRender(Context ctx) {
		super(ctx, new SkiethModel());
		this.shadowRadius = 0.5F;
	}

	@Override
	public RenderType getRenderType(SkeithEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	protected float getDeathMaxRotation(SkeithEntity entityLivingBaseIn) {
		return 0.0F;
	}

	@Override
	public ResourceLocation getTextureLocation(SkeithEntity var1) {
		return this.getTextureResource(var1);
	}

}
