package mod.azure.dothack.items;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entities.DotHackMobs;
import mod.azure.dothack.items.r2.daggers.DorjeHatchetaItem;
import mod.azure.dothack.items.r2.daggers.SpinDrakeItem;
import mod.azure.dothack.items.r2.daggers.SpinGaiguItem;
import mod.azure.dothack.items.r2.daggers.SpinRibsItem;
import mod.azure.dothack.items.r2.spears.GoldenSpearItem;
import mod.azure.dothack.items.r2.staffs.FlameSwordItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

public class DotHackItems {

	public static HackSpawnEgg AZUREKITE_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.AZUREKITE), "azurekite_spawn_egg");
	public static HackSpawnEgg ACEROLA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ACEROLA), "acerola_spawn_egg");
	public static HackSpawnEgg AINA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.AINA), "aina_spawn_egg");
	public static HackSpawnEgg ALKAID_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ALKAID), "alkaid_spawn_egg");
	public static HackSpawnEgg ATOLI_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ATOLI), "atoli_spawn_egg");
	public static HackSpawnEgg AURA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.AURA), "aura_spawn_egg");
	public static HackSpawnEgg AZUREBALMUNG_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.AZUREBALMUNG), "azurebalmung_spawn_egg");
	public static HackSpawnEgg AZUREORCA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.AZUREORCA), "azureorca_spawn_egg");
	public static HackSpawnEgg BALMUNG_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.BALMUNG), "balmung_spawn_egg");
	public static HackSpawnEgg BEAR_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.BEAR), "bear_spawn_egg");
	public static HackSpawnEgg BLACKROSE_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.BLACKROSE), "blackrose_spawn_egg");
	public static HackSpawnEgg BLADEMASTER_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.BLADEMASTER), "blademaster_spawn_egg");
	public static HackSpawnEgg BT_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.BT), "bt_spawn_egg");
	public static HackSpawnEgg CREST_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.CREST), "crest_spawn_egg");
	public static HackSpawnEgg CRIM_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.CRIM), "crim_spawn_egg");
	public static HackSpawnEgg ELK_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ELK), "elk_spawn_egg");
	public static HackSpawnEgg FLARE_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.FLARE), "flare_spawn_egg");
	public static HackSpawnEgg HASEO_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.HASEO), "haseo_spawn_egg");
	public static HackSpawnEgg HASEOXTH_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.HASEOXTH), "haseoxth_spawn_egg");
	public static HackSpawnEgg HEAVYAXEMAN_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.HEAVYAXEMAN), "heavyaxeman_spawn_egg");
	public static HackSpawnEgg HELBA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.HELBA), "helba_spawn_egg");
	public static HackSpawnEgg KITE_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.KITE), "kite_spawn_egg");
	public static HackSpawnEgg KNIGHT_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.KNIGHT), "knight_spawn_egg");
	public static HackSpawnEgg KOJI_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.KOJI), "koji_spawn_egg");
	public static HackSpawnEgg KOMIYANIII_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.KOMIYANIII), "komiyaniii_spawn_egg");
	public static HackSpawnEgg KUHN_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.KUHN), "kuhn_spawn_egg");
	public static HackSpawnEgg LOIS_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.LOIS), "lois_spawn_egg");
	public static HackSpawnEgg LONGARMM_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.LONGARMM), "longarmm_spawn_egg");
	public static HackSpawnEgg MIA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.MIA), "mia_spawn_egg");
	public static HackSpawnEgg MICINO_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.MICINO), "micino_spawn_egg");
	public static HackSpawnEgg MISTRAL_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.MISTRAL), "mistral_spawn_egg");
	public static HackSpawnEgg OBOROZUKIYO_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.OBOROZUKIYO), "oborozukiyo_spawn_egg");
	public static HackSpawnEgg ORCA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ORCA), "orca_spawn_egg");
	public static HackSpawnEgg OKUA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.OKUA), "ouka_spawn_egg");
	public static HackSpawnEgg OVAN_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.OVAN), "ovan_spawn_egg");
	public static HackSpawnEgg PANTA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.PANTA), "panta_spawn_egg");
	public static HackSpawnEgg PI_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.PI), "pi_spawn_egg");
	public static HackSpawnEgg SAKUYA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.SAKUYA), "sakuya_spawn_egg");
	public static HackSpawnEgg SILBABUS_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.SILBABUS), "silbabus_spawn_egg");
	public static HackSpawnEgg SORA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.SORA), "sora_spawn_egg");
	public static HackSpawnEgg SUBARU_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.SUBARU), "subaru_spawn_egg");
	public static HackSpawnEgg TABBY_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.TABBY), "tabby_spawn_egg");
	public static HackSpawnEgg TASK_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.TASK), "task_spawn_egg");
	public static HackSpawnEgg TWINBLADE_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.TWINBLADE), "twinblade_spawn_egg");
	public static HackSpawnEgg TWINBLADEF_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.TWINBLADEF), "twinbladef_spawn_egg");
	public static HackSpawnEgg WAVEMASTERF_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.WAVEMASTERF), "wavemasterf_spawn_egg");
	public static HackSpawnEgg ZELKOVA_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.ZELKOVA), "zelkova_spawn_egg");
	
	public static HackSpawnEgg CHIMCHIM_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.CHIMCHIM), "chimchim_spawn_egg");
	public static HackSpawnEgg SKEITH_SPAWN_EGG = registerItem(new HackSpawnEgg(DotHackMobs.SKEITH), "skeith_spawn_egg");
	
	public static UltimateSteelItem ULTIMATESTEEL = registerItem(new UltimateSteelItem(), "ultimatesteel");
	public static BaseSwordItem FLAMESWORD = registerItem(new FlameSwordItem(Tiers.DIAMOND, 20, -3.05F), "flamesword");
	
	public static BaseSwordItem GOLDENSPEAR = registerItem(new GoldenSpearItem(Tiers.IRON, 20, -3.05F), "goldenspear");
	
	public static BaseSwordItem SPINGAIGU = registerItem(new SpinGaiguItem(Tiers.IRON, 20, -2.5F), "spingaigu");
	public static BaseSwordItem DORJEHETCHETA = registerItem(new DorjeHatchetaItem(Tiers.IRON, 20, -2.5F), "dorjehatcheta");
	public static BaseSwordItem SPINDRAKE = registerItem(new SpinDrakeItem(Tiers.IRON, 20, -2.5F), "spindrake");
	public static BaseSwordItem SPINRIBS = registerItem(new SpinRibsItem(Tiers.IRON, 20, -2.5F), "spinribs");

	static <T extends Item> T registerItem(T c, String id) {
		Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DotHackMod.MODID, id), c);
		return c;
	}
}
