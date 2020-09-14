package com.daversini.minerals_plus.blocks;

import com.daversini.minerals_plus.MineralsPlus;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(MineralsPlus.TAB_BLOCKS));
    }
}
