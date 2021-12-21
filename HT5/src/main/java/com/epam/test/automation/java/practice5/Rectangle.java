package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
    private double sideB;

//    public double getA() {
//        return a;
//    }
//
//    public void setA(double a) {
//        this.a = a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public void setB(double b) {
//        this.b = b;
//    }

    public Rectangle(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }

    public Rectangle(double a) {
        this.sideA = a;
        this.sideB = 5 ;
    }

    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    public double getSideA() {
          return sideA;
    }

    public double getSideB() {
           return sideB;
    }

    public double area() {
           return sideA*sideB;
    }

    public double perimeter() {
          return (sideA+sideB)*2;
    }

    public boolean isSquare() {
        if(sideA==sideB){return true;}
        else{return false;}
    }

    public void replaceSides() {
        double swap;
        swap = sideA;
        sideA=sideB;
        sideB=swap;

    }

}
