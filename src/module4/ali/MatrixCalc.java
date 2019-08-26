package module4.ali;
import acm.program.ConsoleProgram;

/* Incomplete and erroneous */
public class MatrixCalc extends ConsoleProgram {
    int[][] matrix1;
    int[][] matrix2;
    int[][] matrix1Values;
    int[][] matrix2Values;

    public void run() {
        intro();
        firstSelection();
    }

    private void intro() {
        print("Welcome to Marxette's Matrix Calculator!\n" +
                "This program is case-sensitive so be careful with your inputs!\n" +
                "The maximum dimension for the matrices would be 3x3\n");
    }

    private void firstSelection() {
        print("\nType [1] to create a Matrix Problem\n" +
                "Type [2] to quit\n");

        int option = readInt("> ");

        switch(option) {
            case 1:
                selectionMenu();
                break;
            case 2:
                // If user types 2 then the calculator exits
                exit();
            default:
                println("Invalid Input\n");
                firstSelection();
        }

    }

    private void selectionMenu() {
        print("\n---------------------------------------------\n");
        print("Selection Menu\n");
        int choice = readInt("Type [1] to create the first Matrix\n" +
                "Type [2] to create the second matrix\n" +
                "Type [3] to do the matrix operations\n" +
                "Type [4] to exit the program\n> ");

        switch (choice){
            case 1:
                matrixOne();
                break;
            case 2:
                matrixTwo();
                break;
            case 3:
                operators();
                break;
            default:
                print("Invalid input");
                selectionMenu();
        }
    }

    private void matrixProblem() {
        println("\n");

        matrixOne();
        matrixTwo();

        verification();
        operators();

        print("\n---------------------------------------------\n");
        // Allows Users to go to main menu
        firstSelection();
    }

    private boolean operators() {
        boolean statusC = true;
        while (statusC) {
            print("\n---------------------------------------------\n");
            String operator = readLine("Select Matrix Operation\n\n" +
                    "Type [+] for Addition\n" +
                    "Type [-] for Subtraction\n" +
                    "Type [*] for Multiplication\n" +
                    "Type [T] for Transpose\n" +
                    "Type [0] to exit the program\n> ");
            statusC = performOperation(operator, matrix1Values, matrix2Values);
        } return statusC;
    }

    private boolean matrixOne() {
        boolean dimension = true;
        int rowOne = readInt("\nEnter number of rows for the first matrix: ");
        int columnOne = readInt("Enter number of columns for the first matrix: ");

        if ((rowOne <= 3) && (columnOne <= 3)) {
            matrix1 = createMatrix(rowOne, columnOne);

            matrix1Values = setMatrixValues(matrix1, "first");

            if (matrix2Values != null){
                verification();
            } else selectionMenu();

        } else
            dimension = false;
        return dimension;
    }

    private boolean matrixTwo() {
        boolean dimension = true;
        int rowTwo = readInt("\nEnter number of rows for the second matrix: ");
        int columnTwo = readInt("Enter number of columns for the second matrix: ");

        if ((rowTwo <= 3) && (columnTwo <= 3)) {
            matrix2 = createMatrix(rowTwo, columnTwo);

            matrix1Values = setMatrixValues(matrix2, "second");

            selectionMenu();

            if (matrix1Values != null){
                verification();
            } else selectionMenu();

        } else
            dimension = false;
        return dimension;
    }



    private int[][] createMatrix(int numRows, int numColumns){
        int[][] matrix = new int[numRows][numColumns];
        return matrix;
    }

