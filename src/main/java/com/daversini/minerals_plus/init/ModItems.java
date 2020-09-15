package com.daversini.minerals_plus.init;

import com.daversini.minerals_plus.MineralsPlus;
import com.daversini.minerals_plus.blocks.BlockItemBase;
import com.daversini.minerals_plus.items.Banana;
import com.daversini.minerals_plus.items.ItemBase;
import com.daversini.minerals_plus.util.enums.ModArmorMaterial;
import com.daversini.minerals_plus.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MineralsPlus.MOD_ID);


    //Block items
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",
            () -> new BlockItemBase(ModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",
            () -> new BlockItemBase(ModBlocks.RUBY_BLOCK.get()));


    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Banana> BANANA = ITEMS.register("banana", Banana::new);


    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(ModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",
            () -> new ShovelItem(ModItemTier.RUBY, 0.5f, -3.0F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",
            () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",
            () -> new AxeItem(ModItemTier.RUBY, 4, -2.8F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",
            () -> new HoeItem(ModItemTier.RUBY, -3,-1.0f, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));


    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModItemTier.EMERALD, 2, -2.2f, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModItemTier.EMERALD, 0.5f, -2.8F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModItemTier.EMERALD, 0, -2.5F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModItemTier.EMERALD, 4, -2.5F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModItemTier.EMERALD, -3,1.0f, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));


    //Armors
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots",
            () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));


    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.HEAD, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.CHEST, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.LEGS, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new ArmorItem(ModArmorMaterial.EMERALD, EquipmentSlotType.FEET, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
}
