package mod.azure.dothack.client.renders.weapons;

import mod.azure.azurelib.renderer.GeoItemRenderer;
import mod.azure.dothack.client.models.weapons.UltimateSteelModel;
import mod.azure.dothack.items.UltimateSteelItem;

public class UltimateSteelRender extends GeoItemRenderer<UltimateSteelItem> {

	public UltimateSteelRender() {
		super(new UltimateSteelModel());
	}

}
