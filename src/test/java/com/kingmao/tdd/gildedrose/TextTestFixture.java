package com.kingmao.tdd.gildedrose;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.kingmao.tdd.gildedrose.Item.*;

/**
 * @author QX
 * @date 2021/3/30
 */
public class TextTestFixture {

    public static void main(String[] args) {
        String baseLine = getBaseLine();
        System.out.println(baseLine);
    }

    public static String getBaseLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(out);
        printStream.println("OMGHAI!");

        Item[] items = new Item[] {
                createNormalItem("+5 Dexterity Vest", 10, 20), //
                createNormalItem("Aged Brie", 2, 0), //
                createNormalItem("Elixir of the Mongoose", 5, 7), //
                createSulfuras(0, 80), //
                createSulfuras( -1, 80),
                createBackstagePass( 15, 20),
                createBackstagePass( 10, 49),
                createBackstagePass( 5, 49),
                // this conjured item does not work properly yet
                createNormalItem("Conjured Mana Cake", 3, 6) };

        GildedRose app = new GildedRose(items);

        int days = 2;

        for (int i = 0; i < days; i++) {
            printStream.println("-------- day " + i + " --------");
            printStream.println("name, sellIn, quality");
            for (Item item : items) {
                printStream.println(item);
            }
            printStream.println();
            app.passOneDay();
        }
        return out.toString();
    }
}
