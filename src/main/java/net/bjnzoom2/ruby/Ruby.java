package net.bjnzoom2.ruby;

import net.bjnzoom2.ruby.block.ModBlocks;
import net.bjnzoom2.ruby.component.ModDataComponentTypes;
import net.bjnzoom2.ruby.item.ModItemGroups;
import net.bjnzoom2.ruby.item.ModItems;
import net.bjnzoom2.ruby.util.HammerUsageEvent;
import net.bjnzoom2.ruby.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
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

		ModDataComponentTypes.registerDataComponentTypes();

		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

		ModWorldGeneration.generateModWorldGen();
	}
}