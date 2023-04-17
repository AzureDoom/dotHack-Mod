package mod.azure.dothack.client.renders.monster;

import mod.azure.azurelib.renderer.GeoEntityRenderer;
import mod.azure.dothack.client.models.ChimChimModel;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class ChimChimRender extends GeoEntityRenderer<ChimChimEntity> {

	public ChimChimRender(Context ctx) {
		super(ctx, new ChimChimModel());
		this.shadowRadius = 0.3F;
	}

	@Override
	protected float getDeathMaxRotation(ChimChimEntity entityLivingBaseIn) {
		return 0.0F;
	}

}
