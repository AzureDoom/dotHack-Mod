package mod.azure.dothack.client.renders.npcs;

import mod.azure.azurelib.renderer.GeoEntityRenderer;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.models.NPCModel;
import mod.azure.dothack.entities.bases.NPCEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class LoisRender extends GeoEntityRenderer<NPCEntity> {

	private static ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID, "textures/entity/lois.png");

	public LoisRender(EntityRendererProvider.Context renderManagerIn) {
		super(renderManagerIn, new NPCModel(TEXTURE));
		this.shadowRadius = 0.5F;
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
