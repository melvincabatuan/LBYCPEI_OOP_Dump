package module4.sabu;

import acm.program.*;

public class MatrixCalculator extends ConsoleProgram{

    public static final int ROW_NO = 3;
    public static final int COL_NO = 3;
    int [][] matrix1;
    int [][] matrix2;
    int [][] matrixProd;
    private int matrix1_row;
    private int matrix1_column;
    private int matrix2_row;
    private int matrix2_column;
    private int sum = 0;
    private int diff = 0;
    private int first = 0;
    private int second = 0;

    public void run() {
        int terminate = 0;

        while(terminate != 2){
            optionScreen();
            int choice = readInt("");
            switch (choice) {
                case 1:
                    matrix1();
                    terminate = readInt("");
                    nextSlide();
                    break;
                case 2:
                    matrix2();
                    terminate = readInt("");
                    nextSlide();
                    break;
                case 3:
                    nextSlide();
                    operationMenu();
                    int operation = readInt("");
                    if (operation == 1){
                        if (matrix1_row == 0 && matrix1_column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2_row == 0 && matrix2_column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Sum:");
                        for(int x = 0; x < matrix1_row; x++){
                            for(int y = 0; y < matrix1_column; y++){
                                sum += (matrix1[x][y] + matrix2[x][y]);
                                print(sum + " ");
                                sum = 0;
                            }
                            println();
                        }
                        println("");
                        break;
                    }
                    if (operation == 2){
                        if (matrix1_row == 0 && matrix1_column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2_row == 0 && matrix2_column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Difference:");
                        for(int x = 0; x < matrix1_row; x++){
                            for(int y = 0; y < matrix1_column; y++){
                                diff += (matrix1[x][y] - matrix2[x][y]);
                                print(diff + " ");
                                diff = 0;
                            }
                            println();
                        }
                        println("");
                        break;
                    }
                    if (operation == 3){
                        if (matrix1_row == 0 && matrix1_column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2_row == 0 && matrix2_column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();
                        matrixProd = new int[matrix1_row][matrix2_column];
                        for(int x = 0; x < matrix1_row; x++){
                            for(int y = 0; y < matrix2_column; y++){
                                for (int z = 0; z < matrix2_column; z++) {
                                    matrixProd[x][y] = matrixProd[x][y] + matrix1[x][z] * matrix2[y][z];
                                }
                            }
                        }
                        println("Product:");
                        for(int x = 0; x < matrix1_row; x++){
                            for(int y = 0; y < matrix2_column; y++){
                                print(matrixProd[x][y] + " ");
                            }
                            println();
                        }
                        break;
                    }
                    if (operation == 4){
                        if (matrix1_row == 0 && matrix1_column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (matrix2_row == 0 && matrix2_column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        printMatrices();

                        println("Transposed Matrix 1:");
                        for(int x = 0; x < matrix1_row; x++){
                            for(int y = 0; y < matrix1_column; y++){
                                first = matrix1[x][y];
                                second = matrix2[x][y];
                                matrix1[x][y] = second;
                                matrix2[x][y] = first;
                                print(matrix1[x][y] + " ");
                            }
                            println();
                        }
                        println("");

                        println("Transposed Matrix 2:");
                        for(int x = 0; x < matrix2_row; x++){
                            for(int y = 0; y < matrix2_column; y++){
                                print(matrix2[x][y] + " ");
                            }
                            println();
                        }
                        println("");
                        break;
                    }
                    println("");
                    println("Invalid choice.");
                    println("");
                    break;
                default:
                    println("\nInvalid option.");
                    println("");
                    break;
            }
        }

    }

    private void printMatrices(){
        println("");
        println("Matrix 1:");
        for(int x = 0; x < matrix1_row; x++){
            for(int y = 0; y < matrix1_column; y++){
                print(matrix1[x][y] + " ");
            }
            println();
        }
        println("");
        println("Matrix 2:");
        for(int x = 0; x < matrix2_row; x++){
            for(int y = 0; y < matrix2_column; y++){
                print(matrix2[x][y] + " ");
            }
            println();
        }
        println("");
    }

    private void matrix1(){
        matrix1 = new int[ROW_NO][COL_NO];

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
        matrix1_row = row1;
        matrix1_column = col1;
        ending();
    }

    private void matrix2(){
        matrix2 = new int[ROW_NO][COL_NO];

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
        matrix2_row = row2;
        matrix2_column = col2;
        ending();
    }

    private void ending(){
        println("\n[1] Return to selection menu");
        println("[2] End program\n");
    }

    private void operationMenu(){
        println("[1] Addition");
        println("[2] Subtraction");
        println("[3] Multiplication");
        println("[4] Transpose");
    }

    private void optionScreen(){
        println("[1] Input matrix 1");
        println("[2] Input matrix 2");
        println("[3] Perform matrix operations");
    }

    private void nextSlide(){
        for (int x = 0; x <= 50; x++) {
            println();
        }
    }

    public static void main(String[] args) {
        (new MatrixCalculator()).start(args);
    }
}