    private void verification() {
        print("\n\n MATRIX 1\n ");
        for(int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                int charM1 = matrix1[i][j];
                print(charM1 + " ");
            }
            print("\n ");
        }
        print("\n\n MATRIX 2\n ");
        for(int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int charM2 = matrix2[i][j];
                print(charM2 + " ");
            }
            print("\n ");
        }
        print("\n\n---------------------------------------------\n");
        int verify = readInt("Type [1] to confirm both matrices\n" +
                "Type [2] to create new matrices\n" +
                "Type [3] to change matrix values\n" +
                "Type [4] to exit the program\n> ");
        switch (verify){
            case 1:
                break;
            case 2:
                matrixProblem();
            case 3:
                matrix1Values = setMatrixValues(matrix1,"first");
                matrix2Values = setMatrixValues(matrix2, "second");
                verification();
            case 4:
                exit();
            default:
                println("Invalid Input\n");
        }
    }

    private boolean performOperation(String operator, int[][] matrix1, int[][] matrix2){
        int optSelected;
        boolean status = false;
        switch(operator){
            case "*":
                multiplication(matrix1, matrix2);
                break;
            case "+":
                addition(matrix1, matrix2);
                break;
            case "-":
                subtraction(matrix1, matrix2);
                break;
            case "T":
                transposeMatrixOne(matrix1);
                print("\n");
                transposeMatrixTwo(matrix2);
                break;
            default:
                println("Operator invalid");
                break;
        }
        // Dialogue informing users of options after arithmetic operation
        // is done running. Options include performing additional operations
        // on the set matrices or to exit
        print("\n---------------------------------------------\n");
        optSelected = readInt("Type [1] to perform another operation on the matrices\n" +
                "Type [2] to create new matrices\n" +
                "Type [3] to exit the program\n");
        switch(optSelected){
            case 1:
                status = true;
                break;
            case 2:
                matrixProblem();
                break;
            case 3:
                exit();
        }
        return status;
    }

    private int[][] setMatrixValues(int[][] matrix, String label){
        int rows = matrix.length;
        int columns = matrix[0].length;
        print("\nEnter values for the " + label + " matrix\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int dataEntered = readInt("Row " + (i + 1) + ", column " + (j + 1) + ":");
                matrix[i][j] = dataEntered;
            }
        }
        return matrix;
    }

    private void multiplication(int[][] matrix1, int[][] matrix2){
        boolean status = matrixMultiCheck(matrix1, matrix2);
        if(status == true){
            int[][] multi = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++){
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++)
                        multi[i][j] += matrix1[i][k] * matrix2[k][j];
                    print(multi[i][j] + " ");
                }
                print("\n");
            }
            print("\n");
        }else
            print("\nInvalid Input");
    }

    private void addition(int[][] matrix1, int[][] matrix2){
        boolean status = matrixAddSubCheck(matrix1, matrix2);
        if(status == true){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix1[0].length; j++){
                    int charM1 = matrix1[i][j];
                    int charM2 = matrix2[i][j];
                    int resultant = charM1 + charM2;
                    print(resultant+" ");
                }
                print("\n");
            }
        }else{
            println("\nAddition operation is not available since both matrices do not have the same dimensions");
        }
    }
    private void subtraction(int[][] matrix1, int[][] matrix2){
        boolean status = matrixAddSubCheck(matrix1, matrix2);
        if(status == true){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix1[0].length; j++){
                    int charM1 = matrix1[i][j];
                    int charM2 = matrix2[i][j];
                    int resultant = charM1 - charM2;
                    print(resultant+ " ");
                }
                print("\n");
            }
        }else{
            println("\nSubtraction operation is not available since both matrices do not have the same dimensions");
        }
    }

    private void transposeMatrixOne(int[][] matrix1) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix1[j][i];
                print(transpose[i][j] + " ");
            }
            print("\n");
        }
    }

    private void transposeMatrixTwo(int[][] matrix2) {
        int rows = matrix2.length;
        int columns = matrix2[0].length;
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix2[j][i];
                print(transpose[i][j] + " ");
            }
            print("\n");
        }
    }

    private boolean matrixAddSubCheck(int[][] matrix1, int[][] matrix2){
        boolean status;
        int numRows1 = matrix1.length;
        int numColumns1 = matrix1[0].length;
        int numRows2 = matrix2.length;
        int numColumns2 = matrix2[0].length;
        if(numRows1 == numRows2 && numColumns1 == numColumns2){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
    private boolean matrixMultiCheck(int[][] matrix1, int[][] matrix2){
        boolean status;
        int columns = matrix1[0].length;
        int rows = matrix2.length;
        if(columns == rows){
            status = true;
        }else{
            status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        new MatrixCalc().start(args);
    }

}