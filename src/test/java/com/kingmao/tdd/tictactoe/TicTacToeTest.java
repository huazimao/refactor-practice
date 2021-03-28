package com.kingmao.tdd.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * @author QX
 * @date 2021/3/28
 */
class TicTacToeTest {

    TicTacToe ticTacToe = new TicTacToe();

    @Test
    @DisplayName("边界检查")
    public void play_outside_exception() {
        //assertJ，以方法为主题进行断言
        assertThatThrownBy(() ->{ticTacToe.play(2,12);}).isInstanceOf(RuntimeException.class);

    }

    @Test
    @DisplayName("重复落子异常检查")
    public void play_occupied_exception(){
        ticTacToe.play(1,1);
        assertThatThrownBy(() ->{ticTacToe.play(1,1);}).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("下一个player")
    public void who_is_next_player(){
        ticTacToe.play(1,1);
        assertThat(ticTacToe.nextPlayer()).isEqualTo('o').as("下完第一次，第二次的player是o");
        ticTacToe.play(2, 1);
        assertThat(ticTacToe.nextPlayer()).isEqualTo('x').as("下完第二次，第三次的player是x");
    }

    @Test
    @DisplayName("win")
    public void win(){
        String result = ticTacToe.play(1, 1);
        assertThat(result).isEqualTo("win");

    }

    @Test
    @DisplayName("垂直获胜条件")
    public void whenPlayAndWholeHorizontalLineThenWinner(){
        ticTacToe.play(1, 1); // X
        ticTacToe.play(1, 2); // O
        ticTacToe.play(2, 1); // X
        ticTacToe.play(2, 2); // O
        String actual = ticTacToe.play(3, 1); // X

    }

}