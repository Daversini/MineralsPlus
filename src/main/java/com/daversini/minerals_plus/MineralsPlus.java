package com.daversini.minerals_plus;

import com.daversini.minerals_plus.init.ModBlocks;
import com.daversini.minerals_plus.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("minerals_plus")
public class MineralsPlus
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "minerals_plus";

    public MineralsPlus() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    //Mod Tabs
    public static final ItemGroup TAB_BLOCKS = new ItemGroup("mineralsPlusBlocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RUBY_BLOCK.get());
        }
    };

    public static final ItemGroup TAB_MISCELLANEOUS = new ItemGroup("mineralsPlusMiscellaneous") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final ItemGroup TAB_TOOLS = new ItemGroup("mineralsPlusTools") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY_PICKAXE.get());
        }
    };

    public static final ItemGroup TAB_COMBAT = new ItemGroup("mineralsPlusCombat") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.RUBY_SWORD.get());
        }
    };

    public static final ItemGroup TAB_FOODSTUFFS = new ItemGroup("mineralsPlusFoodstuffs") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.BANANA.get());
        }
    };
}
