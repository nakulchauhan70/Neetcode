package com.code150.arrayandhashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSoduku {
    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char number = board[i][j];
                if (number != '.') {
                    if (!set.add(number + " is in row " + i) || !set.add(number + " is in column " + j) || !set.add(number + " is in block" + i / 3 + "" + j / 3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
