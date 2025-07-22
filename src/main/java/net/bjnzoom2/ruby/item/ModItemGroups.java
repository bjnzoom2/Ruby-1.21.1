package net.bjnzoom2.ruby.item;

import net.bjnzoom2.ruby.Ruby;
import net.bjnzoom2.ruby.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.mojang.serialization.codecs.RecordCodecBuilder.build;


public class ModItemGroups {
    public static final ItemGroup RUBY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Ruby.MOD_ID, "ruby_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY))
                    .displayName(Text.translatable("itemgroup.ruby.ruby_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);

                        entries.add(ModItems.CHISEL);
                    }).build());


    public static final ItemGroup RUBY_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Ruby.MOD_ID, "ruby_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK))
                    .displayName(Text.translatable("itemgroup.ruby.ruby_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                    }).build());

    public static void registerItemGroups() {
        Ruby.LOGGER.info("Registering Item Groups for " + Ruby.MOD_ID);
    }
}
