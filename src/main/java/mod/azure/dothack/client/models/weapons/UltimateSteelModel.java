package mod.azure.dothack.client.models.weapons;

import mod.azure.azurelib.model.GeoModel;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.UltimateSteelItem;
import net.minecraft.resources.ResourceLocation;

public class UltimateSteelModel extends GeoModel<UltimateSteelItem> {
	@Override
	public ResourceLocation getModelResource(UltimateSteelItem object) {
		return new ResourceLocation(DotHackMod.MODID, "geo/gatesword.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UltimateSteelItem object) {
		return new ResourceLocation(DotHackMod.MODID, "textures/item/gatesword.png");
	}

	@Override
	public ResourceLocation getAnimationResource(UltimateSteelItem animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/gatesword.animation.json");
	}

}
