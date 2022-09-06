package mod.azure.dothack;

import mod.azure.dothack.entities.DotHackMobs;
import mod.azure.dothack.entities.bases.NPCEntity;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import mod.azure.dothack.items.DotHackItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DotHackMod implements ModInitializer {
	DotHackMobs MOBS;
	DotHackItems ITEMS;
	public static final String MODID = "dothack";
	public static final CreativeModeTab NPC_TAB = FabricItemGroupBuilder.create(new ResourceLocation(MODID, "entities"))
			.icon(() -> new ItemStack(DotHackItems.AZUREKITE_SPAWN_EGG)).build();
//	public static final CreativeModeTab BLOCKS = FabricItemGroupBuilder.create(new ResourceLocation(MODID, "blocks"))
//			.icon(() -> new ItemStack(DotHackItems.AZUREKITE_SPAWN_EGG)).build();

	@Override
	public void onInitialize() {
		MOBS = new DotHackMobs();
		ITEMS = new DotHackItems();
		FabricDefaultAttributeRegistry.register(DotHackMobs.AZUREKITE, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ACEROLA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.AINA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ALKAID, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ATOLI, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.AURA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.AZUREBALMUNG, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.AZUREORCA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.BALMUNG, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.BEAR, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.BLACKROSE, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.BLADEMASTER, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.BT, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.CREST, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.CRIM, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ELK, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.FLARE, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.HASEO, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.HASEOXTH, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.HEAVYAXEMAN, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.HELBA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.KITE, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.KNIGHT, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.KOJI, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.KOMIYANIII, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.KUHN, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.LOIS, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.LONGARMM, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.MIA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.MICINO, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.MISTRAL, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.OBOROZUKIYO, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ORCA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.OKUA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.OVAN, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.PANTA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.PI, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.SAKUYA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.SILBABUS, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.SORA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.SUBARU, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.TABBY, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.TASK, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.TWINBLADE, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.TWINBLADEF, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.WAVEMASTERF, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.ZELKOVA, NPCEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.CHIMCHIM, ChimChimEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(DotHackMobs.SKEITH, SkeithEntity.createMobAttributes());
	}
}
