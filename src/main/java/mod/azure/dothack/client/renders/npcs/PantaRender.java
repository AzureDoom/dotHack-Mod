package mod.azure.dothack.client.renders.npcs;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.models.NPCModel;
import mod.azure.dothack.entities.bases.NPCEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PantaRender extends GeoEntityRenderer<NPCEntity> {

	private static ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID, "textures/entity/panta.png");

	public PantaRender(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new NPCModel(TEXTURE));
		this.shadowRadius = 0.5F;
	}

	@Override
	public RenderType getRenderType(NPCEntity animatable, float partialTicks, PoseStack stack,
			MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(TEXTURE);
	}

	@Override
	protected float getDeathMaxRotation(NPCEntity entityLivingBaseIn) {
		return 0.0F;
	}

	@Override
	public ResourceLocation getTextureLocation(NPCEntity var1) {
		return TEXTURE;
	}
}
