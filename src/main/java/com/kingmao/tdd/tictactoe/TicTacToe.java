package com.kingmao.tdd.tictactoe;

/**
 * 井字游戏规则玩法：https://baike.baidu.com/item/%E4%BA%95%E5%AD%97%E6%A3%8B/4467444?fr=aladdin
 *
 * @author QX
 * @date 2021/3/28
 */
public class TicTacToe {

    private Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    public TicTacToe() {
        this.board = board;
    }

    public void play(int x, int y) {
        if (x < 1 || x > 3) {
            throw new RuntimeException("X is outside board");
        }
        if (y < 1 || y > 3) {
            throw new RuntimeException("Y is outside board");
        }

    }
}
