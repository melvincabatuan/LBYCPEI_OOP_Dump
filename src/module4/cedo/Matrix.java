package module4.cedo;

import acm.program.ConsoleProgram;

// Incomplete
public class Matrix extends ConsoleProgram{

    public void run(){
        // TODO: Write code here

    }

    private int displayMenu() {
        for (int i=0;i<40;i++) print("-");
        println("Matrix Operation Menu:");
        println("1. Enter values of first matrix");
        return 0;
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Matrix()).start(args);
    }
}
