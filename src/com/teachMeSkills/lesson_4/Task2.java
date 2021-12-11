package com.teachMeSkills.lesson_4;

import java.util.Arrays;

/**
 * Multiplication of two matrices Create two arrays of integers of size 3x3 (two matrices).
 * 	Write a program to multiply the two matrices.
 * 	first array: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * 	second array: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * 	Expected result:  1  2  3   1  1  1   0  0  0
 */
public class Task2 {
    public static void main(String[] args) {
        int [][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int [][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int row = array1.length;
        int column = array2[0].length;
        int [][] array3 = new int[row][column];
        int result = 0;

        for (int i = 0; i < row; i++){ //rows array1
            for (int j = 0; j < column; j++){ //columns array2
                for (int k =0; k < array1[0].length; k ++){ //columns array1
                    result += array1[i][k] * array2[k][j];
                }
                array3[i][j] = result;
                result = 0;
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
