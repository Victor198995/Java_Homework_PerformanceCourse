package com.epam.test.automation.java.practice4;

import static com.epam.test.automation.java.practice4.SortOrder.ASC;
import static com.epam.test.automation.java.practice4.SortOrder.DESC;

public class Task1 {


    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
        boolean isSortedd = false;

        if (order == ASC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] <= array[i + 1]) {
                    isSortedd = true;
                } else {
                    isSortedd = false;
                    break;
                }
            }
        } else if (order == DESC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] >= array[i + 1]) {
                    isSortedd = true;
                } else {
                    isSortedd = false;
                    break;
                }
            }
        }
        return isSortedd;
    }
}
