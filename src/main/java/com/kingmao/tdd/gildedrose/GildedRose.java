package com.kingmao.tdd.gildedrose;

/**
 * 快捷键:
 * 将代码块抽取成公共方法 refactor --> extract  --> method
 * ood (如果可以)将方法抽取到类内部 move instance method
 * @author QX
 * @date 2021/3/30
 */
public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void passOneDay() {
        for (Item item : items) {
            item.updateQualityByOneDay();
        }
    }


}
