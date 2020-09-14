package com.daversini.minerals_plus.items;

import com.daversini.minerals_plus.MineralsPlus;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Banana extends Item {
    public Banana() {
        super(new Item.Properties()
                .group(MineralsPlus.TAB_FOODSTUFFS)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.STRENGTH, 200, 1), 1) //Forza per 200 ticks (10 secondi * 20), livello effetto: 1, probabilità: 100%
                        .effect(new EffectInstance(Effects.POISON, 100, 0), 0.2f) //Veleno per 100 ticks (5 secondi * 20), livello effetto: 0, probabilità: 20%
                        .build())
        );
    }
}
