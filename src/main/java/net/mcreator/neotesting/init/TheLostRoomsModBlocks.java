
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neotesting.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.neotesting.block.Level0WallBlock;
import net.mcreator.neotesting.block.Level0RoofBlock;
import net.mcreator.neotesting.block.Level0LightOffBlock;
import net.mcreator.neotesting.block.Level0LightBlock;
import net.mcreator.neotesting.block.Level0FloorBlock;
import net.mcreator.neotesting.TheLostRoomsMod;

public class TheLostRoomsModBlocks {
	public static Block LEVEL_0_FLOOR;
	public static Block LEVEL_0_WALL;
	public static Block LEVEL_0_ROOF;
	public static Block LEVEL_0_LIGHT;
	public static Block LEVEL_0_LIGHT_OFF;

	public static void load() {
		LEVEL_0_FLOOR = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_floor"), new Level0FloorBlock());
		LEVEL_0_WALL = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_wall"), new Level0WallBlock());
		LEVEL_0_ROOF = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_roof"), new Level0RoofBlock());
		LEVEL_0_LIGHT = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_light"), new Level0LightBlock());
		LEVEL_0_LIGHT_OFF = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_light_off"), new Level0LightOffBlock());
	}

	public static void clientLoad() {
		Level0FloorBlock.clientInit();
		Level0WallBlock.clientInit();
		Level0RoofBlock.clientInit();
		Level0LightBlock.clientInit();
		Level0LightOffBlock.clientInit();
	}
}
