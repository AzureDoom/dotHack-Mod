package mod.azure.dothack.items.r2.spears;

import java.util.function.Consumer;

import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.dothack.client.renders.weapons.GoldenSpearRender;
import mod.azure.dothack.items.BaseSwordItem;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Tier;

public class GoldenSpearItem extends BaseSwordItem {

	public GoldenSpearItem(Tier tier, int damage, float speed) {
		super(tier, damage, speed);
	}

	@Override
	public void createRenderer(Consumer<Object> consumer) {
		consumer.accept(new RenderProvider() {
			private GoldenSpearRender renderer = null;

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				if (renderer == null)
					return new GoldenSpearRender();
				return renderer;
			}
		});
	}

}
