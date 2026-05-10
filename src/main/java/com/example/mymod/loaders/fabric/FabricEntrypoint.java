//? if fabric {
/*package com.example.mymod.loaders.fabric;

import com.example.mymod.impl.registry.ModItems;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class FabricEntrypoint implements ModInitializer {

  @Override
  public void onInitialize() {
    bind(BuiltInRegistries.ITEM, ModItems::register);
  }

  public <T> void bind(Registry<T> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    source.accept((t, id) -> Registry.register(registry, id, t));
  }
}
*///?}
