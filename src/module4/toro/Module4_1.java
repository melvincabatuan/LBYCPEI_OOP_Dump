package module4.toro;

import acm.program.*;

public class Module4_1 extends ConsoleProgram {

    private int rows1;
    private int cols1;
    private int rows2;
    private int cols2;
    private double[][] matrix1;
    private double[][] matrix2;
    private double[][] result;

    public void run() {
        while (true) {
            displayMenu();

            int c = readInt();
            if ((c >= 3 && c <= 6) && (matrix1 == null || matrix2 == null)) {
                println("\n\n\nError: Please enter values for both matrices first.");
                continue;
            }

            if (c < 1 || c > 7) {
                println("\n\n\nError: Invalid choice");
                continue;
            }

            if (c == 1) {
                getMatrix1Values();
            }

            if (c == 2) {
                getMatrix2Values();
            }

            if (c == 3) {
                if(rows1 != rows2 || cols1 != cols2) {
                    println("\n\n\nError: Matrices must be the same size");
                    continue;
                }
                addMatrices();
            }

            if (c == 4) {
                if(rows1 != rows2 || cols1 != cols2) {
                    println("\n\n\nError: Matrices must be the same size");
                    continue;
                }
                subtractMatrices();
            }

            if (c == 5) {
                if(cols1 != rows2) {
                    println("\n\n\nError: The matrices cannot be multiplied.");
                    continue;
                }
                multiplyMatrices();
            }

            if (c == 6) {
                transposeMatrices();
            }

            if (c == 7) {
                System.exit(0);
                println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }
        }
    }

    private int inputMatrixValue() {
        int n = readInt();
        if (n < 1 || n > 3) {
            println("\nError: Value must be between 1 and 3.");
            n = inputMatrixValue();
        }
        return n;
    }

    private void displayMenu() {
        println("\nSelect an option: ");
        println("1) Enter values for 1st matrix");
        println("2) Enter values for 2nd matrix");
        println("3) Add matrices");
        println("4) Subtract matrices");
        println("5) Multiply matrices");
        println("6) Transpose matrices");
        println("7) Quit");
    }

    private void getMatrix1Values() {
        println("Input no. of rows of 1st matrix:");
        rows1 = inputMatrixValue();

        println("\nInput no. of columns of 1st matrix:");
        cols1 = inputMatrixValue();

        matrix1 = new double[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                println("\nEnter a value for number at row " + (i + 1) + " column " + (j + 1));
                matrix1[i][j] = readDouble();
            }
        }

        println("\nMATRIX 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                printf("%12.2f ", matrix1[i][j]);

            }println("");
        }
    }

    private void getMatrix2Values() {
        println("\nInput no. of rows of 2nd matrix:");
        rows2 = inputMatrixValue();

        println("\nInput no. of columns of 2nd matrix:");
        cols2 = inputMatrixValue();

        matrix2 = new double[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                println("\nEnter a value for number at row " + (i + 1) + " column " + (j + 1));
                matrix2[i][j] = readDouble();
            }
        }

        println("\nMATRIX 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                printf("%12.2f ", matrix2[i][j]);
            }println("");
        }
    }

    private void addMatrices() {
        result = new double[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }println("");
        }

        println("\nMatrix 1 + Matrix 2:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                printf("%12.2f ", result[i][j]);
            }println("");
        }
    }

    private void subtractMatrices() {
        result = new double[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }println("");
        }

        println("\nMatrix 1 - Matrix 2:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                printf("%12.2f ", result[i][j]);
            }println("");
        }
    }

    private void multiplyMatrices() {
        result = new double[rows1][cols2];
        for(int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        println("\nMatrix 1 x Matrix 2:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                printf("%12.2f ", result[i][j]);
            }println("");
        }
    }

    private void transposeMatrices() {
        result = new double[cols1][rows1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[j][i] = matrix1[i][j];
            }println("");
        }

        println("\nMatrix 1 T:");
        for (int i = 0; i < cols1; i++) {
            for (int j = 0; j < rows1; j++) {
                printf("%12.2f ", result[i][j]);
            }println("");
        }

        result = new double[cols2][rows2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                result[j][i] = matrix2[i][j];
            }println("");
        }

        println("Matrix 2 T:");
        for (int i = 0; i < cols2; i++) {
            for (int j = 0; j < rows2; j++) {
                printf("%12.2f ", result[i][j]);
            }println("");
        }
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Module4_1()).start(args);
    }
}
