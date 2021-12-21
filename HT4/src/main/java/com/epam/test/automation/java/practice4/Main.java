package com.epam.test.automation.java.practice4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {511, 171, 24, 24,8,0};
        int[] arr2={15, 10, 13};
        System.out.println(Task1.isSorted(arr,SortOrder.DESC));
        System.out.println(Arrays.toString(Task2.transform(arr2,SortOrder.DESC)));
        System.out.println(Task3.multiArithmeticElements( 5, 3, 4));
        System.out.println(Task4.sumGeometricElements(100,0.5,20));

    }
}