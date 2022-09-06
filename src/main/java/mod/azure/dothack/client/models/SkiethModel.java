package mod.azure.dothack.client.models;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class SkiethModel extends AnimatedTickingGeoModel<SkeithEntity> {

	@Override
	public ResourceLocation getAnimationResource(SkeithEntity animatable) {
		return new ResourceLocation(DotHackMod.MODID, "animations/skeith.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SkeithEntity object) {
		return new ResourceLocation(DotHackMod.MODID, "geo/skeith.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SkeithEntity object) {
		return new ResourceLocation(DotHackMod.MODID, "textures/entity/boss/skeith.png");
	}

}
