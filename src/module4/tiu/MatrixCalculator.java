package module4.tiu;

import acm.program.ConsoleProgram;

public class MatrixCalculator extends ConsoleProgram{
    public void run() {

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int row1, column1, row2, column2, answer, result, matrix;
        row1 = readInt("Enter the number of rows for Matrix 1 (1-3):", 1, 3);
        column1 = readInt("Enter the number of columns for Matrix 1 (1-3):", 1, 3);


        for (int i = 0; i < column1; i++) {
            for (int j = 0; j < row1; j++) {
                matrix1[i][j] = readInt("input matrix 1 column " + (i + 1) + " row " + (j + 1) + ":");
            }
        }

        print("Matrix 1: \n");
        for (int i = 0; i < column1; i++) {
            for (int j= 0; j < row1; j++) {
                print(matrix1[i][j] + " ");
            }
            print("\n");
        }


        row2 = readInt("Enter the number of rows for Matrix 2 (1-3):", 1, 3);
        column2 = readInt("Enter the number of columns for Matrix 2(1-3):", 1, 3);

        for (int i = 0; i < column2; i++) {
            for (int j = 0; j< row2; j++) {
                matrix2[i][j] = readInt("Matrix 2 column " + (i + 1) + " row " + (j + 1) + ":");
            }
        }


        print("Matrix 2: \n");
        for (int i = 0; i < column2; i++) {
            for (int j = 0; j < row2; j++) {
                print(matrix2[i][j] + " ");
            }
            print("\n");
        }

        do {
            println("1. ADD");
            println("2. SUBTRACT");
            println("3. MULTIPLY");
            println("4. TRANSPOSE");
            println("5. EXIT");

            answer = readInt("Enter the operation:");

            if (answer==1)
            {
                if (column1 == column2 && row1 == row2) {
                    for (int i = 0; i < column1; i++) {
                        for (int j = 0; j < row1; j++) {
                            result = matrix1[i][j] + matrix2[i][j];
                            print(result + "  ");
                        }
                        print("\n");
                    }
                } else {
                    print("Row and columns of matrices are not equal");
                }
            }
            else if (answer==2)
            {
                if (column1 == column2 && row1 == row2) {
                    for (int i = 0; i < column1; i++) {
                        for (int j = 0; j < row1; j++) {
                            result = matrix1[i][j] - matrix2[i][j];
                            print(result + "  ");
                        }
                        print("\n");
                    }
                } else {
                    print("Row and columns of matrices are not equal");
                }
            }
            else if (answer==3)
            {
                if (column1 == column2 && row1 == row2) {
                    for (int i = 0; i < column1; i++) {
                        for (int j = 0; j < row1; j++) {
                            result = matrix1[i][j] * matrix2[i][j];
                            print(result + "  ");
                        }
                        print("\n");
                    }
                } else {
                    print("Row and columns of matrices are not equal");
                }
            }
            else if(answer==4)
            {
                matrix = readInt("1. Matrix 1 \n2. Matrix 2\nEnter 1 or 2:", 1, 2);
                if (matrix == 1) {
                    for (int i = 0; i < column1; i++) {
                        for (int j = 0; j < row1; j++) {
                            print(matrix1[j][i] + " ");
                        }
                        println();
                    }
                } else {
                    for (int i = 0; i < column2; i++) {
                        for (int j = 0; j < row2; j++) {
                            print(matrix2[j][i] + " ");
                        }
                        println();
                    }
                }
            }
        }while(answer != 5);
    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        new MatrixCalculator().start(args);
    }
}