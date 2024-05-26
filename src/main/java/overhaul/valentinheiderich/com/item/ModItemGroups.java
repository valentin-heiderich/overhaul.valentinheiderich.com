package overhaul.valentinheiderich.com.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import overhaul.valentinheiderich.com.ValentinsOverhaul;

import net.minecraft.registry.Registry;
import overhaul.valentinheiderich.com.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup ValentinsOverhaulGroup = Registry.register(Registries.ITEM_GROUP,
        new Identifier(ValentinsOverhaul.MOD_ID, "valentins_overhaul_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.valentins_overhaul_group"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                    }))
                    .build());

    public static void registerModItemGroups() {
        ValentinsOverhaul.LOGGER.info("Registering mod item groups for %s ...".formatted(ValentinsOverhaul.MOD_ID));
    }
}
