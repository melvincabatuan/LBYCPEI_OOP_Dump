package module4.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */


import acm.program.*;
public class MatrixCalc extends ConsoleProgram {
    public void run() {
        displayMenu();
    }

    public void displayMenu(){
        int choice;
        int row1 = readInt("Number of rows of Matrix 1: ");
        int col1 = readInt("Number of columns of Matrix 1: ");
        int row2 = readInt("Number of rows of Matrix 2: ");
        int col2 = readInt("Number of columns of Matrix 2: ");
        int[][] arr1;
        arr1 = new int[row1][col1];
        int[][] arr2;
        arr2 = new int[row2][col2];


        do {

            printf("\nMatrix Selection Menu\n");
            printf("---------------------\n");
            printf("1. First Matrix\n");
            printf("2. Second Matrix\n");
            printf("3. Addition\n");
            printf("4. Subtraction\n");
            printf("5. Multiplication\n");
            printf("6. Transpose\n");
            printf("7. Quit\n");
            choice = readInt("\nChoice: ");
            if (choice == 1) {
                arr1 = firstMatrix(row1, col1);
            }
            else if (choice == 2) {
                arr2 = secondMatrix(row2,col2);
            }
            else if (choice == 3){
                if((arr1==null) || (arr2==null)){
                    println("Both matrices should have values. Try Again.");
                    displayMenu();
                }
                else{
                    if((row1==row2)&&(col1==col2)){
                        addition(arr1, arr2, row1, col1, row2, col2);
                    }
                    else
                    {
                        println("Matrix 1 and 2 should have the same dimensions in order to accomplish this operation.\n");
                        displayMenu();
                    }
                }

            }
            else if (choice==4){
                if((arr1==null) || (arr2==null)){
                    println("Both matrices should have values. Try Again.");
                    displayMenu();
                }
                else{
                    if((row1==row2)&&(col1==col2)) {
                        subtraction(arr1, arr2, row1, col1, row2, col2);
                    }
                    else {
                        println("Matrix 1 and 2 should have the same dimensions in order to accomplish this operation.");
                        displayMenu();
                    }
                }
            }
            else if (choice==5){
                if((arr1==null) || (arr2==null)){
                    println("Both matrices should have values. Try Again.");
                    displayMenu();
                }
                else {
                    multiplication(arr1, arr2, row1, col1, row2, col2);
                }
            }
            else if (choice==6){
                if((arr1==null) || (arr2==null)){
                    println("Both matrices should have values. Try Again.");
                    displayMenu();
                }
                else {
                    transpose(arr1, arr2, row1, col1, row2, col2);
                }
            }
        } while (choice!=7);
        clearScreen();


    }

    public int[][] firstMatrix(int row, int col){
        int[][] arr;
        arr = new int[row][col];
        for(int x=0; x<row;x++){
            for(int y=0; y<col; y++){
                arr[x][y] = readInt("Array 1 [" + x + "][" + y + "]=");
            }
        }
        println("Your input is: ");
        for(int x = 0; x < row; x++){
            for(int y = 0; y < col; y++){
                print(arr[x][y] + " ");
            }
            println();
        }

        return arr;
    }

    public int[][] secondMatrix(int row2, int col2){
        int[][] arr2;
        arr2 = new int[row2][col2];
        for(int x2=0; x2<row2;x2++){
            for(int y2=0; y2<col2; y2++){
                arr2[x2][y2] = readInt("Array 2 [" + x2 + "][" + y2 + "]=");
            }
        }

        println("Your input is: ");
        for(int x2 = 0; x2 < row2; x2++){
            for(int y2 = 0; y2 < col2; y2++){
                print(arr2[x2][y2] + " ");
            }
            println();
        }

        return arr2;
    }

    public void addition(int[][] arr1, int[][] arr2, int row, int col, int row2, int col2){
        int x,y;
        int[][] arr3;
        arr3 = new int[row][col];

        for (x=0;x<row;x++) {
            for (y=0;y<col;y++) {
                arr3[x][y] = arr1[x][y] + arr2[x][y];
            }
        }

        clearScreen();
        println("The sum is: ");
        for(x = 0; x < row; x++){
            for(y = 0; y < col; y++){
                print(arr3[x][y] + " ");
            }
            println();
        }

    }

    public void subtraction(int[][] arr1, int[][] arr2, int row, int col, int row2, int col2){
        int x,y;
        int[][] arr3;
        arr3 = new int[row][col];

        for (x=0;x<row;x++) {
            for (y=0;y<col;y++) {
                arr3[x][y] = arr1[x][y] - arr2[x][y];
            }
        }

        clearScreen();
        println("The difference is: ");
        for(x = 0; x < row; x++){
            for(y = 0; y < col; y++){
                print(arr3[x][y] + " ");
            }
            println();
        }
    }

    public void multiplication(int[][] arr1, int[][] arr2, int row, int col, int row2, int col2){
        int x,y;
        int[][] arr3;
        arr3 = new int[row][col];
        int add = 0;

        for (x=0;x<row;x++) {
            for (y=0;y<col2;y++) {
                for(int z=0; z < row2; z++) {
                    add = add + arr1[x][z] * arr2[z][y];
                }
                arr3[x][y] = add;
                add = 0;
            }
        }

        clearScreen();
        println("The product is: ");
        for(x = 0; x < row; x++){
            for(y = 0; y < col2; y++){
                print(arr3[x][y] + " ");
            }
            println();
        }
    }

    public void transpose(int[][] arr1, int[][] arr2, int row, int col, int row2, int col2){
        int x,y;

        int[][] arr1new;
        arr1new = new int[row][col];
            int[][] arr2new;
            arr2new = new int[row][col];
            for (x = 0; x < row; x++) {
                for (y = 0; y < col; y++) {
                    arr2new[x][y] = arr1[x][y];
                }
            }

        for (x = 0; x < row2; x++) {
            for (y = 0; y < col2; y++) {
                arr1new[x][y] = arr2[x][y];
            }
        }


            println("\nThe new Array 1: ");
            for (x = 0; x < row; x++) {
                for (y = 0; y < col; y++) {
                    print(arr1new[x][y] + " ");
                }
                println();
            }

            println("\nThe new Array 2: ");
        for (x = 0; x < row; x++) {
            for (y = 0; y < col; y++) {
                print("New array 2: " + arr2new[x][y] + " ");
            }
            println();
        }

    }

    public void clearScreen() {
        for (int i = 0; i < 1000; i++) {
            println();
        }
    }

    // Solves java.lang.NoClassDefFoundError 
    public static void main(String[] args) {
        (new MatrixCalc()).start(args);
    }
}

