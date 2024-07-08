package io.github.nitianstudio.reteastory.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredSupplier;
import dev.architectury.registry.registries.RegistrySupplier;
import io.github.nitianstudio.reteastory.Reteastory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;

import java.util.Locale;
import java.util.function.Supplier;

public enum RegistryGroup implements Supplier<CreativeModeTab> {
    CORE();
    public final ResourceKey<CreativeModeTab> key;
    private final RegistrySupplier<CreativeModeTab> tab;
    RegistryGroup() {
        key = CreativeModeTabs.createKey(Reteastory.MOD_ID + "_" + name().toLowerCase(Locale.ROOT));
        tab = RegistryUtil.groups.register(name().toLowerCase(Locale.ROOT), () -> CreativeTabRegistry.create(
                Component.translatable(Reteastory.MOD_ID + "_" + name().toLowerCase(Locale.ROOT)),
                () -> new ItemStack(RegistryItem.WOODEN_BOWL_ITEM.get())
        ));
    }

    public static void registry() {}

    @Override
    public CreativeModeTab get() {
        return tab.get();
    }
}
