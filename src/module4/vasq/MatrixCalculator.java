package module4.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 6/21/19
 */

import acm.program.*;

public class MatrixCalculator extends ConsoleProgram{


    private static final double CANVAS_WIDTH = 800;
    private static final double CANVAS_HEIGHT = 670;

    private static final int MAX_ROW = 3;
    private static final int MAX_COL = 3;

    private int matrix1Row;
    private int matrix1Column;
    private int matrix2Row;
    private int matrix2Column;

    private int matrixSum = 0;
    private int matrixDifference = 0;
    private int matrixProduct = 0;

    private int swap1 = 0;
    private int swap2 = 0;

    int [][] matrix1;
    int [][] matrix2;

    public void run() {
        setSize(CANVAS_WIDTH,CANVAS_HEIGHT);
        int loop = 0;
        while(loop != 2){
            println("   MATRIX MENU");
            println("1. Input Matrix #1");
            println("2. Input Matrix #2");
            println("3. Matrix Operations");
            println("4. Exit");
            int choice = readInt(":");
            switch (choice) {
                case 1:
                    matrix1();
                    loop = readInt("");
                    clearScreen();
                    break;
                case 2:
                    matrix2();
                    loop = readInt("");
                    clearScreen();
                    break;
                case 3:
                    clearScreen();
                    println(" Matrix Operation");
                    println("1. Addition");
                    println("2. Subtraction");
                    println("3. Multiplication");
                    println("4. Transpose");
                    println("5. Show stored matrix value");
                    int operation = readInt("");
                    if (operation == 1){
                        if (matrix1Row == 0 && matrix1Column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2Row == 0 && matrix2Column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Sum:");
                        for(int x = 0; x < matrix1Row; x++){
                            for(int y = 0; y < matrix1Column; y++){
                                matrixSum += (matrix1[x][y] + matrix2[x][y]);
                                print(matrixSum + " ");
                                matrixSum = 0;
                            }
                            println();
                        }
                        if(matrix1Row != matrix2Row && matrix1Column != matrix2Column) {
                            println("\nAdditional unprinted values from above:");
                            for (int x = 0; x < matrix1Column; x++) {
                                for (int y = 0; y < matrix1Row; y++) {
                                    matrixSum += (matrix1[x][y] + matrix2[x][y]);
                                    print(matrixSum + " ");
                                    matrixSum = 0;
                                }
                                println();
                            }
                        }
                        println("");
                        break;
                    }
                    if (operation == 2){
                        if (matrix1Row == 0 && matrix1Column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2Row == 0 && matrix2Column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Difference:");
                        for(int x = 0; x < matrix1Row; x++){
                            for(int y = 0; y < matrix1Column; y++){
                                matrixDifference += (matrix1[x][y] - matrix2[x][y]);
                                print(matrixDifference + " ");
                                matrixDifference = 0;
                            }
                            println();
                        }
                        if(matrix1Row != matrix2Row && matrix1Column != matrix2Column) {
                            println("\nAdditional unprinted values from above:");
                            for (int x = 0; x < matrix1Column; x++) {
                                for (int y = 0; y < matrix1Row; y++) {
                                    matrixDifference += (matrix1[x][y] - matrix2[x][y]);
                                    print(matrixDifference + " ");
                                    matrixDifference = 0;
                                }
                                println();
                            }
                        }
                        println("");
                        break;
                    }
                    if (operation == 3){
                        if (matrix1Row == 0 && matrix1Column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2Row == 0 && matrix2Column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Product:");
                        for(int x = 0; x < matrix1Row; x++){
                            for(int y = 0; y < matrix1Column; y++){
                                matrixProduct += (matrix1[x][y] * matrix2[x][y]);
                                print(matrixProduct + " ");
                                matrixProduct = 0;
                            }
                            println();
                        }
                        if(matrix1Row != matrix2Row && matrix1Column != matrix2Column) {
                            println("\nAdditional unprinted values from above:");
                            for (int x = 0; x < matrix1Column; x++) {
                                for (int y = 0; y < matrix1Row; y++) {
                                    matrixProduct += (matrix1[x][y] * matrix2[x][y]);
                                    print(matrixProduct + " ");
                                    matrixProduct = 0;
                                }
                                println();
                            }
                        }
                        println("");
                        break;
                    }
                    if (operation == 4){
                        if (matrix1Row == 0 && matrix1Column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2Row == 0 && matrix2Column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Transposed Matrix 1:");
                        for(int x = 0; x < matrix1Row; x++){
                            for(int y = 0; y < matrix1Column; y++){
                                swap1 = matrix1[x][y];
                                swap2 = matrix2[x][y];
                                matrix1[x][y] = swap2;
                                matrix2[x][y] = swap1;
                                print(matrix1[x][y] + " ");
                            }
                            println();
                        }
                        println("");

                        println("Transposed Matrix 2:");
                        for(int x = 0; x < matrix2Row; x++){
                            for(int y = 0; y < matrix2Column; y++){
                                print(matrix2[x][y] + " ");
                            }
                            println();
                        }
                        println("");
                        break;
                    }
                    if (operation == 5){
                        clearScreen();
                        printMatrices();

                        break;
                    }
                    println("");
                    println("Invalid choice.");
                    println("");
                    break;
                case 4:
                    exit();
                default:
                    println("\nInvalid option.");
                    println("");
                    break;
            }
        }

        exit();

    }

    private void printMatrices(){
        println("");
        println("Matrix 1:");
        for(int x = 0; x < matrix1Row; x++){
            for(int y = 0; y < matrix1Column; y++){
                print(matrix1[x][y] + " ");
            }
            println();
        }
        println("");
        println("Matrix 2:");
        for(int x = 0; x < matrix2Row; x++){
            for(int y = 0; y < matrix2Column; y++){
                print(matrix2[x][y] + " ");
            }
            println();
        }
        println("");
    }

    private void matrix1(){
        matrix1 = new int[MAX_ROW][MAX_COL];

        println();

        // MATRIX 1
        println("Input for matrix 1:\n");

        int row1 = readInt("Number of Rows: ");
        int col1 = readInt("Number of Columns: ");
        println("");

        for(int x = 0; x < row1; x++){
            for(int y = 0; y < col1; y++){
                matrix1[x][y] = readInt("Row[" + x + "]Column[" + y + "] = ");
            }
        }

        println("");
        println("Matrix 1:");
        for(int x = 0; x < row1; x++){
            for(int y = 0; y < col1; y++){
                print(matrix1[x][y] + " ");
            }
            println();
        }
        matrix1Row = row1;
        matrix1Column = col1;

        println("\n1. Return to MATRIX MENU");
        println("2. End program\n");
    }

    private void matrix2(){
        matrix2 = new int[MAX_ROW][MAX_COL];

        println("");
        println("Input for matrix 2:\n");

        int row2 = readInt("Number of Rows: ");
        int col2 = readInt("Number of Columns: ");
        println("");

        for(int x = 0; x < row2; x++){
            for(int y = 0; y < col2; y++){
                matrix2[x][y] = readInt("Row[" + x + "]Column[" + y + "] = ");
            }
        }

        println("");
        println("Matrix 2:");
        for(int x = 0; x < row2; x++){
            for(int y = 0; y < col2; y++){
                print(matrix2[x][y] + " ");
            }
            println();
        }
        matrix2Row = row2;
        matrix2Column = col2;

        println("\n1. Return to MATRIX MENU");
        println("2. End program\n");
    }



    private void clearScreen(){
        for (int x = 0; x <= 100; x++) {
            println();
        }
    }

    public static void main(String[] args) {
        (new MatrixCalculator()).start(args);
    }

}



