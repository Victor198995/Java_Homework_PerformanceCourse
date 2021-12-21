package com.epam.test.automation.java.practice3;

import java.util.ArrayList;




public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int[] task1(int[] array) {
        //int temp;

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] % 2 == 0 && array[array.length - 1 - i] % 2 == 0) {
                //swapping
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
        return array;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int[] array) {
        //find max array value
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }


        ArrayList<Integer> indexes = new ArrayList<Integer>();
//        //find indexes in loop
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indexes.add(i);
            }
        }
        if (indexes.size() == 1) return 0;
        return indexes.get(indexes.size() - 1) - indexes.get(0);
    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */


    public static int[][] task3(int[][] squareM) {
        // int[][] matrix = new int[4][4];
        for (int i = 0; i < squareM.length; i++) {
            for (int j = 0; j < squareM[i].length; j++) {
                if (i < j) {
                    squareM[i][j] = 1;
                }
                if (i > j) {
                    squareM[i][j] = 0;
                }
            }
        }
        return squareM;
    }

}

