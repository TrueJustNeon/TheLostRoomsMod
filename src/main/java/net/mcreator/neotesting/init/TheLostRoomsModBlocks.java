
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neotesting.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.neotesting.block.Level0WallBlock;
import net.mcreator.neotesting.TheLostRoomsMod;

public class TheLostRoomsModBlocks {
	public static Block LEVEL_0_WALL;

	public static void load() {
		LEVEL_0_WALL = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_wall"), new Level0WallBlock());
	}

	public static void clientLoad() {
		Level0WallBlock.clientInit();
	}
}
