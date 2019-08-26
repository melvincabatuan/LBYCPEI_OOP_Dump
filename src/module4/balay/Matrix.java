package module4.balay;

import acm.program.ConsoleProgram;

public class Matrix extends ConsoleProgram {


    public static final int MAX_ROW = 3;
    public static final int MAX_COL = 3;
    public int myRow;
    public int myCol;
    public int myRow2;
    public int myCol2;
    public int sum=0;
    public int summ=0;
    public void run() {
        println("Hello LBYCPEI OOP!");
        int[][] myArray;
        int[][] myOtherArray;// declaration (no allocation)
        int[][] myFinalArray;
        myOtherArray = new int[MAX_ROW][MAX_COL];
        myArray = new int[MAX_ROW][MAX_COL];  // memory alloc
        myFinalArray = new int[MAX_ROW][MAX_COL];
        println();
        while (true) {
            println("1. Enter values for matrix A: ");
            println("2. Enter values for matrix B: ");
            println("3. Addition");
            println("4. Subtraction");
            println("5. Multiplication");
            println("6. Transpose");
            println("7. Quit");
            for (int row = 0; row < MAX_ROW; row++) {
                for (int col = 0; col < MAX_COL; col++) {
                    print(myArray[row][col] + " ");
                }
                println();
            }
            println();
            for (int row = 0; row < MAX_ROW; row++) {
                for (int col = 0; col < MAX_COL; col++) {
                    print(myOtherArray[row][col] + " ");
                }
                println();
            }
            int choice = readInt("");
            if (choice == 1) {
                myRow = readInt("row: ");
                myCol = readInt("col: ");

                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        myArray[row][col] = readInt("myArray[" + row + "][" + col + "]=");
                    }
                }
                println("Your input is: ");
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        print(myArray[row][col] + " ");
                    }
                    println();
                }
                println();
            } else if (choice == 2) {
                myRow2 = readInt("row: ");
                myCol2 = readInt("col: ");
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        myOtherArray[row][col] = readInt("myOtherArray[" + row + "][" + col + "]=");
                    }
                }
                println("Your input is: ");
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        print(myOtherArray[row][col] + " ");
                    }
                    println();
                }
                println();
            } else if (choice == 3) {
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        sum += myArray[row][col];
                    }
                }
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        sum += myOtherArray[row][col];
                    }
                }
                if (sum == 0) {
                    println("matrices must have values!");
                } else {
                    for (int row = 0; row < myRow; row++) {
                        for (int col = 0; col < myCol; col++) {
                            myFinalArray[row][col] = myArray[row][col] + myOtherArray[row][col];
                        }
                    }
                    println("The sum is:");
                    for (int row = 0; row < myRow; row++) {
                        for (int col = 0; col < myCol; col++) {
                            print(myFinalArray[col][row]+ " ");
                        }
                        println();
                    }

                }


            }
            else if(choice==4){
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        sum += myArray[row][col];
                    }
                }
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        sum += myOtherArray[row][col];
                    }
                }
                if (sum == 0) {
                    println("matrices must have values!");

                }
                else {
                    for (int row = 0; row < myRow; row++) {
                        for (int col = 0; col < myCol; col++) {
                            myFinalArray[row][col] = myArray[row][col] - myOtherArray[row][col];
                        }
                    }
                    println("The difference is:");
                    for (int row = 0; row < myRow; row++) {
                        for (int col = 0; col < myCol; col++) {
                            print(myFinalArray[col][row]+ " ");
                        }
                        println();
                    }

                }


            }
            else if(choice==5){
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        sum += myArray[row][col];
                    }
                }
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        sum += myOtherArray[row][col];
                    }
                }
                if (sum == 0) {
                    println("matrices must have values!");

                }
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        for (int count = 0; count < myCol; count++) {
                            summ = summ + myArray[row][count]*myOtherArray[count][col]; //Multiplying matrices is multiplying the rows of Matrix A and the columns of Matrix B
                        }

                        myFinalArray[row][col] = summ; //gets the product
                        summ = 0;
                    }
                }
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        print(myFinalArray[row][col] + " ");
                    }
                    println();
                }

            }
            else if(choice==6) {
                for (int row = 0; row < myRow; row++) {
                    for (int col = 0; col < myCol; col++) {
                        sum += myArray[row][col];
                    }
                }
                for (int row = 0; row < myRow2; row++) {
                    for (int col = 0; col < myCol2; col++) {
                        sum += myOtherArray[row][col];
                    }
                }
                if (sum == 0) {
                    println("matrices must have values!");

                } else {
                    for (int row = 0; row < MAX_ROW; row++) {
                        for (int col = 0; col < MAX_COL; col++) {
                            myFinalArray[row][col] = myOtherArray[row][col];
                        }

                    }
                    for (int row = 0; row <MAX_ROW ; row++) {
                        for (int col = 0; col < MAX_COL; col++) {
                            myOtherArray[row][col] = myArray[row][col];
                        }

                    }
                    for (int row = 0; row < MAX_ROW; row++) {
                        for (int col = 0; col < MAX_COL; col++) {
                            myArray[row][col] = myFinalArray[row][col];
                        }

                    }
                }

            }

            else if(choice==7){
                break;
            }
            else{
                println("INVALID");
            }
        }
        // Solves java.lang.NoClassDefFoundError

    }


    public static void main(String[] args) {
        (new Matrix()).start(args);
    }
}


// Array Demo 2