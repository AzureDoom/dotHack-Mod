package mod.azure.dothack.items.r2.daggers;

import java.util.function.Consumer;

import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.dothack.client.renders.weapons.SpinDrakeRender;
import mod.azure.dothack.items.BaseSwordItem;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Tier;

public class SpinDrakeItem extends BaseSwordItem {

	public SpinDrakeItem(Tier tier, int damage, float speed) {
		super(tier, damage, speed);
	}

	@Override
	public void createRenderer(Consumer<Object> consumer) {
		consumer.accept(new RenderProvider() {
			private SpinDrakeRender renderer = null;

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				if (renderer == null)
					return new SpinDrakeRender();
				return renderer;
			}
		});
	}

}
