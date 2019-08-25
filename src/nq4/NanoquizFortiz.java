package nq4;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/21/19
 *
 */

import acm.program.ConsoleProgram;

public class NanoquizFortiz extends ConsoleProgram {
    public void run(){
        intro();
        playOneGame("PROGRAMMER");
    }

    private void intro(){

        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("          Welcome to HangmanTiu!");
        println("    I will think of a random word.");
        println(" You will try to guess its letters.");
        println("    Every time you guess a letter");
        println(" that isn't in my word, a new body");
        println("   part of the hanging man appears.");
        println("             Good luck!");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("");
    }

    private int playOneGame(String secretWord){
        int guessCount = 8;
        char[] correct = new char[secretWord.length()];
        String guessedLetters = "";

        while(guessCount > 0) {
            displayHangman(guessCount);
            println("\nGuesses left: "+guessCount);
            print("Secret word: ");
            String hint = createHint(secretWord, guessedLetters);
            println(hint);
            if(guessedLetters.length() > 0) println("Your guesses: "+guessedLetters);
            String confirm = new String(correct);
            if(confirm.equals(secretWord)){
                println("You guessed the word correctly!");
                break;
            }
            char letter = readGuess(guessedLetters);

            guessedLetters += letter;
            if(secretWord.contains(Character.toString(letter))){
                println("CORRECT!");
                for(int i=0;i<secretWord.length();i++){
                    if(secretWord.charAt(i) == letter) correct[i] = letter;
                }
            }
            else guessCount--;
        }
        if(guessCount == 0) {
            println("You lose!");
            println("You ran out of guesses!");
            println("The correct word was "+secretWord);
            displayHangman(guessCount);
        }
        return 0;
    }

    private String createHint(String secretWord, String guessedLetters){
        String hint = "";
        int i, j;

        if(guessedLetters.length() > 0) {
            for(i=0;i<secretWord.length();i++){
                boolean verify = false;
                for(j=0;j<guessedLetters.length();j++){
                    if(guessedLetters.charAt(j) == secretWord.charAt(i)){
                        hint += guessedLetters.charAt(j);
                        verify = true;
                    }
                }
                if(!verify)hint += "-";
            }
        }
        else{
            for(i=0;i<secretWord.length();i++) hint += "-";
        }
        return hint;
    }

    private char readGuess(String guessedLetters){
        String input, illegal="1234567890-=!@#$%^&*()_+,./;'[]\\<>?:\"{}|";
        char letter;

        do{
            input = readLine("Your guess? ");
            if(illegal.contains(input)) println("Enter a letter from A-Z");
            else if(input.length() > 1) println("Enter a letter from A-Z");
            else if(guessedLetters.contains(input.toUpperCase())) println("You've already tried that.");
        }while(input.length() > 1 || illegal.contains(input) || guessedLetters.contains(input.toUpperCase()));
        letter = input.toUpperCase().charAt(0);
        return letter;
    }

    private void displayHangman(int guessCount){
        switch(guessCount){
            case 8:
                display8();
                break;
            case 7:
                display7();
                break;
            case 6:
                display6();
                break;
            case 5:
                display5();
                break;
            case 4:
                display4();
                break;
            case 3:
                display3();
                break;
            case 2:
                display2();
                break;
            case 1:
                display1();
                break;
            case 0:
                display0();
                break;
        }
    }

    private void display8(){
        println("   +------------+\n" +
                "   |            |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######");
    }

    private void display7(){
        println("   +------------+          _________\n" +
                "   |            |         /         \\\n" +
                "   |         _______      | Why me? |\n" +
                "   |        / o   o \\   / \\_________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######");
    }

    private void display6(){
        println("   +------------+          _____________\n" +
                "   |            |         /             \\\n" +
                "   |         _______      | I'm scared! |\n" +
                "   |        / o   o \\   / \\_____________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######");
    }

    private void display5(){
        println("   +------------+          __________________\n" +
                "   |            |         /                  \\\n" +
                "   |         _______      | I need a \"hand\"! |\n" +
                "   |        / o   o \\   / \\__________________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }

    private void display4(){
        println("   +------------+          ______________\n" +
                "   |            |         /              \\\n" +
                "   |         _______      | Half gone... |\n" +
                "   |        / o   o \\   / \\______________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+----//\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }

    private void display3(){
        println("   +------------+          _____________\n" +
                "   |            |         /             \\\n" +
                "   |         _______      | Not good... |\n" +
                "   |        / o   o \\   / \\_____________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+----//\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |           /\n" +
                "   |          /\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }

    private void display2(){
        println("   +------------+          ____________\n" +
                "   |            |         /            \\\n" +
                "   |         _______      | Hurry up!! |\n" +
                "   |        / o   o \\   / \\____________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+----//\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |           / \\\n" +
                "   |          /   \\\n" +
                "   |\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }

    private void display1(){
        println("   +------------+          ____________\n" +
                "   |            |         /            \\\n" +
                "   |         _______      | Help me!!! |\n" +
                "   |        / o   o \\   / \\____________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+----//\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |           / \\\n" +
                "   |          /   \\\n" +
                "   |       __/\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }

    private void display0(){
        println("   +------------+          _________________\n" +
                "   |            |         /                 \\\n" +
                "   |         _______      | AUGH, I'M DEAD. |\n" +
                "   |        / X   X \\   / \\_________________/\n" +
                "   |        |   .   |  /\n" +
                "   |        |  ___  |\n" +
                "   |        \\_______/\n" +
                "   |            |\n" +
                "   |      \\\\----+----//\n" +
                "   |            |\n" +
                "   |            |\n" +
                "   |           / \\\n" +
                "   |          /   \\\n" +
                "   |       __/     \\__\n" +
                "   |\n" +
                "---+---\n" +
                "#######\n");
    }


    public static void main (String[] args){
        (new NanoquizFortiz()).start(args);
    }
}
