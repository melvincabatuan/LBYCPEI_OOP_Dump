package module4.balay;

import acm.program.ConsoleProgram;

import java.util.Scanner;
public class Hangman extends ConsoleProgram {
    int count= 8;
    public void run() {
        intro();
        playOneGame("PROGRAMMER");

    }


    private void intro() {
        println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "    Welcome to Hangman!\n" +
                "I will think of a random word.\n" +
                "You'll try to guess its letters.\n" +
                "Every time you guess a letter\n" +
                "that isn't in my word, a new body\n" +
                "part of the hanging man appears.\n" +
                "          Goodluck!\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        String tempLetter;

        int check;

        StringBuilder lettersUsed = new StringBuilder();
        StringBuilder correctLetters = new StringBuilder();
        for(int i = 0; i<secretWord.length();i++){
            correctLetters.append("-");
        }
        while(count!=0&&correctLetters.indexOf(secretWord)!=0){
            createHint(secretWord,lettersUsed,correctLetters);
            print("Secret word:");
            print(correctLetters);
            println();






            println();
            if(correctLetters.indexOf(secretWord)==0){
                println("YOU WIN");
                break;


            }
            println("Your guess?");
            Scanner guess = new Scanner(readLine());
            tempLetter = guess.next();
            if(tempLetter.matches("[0-9]+")|| tempLetter.length()>1){
                println("Please enter a single letter from A-Z");

            }
            else{
                check = secretWord.indexOf(readGuess(tempLetter.toUpperCase()));
                if(check==-1){
                    if(lettersUsed.indexOf(tempLetter.toUpperCase())>=0){
                        println("You already entered this letter!");
                    }
                    else {
                        println("Wrong, try again.");
                        count--;
                        lettersUsed.append(tempLetter.toUpperCase());
                    }
                }
                else{
                    if(lettersUsed.indexOf(tempLetter.toUpperCase())>=0){
                        println("You already entered this letter!");
                    }
                    else {
                        println("Correct!");
                        lettersUsed.append(tempLetter.toUpperCase());

                    }

                }
                println("Your guesses "+lettersUsed);
                println("Guesses left "+count);

            }






        }


        return 0;
    }


    // TODO: comment this method
    private void createHint(String secretWord, StringBuilder guessedLetters, StringBuilder rightLetters) {
        for (int i = 0; i < secretWord.length(); i++) {
            for (int j = 0; j < guessedLetters.length(); j++) {

                if (guessedLetters.charAt(j)==secretWord.charAt(i)) {
                    rightLetters.setCharAt(i,guessedLetters.charAt(j));

                }


            }
        }

    }

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        char guessChar;
        guessChar = guessedLetters.charAt(0);
        return guessChar;
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {

    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {

    }

    // TODO: comment this method
    private String getRandomWord(String filename) {

        return "";
    }


    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        canvas.reset();  // sample canvas method call
            if(count==7){
                canvas.noteIncorrectGuess(count);
            }



    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}

