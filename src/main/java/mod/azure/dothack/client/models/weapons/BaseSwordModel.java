package mod.azure.dothack.client.models.weapons;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.BaseSwordItem;
import net.minecraft.resources.ResourceLocation;

public class BaseSwordModel extends GeoModel<BaseSwordItem> {

	protected final ResourceLocation TEXTURE_DEFAULT;
	protected final ResourceLocation MODEL_DEFAULT;

	public BaseSwordModel(ResourceLocation textureDefault, ResourceLocation modelDefault) {
		super();
		this.TEXTURE_DEFAULT = textureDefault;
		this.MODEL_DEFAULT = modelDefault;
	}
	
	@Override
	public ResourceLocation getModelResource(BaseSwordItem object) {
		return MODEL_DEFAULT;
	}

	@Override
	public ResourceLocation getTextureResource(BaseSwordItem object) {
		return TEXTURE_DEFAULT;
	}

	@Override
	public ResourceLocation getAnimationResource(BaseSwordItem animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/empty.json");
	}

}
