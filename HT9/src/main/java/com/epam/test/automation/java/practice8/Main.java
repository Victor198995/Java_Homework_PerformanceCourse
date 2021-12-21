package com.epam.test.automation.java.practice8;

public class Main {
    public static void main(String[] args) throws MatrixException, ArithmeticException, ArrayIndexOutOfBoundsException {

        double contents[][] = {{5, 5, 5}, {5, 5, 5}, {5, 5, 5}};


        double contentsEx1[][] = new double[0][0];
        double contentsEx2[][] = new double[1][0];
        double contentsEx3[][] = new double[0][1];

        try {
            Matrix matrixEx1 = new Matrix(0, 4);
            Matrix matrixEx2 = new Matrix(3, 0);
            Matrix matrixEx3 = new Matrix(0, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Matrix matrixEx4 = new Matrix(contentsEx1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Matrix matrixEx5 = new Matrix(contentsEx2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        try {
            Matrix matrixEx6 = new Matrix(contentsEx3);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        Matrix matrix1 = new Matrix(3, 4);
        Matrix matrix2 = new Matrix(3, 3);
        Matrix matrix2zero = new Matrix(3, 3);
        Matrix matrix3 = new Matrix(contents);

        System.out.println("1 matrix:");
        matrix3.matrixPrint();


//setFirstMatrix
        //matrix3.matrixPrint();
        matrix1.indexerValuesSetByLoop(0);
        matrix2.indexerValuesSetByLoop(2);
        matrix2zero.indexerValuesSetByLoop(0);
        // matrix4.indexerValuesSetByLoop(4);


        System.out.println("1 matrix:");
        matrix1.matrixPrint();
        System.out.println("2 matrix:");
        matrix2.matrixPrint();

        System.out.println("2 Matrix Addition");
        matrix3.addition(matrix2).matrixPrint();

        System.out.println("2 Matrix Subtraction");
        matrix3.subtraction(matrix2).matrixPrint();

        System.out.println("Exception case 1");
        try {
            matrix3.subtraction(matrix1);
        } catch (MatrixException a) {
            System.out.println(a.getMessage());
        }

        System.out.println("2 Matrix Mult");
        matrix3.multiplication(matrix2).matrixPrint();

        System.out.println("2 Matrix Deletion");
        matrix3.deletion(matrix2).matrixPrint();


        System.out.println("Exception case 2");
        try {
            matrix3.deletion(matrix2zero);
        } catch (MatrixException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("After all:");
        matrix2.matrixPrint();
        matrix3.matrixPrint();

//        System.out.println("3 matrix:");
//        System.out.println(matrix3.getColumns());
//        System.out.println(matrix3.getRows());
//        matrix3.matrixPrint();
//        System.out.println("4 matrix:");
//        matrix4.matrixPrint();


    }
}
