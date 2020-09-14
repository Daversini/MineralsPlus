package com.daversini.minerals_plus.init;

import com.daversini.minerals_plus.MineralsPlus;
import com.daversini.minerals_plus.blocks.RubyBlock;
import com.daversini.minerals_plus.blocks.RubyOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MineralsPlus.MOD_ID);

    //Blocks
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
}
