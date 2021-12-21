package com.epam.test.automation.java.practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int value) {
        // int oddSum;
        if (value > 0) {
            int oddSum = 0;
            while (value > 0) {
                int digit = value % 10;
                value /= 10;
                if (digit % 2 != 0) {
                    oddSum += digit;
                }

            }

            // throw new UnsupportedOperationException();
            return oddSum;
        } else {
            throw new IllegalArgumentException("Value should be positive");
        }

    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int value) {
        int result = 0;
        if (value > 0) {
            //converting decimal to binary
            List<Integer> list = new ArrayList<>();

            //Transform into binary in reversed order
//            while (value >= 2) {
//                int valueRest = value % 2;
//                value = value / 2;
//
//                list.add(valueRest);
//                if (value < 2) list.add(value);
//            }
            while (value > 0) {
                int valueRest = value % 2;
                value = value / 2;

                list.add(valueRest);
                //if (value < 2) list.add(value);
            }
            //reverse list
            Collections.reverse(list);

            for (int i = 0; i <= list.size() - 1; i++) {
                if (list.get(i) == 1) {
                    result++;
                }
            }
            return result;

        } else {
            throw new IllegalArgumentException("Value should be positive");
        }

    }

    /**
     * <summary>
     * Implement code according to description of task 3.
     * </summary>
     */
    public static int task3(int value) {
        if (value == 1) return 0;
        if (value > 1) {
            int[] fibonacciArr = new int[value];
            fibonacciArr[0] = 0;
            fibonacciArr[1] = 1;

            int sumFibonacci = 0;


            for (int i = 2; i < value; i++) {
                fibonacciArr[i] = fibonacciArr[i - 1] + fibonacciArr[i - 2];
                sumFibonacci = sumFibonacci + fibonacciArr[i];
            }

            // throw new UnsupportedOperationException();
            return sumFibonacci + fibonacciArr[1];
        } else {
            throw new IllegalArgumentException("Value should be positive");
        }
    }

}
