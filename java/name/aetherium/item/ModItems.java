package name.aetherium.item;

import name.aetherium.Aetherium;
import name.aetherium.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModItems {

    //Items
    public static final Item AETHERIUM_INGOT = registerItem("aetherium_ingot", new Item(new FabricItemSettings()));
    public static final Item AETHERIUM_SHARD = registerItem("aetherium_shard", new Item(new FabricItemSettings()));
    public static final Item AETHERIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("aetherium_upgrade_smithing_template", new Item(new FabricItemSettings()));

    //Tools
    public static final Item AETHERIUM_SWORD = registerItem("aetherium_sword",
            new SwordItem(ModToolMaterial.AETHERIUM, 3, -2.4f, new FabricItemSettings()));

    public static final Item AETHERIUM_PICKAXE = registerItem("aetherium_pickaxe",
            new PickaxeItem(ModToolMaterial.AETHERIUM, 1, -2.8f, new FabricItemSettings()));

    public static final Item AETHERIUM_AXE = registerItem("aetherium_axe",
            new AxeItem(ModToolMaterial.AETHERIUM, 5, -3, new FabricItemSettings()));
    public static final Item AETHERIUM_SHOVEL = registerItem("aetherium_shovel",
            new ShovelItem(ModToolMaterial.AETHERIUM, 1.5f, -3, new FabricItemSettings()));
    public static final Item AETHERIUM_HOE = registerItem("aetherium_hoe",
            new HoeItem(ModToolMaterial.AETHERIUM, -5, 0, new FabricItemSettings()));

    //Armor
    public static final Item AETHERIUM_HELMET = registerItem("aetherium_helmet",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AETHERIUM_CHESTPLATE = registerItem("aetherium_chestplate",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item AETHERIUM_LEGGINGS = registerItem("aetherium_leggings",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AETHERIUM_BOOTS = registerItem("aetherium_boots",
            new ArmorItem(ModArmorMaterials.AETHERIUM, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(AETHERIUM_INGOT);
        entries.add(AETHERIUM_SHARD);
        entries.add(AETHERIUM_UPGRADE_SMITHING_TEMPLATE);
    }

    private static void addItemsToBlockTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.AETHERIUM_BLOCK);
    }

    private static void addItemsToNaturalTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModBlocks.AETHERIUM_SHARD_ORE);
        entries.add(ModBlocks.DEEPSLATE_AETHERIUM_SHARD_ORE);
    }
    private static void addItemsToToolTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.AETHERIUM_SHOVEL);
        entries.add(ModItems.AETHERIUM_PICKAXE);
        entries.add(ModItems.AETHERIUM_AXE);
        entries.add(ModItems.AETHERIUM_HOE);
    }

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(ModItems.AETHERIUM_SWORD);
        entries.add(ModItems.AETHERIUM_AXE);
        entries.add(ModItems.AETHERIUM_HELMET);
        entries.add(ModItems.AETHERIUM_CHESTPLATE);
        entries.add(ModItems.AETHERIUM_LEGGINGS);
        entries.add(ModItems.AETHERIUM_BOOTS);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Aetherium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Aetherium.LOGGER.info("Registering Mod Items for" + Aetherium.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModItems::addItemsToBlockTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }

}
