package com.daversini.minerals_plus.util;

import com.daversini.minerals_plus.MineralsPlus;
import com.daversini.minerals_plus.armor.ModArmorMaterial;
import com.daversini.minerals_plus.blocks.BlockItemBase;
import com.daversini.minerals_plus.blocks.RubyBlock;
import com.daversini.minerals_plus.blocks.RubyOre;
import com.daversini.minerals_plus.items.Banana;
import com.daversini.minerals_plus.items.ItemBase;
import com.daversini.minerals_plus.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MineralsPlus.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MineralsPlus.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocks
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);


    //Block items
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore",() -> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block",() -> new BlockItemBase(RUBY_BLOCK.get()));


    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Banana> BANANA = ITEMS.register("banana", Banana::new);


    //Tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 2, -2.4F, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 0.5f, -2.0F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 0, -2.8F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 4, -2.8F, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -3,-1.0f, new Item.Properties().group(MineralsPlus.TAB_TOOLS)));

    
    //Armors
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, new Item.Properties().group(MineralsPlus.TAB_COMBAT)));
}
