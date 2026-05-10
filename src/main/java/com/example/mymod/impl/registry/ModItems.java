package com.example.mymod.impl.registry;

import com.example.mymod.ExampleMod;
import java.util.function.BiConsumer;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;

public class ModItems {

  public static Item MAGIC_STICK;

  public static void register(BiConsumer<Item, Identifier> consumer) {

    MAGIC_STICK = new Item(
        new Properties()
        //? if 1.21.1 {
        /*
         *///?} else if 26.1.2 {
            .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, "magic_stick")))
    //?}
    );
    consumer.accept(MAGIC_STICK, Identifier.fromNamespaceAndPath(ExampleMod.MOD_ID, "magic_stick"));
  }
}
