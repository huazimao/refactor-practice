package com.kingmao.tdd.gildedrose;

import lombok.AllArgsConstructor;
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

    public static Item createBackstagePass(int sellIn, int quality) {
        return new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    public static Item createNormalItem(String msg ,int sellIn, int quality) {
        return new Item(msg, sellIn, quality);
    }

    public static Item createSulfuras(int sellIn, int quality) {
        return new Item("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    private Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    public boolean isEqualsSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }

    public boolean isEqualsBackstatge() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    void updateQualityByOneDay() {
        updateQuality();
        updateSellIn();


        if (isExpired()) {
            updateByAfterExpiredtion();
        }
    }

    private void updateQuality() {
        if (!isAgedBrie()
                && !isEqualsBackstatge()) {
            if (quality > 0) {
                if (!isEqualsSulfuras()) {
                    quality = quality - 1;
                }
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;

                if (isEqualsBackstatge()) {
                    if (sellIn < 11) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }

                    if (sellIn < 6) {
                        if (quality < 50) {
                            quality = quality + 1;
                        }
                    }
                }
            }
        }
    }

    private void updateByAfterExpiredtion() {
        if (!isAgedBrie()) {
            if (!isEqualsBackstatge()) {
                if (quality > 0) {
                    if (!isEqualsSulfuras()) {
                        quality = quality - 1;
                    }
                }
            } else {
                quality = 0;
            }
        } else {
            if (quality < 50) {
                quality = quality + 1;
            }
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    private void updateSellIn() {
        if (!isEqualsSulfuras()) {
            sellIn = sellIn - 1;
        }
    }
}
