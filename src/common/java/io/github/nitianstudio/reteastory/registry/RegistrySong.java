package io.github.nitianstudio.reteastory.registry;

import io.github.nitianstudio.reteastory.Reteastory;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.item.JukeboxSongs;

import java.util.Locale;

public enum RegistrySong {
    ;
    RegistrySong() {
        RegistryUtil.songs.register(name().toLowerCase(Locale.ROOT), () -> JukeboxSongs);
    }

    public static void registry() {

    }


}
