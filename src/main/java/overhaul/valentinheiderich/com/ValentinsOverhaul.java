package overhaul.valentinheiderich.com;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import overhaul.valentinheiderich.com.block.ModBlocks;
import overhaul.valentinheiderich.com.item.ModItemGroups;
import overhaul.valentinheiderich.com.item.ModItems;

public class ValentinsOverhaul implements ModInitializer {
	public static final String MOD_ID = "valentins-overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerModItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}