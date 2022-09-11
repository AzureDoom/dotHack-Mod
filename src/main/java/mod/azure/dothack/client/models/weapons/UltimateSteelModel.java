package mod.azure.dothack.client.models.weapons;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.UltimateSteelItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UltimateSteelModel extends AnimatedGeoModel<UltimateSteelItem> {
	@Override
	public ResourceLocation getModelResource(UltimateSteelItem object) {
		return new ResourceLocation(DotHackMod.MODID, "geo/gatesword.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(UltimateSteelItem object) {
		return new ResourceLocation(DotHackMod.MODID, "textures/items/gatesword.png");
	}

	@Override
	public ResourceLocation getAnimationResource(UltimateSteelItem animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/gatesword.animation.json");
	}

}
