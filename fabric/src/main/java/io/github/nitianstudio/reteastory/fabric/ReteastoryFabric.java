package io.github.nitianstudio.reteastory.fabric;

import io.github.nitianstudio.reteastory.Reteastory;
import net.fabricmc.api.ModInitializer;

public class ReteastoryFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Reteastory.init();
    }
}