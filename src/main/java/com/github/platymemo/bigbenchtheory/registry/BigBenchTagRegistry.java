package com.github.platymemo.bigbenchtheory.registry;

import com.github.platymemo.bigbenchtheory.BigBenchTheory;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BigBenchTagRegistry {
    // These are the benches that can be used for big bench crafting
    // Can't just add benches to the tag willy-nilly, they also must produce the proper ScreenHandlerFactory
    public static final TagKey<Block> BIG_BENCHES = TagKey.of(Registry.BLOCK_KEY ,BigBenchTheory.getId("benches"));

    // These are crafting tables for use in crafting recipes, like the ones for bigger benches
    public static final TagKey<Item> CRAFTING_TABLES = TagKey.of(Registry.ITEM_KEY ,new Identifier("c", "crafting_tables"));

    public static void register() {
    }
}
