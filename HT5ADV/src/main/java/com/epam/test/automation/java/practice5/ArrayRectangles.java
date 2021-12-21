package com.epam.test.automation.java.practice5;

public class ArrayRectangles {

    static int count;

    private Rectangle rectangleArray[];

    public Rectangle[] getRectangleArray() {
        return rectangleArray;
    }

    //Constructor creating an empty array of rectangles with length n
    public ArrayRectangles(int n) {
        rectangleArray = new Rectangle[n];
        //obj index
        count = 0;
    }

    //Constructor that receives an arbitrary amount of objects of type Rectangle or an array of objects of type Rectangle.
    public ArrayRectangles(Rectangle[] rectangleArray) {
        this.rectangleArray = rectangleArray;
    }

    //Method addRectangle that adds a rectangle of type Rectangle to the array
    public boolean addRectangle(Rectangle rect) {
        if (count > rectangleArray.length) {
            return false;
        } else {
            rectangleArray[count] = rect;
            count++;
        }
        return true;
    }

    public double numberMaxArea() {
        double max_area = rectangleArray[0].area();
        for (int i = 1; i < rectangleArray.length; i++)
            if (max_area < rectangleArray[i].area()) {
                //swap
                max_area = rectangleArray[i].area();
            }
        return max_area;
    }

    public double numberMinPerimeter() {
        double min_perimeter = rectangleArray[0].perimeter();
        for (int i = 1; i < rectangleArray.length; i++) {
            //swap
            if (min_perimeter > rectangleArray[i].perimeter()) {
                min_perimeter = rectangleArray[i].perimeter();
            }
        }
        return min_perimeter;
    }

    public int numberSquares() {
        return rectangleArray.length;
    }

    public void printArray() {
        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.println(rectangleArray[i]);
        }
    }
}
