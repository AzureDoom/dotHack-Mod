package mod.azure.dothack.client;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.renders.boss.SkeithRender;
import mod.azure.dothack.client.renders.monster.ChimChimRender;
import mod.azure.dothack.client.renders.npcs.AcerolaRender;
import mod.azure.dothack.client.renders.npcs.AinaRender;
import mod.azure.dothack.client.renders.npcs.AlkaidRender;
import mod.azure.dothack.client.renders.npcs.AtoliRender;
import mod.azure.dothack.client.renders.npcs.AuraRender;
import mod.azure.dothack.client.renders.npcs.AzureBalmungRender;
import mod.azure.dothack.client.renders.npcs.AzureKiteRender;
import mod.azure.dothack.client.renders.npcs.AzureOrcaRender;
import mod.azure.dothack.client.renders.npcs.BTRender;
import mod.azure.dothack.client.renders.npcs.BalmungRender;
import mod.azure.dothack.client.renders.npcs.BearRender;
import mod.azure.dothack.client.renders.npcs.BlackRoseRender;
import mod.azure.dothack.client.renders.npcs.BlademasterRender;
import mod.azure.dothack.client.renders.npcs.CrestRender;
import mod.azure.dothack.client.renders.npcs.CrimRender;
import mod.azure.dothack.client.renders.npcs.ElkRender;
import mod.azure.dothack.client.renders.npcs.FlareRender;
import mod.azure.dothack.client.renders.npcs.HaseoRender;
import mod.azure.dothack.client.renders.npcs.HaseoXthRender;
import mod.azure.dothack.client.renders.npcs.HeavyAxemanRender;
import mod.azure.dothack.client.renders.npcs.HelbaRender;
import mod.azure.dothack.client.renders.npcs.KiteRender;
import mod.azure.dothack.client.renders.npcs.KnightRender;
import mod.azure.dothack.client.renders.npcs.KojiRender;
import mod.azure.dothack.client.renders.npcs.KomiyanIIIRender;
import mod.azure.dothack.client.renders.npcs.KuhnRender;
import mod.azure.dothack.client.renders.npcs.LoisRender;
import mod.azure.dothack.client.renders.npcs.LongArmMRender;
import mod.azure.dothack.client.renders.npcs.MiaRender;
import mod.azure.dothack.client.renders.npcs.MicinoRender;
import mod.azure.dothack.client.renders.npcs.MistralRender;
import mod.azure.dothack.client.renders.npcs.OborozukiyoRender;
import mod.azure.dothack.client.renders.npcs.OkuaRender;
import mod.azure.dothack.client.renders.npcs.OrcaRender;
import mod.azure.dothack.client.renders.npcs.OvanRender;
import mod.azure.dothack.client.renders.npcs.PantaRender;
import mod.azure.dothack.client.renders.npcs.PiRender;
import mod.azure.dothack.client.renders.npcs.SakuyaRender;
import mod.azure.dothack.client.renders.npcs.SilbabusRender;
import mod.azure.dothack.client.renders.npcs.SoraRender;
import mod.azure.dothack.client.renders.npcs.SubaruRender;
import mod.azure.dothack.client.renders.npcs.TabbyRender;
import mod.azure.dothack.client.renders.npcs.TaskRender;
import mod.azure.dothack.client.renders.npcs.TwinbladeFRender;
import mod.azure.dothack.client.renders.npcs.TwinbladeRender;
import mod.azure.dothack.client.renders.npcs.WaveMasterFRender;
import mod.azure.dothack.client.renders.npcs.ZelkovaRender;
import mod.azure.dothack.entities.DotHackMobs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class DotHackClientMod implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(DotHackMobs.AZUREKITE, (ctx) -> new AzureKiteRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ACEROLA, (ctx) -> new AcerolaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.AINA, (ctx) -> new AinaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ALKAID, (ctx) -> new AlkaidRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ATOLI, (ctx) -> new AtoliRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.AURA, (ctx) -> new AuraRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.AZUREBALMUNG, (ctx) -> new AzureBalmungRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.AZUREORCA, (ctx) -> new AzureOrcaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.BALMUNG, (ctx) -> new BalmungRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.BEAR, (ctx) -> new BearRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.BLACKROSE, (ctx) -> new BlackRoseRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.BLADEMASTER, (ctx) -> new BlademasterRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.BT, (ctx) -> new BTRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.CREST, (ctx) -> new CrestRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.CRIM, (ctx) -> new CrimRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ELK, (ctx) -> new ElkRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.FLARE, (ctx) -> new FlareRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.HASEO, (ctx) -> new HaseoRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.HASEOXTH, (ctx) -> new HaseoXthRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.HEAVYAXEMAN, (ctx) -> new HeavyAxemanRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.HELBA, (ctx) -> new HelbaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.KITE, (ctx) -> new KiteRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.KNIGHT, (ctx) -> new KnightRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.KOJI, (ctx) -> new KojiRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.KOMIYANIII, (ctx) -> new KomiyanIIIRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.KUHN, (ctx) -> new KuhnRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.LOIS, (ctx) -> new LoisRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.LONGARMM, (ctx) -> new LongArmMRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.MIA, (ctx) -> new MiaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.MICINO, (ctx) -> new MicinoRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.MISTRAL, (ctx) -> new MistralRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.OBOROZUKIYO, (ctx) -> new OborozukiyoRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ORCA, (ctx) -> new OrcaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.OKUA, (ctx) -> new OkuaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.OVAN, (ctx) -> new OvanRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.PANTA, (ctx) -> new PantaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.PI, (ctx) -> new PiRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.SAKUYA, (ctx) -> new SakuyaRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.SILBABUS, (ctx) -> new SilbabusRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.SORA, (ctx) -> new SoraRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.SUBARU, (ctx) -> new SubaruRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.TABBY, (ctx) -> new TabbyRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.TASK, (ctx) -> new TaskRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.TWINBLADE, (ctx) -> new TwinbladeRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.TWINBLADEF, (ctx) -> new TwinbladeFRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.WAVEMASTERF, (ctx) -> new WaveMasterFRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.ZELKOVA, (ctx) -> new ZelkovaRender(ctx));

		EntityRendererRegistry.register(DotHackMobs.CHIMCHIM, (ctx) -> new ChimChimRender(ctx));
		EntityRendererRegistry.register(DotHackMobs.SKEITH, (ctx) -> new SkeithRender(ctx));

		FabricLoader.getInstance().getModContainer(DotHackMod.MODID).ifPresent(container -> {
			ResourceManagerHelper.registerBuiltinResourcePack(asId("azureskin"), container, ResourcePackActivationType.NORMAL);
		});
	}
	
	public static ResourceLocation asId(String path) {
		return new ResourceLocation(DotHackMod.MODID, path);
	}

}
