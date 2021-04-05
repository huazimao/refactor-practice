package com.kingmao.refactor.gildedrose;

import com.google.common.io.Files;
import org.junit.jupiter.api.Test;


import java.io.File;
import java.io.IOException;

import static com.google.common.base.Charsets.UTF_8;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * @author QX
 * @date 2021/3/30
 */
class GildedRoseTest {

    @Test
    void always_equals_base_line() throws IOException {
        String outPut = TextTestFixture.getBaseLine();
        String baseLine = Files.toString(new File("src/test/baseline.txt"), UTF_8);
        assertThat(outPut).isEqualTo(baseLine);
    }


}