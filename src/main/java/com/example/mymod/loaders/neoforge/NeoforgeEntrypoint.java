//? if neoforge {
/*package com.example.mymod.loaders.neoforge;

import com.example.mymod.ExampleMod;
import com.example.mymod.impl.registry.ModItems;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(ExampleMod.MOD_ID)
public class NeoforgeEntrypoint {

  public NeoforgeEntrypoint(IEventBus modEventBus) {
    bind(modEventBus, Registries.ITEM, ModItems::register);
  }

  public <T> void bind(IEventBus modEventBus, ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, Identifier>> source) {
    modEventBus.addListener((Consumer<RegisterEvent>) event -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, id) -> event.register(registry, id, () -> t));
      }
    });
  }
}
*///?}
