package mod.azure.dothack.client.renders.boss;

import mod.azure.azurelib.renderer.GeoEntityRenderer;
import mod.azure.dothack.client.models.SkiethModel;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class SkeithRender extends GeoEntityRenderer<SkeithEntity> {

	public SkeithRender(Context ctx) {
		super(ctx, new SkiethModel());
		this.shadowRadius = 0.5F;
	}

	@Override
	protected float getDeathMaxRotation(SkeithEntity entityLivingBaseIn) {
		return 0.0F;
	}

}
