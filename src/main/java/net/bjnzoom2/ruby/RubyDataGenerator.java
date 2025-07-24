package net.bjnzoom2.ruby;

import net.bjnzoom2.ruby.datagen.ModBlockTagProvider;
import net.bjnzoom2.ruby.datagen.ModItemTagProvider;
import net.bjnzoom2.ruby.datagen.ModLootTableProvider;
import net.bjnzoom2.ruby.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class RubyDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
	}
}
