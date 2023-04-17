package mod.azure.dothack.client.renders.weapons;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.models.weapons.BaseSwordModel;
import mod.azure.dothack.items.BaseSwordItem;
import net.minecraft.resources.ResourceLocation;

public class SpinGaiGuRender extends GeoItemRenderer<BaseSwordItem> {

	private static ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID, "textures/item/spingaigu.png");
	private static ResourceLocation MODEL = new ResourceLocation(DotHackMod.MODID, "geo/spingaigu.geo.json");

	public SpinGaiGuRender() {
		super(new BaseSwordModel(TEXTURE, MODEL));
	}

}
