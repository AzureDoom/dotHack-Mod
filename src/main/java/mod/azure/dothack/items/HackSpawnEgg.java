package mod.azure.dothack.items;

import mod.azure.dothack.DotHackMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public class HackSpawnEgg extends SpawnEggItem {

	public HackSpawnEgg(EntityType<? extends Mob> type) {
		super(type, 11022961, 11035249, new Item.Properties().stacksTo(64).tab(DotHackMod.NPC_TAB));
	}
}
