package com.teachMeSkills.lesson_4;

import java.util.Scanner;

/**
 * Create a three-dimensional array of integers By using loops to "walk" through the entire array
 * and increase each element by a given number.  Let the number by which each element will be increased,
 * is given from the console.
 */
public class Task0 {
    public static void main(String[] args) {
        int[][][] array1 = {{{12, 4, 7}, {3, 22, 15}}, {{7, 10, 1}}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce any integer number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    array1[i][j][k] += n;
                    System.out.print(array1[i][j][k] + " ");
                }
                System.out.println();
            }
        }

    }
}