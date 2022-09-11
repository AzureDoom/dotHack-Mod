package mod.azure.dothack.entities;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entities.bases.NPCEntity;
import mod.azure.dothack.entities.bosses.SkeithEntity;
import mod.azure.dothack.entities.mobs.ChimChimEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class DotHackMobs {

	// NPCS
	public static final EntityType<NPCEntity> AZUREKITE = npc("azurekite");
	public static final EntityType<NPCEntity> ACEROLA = npc("acerola");
	public static final EntityType<NPCEntity> AINA = npc("aina");
	public static final EntityType<NPCEntity> ALKAID = npc("alkaid");
	public static final EntityType<NPCEntity> ATOLI = npc("atoli");
	public static final EntityType<NPCEntity> AURA = npc("aura");
	public static final EntityType<NPCEntity> AZUREBALMUNG = npc("azurebalmung");
	public static final EntityType<NPCEntity> AZUREORCA = npc("azureorca");
	public static final EntityType<NPCEntity> BALMUNG = npc("balmung");
	public static final EntityType<NPCEntity> BEAR = npc("bear");
	public static final EntityType<NPCEntity> BLACKROSE = npc("blackrose");
	public static final EntityType<NPCEntity> BLADEMASTER = npc("blademaster");
	public static final EntityType<NPCEntity> BT = npc("bt");
	public static final EntityType<NPCEntity> CREST = npc("crest");
	public static final EntityType<NPCEntity> CRIM = npc("crim");
	public static final EntityType<NPCEntity> ELK = npc("elk");
	public static final EntityType<NPCEntity> FLARE = npc("flare");
	public static final EntityType<NPCEntity> HASEO = npc("haseo");
	public static final EntityType<NPCEntity> HASEOXTH = npc("haseoxth");
	public static final EntityType<NPCEntity> HEAVYAXEMAN = npc("heavyaxeman");
	public static final EntityType<NPCEntity> HELBA = npc("helba");
	public static final EntityType<NPCEntity> KITE = npc("kite");
	public static final EntityType<NPCEntity> KNIGHT = npc("knight");
	public static final EntityType<NPCEntity> KOJI = npc("koji");
	public static final EntityType<NPCEntity> KOMIYANIII = npc("komiyaniii");
	public static final EntityType<NPCEntity> KUHN = npc("kuhn");
	public static final EntityType<NPCEntity> LOIS = npc("lois");
	public static final EntityType<NPCEntity> LONGARMM = npc("longarmm");
	public static final EntityType<NPCEntity> MIA = npc("mia");
	public static final EntityType<NPCEntity> MICINO = npc("micino");
	public static final EntityType<NPCEntity> MISTRAL = npc("mistral");
	public static final EntityType<NPCEntity> OBOROZUKIYO = npc("oborozukiyo");
	public static final EntityType<NPCEntity> ORCA = npc("orca");
	public static final EntityType<NPCEntity> OKUA = npc("ouka");
	public static final EntityType<NPCEntity> OVAN = npc("ovan");
	public static final EntityType<NPCEntity> PANTA = npc("panta");
	public static final EntityType<NPCEntity> PI = npc("pi");
	public static final EntityType<NPCEntity> SAKUYA = npc("sakuya");
	public static final EntityType<NPCEntity> SILBABUS = npc("silabus");
	public static final EntityType<NPCEntity> SORA = npc("sora");
	public static final EntityType<NPCEntity> SUBARU = npc("subaru");
	public static final EntityType<NPCEntity> TABBY = npc("tabby");
	public static final EntityType<NPCEntity> TASK = npc("task");
	public static final EntityType<NPCEntity> TWINBLADE = npc("twinblade");
	public static final EntityType<NPCEntity> TWINBLADEF = npc("twinbladef");
	public static final EntityType<NPCEntity> WAVEMASTERF = npc("wavemasterf");
	public static final EntityType<NPCEntity> ZELKOVA = npc("zelkova");

	static EntityType<NPCEntity> npc(String id) {
		return Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(DotHackMod.MODID, id),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, NPCEntity::new)
						.dimensions(EntityDimensions.fixed(1.1F, 2.1F)).trackRangeBlocks(90).trackedUpdateRate(1)
						.build());
	}

	// Bosses
	public static final EntityType<SkeithEntity> SKEITH = Registry.register(Registry.ENTITY_TYPE,
			new ResourceLocation(DotHackMod.MODID, "skeith"),
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, SkeithEntity::new)
					.dimensions(EntityDimensions.fixed(3.0f, 6.5F)).trackRangeBlocks(90).trackedUpdateRate(1).build());

	// Mobs
	public static final EntityType<ChimChimEntity> CHIMCHIM = Registry.register(Registry.ENTITY_TYPE,
			new ResourceLocation(DotHackMod.MODID, "chimchim"),
			FabricEntityTypeBuilder.create(MobCategory.MONSTER, ChimChimEntity::new)
					.dimensions(EntityDimensions.fixed(0.6f, 1.0F)).trackRangeBlocks(90).trackedUpdateRate(1).build());
}
