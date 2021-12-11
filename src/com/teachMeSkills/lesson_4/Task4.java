package com.teachMeSkills.lesson_4;

/**
 * Create a two-dimensional array.  Output the diagonals of the array to the console.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{2, 3, 1}, {0, 0, 0}, {4, 5, 2}};

        System.out.println("first diagonal: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("reverse diagonal: ");

        int maxIdx = array.length - 1;
        for (int i = 0; i <= maxIdx; i++) {
            System.out.print(array[i][maxIdx - i] + " ");
        }
    }
}
