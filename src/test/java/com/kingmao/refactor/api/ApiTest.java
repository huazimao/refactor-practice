package com.kingmao.refactor.api;

import com.kingmao.refactor.tictactoe.TicTacToe;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 常用断言方法
 * @author QX
 * @date 2021/3/28
 */
class ApiTest {

    TicTacToe ticTacToe = new TicTacToe();

    @DisplayName("各种异常的断言")
    @Test
    void api_exception_tests() {

        //junit5
        assertThrows(RuntimeException.class, () ->{ticTacToe.play(2,5);});

        //assertJ，以方法为主题进行断言
        assertThatThrownBy(() ->{ticTacToe.play(2,11);}).isInstanceOf(RuntimeException.class);

        //assertJ，以指定的异常为主题进行断言
        assertThatExceptionOfType(RuntimeException.class).isThrownBy(() ->{ticTacToe.play(2,31);});

        //assertJ，无异常断肠
        assertThatCode(() ->{ticTacToe.play(2,1);}).doesNotThrowAnyException();

    }

}