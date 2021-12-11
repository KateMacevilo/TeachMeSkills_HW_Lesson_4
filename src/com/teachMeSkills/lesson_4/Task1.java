package com.teachMeSkills.lesson_4;

import java.util.Arrays;

/**
 * Chessboard Create a program to tell the chessboard using a loop.
 * Create a two-dimensional array of 8x8 String.   Use loops to set B(Black) or W(White) to the loop elements.
 * The result of the program:
 * W  B  W  B  W  B  W  B    B  W  B  W  B  W  B  W   etc.
 */
public class Task1 {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        int prevColor = 0; //если prevColor 0 - рисуем белый, если 1 - рисуем черный

        for (int i = 0; i < chess.length; i++) {

            for (int j = 0; j < chess[i].length; j++) {
                if (prevColor == 0) {
                    chess[i][j] = "W";
                    prevColor = 1;
                } else {
                    chess[i][j] = "B";
                    prevColor = 0;
                }
            }
            if (prevColor == 0) {
                prevColor = 1;
            } else {
                prevColor = 0;
            }
            System.out.println(Arrays.toString(chess[i]));
        }
    }
}
