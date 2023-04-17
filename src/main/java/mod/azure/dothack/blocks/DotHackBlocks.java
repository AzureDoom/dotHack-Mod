package mod.azure.dothack.blocks;

import mod.azure.dothack.DotHackMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public class DotHackBlocks {

	static <T extends Block> T block(T c, String id) {
		Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DotHackMod.MODID, id), c);
		return c;
	}
}
