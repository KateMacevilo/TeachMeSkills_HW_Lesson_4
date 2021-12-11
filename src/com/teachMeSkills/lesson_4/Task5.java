package com.teachMeSkills.lesson_4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Create a two-dimensional array of integers.
 * Sort the elements in the rows of the two-dimensional array in ascending order.
 */
public class Task5 {
    public static void main(String[] args) {
        int [][] array1 = new int [3][4];
        int [][] array2 = new int [2][3];
        introduceArray(array1);
        introduceArray(array2);

        System.out.println("Array after sort");
        sortArray(array1);
        sortArray(array2);

    }

    static void introduceArray(int [][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random()*11);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void sortArray(int [][] array){
        for (int i =0; i < array.length; i++){
                Arrays.sort(array[i]);
                System.out.print(Arrays.toString(array[i]) + " ");
        }
    }
}
