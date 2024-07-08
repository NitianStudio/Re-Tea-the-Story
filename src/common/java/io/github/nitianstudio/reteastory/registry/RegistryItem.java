package io.github.nitianstudio.reteastory.registry;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public enum RegistryItem implements Supplier<Item> {
    WOODEN_BOWL_ITEM(RegistryBlock.WOODEN_BOWL.get(), properties -> new BlockItem(RegistryBlock.WOODEN_BOWL.get(), properties.arch$tab(RegistryGroup.CORE.get())));
    private final RegistrySupplier<Item> item;
    RegistryItem(Function<Item.Properties, Item> function) {
        item = RegistryUtil.items.register(name().toLowerCase(Locale.ROOT), () -> function.apply(new Item.Properties()));
    }

    RegistryItem(Block block, Function<Item.Properties, BlockItem> function) {
        item = RegistryUtil.items.register(block.arch$registryName(), () -> function.apply(new Item.Properties()));
    }

    public static void registry() {}

    @Override
    public Item get() {
        return item.get();
    }
}
