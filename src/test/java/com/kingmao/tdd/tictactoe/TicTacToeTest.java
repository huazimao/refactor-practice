package com.kingmao.tdd.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author QX
 * @date 2021/3/28
 */
class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();

    @Test
    void play_board() {
        //junit5
        assertThrows(RuntimeException.class, () ->{ticTacToe.play(2,5);});

        //assertJ，以方法为主题进行断言
        assertThatThrownBy(() ->{ticTacToe.play(2,1);}).isInstanceOf(RuntimeException.class);

        //assertJ，以指定的异常为主题进行断言
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() ->{ticTacToe.play(2,1);});

        //assertJ，无异常断肠
        assertThatCode(() ->{ticTacToe.play(2,11);}).doesNotThrowAnyException();
    }
}