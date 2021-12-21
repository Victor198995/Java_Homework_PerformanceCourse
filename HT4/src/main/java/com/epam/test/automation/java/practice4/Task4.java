package com.epam.test.automation.java.practice4;

import java.util.ArrayList;

public class Task4 {

    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */

    public static double sumGeometricElements(int a1, double t, int alim) {
        double sum = a1;
        if (t <= 0 && t >= 1) {
            throw new IllegalArgumentException("Invalid t value 0<t<1");
        } else {
            while (a1 * t > alim) {
                a1 *= t;

                sum = sum + a1;
            }
            return sum;
        }
    }

}
