package com.kingmao.tdd.tictactoe;

/**
 * 井字游戏规则玩法：https://baike.baidu.com/item/%E4%BA%95%E5%AD%97%E6%A3%8B/4467444?fr=aladdin
 *
 * @author QX
 * @date 2021/3/28
 */
public class TicTacToe {

    private Character[][] board = {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};

    private char lastPlayer = '\0';

    public String play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBox(x, y);
        lastPlayer = nextPlayer();
        return "win";
    }

    private void setBox(int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        }
        board[x - 1][y - 1] = 'x';
    }

    private void checkAxis(int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException("axis is outside board");
        }
    }

    public char nextPlayer(){
        if (lastPlayer == 'x') {
            return 'o';
        }
        return 'x';
    }

}
