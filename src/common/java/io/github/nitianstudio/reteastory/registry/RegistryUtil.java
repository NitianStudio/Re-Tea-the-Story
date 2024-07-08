package io.github.nitianstudio.reteastory.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import io.github.nitianstudio.reteastory.Reteastory;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.JukeboxSongs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class RegistryUtil {
    public static final DeferredRegister<Block> blocks = DeferredRegister.create(Reteastory.MOD_ID, Registries.BLOCK);
    public static final DeferredRegister<CreativeModeTab> groups = DeferredRegister.create(Reteastory.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final DeferredRegister<Item> items = DeferredRegister.create(Reteastory.MOD_ID, Registries.ITEM);

    public static final DeferredRegister<JukeboxSong> songs = DeferredRegister.create(Reteastory.MOD_ID, Registries.JUKEBOX_SONG);
    public static final DeferredRegister<BlockEntityType<? extends BlockEntity>> tiles = DeferredRegister.create(Reteastory.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static void registry() {

        RegistryBlock.registry();
        RegistryGroup.registry();
        RegistryItem.registry();
        RegistryTileEntity.registry();
        RegistrySong.registry();
        blocks.register();
        groups.register();
        items.register();
        tiles.register();
        songs.register();
    }
}
