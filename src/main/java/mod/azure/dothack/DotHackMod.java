package mod.azure.dothack;

import mod.azure.dothack.entities.DotHackMobs;
import mod.azure.dothack.entities.bases.NPCEntity;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import mod.azure.dothack.items.DotHackItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DotHackMod implements ModInitializer {
	DotHackMobs MOBS;
	DotHackItems ITEMS;
	public static final String MODID = "dothack";

	public static final CreativeModeTab NPC_TAB = FabricItemGroup.builder(DotHackMod.modResource("entities")).icon(() -> new ItemStack(DotHackItems.AZUREKITE_SPAWN_EGG)).displayItems((context, entries) -> {
		entries.accept(DotHackItems.AZUREKITE_SPAWN_EGG);
		entries.accept(DotHackItems.ACEROLA_SPAWN_EGG);
		entries.accept(DotHackItems.AINA_SPAWN_EGG);
		entries.accept(DotHackItems.ALKAID_SPAWN_EGG);
		entries.accept(DotHackItems.ATOLI_SPAWN_EGG);
		entries.accept(DotHackItems.AURA_SPAWN_EGG);
		entries.accept(DotHackItems.AZUREBALMUNG_SPAWN_EGG);
		entries.accept(DotHackItems.AZUREORCA_SPAWN_EGG);
		entries.accept(DotHackItems.BALMUNG_SPAWN_EGG);
		entries.accept(DotHackItems.BEAR_SPAWN_EGG);
		entries.accept(DotHackItems.BLACKROSE_SPAWN_EGG);
		entries.accept(DotHackItems.BLADEMASTER_SPAWN_EGG);
		entries.accept(DotHackItems.BT_SPAWN_EGG);
		entries.accept(DotHackItems.CREST_SPAWN_EGG);
		entries.accept(DotHackItems.CRIM_SPAWN_EGG);
		entries.accept(DotHackItems.ELK_SPAWN_EGG);
		entries.accept(DotHackItems.FLARE_SPAWN_EGG);
		entries.accept(DotHackItems.HASEO_SPAWN_EGG);
		entries.accept(DotHackItems.HASEOXTH_SPAWN_EGG);
		entries.accept(DotHackItems.HEAVYAXEMAN_SPAWN_EGG);
		entries.accept(DotHackItems.HELBA_SPAWN_EGG);
		entries.accept(DotHackItems.KITE_SPAWN_EGG);
		entries.accept(DotHackItems.KNIGHT_SPAWN_EGG);
		entries.accept(DotHackItems.KOJI_SPAWN_EGG);
		entries.accept(DotHackItems.KOMIYANIII_SPAWN_EGG);
		entries.accept(DotHackItems.KUHN_SPAWN_EGG);
		entries.accept(DotHackItems.LOIS_SPAWN_EGG);
		entries.accept(DotHackItems.LONGARMM_SPAWN_EGG);
		entries.accept(DotHackItems.MIA_SPAWN_EGG);
		entries.accept(DotHackItems.MICINO_SPAWN_EGG);
		entries.accept(DotHackItems.MISTRAL_SPAWN_EGG);
		entries.accept(DotHackItems.OBOROZUKIYO_SPAWN_EGG);
		entries.accept(DotHackItems.ORCA_SPAWN_EGG);
		entries.accept(DotHackItems.OKUA_SPAWN_EGG);
		entries.accept(DotHackItems.OVAN_SPAWN_EGG);
		entries.accept(DotHackItems.PANTA_SPAWN_EGG);
		entries.accept(DotHackItems.PI_SPAWN_EGG);
		entries.accept(DotHackItems.SAKUYA_SPAWN_EGG);
		entries.accept(DotHackItems.SILBABUS_SPAWN_EGG);
		entries.accept(DotHackItems.SORA_SPAWN_EGG);
		entries.accept(DotHackItems.SUBARU_SPAWN_EGG);
		entries.accept(DotHackItems.TABBY_SPAWN_EGG);
		entries.accept(DotHackItems.TASK_SPAWN_EGG);
		entries.accept(DotHackItems.TWINBLADE_SPAWN_EGG);
		entries.accept(DotHackItems.TWINBLADEF_SPAWN_EGG);
		entries.accept(DotHackItems.WAVEMASTERF_SPAWN_EGG);
		entries.accept(DotHackItems.ZELKOVA_SPAWN_EGG);
		entries.accept(DotHackItems.CHIMCHIM_SPAWN_EGG);
		entries.accept(DotHackItems.SKEITH_SPAWN_EGG);
	}).build();

	public static final CreativeModeTab ITEM_TAB = FabricItemGroup.builder(DotHackMod.modResource("items")).icon(() -> new ItemStack(DotHackItems.ULTIMATESTEEL)).displayItems((context, entries) -> {
		entries.accept(DotHackItems.FLAMESWORD);
		entries.accept(DotHackItems.GOLDENSPEAR);
		entries.accept(DotHackItems.SPINGAIGU);
		entries.accept(DotHackItems.DORJEHETCHETA);
		entries.accept(DotHackItems.SPINDRAKE);
		entries.accept(DotHackItems.SPINRIBS);
		entries.accept(DotHackItems.ULTIMATESTEEL);
	}).build();

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

	public static final ResourceLocation modResource(String name) {
		return new ResourceLocation(DotHackMod.MODID, name);
	}
}
