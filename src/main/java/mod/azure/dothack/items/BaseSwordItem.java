package mod.azure.dothack.items;

import java.util.function.Supplier;

import mod.azure.azurelib.animatable.GeoItem;
import mod.azure.azurelib.core.animatable.instance.AnimatableInstanceCache;
import mod.azure.azurelib.core.animation.AnimatableManager.ControllerRegistrar;
import mod.azure.azurelib.core.animation.AnimationController;
import mod.azure.azurelib.core.object.PlayState;
import mod.azure.azurelib.util.AzureLibUtil;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public abstract class BaseSwordItem extends SwordItem implements GeoItem {

	protected final AnimatableInstanceCache cache = AzureLibUtil.createInstanceCache(this, true);
	protected final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

	public BaseSwordItem(Tier tier, int damage, float speed) {
		super(tier, damage, speed, new Item.Properties().stacksTo(1));
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return false;
	}
	@Override
	public void registerControllers(ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "shoot_controller", event -> PlayState.CONTINUE));
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}

	@Override
	public Supplier<Object> getRenderProvider() {
		return this.renderProvider;
	}

}
