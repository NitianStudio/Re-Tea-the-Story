package io.github.nitianstudio.reteastory.datagen;

import io.github.nitianstudio.reteastory.Reteastory;
import io.github.nitianstudio.reteastory.datagen.provider.ToolTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Reteastory.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ReteastoryGeneration {
    @SubscribeEvent
    public static void datagen(GatherDataEvent event) {

        boolean client = event.includeClient();
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookup = event.getLookupProvider();
        ExistingFileHelper existing = event.getExistingFileHelper();
        generator.addProvider(client, new ToolTagsProvider(packOutput, lookup, existing));

    }
}
