package module4.dong;

import acm.program.*;

public class MatrixCalc extends ConsoleProgram {


    public static final int MAX_ROW = 3;
    public static final int MAX_COL = 3;
    private int [][] myArray;     // declaration (no allocation)
    private int [][] myArray2;
    private int myRow;
    private int myCol;
    private int [][] add;
    private int [][] sub;
    private int [][] mul;
    private int [][] trans;


    public void run() {
        myArray = new int[MAX_ROW][MAX_COL];  // memory alloc
        myArray2 = new int[MAX_ROW][MAX_COL];

        myRow = readInt("row: ");
        myCol = readInt("col: ");

        while(myRow >3 || myRow <1){
            myRow = readInt("please enter a row more than 1 and less than 3 row: ");
        }
        while(myCol>3 || myCol <1){
            myCol = readInt("please enter a row more than 1 and less than 3 row: ");
        }
        menu();
    }

    private void menu(){
        println("1.) Enter 1st Matrix");
        println("2.) Enter 2nd Matrix");
        println("3.) Operations");
        println("4.) Quit");
        int choose = readInt();
        while (choose >4 || choose <1){
            choose = readInt();
        }
        if (choose == 1){
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    myArray[row][col] = readInt("myArray[" + row + "][" + col + "]=");
                }
            }
            println("Your input is: ");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    print(myArray[row][col] + " ");
                }
                println();
            }
            println("Enter second array");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    myArray2[row][col] = readInt("myArray2[" + row + "][" + col + "]=");
                }
            }
            println("Your input is: ");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    print(myArray2[row][col] + " ");
                }
                println();
            }
            operations();
        }
        else if (choose == 2){
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    myArray[row][col] = readInt("myArray[" + row + "][" + col + "]=");
                }
            }
            println("Your input is: ");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    print(myArray[row][col] + " ");
                }
                println();
            }
            println("Enter second Array");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    myArray2[row][col] = readInt("myArray2[" + row + "][" + col + "]=");
                }
            }
            println("Your input is: ");
            for(int row = 0; row < myRow; row++){
                for(int col = 0; col < myCol; col++){
                    print(myArray2[row][col] + " ");
                }
                println();
            }
            operations();
        }
        else if (choose == 3){
            println("Matrices are empty please enter them first.");
            menu();
        }
        else if (choose == 4){
            System.exit(0);
        }
    }

    private void operations(){
        println("1.) Addition");
        println("2.) Subtraction");
        println("3.) Multiplication");
        println("4.) Transpose");

        add = new int[MAX_ROW][MAX_COL];
        sub = new int[MAX_ROW][MAX_COL];
        mul = new int[MAX_ROW][MAX_COL];
        trans = new int[MAX_ROW][MAX_COL];
        int sum;
        int choice = readInt();

        if (choice == 1){
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    add[i][j] = myArray[i][j] + myArray2[i][j];
                    print(add[i][j]+" ");
                }
                println();
            }
        }
        if (choice == 2){
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    sub[i][j] = myArray[i][j] - myArray2[i][j];
                    print(sub[i][j]+" ");
                }
                println();
            }
        }
        if (choice == 3){
            for(int i =0;i<myRow;i++){
                for(int j=0;j<myCol;j++){
                    sum=0;
                    for(int k =0;k<myRow;k++){
                        sum = sum + myArray[i][k] * myArray2[k][j];
                    }
                    mul[i][j]=sum;

                }
            }

            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){

                    print(mul[i][j]+" ");

                }
                println();
            }
        }
        if (choice == 4){
            println("1st transposed matrix:");
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    trans[j][i] = myArray[i][j];
                }
            }
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    print(trans[i][j]+" ");
                }
                println();
            }
            println("Second transposed matrix: ");
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    trans[j][i] = myArray2[i][j];
                }
            }
            for(int i = 0;i<myRow;i++){
                for(int j = 0;j<myCol;j++){
                    print(trans[i][j]+" ");
                }
                println();
            }
        }
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new MatrixCalc()).start(args);
    }
}