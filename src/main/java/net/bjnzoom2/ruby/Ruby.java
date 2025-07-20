package net.bjnzoom2.ruby;

import net.bjnzoom2.ruby.block.ModBlocks;
import net.bjnzoom2.ruby.item.ModItemGroups;
import net.bjnzoom2.ruby.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ruby implements ModInitializer {
	public static final String MOD_ID = "ruby";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}