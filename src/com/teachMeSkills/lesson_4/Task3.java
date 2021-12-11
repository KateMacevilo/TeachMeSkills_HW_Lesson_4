package com.teachMeSkills.lesson_4;

/**
 * Create a two-dimensional array of integers.
 * Output to the console the sum of all elements of the array.
 */
public class Task3 {
    public static void main(String[] args) {
        int[][] array1 = {{2, 5, 11, 3}, {1, 6, 1, 0}, {7, 12, 2, 3}};
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                sum += array1[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }
}
