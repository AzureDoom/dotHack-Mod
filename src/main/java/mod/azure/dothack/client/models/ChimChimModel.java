package mod.azure.dothack.client.models;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class ChimChimModel extends AnimatedTickingGeoModel<ChimChimEntity> {

	@Override
	public ResourceLocation getAnimationResource(ChimChimEntity animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/chimchim.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ChimChimEntity object) {
		return new ResourceLocation(DotHackMod.MODID, "geo/chimchim.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ChimChimEntity object) {
		return new ResourceLocation(DotHackMod.MODID, "textures/entity/monster/chimchim.png");
	}

}