package nq4;

import acm.program.*;
import java.lang.String;


public class HangmanCont extends ConsoleProgram {
    //private static final int GUESS = 0;


    public void run() {
        // TODO: write this method
        intro();
        readLine("Press enter to continue");
        playOneGame("apple");
    }

    // TODO: comment this method
    private void intro() {
        // TODO: write this method
        print("@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "Welcome to HangmanTiu!\n" +
                "I will think of a random word.\n" +
                "You'll try to guess its letters.\n" +
                "Every time you guess a letter\n" +
                "that isn't in my word, a new body\n" +
                "part of the hanging man appears.\n" +
                "Goodluck!\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method

        //initial variables and values
        char guess;
        int lives = 8, count=0;
        String charGuess = "";
        int length = secretWord.length();
        char[] charArray = secretWord.toCharArray();
        char[] correctGuess = new char[length];


        for(int i = 0;i<length;i++)
        {
            correctGuess[i]= '-';
        }


        do {
            displayHangman(lives);
            print("Secret Word: " );
            for(int i = 0; i < length; i++){
                print(correctGuess[i]);
            }
            println();
            println("Your Guesses:" + charGuess);
            println("Guesses Left: "+ lives);
            print("Your Guess? ");
            guess = readGuess(readLine());
            charGuess = charGuess + guess;
            boolean checker = false;



            for (int i = 0; i < length; i++) {
                if(guess == charArray[i]){
                    correctGuess[i]= charArray[i];
                    checker = true;
                    count++;
                }
            }
            if(count >= length){
                println("You guess it right!");
                println("You Win!");
                break;
            }

            if(checker == false){
                lives--;
                if(lives <= 0){
                    break;
                }
            }
        }while(lives >= 0);
        if(lives == 0){
            displayHangman(lives);
        }
        return 0;
    }


    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        // TODO: write this method
        return "";
    }

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        // TODO: write this method
        char guessChar;
        guessChar = guessedLetters.charAt(0);
        return guessChar;
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        // TODO: write this method
        //display 8
        if(guessCount == 8) {
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
        //display 7
        else if(guessCount == 7) {
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
        //display 6
        else if(guessCount == 6) {
            println(" +------------+          _____________\n" +
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
        //display 5
        else if(guessCount ==5) {
            print("   +------------+          __________________\n" +
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
                    "#######");
        }
        //display 4
        else if(guessCount ==4) {
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
                    "#######");
        }
        //display 3
        else if(guessCount == 3) {
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
                    "#######");
        }
        //display 2
        else if(guessCount ==2) {
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
        //display 1
        else if(guessCount == 1) {
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
        //display 0
        else if(guessCount ==0) {
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
    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {
        // TODO: write this method
    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        // TODO: write this method
        return "";
    }



    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new HangmanCont().start(args);
    }

;
}
