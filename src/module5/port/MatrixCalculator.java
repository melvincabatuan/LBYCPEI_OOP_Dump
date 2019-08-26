package module5.port;

/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 06 - 07 - 2019
 */
import acm.program.*;

public class MatrixCalculator extends ConsoleProgram {

    int col1, col2;
    int row1, row2;

    private CalculateMatrix calculateMatrix;

    public void run() {

        calculateMatrix = new CalculateMatrix();

        int choice = 0;

        while (choice != 9) {

            printf("\nSelect Operation:\n1) Input matrix size \n2) Input values for the first matrix \n3) Input values for the second matrix \n4) Display Data \n5) Matrix Addition \n6) Matrix Subtraction \n7) Matrix Multiplication \n8) Matrix Transpose \n9) Exit\n\nInput your selection: ");
            choice = readInt();

            if (choice == 1) {
                int row = inputMatrixRow1();
                int col = inputMatrixColumn1();

                int row2 = inputMatrixRow2();
                int col2 = inputMatrixColumn2();
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

    private int inputMatrixColumn1(){
        printf("\nEnter the number of columns in the First Matrix: ");
        col1 = calculateMatrix.setMatrixRows1(readInt());
        return col1;
    }

    private int inputMatrixRow1(){
        printf("\nEnter the number of rows in the First Matrix: ");
        row1 = calculateMatrix.setMatrixColumns1(readInt());
        return row1;
    }

    private int inputMatrixColumn2(){
        printf("\nEnter the number of columns in the Second Matrix: ");
        col2 = calculateMatrix.setMatrixRows2(readInt());
        return col2;
    }

    private int inputMatrixRow2(){
        printf("\nEnter the number of rows in the Second Matrix: ");
        row2 = calculateMatrix.setMatrixColumns2(readInt());
        return row2;
    }

    public void inputMatrixValues() {
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < row1; j++) {
                println("\nInput value of " + (i + 1) + " x " + (j + 1) + " in the first matrix: ");
                calculateMatrix.setMatrix1Values(i, j, readInt());
            }
        }
    }

    public void inputMatrix2Values(){
        for (int i = 0; i < col2; i++){
            for (int j = 0 ; j < row2; j++){
                println("\nInput value of " + (i+1) + " x " + (j+1) + " in the second matrix: ");
                calculateMatrix.setMatrix2Values(i,j,readInt());
            }
        }
    }

    public void displayMatrixValues(){
        printf("\nMatrix Values for the first matrix: \n");
        for (int i = 0; i < col1; i++) {
            for (int j = 0 ; j < row1; j++) {
                print("[" + calculateMatrix.getMatrix1Values(i, j) + "]");
            }
            println();
        }
        printf("\nMatrix Values for the second matrix: \n");
        for (int i = 0; i < col2; i++) {
            for (int j = 0 ; j < row2; j++) {
                print("[" + calculateMatrix.getMatrix2Values(i, j) + "]");
            }
            println();
        }
    }

    public void addMatrix(){

        int col = col1;
        if (col1 < col2) col =  col2;

        int row =  row1;
        if (row1 < row2) row =  row2;

        calculateMatrix.calculateMatrixSum();

        printf("\nAdded Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + calculateMatrix.getMatrixResult(i,j) + "]");
            }
            println();
        }
    }

    public void subtractMatrix(){

        int col = col1;
        if (col1 < col2) col =  col2;

        int row =  row1;
        if (row1 < row2) row =  row2;

        calculateMatrix.calculateMatrixDifference();

        printf("\nAdded Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + calculateMatrix.getMatrixResult(i,j) + "]");
            }
            println();
        }
    }

    public void multiplyMatrix(){

        int col = col1;
        if (col1 < col2) col =  col2;

        int row =  row1;
        if (row1 < row2) row =  row2;

        calculateMatrix.calculateMatrixProduct();

        printf("\nMultiplied Matrix Values: \n");
        for (int i = 0; i < col; i++) {
            for (int j = 0 ; j < row; j++) {
                print("[" + calculateMatrix.getMatrixResult(i,j) + "]");
            }
            println();
        }
    }

    public void transposeMatrix(){

        calculateMatrix.calculateMatrixTranspose();

        printf("\nOriginal form of Matrix 1: \n");
        for (int i = 0; i < col1; i++) {
            for (int j = 0 ; j < row1; j++) {
                print("[" + calculateMatrix.getMatrix1Values(i,j) + "]");
            }
            println();
        }

        printf("\nOriginal form of Matrix 2: \n");
        for (int i = 0; i < col2; i++) {
            for (int j = 0 ; j < row2; j++) {
                print("[" + calculateMatrix.getMatrix2Values(i,j) + "]");
            }
            println();
        }

        printf("\nTranspose of Matrix 1: \n");
        for(int i=0;i<row1;i++) {
            for(int j=0;j<col1;j++) {
                print("[" + calculateMatrix.getMatrix1Transpose(i,j) + "]");
            }
            printf("\n");
        }

        printf("\nTranspose of Matrix 2: \n");
        for(int i=0;i<row2;i++) {
            for(int j=0;j<col2;j++) {
                print("[" + calculateMatrix.getMatrix2Transpose(i,j) + "]");
            }
            printf("\n");
        }

    }
    public static void main (String[] args){
        (new MatrixCalculator()).start(args);
    }

}
