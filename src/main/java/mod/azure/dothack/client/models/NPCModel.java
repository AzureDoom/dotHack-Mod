package mod.azure.dothack.client.models;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entities.bases.NPCEntity;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class NPCModel extends GeoModel<NPCEntity> {

	protected final ResourceLocation TEXTURE_DEFAULT;

	public NPCModel(ResourceLocation textureDefault) {
		super();
		this.TEXTURE_DEFAULT = textureDefault;
	}

	@Override
	public ResourceLocation getAnimationResource(NPCEntity animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/npc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NPCEntity object) {
		return new ResourceLocation(DotHackMod.MODID, "geo/npc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NPCEntity object) {
		return this.TEXTURE_DEFAULT;
	}

	@Override
	public RenderType getRenderType(NPCEntity animatable, ResourceLocation texture) {
		return RenderType.entityTranslucent(texture);
	}

}
