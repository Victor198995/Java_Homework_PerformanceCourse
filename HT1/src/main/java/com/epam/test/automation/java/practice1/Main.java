package com.epam.test.automation.java.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if (n == 0) return 0;
        else if (n > 0) return (int) Math.pow(n, 2);
        else return Math.abs(n);

        //throw new UnsupportedOperationException();
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        int firstNumber = n / 100;
        int secondNumber = (n % 100) / 10;
        int thirdNumber = n % 10;

        //sorting by list
        List<Integer> list = new ArrayList<>();
        list.add(firstNumber);
        list.add(secondNumber);
        list.add(thirdNumber);

        Collections.sort(list, Collections.reverseOrder());

        int result = list.get(0) * 100 + list.get(1) * 10 + list.get(2);
        return result;

    }

}
