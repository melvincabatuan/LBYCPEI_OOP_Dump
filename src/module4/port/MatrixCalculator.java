package module4.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 06 - 07 - 2019
 */
import acm.program.*;

public class MatrixCalculator extends ConsoleProgram {

    int col = 3;
    int row = 3;
    double matrix[][] = new double[col][row];
    double matrix2[][] = new double[col][row];
    double matrixResult[][] = new double[col][row];

    public void run() {

        int choice = 0;

        while (choice != 9) {

            printf("\nSelect Operation:\n1) Input matrix size \n2) Input values for the first matrix \n3) Input values for the second matrix \n4) Display Data \n5) Matrix Addition \n6) Matrix Subtraction \n7) Matrix Multiplication \n8) Matrix Transpose \n9) Exit\n\nInput your selection: ");
            choice = readInt();

            if (choice == 1) {
                inputMatrixColumn();
                inputMatrixRow();
            } else if (choice == 2) {
                inputMatrixValues();
            } else if (choice == 3) {
                inputMatrix2Values();
            } else if (choice == 4) {
                displayMatrixValues();
            } else if (choice == 5) {
                addMatrix();
            } else if (choice == 6) {
                subtractMatrix();
            } else if (choice == 7) {
                multiplyMatrix();
            } else if(choice == 8){
                transposeMatrix();
            }
            else if(choice == 9){
                java.lang.System.exit(0);
            }
            else {
                printf("\nINVALID CHOICE\n\n");
            }

        }

    }

    private int inputMatrixColumn(){

        while(true){
            printf("\nEnter the number of columns in the Matrix: ");
            col = readInt();

            if(col > 3 || col < 1){
                printf("You entered either too much or too little than required\n");
            }

            else break;
        }

        return col;

    }

    private int inputMatrixRow(){

        while(true){
            printf("\nEnter the number of rows in the Matrix: ");
            row = readInt();

            if(row > 3 || row < 1){
                printf("You entered either too much or too little than required\n");
            }

            else break;
        }

        return row;

    }

    public void inputMatrixValues(){
        for (int i = 0; i < col; i++){
            for (int j = 0 ; j < row; j++){
                println("\nInput value of " + (i+1) + " x " + (j+1) + " in the first matrix: ");
                matrix[i][j] = readDouble();
            }
        }
    }

    public void inputMatrix2Values(){
        for (int i = 0; i < col; i++){
            for (int j = 0 ; j < row; j++){
                println("\nInput value of " + (i+1) + " x " + (j+1) + " in the second matrix: ");
                matrix2[i][j] = readDouble();
            }
        }
    }

    public void displayMatrixValues(){
        printf("\nMatrix Values for the first matrix: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrix[i][j] + "]");
            }
            println();
        }
        printf("\nMatrix Values for the second matrix: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrix2[i][j] + "]");
            }
            println();
        }
    }

    public void addMatrix(){
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                matrixResult[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        printf("\nAdded Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrixResult[i][j] + "]");
            }
            println();
        }
    }

    public void subtractMatrix(){
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                matrixResult[i][j] = matrix[i][j] - matrix2[i][j];
            }
        }

        printf("\nSubtracted Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrixResult[i][j] + "]");
            }
            println();
        }
    }

    public void multiplyMatrix(){
        for (int i = 0 ; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrixResult[i][j] = 0;
                for (int k = 0; k < row; k++)
                matrixResult[i][j] = matrixResult[i][j] + (matrix[i][k] * matrix2[k][j]);
            }
        }

        printf("\nMultiplied Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrixResult[i][j] + "]");
            }
            println();
        }
    }

    public void transposeMatrix(){

        double trans1[][] = new double[col][row];
        double trans2[][] = new double[col][row];

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                trans1[j][i] = matrix[i][j];
            }
        }

        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                trans2[j][i] = matrix2[i][j];
            }
        }

        printf("\nOriginal form of Matrix 1: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrix[i][j] + "]");
            }
            println();
        }

        printf("\nOriginal form of Matrix 2: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + matrix2[i][j] + "]");
            }
            println();
        }

        printf("\nTranspose of Matrix 1: \n");
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                print("[" + trans1[i][j] + "]");
            }
            printf("\n");
        }

        printf("\nTranspose of Matrix 2: \n");
        for(int i=0;i<col;i++) {
            for(int j=0;j<row;j++) {
                print("[" + trans2[i][j] + "]");
            }
            printf("\n");
        }

    }
    public static void main (String[] args){
        (new MatrixCalculator()).start(args);
    }

}
