package com.epam.test.automation.java.practice8;

public class Matrix {


    private int rows;
    private int columns;
    private double[][] matrix;

    public Matrix(int rows, int columns) {
        if (rows == 0 || columns == 0) {
            throw new ArrayIndexOutOfBoundsException("Incompatible matrix size");
        } else {
            this.rows = rows;
            this.columns = columns;
            matrix = new double[rows][columns];
        }
    }

    public Matrix(double[][] twoDimArray) throws MatrixException {
        if (twoDimArray.length == 0 && twoDimArray[0].length == 0)
            throw new ArrayIndexOutOfBoundsException("Zero rows and columns array");
        else if (twoDimArray.length == 0) throw new ArrayIndexOutOfBoundsException("Zero rows in array");
        else if (twoDimArray[0].length == 0) throw new ArrayIndexOutOfBoundsException("Zero columns in array");
        this.rows = twoDimArray.length;
        this.columns = twoDimArray[0].length;
        this.matrix = twoDimArray;
    }


//Getters

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    //Setter
    public void indexerValuesSet(int row, int column, double value) {
        if (row < 0 || row > matrix.length - 1)
            throw new ArrayIndexOutOfBoundsException("row index is out of matrix size");
        else if (column < 0 || column > matrix[0].length - 1)
            throw new ArrayIndexOutOfBoundsException("column index is out of matrix size");
        else matrix[row][column] = value;
    }

    public void indexerValuesSetByLoop(double value) {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = value;
            }
        }
    }

    //Getter
    public double indexerValuesGet(int row, int column) {
        if (row < 0 || row > matrix.length - 1)
            throw new ArrayIndexOutOfBoundsException("row index is out of matrix size");
        else if (column < 0 || column > matrix[0].length - 1)
            throw new ArrayIndexOutOfBoundsException("column index is out of matrix size");
        else return matrix[row][column];
    }

    //Print all matrix:
    public void matrixPrint() {
        for (int i = 0; i < this.rows; i++) {
            System.out.println("");
            for (int j = 0; j < this.columns; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
        }
        System.out.println("");
    }

    //matrix adding
    public Matrix addition(Matrix matrix1) throws MatrixException {
        double[][] matr = new double[this.getColumns()][this.getRows()];
        if (matrix1.getColumns() != this.getColumns() || matrix1.getRows() != this.getRows())
            throw new MatrixException("Matrixes have different sizes");
        else {
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix1.getColumns(); j++) {
                    //adding values
                    matr[i][j] = this.matrix[i][j] + matrix1.matrix[i][j];
                }
            }
            return new Matrix(matr);
        }
    }

    //matrix subtraction
    public Matrix subtraction(Matrix matrix1) throws MatrixException {
        double[][] matr = new double[this.getColumns()][this.getRows()];
        if (matrix1.getColumns() != this.getColumns() || matrix1.getRows() != this.getRows())
            throw new MatrixException("Matrixes have different sizes");
        else {
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix1.getColumns(); j++) {
                    //adding values
                    matr[i][j] = this.matrix[i][j] - matrix1.matrix[i][j];
                }
            }
            return new Matrix(matr);
        }
    }

    //matrix multiplication
    public Matrix multiplication(Matrix matrix1) throws MatrixException {
        double[][] matr = new double[this.getColumns()][this.getRows()];
        if (matrix1.getColumns() != this.getColumns() || matrix1.getRows() != this.getRows())
            throw new MatrixException("Matrixes have different sizes");
        else {
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix1.getColumns(); j++) {
                    //adding values
                    matr[i][j] = this.matrix[i][j] * matrix1.matrix[i][j];
                }
            }
            return new Matrix(matr);
        }
    }

    //matrix deletion
    public Matrix deletion(Matrix matrix1) throws MatrixException, ArithmeticException {
        double[][] matr = new double[this.getColumns()][this.getRows()];
        if (matrix1.getColumns() != this.getColumns() || matrix1.getRows() != this.getRows())
            throw new MatrixException("Matrixes have different sizes");
        else {
            for (int i = 0; i < matrix1.getRows(); i++) {
                for (int j = 0; j < matrix1.getColumns(); j++) {
                    //adding values
                    if (matrix1.matrix[i][j] == 0) throw new ArithmeticException("Division to 0");
                    matr[i][j] = this.matrix[i][j] / matrix1.matrix[i][j];
                }
            }
        }
        return new Matrix(matr);
    }
}


