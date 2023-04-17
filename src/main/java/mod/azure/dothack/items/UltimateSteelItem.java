package mod.azure.dothack.items;

import java.util.function.Consumer;
import java.util.function.Supplier;

import mod.azure.azurelib.animatable.client.RenderProvider;
import mod.azure.dothack.client.renders.weapons.UltimateSteelRender;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.phys.AABB;

public class UltimateSteelItem extends BaseSwordItem {

	public UltimateSteelItem() {
		super(Tiers.NETHERITE, 20, -3.25F);
	}

	@Override
	public boolean isFoil(ItemStack stack) {
		return false;
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity miner) {
		if (miner instanceof Player) {
			Player playerentity = (Player) miner;
			if (stack.getDamageValue() < (stack.getMaxDamage() - 1)) {
				if (playerentity.getMainHandItem().getItem() instanceof UltimateSteelItem) {
					final AABB aabb = new AABB(playerentity.blockPosition().above()).inflate(1D, 1D, 1D);
					playerentity.getCommandSenderWorld().getEntities(playerentity, aabb).forEach(e -> doDamage(playerentity, e));
					stack.hurtAndBreak(1, playerentity, p -> p.broadcastBreakEvent(playerentity.getUsedItemHand()));
				}
			}
		}
		return true;
	}

	private void doDamage(LivingEntity user, Entity target) {
		if (target instanceof LivingEntity) {
			target.invulnerableTime = 0;
			target.hurt(user.damageSources().playerAttack((Player) user), 100F);
		}
	}

	@Override
	public void createRenderer(Consumer<Object> consumer) {
		consumer.accept(new RenderProvider() {
			private UltimateSteelRender renderer = null;

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				if (renderer == null)
					return new UltimateSteelRender();
				return renderer;
			}
		});
	}

	@Override
	public Supplier<Object> getRenderProvider() {
		return this.renderProvider;
	}

}
