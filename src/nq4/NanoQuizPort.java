package nq4;

import acm.program.*;

public class NanoQuizPort extends ConsoleProgram {


    public void run() {
        // TODO: write this method
        intro();
        playOneGame("PROGRAMMER");
    }

    // TODO: comment this method
    private void intro() {
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("     Welcome to HangmanTiu!");
        println(" I will think of a random word.");
        println(" You'll try to guess its letters");
        println("  Every time you guess a letter");
        println("that isn't in my word, a new body");
        println(" part of the hanging man appears.");
        println("          Goodluck!");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method

        String secretWordUpperCase = secretWord.toUpperCase();

        int secretWordLength = secretWordUpperCase.length();

        int guessAttempts = 8;

        char[] displayBlank = new char[secretWordLength];

        for(int i=0;i<secretWordLength;i++){
            displayBlank[i] = '-';
        }

        String displayAllBlanks = new String(displayBlank);

        while(guessAttempts > 0 &&! displayAllBlanks.equals(secretWordUpperCase)){


            println("You are guessing for the word: [ " + displayAllBlanks + " ]");

            if(guessAttempts == 8){
                println("You have " + guessAttempts + " attempts.");
            }
            else{
                println("You now have " + guessAttempts + " attempts left.");
            }

            String guess = readLine("Your guess: ");

            String upperCaseConvert = guess.toUpperCase();
            char guessChar = guess.charAt(0);
            char upperCaseCharConvert = Character.toUpperCase(guessChar);

            if(guess.length() > 1){
                println("\nINVALID INPUT");
                println("Only ONE Letter is accepted.\n");
                continue;
            }

            if(Character.isLetter(guessChar) != true){
                println("\nINVALID INPUT");
                println("Only LETTERS are accepted.\n");
                continue;
            }

            if(secretWordUpperCase.indexOf(upperCaseConvert) == -1){
                println("\nThere is no '" + guess + "' in the word.\n");
                guessAttempts = guessAttempts - 1;
            }

            else{
                println("\nThat guess is CORRECT.\n");
                for(int i=0;i<secretWordLength;i++){
                    if(upperCaseCharConvert == secretWordUpperCase.charAt(i)){
                        displayBlank[i]=secretWordUpperCase.charAt(i);
                    }
                }

                String charPass = new String(displayBlank);
                displayAllBlanks = charPass;
            }

        }

        if(guessAttempts == 0){
            println("\nGAME OVER");
            println("You did not guess correct the word, which is '" + secretWordUpperCase + "'.");
        }

        else if(displayAllBlanks.equals(secretWordUpperCase)){
            println("\nWell Done");
            println("You guessed the word, which is '" + secretWordUpperCase + "'.");
            println("YOU WIN !!");
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
        return '?';
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        // TODO: write this method
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
        new NanoQuizPort().start(args);
    }

}
