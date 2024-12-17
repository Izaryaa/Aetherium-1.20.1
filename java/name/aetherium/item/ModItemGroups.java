package name.aetherium.item;

import name.aetherium.Aetherium;
import name.aetherium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {



    public static final ItemGroup AETHERIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Aetherium.MOD_ID, "aetherium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.aetherium"))
                    .icon(() -> new ItemStack(ModItems.AETHERIUM_INGOT)).entries((displayContext, entries) -> {
                        //Items
                        entries.add(ModItems.AETHERIUM_INGOT);
                        entries.add(ModItems.AETHERIUM_SHARD);
                        entries.add(ModItems.AETHERIUM_UPGRADE_SMITHING_TEMPLATE);

                        //Blocks
                        entries.add(ModBlocks.AETHERIUM_BLOCK);
                        entries.add(ModBlocks.AETHERIUM_SHARD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AETHERIUM_SHARD_ORE);

                        //Tools
                        entries.add(ModItems.AETHERIUM_SWORD);
                        entries.add(ModItems.AETHERIUM_PICKAXE);
                        entries.add(ModItems.AETHERIUM_AXE);
                        entries.add(ModItems.AETHERIUM_SHOVEL);
                        entries.add(ModItems.AETHERIUM_HOE);

                        //Armor
                        entries.add(ModItems.AETHERIUM_HELMET);
                        entries.add(ModItems.AETHERIUM_CHESTPLATE);
                        entries.add(ModItems.AETHERIUM_LEGGINGS);
                        entries.add(ModItems.AETHERIUM_BOOTS);

                    }).build());

    public static void registerItemGroups() {
        Aetherium.LOGGER.info("Registering Item Groups for" + Aetherium.MOD_ID);
    }

}
