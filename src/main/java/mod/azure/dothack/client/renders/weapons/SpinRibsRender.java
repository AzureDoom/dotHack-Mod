package mod.azure.dothack.client.renders.weapons;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.models.weapons.BaseSwordModel;
import mod.azure.dothack.items.BaseSwordItem;
import net.minecraft.resources.ResourceLocation;

public class SpinRibsRender extends GeoItemRenderer<BaseSwordItem> {

	private static ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID, "textures/item/spinribs.png");
	private static ResourceLocation MODEL = new ResourceLocation(DotHackMod.MODID, "geo/stubdagger.geo.json");

	public SpinRibsRender() {
		super(new BaseSwordModel(TEXTURE, MODEL));
	}

}
