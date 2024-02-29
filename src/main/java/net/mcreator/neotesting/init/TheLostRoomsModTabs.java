
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.neotesting.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.neotesting.TheLostRoomsMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class TheLostRoomsModTabs {
	public static ResourceKey<CreativeModeTab> TAB_THE_LOST_ROOMS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(TheLostRoomsMod.MODID, "the_lost_rooms"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_THE_LOST_ROOMS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + TheLostRoomsMod.MODID + ".the_lost_rooms")).icon(() -> new ItemStack(TheLostRoomsModBlocks.LEVEL_0_WALL)).build());
	}
}
