package com.kingmao.tdd.gildedrose;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author QX
 * @date 2021/3/30
 */
@Data
@NoArgsConstructor
public class Item {
    public String name;

    public int sellIn;

    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

}
