package module4.cont;

import acm.program.ConsoleProgram;

public class MatrixCalculator extends ConsoleProgram{
    public void run() {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] mult = new int [3][3];
        int rowA, columnA, rowB, columnB, operation, result, ab;
        rowA = readInt("Enter the number of rows for Matrix A (1-3):", 1, 3);
        columnA = readInt("Enter the number of columns for Matrix A (1-3):", 1, 3);


        for (int i = 0; i < rowA; i++) {
            for (int x = 0; x < columnA; x++) {
                a[i][x] = readInt("Matrix A row " + (i + 1) + " column " + (x + 1) + ":");
            }
        }

        print("Matrix A: \n");
        for (int i = 0; i < rowA; i++) {
            for (int x = 0; x < columnA; x++) {
                print(a[i][x] + " ");
            }
            print("\n");
        }


        rowB = readInt("Enter the number of rows for Matrix B (1-3):", 1, 3);
        columnB = readInt("Enter the number of columns for Matrix B(1-3):", 1, 3);

        for (int i = 0; i < rowB; i++) {
            for (int x = 0; x < columnB; x++) {
                b[i][x] = readInt("Matrix B row " + (i + 1) + " column " + (x + 1) + ":");
            }
        }


        print("Matrix B: \n");
        for (int i = 0; i < rowB; i++) {
            for (int x = 0; x < columnB; x++) {
                print(b[i][x] + " ");
            }
            print("\n");
        }

        do {
            print("1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Transpose\n" +
                    "5. Quit\n"
            );


            operation = readInt("Enter the operation:",1,5);

            switch (operation) {
                case 1:
                    if (columnA == columnB && rowA == rowB) {
                        for (int i = 0; i < rowA; i++) {
                            for (int x = 0; x < columnA; x++) {
                                result = a[i][x] + b[i][x];
                                print(result + "  ");
                            }
                            print("\n");
                        }
                    } else {
                        print("Row and Columns of A and B matrices does not match!");
                    }
                    break;
                case 2:
                    if (columnA == columnB && rowA == rowB) {
                        for (int i = 0; i < rowA; i++) {
                            for (int x = 0; x < columnA; x++) {
                                result = a[i][x] - b[i][x];
                                print(result + "  ");
                            }
                            print("\n");
                        }
                    } else {
                        print("Row and Columns of A and B matrices does not match!");
                    }
                    break;
                case 3:
                    if (columnA == rowB) {
                       for(int i =0; i < rowA; i++){
                           for(int x=0; x< columnB;x++){
                               for(int p = 0; p < rowB; p++){
                                   mult[i][x] += a[i][p]*b[p][x];
                               }
                           }
                       }
                       for(int i=0; i<rowA; i++){
                           for(int x=0; x < columnB; x++){
                               print(mult[i][x] + "  ");
                           }
                           print("\n");
                       }
                    } else {
                        print("Row and Columns of A and B matrices does not match!");
                    }
                    break;
                case 4:
                    ab = readInt("1. Matrix A \n2. Matrix B\nEnter 1 or 2:", 1, 2);
                    if (ab == 1) {
                        for (int i = 0; i < columnA; i++) {
                            for (int x = 0; x < rowA; x++) {
                                print(a[i][x] + " ");
                            }
                            print("\n");
                        }
                    } else {
                        for (int i = 0; i < columnB; i++) {
                            for (int x = 0; x < rowB; x++) {
                                print(b[x][i] + " ");
                            }
                            print("\n");
                        }
                    }
                    break;
            }
        }while(operation != 5);
    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        new MatrixCalculator().start(args);
    }
}