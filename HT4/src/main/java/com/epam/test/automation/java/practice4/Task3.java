package com.epam.test.automation.java.practice4;

public class Task3 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */


    public static int multiArithmeticElements(int a1, int t, int n) {
        int result = 1;
        int[] arr = new int[n];
        arr[0] = a1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + t;
            result = arr[i] * result;
        }

        return result * a1;
    }
}
