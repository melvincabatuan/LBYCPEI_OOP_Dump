package module4.job;

import acm.program.*;

public class MatrixCalculator extends ConsoleProgram {


    public static final int MAX_ROW = 3;
    public static final int MAX_COL = 3;
    int [][] table1;
    int [][] table2;
    private int table1_row;
    private int table1_column;
    private int table2_row;
    private int table2_column;
    private int sum = 0;
    private int difference = 0;
    private int product = 0;
    private int first = 0;
    private int second = 0;
    private int endInput;


    public void run() {
        int initializer = 0;

        while (initializer == 0) {
            mainMenu();
            int input = readInt("");
            if (input == 1) {
                table1();
                println();
            }

            else if (input == 2) {
                table2();
                println();
            }

            else if (input == 3) {
                println();
                operation();
                int choice = readInt("");
                switch (choice) {
                    case 1:
                        if (table1_row == 0 && table1_column == 0) {
                            println("\nTable for Matrix 1 is empty!\n");
                            break;
                        }

                        if (table2_row == 0 && table2_column == 0){
                            println("\nTable for Matrix 2 is empty!\n");
                            break;
                        }

                        displayTables();

                        println("Sum:");
                        for(int x = 0; x < table1_row; x++){
                            for(int y = 0; y < table1_column; y++){
                                sum += (table1[x][y] + table2[x][y]);
                                print(sum + " ");
                                sum = 0;
                            }
                            println();
                        }
                        println("");
                        break;

                    case 2:
                        if (table1_row == 0 && table1_column == 0){
                            println("\nTable for Matrix 1 is empty!\n");
                            break;
                        }
                        if (table2_row == 0 && table2_column == 0){
                            println("\nTable for Matrix 2 is empty!\n");
                            break;
                        }

                        displayTables();

                        println("Difference:");
                        for(int x = 0; x < table1_row; x++){
                            for(int y = 0; y < table1_column; y++){
                                difference += (table1[x][y] - table2[x][y]);
                                print(difference + " ");
                                difference = 0;
                            }
                            println();
                        }
                        println("");
                        break;

                    case 3:
                        if (table1_row == 0 && table1_column == 0){
                            println("\nTable for Matrix 1 is empty!\n");
                            break;
                        }
                        if (table2_row == 0 && table2_column == 0){
                            println("\nTable for Matrix 2 is empty!\n");
                            break;
                        }

                        displayTables();

                        println("Product:");
                        for(int x = 0; x < table1_row; x++){
                            for(int y = 0; y < table1_column; y++){
                                product += (table1[x][y] * table2[x][y]);
                                print(product + " ");
                                product = 0;
                            }
                            println();
                        }
                        println("");
                        break;

                    case 4:
                        if (table1_row == 0 && table1_column == 0){
                            println("\nMatrix 1 is empty!\n");
                            break;
                        }
                        if (table2_row == 0 && table2_column == 0){
                            println("\nMatrix 2 is empty!\n");
                            break;
                        }

                        displayTables();

                        println("Transposed table for Matrix 1:");
                        for(int x = 0; x < table1_row; x++){
                            for(int y = 0; y < table1_column; y++){
                                first = table1[x][y];
                                second = table2[x][y];
                                table1[x][y] = second;
                                table2[x][y] = first;
                                print(table1[x][y] + " ");
                            }
                            println();
                        }
                        println("");

                        println("Transposed table for Matrix 2:");
                        for(int x = 0; x < table2_row; x++){
                            for(int y = 0; y < table2_column; y++){
                                print(table2[x][y] + " ");
                            }
                            println();
                        }
                        println("");
                        break;

                    default:
                        println("Invalid input! Please try again.");
                        println();
                }
            }

            else if (input == 4) {
                println("Goodbye!");
                break;
            }

            else {
                println("Invalid input! Please try again.");
            }
        }
    }

    private void mainMenu(){
        println("Please input the appropriate number of your choice:");
        println("[1] Input for table in Matrix 1");
        println("[2] Input for table in Matrix 2");
        println("[3] Perform matrix operations");
        println("[4] Exit program");
    }

    private void end(){
        println("\n[1] Return to main menu");
        println("[2] Exit program\n");
        endInput = readInt("");
        while (endInput < 1 || endInput > 2) {
            println("Invalid input! Please try again.");
            println("\n[1] Return to main menu");
            println("[2] Exit program\n");
            endInput = readInt("");
        }

        if (endInput == 2) {
            println("Goodbye!");
            exit();
        }
    }

    private void operation(){
        println("[1] Addition");
        println("[2] Subtraction");
        println("[3] Multiplication");
        println("[4] Transpose");
    }

    private void table1(){
        table1 = new int[MAX_ROW][MAX_COL];

        println();

        // TABLE 1
        println("Input for table in Matrix 1:\n");
        println("NOTE: Max number of rows and column is 3.");

        int inputRow = readInt("Number of Rows: ");
        int inputColumn = readInt("Number of Columns: ");

        while (inputRow < 1 || inputRow > 3 || inputColumn < 1 || inputColumn > 3) {
            println("Number of rows and columns should be between 1 and 3! Please try again.");
            inputRow = readInt("Number of Rows: ");
            inputColumn = readInt("Number of Columns: ");
        }

        println("");
        for(int x = 0; x < inputRow; x++){
            for(int y = 0; y < inputColumn; y++){
                table1[x][y] = readInt("Row[" + x + "]Column[" + y + "] = ");
            }
        }

        println("");
        println("Table in Matrix 1:");
        for(int x = 0; x < inputRow; x++){
            for(int y = 0; y < inputColumn; y++){
                print(table1[x][y] + " ");
            }
            println();
        }
        table1_row = inputRow;
        table1_column = inputColumn;
        end();
    }

    private void table2(){
        table2 = new int[MAX_ROW][MAX_COL];

        println("");
        println("Input for table in matrix 2:\n");
        println("NOTE: Max number of rows and column is 3.");

        int inputRow1 = readInt("Number of Rows: ");
        int inputColumn1 = readInt("Number of Columns: ");

        while (inputRow1 < 1 || inputRow1 > 3 || inputColumn1 < 1 || inputColumn1 > 3) {
            println("Number of rows and columns should be between 1 and 3! Please try again.");
            inputRow1 = readInt("Number of Rows: ");
            inputColumn1 = readInt("Number of Columns: ");
        }

        println("");
        for(int x = 0; x < inputRow1; x++){
            for(int y = 0; y < inputColumn1; y++){
                table2[x][y] = readInt("Row[" + x + "]Column[" + y + "] = ");
            }
        }

        println("");
        println("Matrix 2:");
        for(int x = 0; x < inputRow1; x++){
            for(int y = 0; y < inputColumn1; y++){
                print(table2[x][y] + " ");
            }
            println();
        }
        table2_row = inputRow1;
        table2_column = inputColumn1;
        end();
    }

    private void displayTables(){
        println("");
        println("Table for Matrix 1:");
        for(int x = 0; x < table1_row; x++){
            for(int y = 0; y < table1_column; y++){
                print(table1[x][y] + " ");
            }
            println();
        }
        println("");
        println("Table for Matrix 2:");
        for(int x = 0; x < table2_row; x++){
            for(int y = 0; y < table2_column; y++){
                print(table2[x][y] + " ");
            }
            println();
        }
        println("");
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new MatrixCalculator()).start(args);
    }
}