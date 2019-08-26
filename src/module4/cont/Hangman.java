package module4.cont;

import acm.program.*;
import java.lang.String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Random;

public class Hangman extends ConsoleProgram {
    //private static final int GUESS = 0;
    public void run() {
        // TODO: write this method'
        int record = 0, wins = 0, totalgames = 0, personalBest = 0 ;
        char cont = 'N';

        intro();
        do {
            totalgames++;
            record = playOneGame(getRandomWord("assets/dict.txt"));
            if(record > 0) wins++;
            if(record > personalBest) personalBest = record;

            cont = readGuess(readLine("Do you want to play again?Y/N"));
        }while(cont == 'Y');
        stats(totalgames,wins,personalBest);
    }

    // TODO: comment this method
    private void intro() {
        // TODO: write this method
        print(  "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "       Welcome to Hangman!\n" +
                "   I will think of a random word.\n" +
                "  You'll try to guess its letters.\n" +
                "   Every time you guess a letter\n" +
                "  that isn't in my word, a new body\n" +
                "   part of the hanging man appears.\n" +
                "             Goodluck!\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method

        //initial variables and values
        char guess;
        int lives = 8;
        String charGuess = "";
        int length = secretWord.length();
        int count = 0;
        char[] charArray = secretWord.toCharArray();
        char[] correctGuess = new char[length];


        for(int i = 0;i<length;i++)
        {
            correctGuess[i]= '-';
        }


        do {
            canvas.draw(lives);
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
                    if(guess == correctGuess[i] && correctGuess[i] == charArray[i] ){
                        checker = true;
                    }
                    else{correctGuess[i]= charArray[i];
                    checker = true;
                    count++;}                }
            }
            if(count == length){
                println("You win!");
                break;
            }
            if(checker == false){
                lives--;
            }
        }while(lives > 0);
        if(lives <= 0){
           displayHangman(lives);
            canvas.draw(lives);
        }
        return lives;


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
        guessChar = guessedLetters.toUpperCase().charAt(0);
        return guessChar;
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        // TODO: write this method
         try {
            BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+guessCount+".txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {
        // TODO: write this method
        int percent=gamesWon*100/gamesCount*100;
        percent = percent/100;
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Overall Statistics:         ");
        println("              Games played: "+gamesCount);
        println("                Games won: "+gamesWon);
        println("              Win percent: "+percent+"%");
        println("         Best game: "+best+" guess(es) remaining");
        println("             Thanks for playing");
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        // TODO: write this method
        int getNumber;
        String randomWord = "";
        Random rand = new Random();
        getNumber = rand.nextInt(74) + 1;

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            for(int i =0; i <= getNumber; i++){
                randomWord = buffer.readLine();
            }
            println(randomWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return randomWord;
    }

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        canvas.reset();
        setSize(1080,720);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }

    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
