package net.bjnzoom2.ruby.datagen;

import net.bjnzoom2.ruby.block.ModBlocks;
import net.bjnzoom2.ruby.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE);
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RUBY_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE);
    }
}
