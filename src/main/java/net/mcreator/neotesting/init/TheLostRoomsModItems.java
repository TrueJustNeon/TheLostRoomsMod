/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neotesting.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.neotesting.TheLostRoomsMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class TheLostRoomsModItems {
	public static Item LEVEL_0_FLOOR;
	public static Item LEVEL_0_WALL;
	public static Item LEVEL_0_ROOF;
	public static Item LEVEL_0_LIGHT;
	public static Item LEVEL_0_LIGHT_OFF;

	public static void load() {
		LEVEL_0_FLOOR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_floor"), new BlockItem(TheLostRoomsModBlocks.LEVEL_0_FLOOR, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TheLostRoomsModTabs.TAB_THE_LOST_ROOMS).register(content -> content.accept(LEVEL_0_FLOOR));
		LEVEL_0_WALL = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_wall"), new BlockItem(TheLostRoomsModBlocks.LEVEL_0_WALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TheLostRoomsModTabs.TAB_THE_LOST_ROOMS).register(content -> content.accept(LEVEL_0_WALL));
		LEVEL_0_ROOF = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_roof"), new BlockItem(TheLostRoomsModBlocks.LEVEL_0_ROOF, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TheLostRoomsModTabs.TAB_THE_LOST_ROOMS).register(content -> content.accept(LEVEL_0_ROOF));
		LEVEL_0_LIGHT = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_light"), new BlockItem(TheLostRoomsModBlocks.LEVEL_0_LIGHT, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TheLostRoomsModTabs.TAB_THE_LOST_ROOMS).register(content -> content.accept(LEVEL_0_LIGHT));
		LEVEL_0_LIGHT_OFF = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(TheLostRoomsMod.MODID, "level_0_light_off"), new BlockItem(TheLostRoomsModBlocks.LEVEL_0_LIGHT_OFF, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(TheLostRoomsModTabs.TAB_THE_LOST_ROOMS).register(content -> content.accept(LEVEL_0_LIGHT_OFF));
	}

	public static void clientLoad() {
	}
}
