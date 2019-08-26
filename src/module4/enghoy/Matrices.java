package module4.enghoy;

import acm.program.*;

public class Matrices extends ConsoleProgram {

    public static final int MAX_ROW = 3;
    public static final int MAX_COL = 3;

    public void run() {
        int[][] firstMatrix;
        int[][] secondMatrix;
        firstMatrix = new int[0][0];
        secondMatrix = new int[0][0];
        int row = 0;
        int col = 0;
        int row2 = 0;
        int col2 = 0;

        while (true) {
            println("Welcome to the Matrix Calculator!!!!!");
            println("1.) Input values for the first matrix");
            println("2.) Input values for the second matrix");
            println("3.) Perform operations");
            println("4.) Exit");

            int choice = readInt(">> ");
            if (choice == 1) {
                row = readInt("Number of rows: ");
                col = readInt("Number of columns: ");
                firstMatrix = getFirstMatrix(row, col);
            }

            else if (choice == 2) {
                row2 = readInt("Number of rows: ");
                col2 = readInt("Number of columns: ");
                secondMatrix = getSecondMatrix(row2, col2);

            }

            else if (choice == 3) {
                operation(row, col, row2, col2, firstMatrix, secondMatrix);

            }

            else if (choice == 4) {
                println("Thank you for using the Matrix Calculator.");
                break;
            }

            else {
                println("Invalid input");

            }
        }
    }

    private int[][] getFirstMatrix(int myRow, int myCol) {
        int[][] firstMatrix = new int[myRow][myCol];
        println("Input the values of the first matrix...");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                firstMatrix[row][col] = readInt("firstMatrix[" + row + "][" + col + "]=");
            }
        }
        println("Your first matrix is: ");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                print(firstMatrix[row][col] + " ");
            }
            println();
        }
        return firstMatrix;
    }

    private int[][] getSecondMatrix(int myRow, int myCol) {
        int[][] secondMatrix = new int[myRow][myCol];
        println("Second matrix");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                secondMatrix[row][col] = readInt("secondMatrix[" + row + "][" + col + "]=");
            }
        }
        println("Your second matrix is: ");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                print(secondMatrix[row][col] + " ");
            }
            println();
        }
        return secondMatrix;
    }

    private void operation(int myRow, int myCol, int myRow2, int myCol2, int[][] firstMatrix, int[][] secondMatrix) {

        if ((firstMatrix.length != 0 && firstMatrix[0].length != 0) && (secondMatrix.length != 0 && secondMatrix[0].length != 0)) {
            println("1.) Perform addition");
            println("2.) Perform subtraction");
            println("3.) Perform multiplication");
            println("4.) Transpose");
            print(">> ");
            int choice = readInt();

            if (choice == 1) {
                if (myRow == myRow2 && myCol == myCol2) {
                    addition(myRow, myCol, firstMatrix, secondMatrix);
                } else {
                    println("[!] Both rows and columns of the first and second matrix must be equal\n");
                }

            } else if (choice == 2) {
                if (myRow == myRow2 && myCol == myCol2) {
                    subtraction(myRow, myCol, firstMatrix, secondMatrix);
                } else {
                    println("[!] Both rows and columns of the first and second matrix must be equal\n");
                }


            } else if (choice == 3) {
                if (myCol == myRow2) {
                    multiplication(myRow, myCol, myCol2, firstMatrix, secondMatrix);
                } else {
                    println("[!] Columns of the first matrix must be equal to the rows of the second matrix");
                }

            } else if (choice == 4) {
                int[][] firstMatrixTranspose;
                int[][] secondMatrixTranspose;
                firstMatrixTranspose = new int[0][0];
                secondMatrixTranspose = new int[0][0];

                transposeFirst(myRow, myCol, firstMatrix);
                transposeSecond(myRow2, myCol2, secondMatrix);

            } else {
                println("[!] Invalid input");
            }

        } else {
            println("[!] Matrices are incomplete");
        }
    }

    private void addition(int myRow, int myCol, int[][] firstMatrix, int[][] matrixS) {
        int[][] matrixAns = new int[myRow][myCol];
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                matrixAns[row][col] = firstMatrix[row][col] + matrixS[row][col];
            }
        }
        println("The sum of the two matrices is: ");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                print(matrixAns[row][col] + " ");
            }
            println();
        }

    }

    private void subtraction(int myRow, int myCol, int[][] firstMatrix, int[][] matrixS) {
        int[][] matrixAns = new int[myRow][myCol];
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                matrixAns[row][col] = firstMatrix[row][col] - matrixS[row][col];
            }
        }
        println("The difference of the two matrices is: ");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                print(matrixAns[row][col] + " ");
            }
            println();
        }

    }

    private void multiplication(int myRow, int myCol, int myCol2, int[][] firstMatrix, int[][] secondMatrix) {
        int[][] productMatrix = new int[myRow][myCol2];

        for (int row = 0; row < myRow; row++) {
            for (int col2 = 0; col2 < myCol2; col2++) {
                for (int col = 0; col < myCol; col++) {
                    productMatrix[row][col2] = productMatrix[row][col2] + firstMatrix[row][col] * secondMatrix[col][col2];
                }
            }
        }

        println("The product of the two matrices is: ");
        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol2; col++) {
                print(productMatrix[row][col] + " ");
            }
            println();
        }
    }

    private int[][] transposeFirst(int myRow, int myCol,int[][] firstMatrix) {
        int[][] firstMatrixTranspose = new int[myCol][myRow];

        for (int row = 0; row < myRow; row++) {
            for (int col = 0; col < myCol; col++) {
                firstMatrixTranspose[col][row] = firstMatrix[row][col];
            }
        }

        println("First matrix transpose");
        for (int row = 0; row < myCol; row++) {
            for (int col = 0; col < myRow; col++) {
                print(firstMatrixTranspose[row][col] + " ");
            }
            println();
        }
        return firstMatrixTranspose;
    }


    private int[][] transposeSecond(int myRow2, int myCol2, int[][] secondMatrix) {
        int[][] secondMatrixTranspose = new int[myCol2][myRow2];

        println("Second matrix transpose: ");
        for (int row = 0; row < myRow2; row++) {
            for (int col = 0; col < myCol2; col++) {
                secondMatrixTranspose[col][row] = secondMatrix[row][col];
            }
        }

        for (int row = 0; row < myCol2; row++) {
            for (int col = 0; col < myRow2; col++) {
                print(secondMatrixTranspose[row][col] + " ");
            }
            println();
        }

        return secondMatrixTranspose;
    }




    public static void main(String[] args) {
        (new Matrices()).start(args);
    }
}