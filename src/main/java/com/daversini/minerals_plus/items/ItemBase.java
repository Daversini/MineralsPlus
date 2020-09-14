package com.daversini.minerals_plus.items;

import com.daversini.minerals_plus.MineralsPlus;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(MineralsPlus.TAB_MISCELLANEOUS));
    }
}
