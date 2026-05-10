//? if !fabric && !neoforge {
/*package com.example.mymod.loaders.forge;

import com.example.mymod.impl.registry.ModItems;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

public class ForgeEntrypoint {

  public ForgeEntrypoint(FMLJavaModLoadingContext context) {
    bind(context.getModEventBus(), Registries.ITEM, ModItems::register);
  }

  @Deprecated @SuppressWarnings("all")
  public ForgeEntrypoint() {
    this(FMLJavaModLoadingContext.get());
  }

  public <T> void bind(IEventBus modEventBus, ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    modEventBus.addListener((Consumer<RegisterEvent>) event -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registry, rl, () -> t));
      }
    });
  }
}
*///?}