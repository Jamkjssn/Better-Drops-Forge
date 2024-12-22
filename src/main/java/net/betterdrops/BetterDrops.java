package net.betterdrops;

import net.betterdrops.item.ModItemGroups;
import net.betterdrops.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterDrops implements ModInitializer {
	public static final String MOD_ID = "betterdrops";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}
}