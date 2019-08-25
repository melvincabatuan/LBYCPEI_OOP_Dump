package module4.chiu;

import acm.program.ConsoleProgram;
public class MatrixCalculator extends ConsoleProgram {
    public double[][] firstMatrix;
    public double[][] secondMatrix;
    public int rows;
    public int column;
    public boolean flag=true;


    public void run() {
        while(flag)
        choices();
        println("Thank you for using the program");
    }

    private void matrixOne() {
        print("Input rows (Max 3) of first Matrix: ");
        rows = readInt();
        print("Input columns (Max 3) of first Matrix: ");
        column = readInt();
        firstMatrix = new double[rows][column];
        inputValues(firstMatrix);
        display(firstMatrix);
    }

    private void matrixTwo(){
        print("Input rows (Max 3) of second Matrix: ");
        rows = readInt();
        print("Input columns (Max 3) of second Matrix: ");
        column = readInt();
        secondMatrix = new double[rows][column];
        inputValues(secondMatrix);
        display(secondMatrix);
    }

    private void inputValues(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                print("Input value in [" + i + ", " + j + "]: ");
                matrix[i][j] = readDouble();
            }
        }
    }

    private void display(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            println();

            for (int j = 0; j < matrix[i].length; j++) {
                print(matrix[i][j] + "    ");

            }
        }
        println();
        println();
    }

    private void choices()
    {
        int choose;
        do {
            println("Choose Operations");
            println("1-Input First Matrix");
            println("2-Input Second Matrix");
            println("3-Addition");
            println("4-Subtraction");
            println("5-Multiplication");
            println("6-Transpose");
            println("7-Quit");
            print(">>");
            choose=readInt();
            println();
            println();
        }while(choose<=0 && choose>7);

        switch(choose)
        {
            case 1:  matrixOne(); break;
            case 2:  matrixTwo(); break;
            case 3: addition(); break;
            case 4: subtraction(); break;
            case 5: multiplication(); break;
            case 6: transpose(); break;
            case 7: flag = false; break;
            default: break;
        }
    }

    private void addition()
    {
        if((firstMatrix==null||secondMatrix==null)) println("Invalid Matrix\n");
        else if(firstMatrix.length!=secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length )
        println("Invalid Matrix\n");
        else{
            double [][] sum=new double[firstMatrix.length][firstMatrix[0].length];
            for(int i=0; i<firstMatrix.length; i++)
            {
                for (int j=0; j<firstMatrix[0].length;j++)
                {
                    sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
                }
            }
            display(sum);
        }
    }
    private void subtraction()
    {
        if((firstMatrix==null||secondMatrix==null)) println("Invalid Matrix\n");
        else if(firstMatrix.length!=secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length )
            println("Invalid matrix!\n");
        else{
            double [][] subtract=new double[firstMatrix.length][firstMatrix[0].length];
            for(int i=0; i<firstMatrix.length; i++)
            {
                for (int j=0; j<firstMatrix[0].length;j++)
                {
                    subtract[i][j]=firstMatrix[i][j]-secondMatrix[i][j];
                }
            }
            display(subtract);
        }
    }

    private void multiplication()
    {
        if((firstMatrix==null||secondMatrix==null)) println("Invalid Matrix\n");
        else if(firstMatrix[0].length==secondMatrix.length)
        {
            double [][] multiply=new double[firstMatrix.length][secondMatrix[0].length];
            for(int i=0; i<firstMatrix.length; i++) {

                for (int j=0; j<secondMatrix[0].length;j++)
                {
                    double adding=0;
                    for (int k = 0; k < firstMatrix[0].length;k++)
                    {
                        adding =(firstMatrix[i][k] * secondMatrix[k][j])+adding;
                    }
                    multiply[i][j]=adding;
                }

            }
            display(multiply);
        }
        else{
            println("Invalid Matrix\n");
        }
    }

    private void transpose()
    {
        moving(firstMatrix);
        moving(secondMatrix);
        println();
    }

    private void moving(double[][] arr)
    {
        if((firstMatrix==null||secondMatrix==null)) println("Invalid Matrix\n");
        else {
            double[][] trans = new double[arr[0].length][arr.length];
            for (int x = 0; x < arr[0].length; x++) {
                for (int y = 0; y < arr.length; y++) {
                    trans[x][y] = arr[y][x];
                }
            }
            display(trans);
        }
    }

    public static void main(String[] args) {
        new MatrixCalculator().start(args);
    }
}

