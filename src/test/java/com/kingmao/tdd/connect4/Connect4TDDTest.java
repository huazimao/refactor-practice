package com.kingmao.tdd.connect4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 重力"五子棋"
 * @author QX
 * @date 2021/3/29
 */
class Connect4TDDTest {

    private Connect4TDD tested;

    @BeforeEach
    void setUp() {
        tested = new Connect4TDD();
    }

    @Test
    @DisplayName("构造方法,开始的时候棋盘内无棋子")
    public void when_game_started_the_board_is_empty(){
        assertThat(tested.getNumberOfDiscs()).isEqualTo(0);
    }

   @Test
   @DisplayName("棋盘边界值异常检测")
    public void when_disc_outside_board_then_RuntimeException() {
        int column1 = 0;
        int column2 = 7;
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() ->{tested.putDiscInColumn(column1);});
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() ->{tested.putDiscInColumn(column2);});
    }

    @Test
    @DisplayName("落子")
    public void put_disc_in_any_column() {
        int column = 2;

    }


   /* @Test
    public void whenFirstDiscInsertedInColumnThenPositionIsZero() {
        int column = 1;
        assertThat(tested.putDiscInColumn(column),
                is(0));
    }*/
/*
    @Test
    public void
    whenSecondDiscInsertedInColumnThenPositionIsOne() {
        int column = 1;
        tested.putDiscInColumn(column);
        assertThat(tested.putDiscInColumn(column),
                is(1));
    }

    @Test
    public void
    whenDiscInsertedThenNumberOfDiscsIncreases() {
        int column = 1;
        tested.putDiscInColumn(column);
        assertThat(tested.getNumberOfDiscs(), is(1));
    }

    @Test
    public void
    whenNoMoreRoomInColumnThenRuntimeException() {
        int column = 1;
        int maxDiscsInColumn = 6; // the number of rows
        for (int times = 0;
             times < maxDiscsInColumn;++times) {
            tested.putDiscInColumn(column);
        }
        exception.expect(RuntimeException.class);
        exception
                .expectMessage("No more room in column " +
                        column);
        tested.putDiscInColumn(column);
    }

*/


}