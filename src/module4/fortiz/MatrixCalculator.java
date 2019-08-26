package module4.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/21/19
 *
 */

import acm.program.*;

public class MatrixCalculator extends ConsoleProgram{
    private int row;
    private int col;
    private double[][] arr1, arr2, arr3, arr4;
    private boolean verify = true;

    public void run(){
        arr1 = new double[3][3];
        arr2 = new double[3][3];
        arr3 = new double[3][3];
        arr4 = new double[3][3];
        setSize();
        fillArray();
        readLine("Press any key to proceed to the operation menu.");
        clearScreen();
        menu();
        println("THANK YOU!");
    }

    private void setSize(){
        do{
            println("INPUT THE NUMBER OF ROWS (MAX 3)");
            row = readInt("row: ");
        }while(row<=0||row>3);
        do{
            println("INPUT THE NUMBER OF COLUMNS (MAX 3)");
            col = readInt("col: ");
        }while(col<=0||col>3);
    }

    private void fillArray(){
        println("\n Array 1");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j] = readDouble("(row "+ (i+1) +" col "+ (j+1) +")>>");
            }
        }

        println("\n Array 2");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[i][j] = readDouble("(row "+ (i+1) +" col "+ (j+1) +")>>");
            }
        }

        showArray("Array 1", arr1);
        showArray("Array 2", arr2);
    }

    private void menu(){
        while(verify){
            println("---- MATRIX CALCULATOR ----");
            println("1. Addition");
            println("2. Subtraction");
            println("3. Multiplication");
            println("4. Transpose");
            println("5. Exit");
            int choice = readInt(">>");
            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    transpose();
                    break;
                case 5:
                    verify = false;
                    break;
                default:
                    println("Invalid input");
                    break;
            }
            clearScreen();
        }
    }

    private void addition(){
        clearScreen();
        showArray("Array 1", arr1);
        showArray("Array 2", arr2);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        showArray("Array 1 + Array 2: ", arr3);
        readLine("Press any key to return to the operation menu.");
    }

    private void subtraction(){
        clearScreen();
        showArray("Array 1", arr1);
        showArray("Array 2", arr2);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[i][j] = arr1[i][j] - arr2[i][j];
                arr4[i][j] = arr2[i][j] - arr1[i][j];
            }
        }
        showArray("Array 1 - Array 2: ", arr3);
        showArray("Array 2 - Array 1: ", arr4);
        readLine("Press any key to return to the operation menu.");
    }

    private void multiplication(){
        clearScreen();
        showArray("Array 1", arr1);
        showArray("Array 2", arr2);
        if(row==col){
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int h = 0; h < col; h++) {
                        arr3[i][j] += arr1[i][h] * arr2[h][j];
                    }
                }
            }
            showArray("Array 1 * Array 2: ", arr3);
            readLine("Press any key to return to the operation menu.");
        }
        else print("Invalid operation.");
    }


    private void transpose(){

        clearScreen();
        showArray("Array 1", arr1);
        showArray("Array 2", arr2);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr3[j][i] = arr1[i][j];
                arr4[j][i] = arr2[i][j];
            }
        }
        println("\nTransposed Array 1:");
        for(int i=0;i<col;i++) {
            for (int j=0;j<row;j++) {
                print(arr3[i][j]+"\t");
            }
            println("");
        }
        println("\nTransposed Array 2:");
        for(int i=0;i<col;i++) {
            for (int j=0;j<row;j++) {
                print(arr4[i][j]+"\t");
            }
            println("");
        }

        readLine("Press any key to return to the operation menu.");

    }

    private void showArray(String prompt, double arr[][]){
        println("\n"+prompt);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                print(arr[i][j]+"\t");
            }
            print("\n");
        }
        println("");
    }

    private void clearScreen() {
        for (int i = 0; i < 1000; i++) {
            println();
        }
    }

    public static void main(String[] args) {
        (new MatrixCalculator()).start(args);
    }
}
