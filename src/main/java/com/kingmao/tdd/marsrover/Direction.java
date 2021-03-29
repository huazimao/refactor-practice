package com.kingmao.tdd.marsrover;

/**
 * @author QX
 * @date 2021/3/28
 */
public enum Direction {

    NORTH(0, 'N'),
    EAST(1, 'E'),
    SOUTH(2, 'S'),
    WEST(3, 'W'),
    NONE(4, 'X');

    private int value;
    private char direction;

    Direction(int value, char direction) {
        this.value = value;
        this.direction = direction;
    }
}
