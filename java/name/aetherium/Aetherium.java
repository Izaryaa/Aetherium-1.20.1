package name.aetherium;

import name.aetherium.block.ModBlocks;
import name.aetherium.item.ModItemGroups;
import name.aetherium.item.ModItems;
import name.aetherium.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Aetherium implements ModInitializer {
	public static final String MOD_ID = "aetherium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModWorldGeneration.generateModWorldGen();
	}

}