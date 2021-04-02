package com.kingmao.tdd.connect4;

import lombok.Data;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author QX
 * @date 2021/3/29
 */
@Data
public class Connect4TDD {

    private static final int ROWS = 7;
    private static final int COLUMNS = 6;
    private static final String EMPTY = " ";
    private String[][] board = new String[ROWS][COLUMNS];

    public Connect4TDD() {
        for (String[] row : board)
            Arrays.fill(row, EMPTY);
    }

    public int getNumberOfDiscs() {
        return 0;
    }

    public void putDiscInColumn(int column) {
        checkColumn(column);
        int row = getNumberOfDiscsInColumn(column);
        checkRowOfColumn(column, row);


    }

    private void checkRowOfColumn(int column, int row) {
        if (row == ROWS) {
            throw new RuntimeException("there is no room column at " + column);
        }
    }

    private int getNumberOfDiscsInColumn(int column) {
        return board[column].length;
    }

    private void checkColumn(int column) {
        if (column < 1 || column > COLUMNS)
            throw new RuntimeException("Invalid column " + column);
    }

    /*public int getNumberOfDiscs() {
        return IntStream.range(0, COLUMNS).map(this::getNumberOfDiscsInColumn).sum();
    }

    private int getNumberOfDiscsInColumn(int column) {
        return (int) IntStream.range(0, ROWS).filter(row -> !EMPTY.equals(board[row][column])).count();
    }

    public int putDiscInColumn(int column) {
        checkColumn(column);
        int row = getNumberOfDiscsInColumn(column);
        checkPositionToInsert(row, column);
        board[row][column] = "X";
        return row;
    }

    private void checkColumn(int column) {
        if (column < 0 || column >= COLUMNS)
            throw new RuntimeException("Invalid column " + column);
    }

    private void checkPositionToInsert(int row, int column) {
        if (row == ROWS)
            throw new RuntimeException("No more room in column " + column);
    }
*/
    public static void main(String[] args) {
        Connect4TDD tdd = new Connect4TDD();
        System.out.println(tdd.toString());
    }
}
