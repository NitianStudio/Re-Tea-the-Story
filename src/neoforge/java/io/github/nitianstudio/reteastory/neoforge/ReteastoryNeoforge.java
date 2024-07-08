package io.github.nitianstudio.reteastory.neoforge;

import io.github.nitianstudio.reteastory.Reteastory;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.data.loading.DatagenModLoader;

import java.util.function.Supplier;

@Mod(Reteastory.MOD_ID)
public class ReteastoryNeoforge {
    public ReteastoryNeoforge() {
        Reteastory.init();
        if (FMLEnvironment.dist == Dist.CLIENT) {
            run(() -> Reteastory::initClient);
        }
    }

    public static void run(Supplier<Runnable> runnableSupplier) {
        runnableSupplier.get().run();
    }
}
