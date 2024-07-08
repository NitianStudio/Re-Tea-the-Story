package io.github.nitianstudio.reteastory;

import dev.architectury.registry.registries.DeferredRegister;
import io.github.nitianstudio.reteastory.registry.RegistryUtil;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reteastory
{
	public static final String MOD_ID = "reteastory";
	public static final Logger LOGGER = LoggerFactory.getLogger(Reteastory.class);

	public static final String NETWORK_VERSION = "1.0";



	public static void init() {
		RegistryUtil.registry();
	}

	public static void initClient() {

}
}
