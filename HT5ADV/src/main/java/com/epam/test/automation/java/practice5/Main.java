package com.epam.test.automation.java.practice5;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2);
        Rectangle rectangle3 = new Rectangle(4, 5);
        Rectangle rectangle4 = new Rectangle(3, 3);
        Rectangle rectangle5 = new Rectangle(10, 5);

        System.out.println("ToStringDescription:");
        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());
        System.out.println(rectangle4.toString());
        System.out.println(rectangle5.toString());

        System.out.println("***********Array");

        ArrayRectangles array0 = new ArrayRectangles(5);

        ArrayRectangles array1 = new ArrayRectangles(array0.getRectangleArray());

        array1.addRectangle(rectangle1);
        array1.addRectangle(rectangle2);
        array1.addRectangle(rectangle3);
        array1.addRectangle(rectangle4);
        array1.addRectangle(rectangle5);

        array1.printArray();

        System.out.println(array1.numberMaxArea());
        System.out.println(array1.numberMinPerimeter());
        System.out.println(array1.numberSquares());

    }


}