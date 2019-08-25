package module4.panes;//Panes, Michael Ryan B.

import acm.program.*;

import java.text.DecimalFormat;

public class Matrix extends ConsoleProgram {

    public static final int MAX_ROW = 3;
    public static final int MAX_COL = 3;

    public void run() {
        menu();
    }

    public void menu() {
        DecimalFormat decimal = new DecimalFormat("#.00");
        int choice = 0;
        int init2 = 0,init3 = 0, row1 = 0, col1 = 0, row2 = 0, col2 = 0;
        double[][] firstArray, secondArray,thirdArray;
        firstArray = new double[MAX_ROW][MAX_COL];
        secondArray = new double[MAX_ROW][MAX_COL];
        thirdArray = new double[MAX_ROW][MAX_COL];

        while (choice != 9) {
            println("-----------------------");
            println("Matrix calculator");
            println("-----------------------");
            println("1. Enter First Matrix");
            println("2. Enter Second Matrix");
            println("3. Addition");
            println("4. Subtraction");
            println("5. Multiplication");
            println("6. Division");
            println("7. Transpose");
            println("8. Exit");
            choice = readInt();
            println();
            println();
            println();


            if (choice == 1) {
                println("Enter column size (max=3): ");
                col1 = readInt();

                while (col1 <= 0 || col1 >= 4) {
                    println("Invalid column size.");
                    println("");
                    println("Enter column size (max=3): ");
                    col1 = readInt();

                }

                println("Enter row size (max=3): ");
                row1 = readInt();

                while (row1 <= 0 || row1 >= 4) {
                    println("Invalid row size.");
                    println("");
                    println("Enter row size (max=3): ");
                    row1 = readInt();
                }
                for (int i = 0; i < row1; i++) {
                    for (int j = 0; j < col1; j++) {
                        firstArray[i][j] = readDouble("First Array[" + i + "][" + j + "]=");
                    }
            }
                clearScreen();
                init2 = 1;
            }


            else if (choice == 2) {
                println("Enter column size (max=3): ");
                col2 = readInt();

                while (col2 <= 0 || col2 >= 4) {
                    println("Invalid column size.");
                    println("");
                    println("Enter column size (max=3): ");
                    col2 = readInt();

                }

                println("Enter row size (max=3): ");
                row2 = readInt();

                while (row2 <= 0 || row2 >= 4) {
                    println("Invalid row size.");
                    println("");
                    println("Enter row size (max=3): ");
                    row2 = readInt();
                }

                    for (int i = 0; i < row2; i++) {
                        for (int j = 0; j < col2; j++) {
                            secondArray[i][j] = readDouble("Second Array[" + i + "][" + j + "]=");
                        }
                }
                clearScreen();

                init3 = 1;
            }


            else if  (choice == 3) {
                if (init2==0 || init3==0){
                    clearScreen();
                    println("No values have been inputted in the matrix yet.");
                }
                else {
                    clearScreen();
                    println("Addition");


                    println("First Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            print(firstArray[i][j] + "         ");
                        }
                        println();
                    }
                    println("Second Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            print(secondArray[i][j] + "         ");
                        }
                        println();
                    }

                    println("First Array + Second Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            thirdArray[i][j] = firstArray[i][j] + secondArray[i][j];
                            print(thirdArray[i][j] + "         ");
                        }
                        println();
                    }

                    println();
                    println();
                    println();



                }
            }

            else if  (choice == 4) {
                if (init2==0 || init3==0) {
                    clearScreen();
                    println("No values have been inputted in the matrix yet.");

                }
                else {
                    clearScreen();
                    println("Subtraction");


                    println("First Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            print(firstArray[i][j] + "         ");
                        }
                        println();
                    }
                    println("Second Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            print(secondArray[i][j] + "         ");
                        }
                        println();
                    }

                    println("First Array - Second Array");
                    for(int i = 0; i < 3; i++){
                        for(int j = 0; j < 3; j++){
                            thirdArray[i][j] = firstArray[i][j] - secondArray[i][j];
                            print(thirdArray[i][j] + "         ");
                        }
                        println();
                    }

                    println();
                    println();
                    println();

                }
            }

            else if  (choice == 5) {
                if (init2==0 || init3==0) {
                    clearScreen();
                    println("No values have been inputted in the matrix yet.");


                }
                else if (row1!=row2&&col1!=col2){
                    clearScreen();
                    println("Invalid matrix size.");
                }
                if (row1==row2&&col1==col2){
                    clearScreen();
                    println("Multiplication");

                    println("First Array");
                    for(int i = 0; i < col1; i++){
                        for(int j = 0; j < row1; j++){
                            print(firstArray[i][j] + "         ");
                        }
                        println();
                    }
                    println("Second Array");
                    for(int i = 0; i < col1; i++){
                        for(int j = 0; j < row1; j++){
                            print(secondArray[i][j] + "         ");
                        }
                        println();
                    }

                    println("First Array * Second Array");
                    if(col1==1) {
                        if(row1==1) {
                            thirdArray[0][0] = firstArray[0][0] * secondArray[0][0];
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                        else if(row1==2){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[0][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[0][1]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }

                        }
                        else if(row1==3){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[0][0])+(firstArray[0][2]*secondArray[0][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[0][1])+(firstArray[0][2]*secondArray[0][1]));
                            thirdArray[0][2] = ((firstArray[0][0] * secondArray[0][2])+(firstArray[0][1]*secondArray[0][2])+(firstArray[0][2]*secondArray[0][2]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }

                        }
                    }

                    else if(col1==2) {
                        if(row1==1) {
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[1][0]*secondArray[0][0]));
                            thirdArray[1][0] = ((firstArray[0][0] * secondArray[1][0])+(firstArray[1][0]*secondArray[1][0]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                        else if(row1==2){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[1][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[1][1]));
                            thirdArray[1][0] = ((firstArray[1][0] * secondArray[0][0])+(firstArray[1][1]*secondArray[1][0]));
                            thirdArray[1][1] = ((firstArray[1][0] * secondArray[0][1])+(firstArray[1][1]*secondArray[1][1]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                        else if(row1==3){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[1][0])+(firstArray[0][2]*secondArray[2][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[1][1])+(firstArray[0][2]*secondArray[2][1]));
                            thirdArray[0][2] = ((firstArray[0][0] * secondArray[0][2])+(firstArray[0][1]*secondArray[1][2])+(firstArray[0][2]*secondArray[2][2]));
                            thirdArray[1][0] = ((firstArray[1][0] * secondArray[0][0])+(firstArray[1][1]*secondArray[1][0])+(firstArray[1][2]*secondArray[2][0]));
                            thirdArray[1][1] = ((firstArray[1][0] * secondArray[0][1])+(firstArray[1][1]*secondArray[1][1])+(firstArray[1][2]*secondArray[2][1]));
                            thirdArray[1][2] = ((firstArray[1][0] * secondArray[0][2])+(firstArray[1][1]*secondArray[1][2])+(firstArray[1][2]*secondArray[2][2]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                    }

                    else if(col1==3) {
                        if(row1==1) {
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[1][0]*secondArray[0][0])+(firstArray[2][0]*secondArray[0][0]));
                            thirdArray[1][0] = ((firstArray[0][0] * secondArray[1][0])+(firstArray[1][0]*secondArray[1][0])+(firstArray[2][0]*secondArray[1][0]));
                            thirdArray[2][0] = ((firstArray[0][0] * secondArray[2][0])+(firstArray[1][0]*secondArray[2][0])+(firstArray[2][0]*secondArray[2][0]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                        else if(row1==2){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[1][0])+(firstArray[0][2]*secondArray[2][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[1][1])+(firstArray[0][2]*secondArray[2][1]));
                            thirdArray[1][0] = ((firstArray[1][0] * secondArray[0][0])+(firstArray[1][1]*secondArray[1][0])+(firstArray[1][2]*secondArray[2][0]));
                            thirdArray[1][1] = ((firstArray[1][0] * secondArray[0][1])+(firstArray[1][1]*secondArray[1][1])+(firstArray[1][2]*secondArray[2][1]));
                            thirdArray[2][0] = ((firstArray[2][0] * secondArray[0][0])+(firstArray[2][1]*secondArray[1][0])+(firstArray[2][2]*secondArray[2][0]));
                            thirdArray[2][1] = ((firstArray[2][0] * secondArray[0][1])+(firstArray[2][1]*secondArray[1][1])+(firstArray[2][2]*secondArray[2][1]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }
                        }
                        else if(row1==3){
                            thirdArray[0][0] = ((firstArray[0][0] * secondArray[0][0])+(firstArray[0][1]*secondArray[1][0])+(firstArray[0][2]*secondArray[2][0]));
                            thirdArray[0][1] = ((firstArray[0][0] * secondArray[0][1])+(firstArray[0][1]*secondArray[1][1])+(firstArray[0][2]*secondArray[2][1]));
                            thirdArray[0][2] = ((firstArray[0][0] * secondArray[0][2])+(firstArray[0][1]*secondArray[1][2])+(firstArray[0][2]*secondArray[2][2]));
                            thirdArray[1][0] = ((firstArray[1][0] * secondArray[0][0])+(firstArray[1][1]*secondArray[1][0])+(firstArray[1][2]*secondArray[2][0]));
                            thirdArray[1][1] = ((firstArray[1][0] * secondArray[0][1])+(firstArray[1][1]*secondArray[1][1])+(firstArray[1][2]*secondArray[2][1]));
                            thirdArray[1][2] = ((firstArray[1][0] * secondArray[0][2])+(firstArray[1][1]*secondArray[1][2])+(firstArray[1][2]*secondArray[2][2]));
                            thirdArray[2][0] = ((firstArray[2][0] * secondArray[0][0])+(firstArray[2][1]*secondArray[1][0])+(firstArray[2][2]*secondArray[2][0]));
                            thirdArray[2][1] = ((firstArray[2][0] * secondArray[0][1])+(firstArray[2][1]*secondArray[1][1])+(firstArray[2][2]*secondArray[2][1]));
                            thirdArray[2][2] = ((firstArray[2][0] * secondArray[0][2])+(firstArray[2][1]*secondArray[1][2])+(firstArray[2][2]*secondArray[2][2]));
                            for(int i = 0; i < col1; i++){
                                for(int j = 0; j < row1; j++){
                                    print(thirdArray[i][j] + "         ");
                                }
                                println();
                            }

                        }
                    }
                    println();
                    println();
                    println();

                }
            }

            else if  (choice == 6) {
                if (init2==0 || init3==0) {
                    clearScreen();
                    println("No values have been inputted in the matrix yet.");


                }
                else if (row1!=row2||col1!=row2){
                    clearScreen();
                    println("Invalid matrix size.");
                }
                else {
                    clearScreen();
                    println("Division");

                    println("First Array");
                    for(int i = 0; i < row1; i++){
                        for(int j = 0; j < col1; j++){
                            print(firstArray[i][j] + "         ");
                        }
                        println();
                    }
                    println("Second Array");
                    for(int i = 0; i < row1; i++){
                        for(int j = 0; j < col1; j++){
                            print(secondArray[i][j] + "         ");
                        }
                        println();
                    }

                    println("First Array / Second Array");
                    for(int i = 0; i < row1; i++){
                        for(int j = 0; j < col1; j++){
                            thirdArray[i][j] = firstArray[i][j] / secondArray[i][j];
                            print(decimal.format(thirdArray[i][j])+ "         ");
                        }
                        println();
                    }

                    println();
                    println();
                    println();
                }
            }

            else if  (choice == 7) {
                if (init2==0 || init3==0) {
                    clearScreen();
                    println("No values have been inputted in the matrix yet.");


                }
                else {
                    clearScreen();
                    println("Transpose");

                    println("First Array");
                    for(int i = 0; i < row1; i++){
                        for(int j = 0; j < col1; j++){
                            print(firstArray[i][j] + "         ");
                        }
                        println();
                    }
                    println("Second Array");
                    for(int i = 0; i < row2; i++){
                        for(int j = 0; j < col2; j++){
                            print(secondArray[i][j] + "     ");
                        }
                        println();
                    }

                    println("First Array transposed");
                    for(int i = 0; i < col1; i++){
                        for(int j = 0; j < row1; j++){
                            print(firstArray[j][i] + "         ");
                        }
                        println();
                    }

                    println("Second Array transposed");
                    for(int i = 0; i < col2; i++){
                        for(int j = 0; j < row2; j++){
                            print(secondArray[j][i] + "         ");
                        }
                        println();
                    }

                    println();
                    println();
                    println();
                }
            }

            else if  (choice == 8) {
                println("Exit");
                exit();
            }

            else {
                clearScreen();
                println("Invalid\n\n");
                menu();

            }
        }
        }

        public void clearScreen () {
            for (int i = 0; i < 500; i++) {
                println("");
            }
        }

        // Solves java.lang.NoClassDefFoundError 
        public static void main (String[]args){
            (new Matrix()).start(args);
        }
    }