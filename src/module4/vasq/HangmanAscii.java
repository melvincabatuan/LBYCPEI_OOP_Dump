package module4.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 6/21/19
 */

import acm.program.*;
import acm.util.RandomGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HangmanAscii extends ConsoleProgram {
    private static final double CANVAS_WIDTH = 750;
    private static final double CANVAS_HEIGHT = 800;

    public void run() {
        // TODO: write this method

        int guessCountBest = 0, guessCountPrev = 0, guessCountNow;
        float gamesCount = 0, winCount = 0;

        setSize(CANVAS_WIDTH,CANVAS_HEIGHT);
        intro();
        do{
            String filename = promptUserForFile("Enter the filename of the dictionary you want to use: ", "assets");
            guessCountNow = playOneGame(getRandomWord(filename));
            if(guessCountNow>0){
                winCount++;
                if(guessCountNow > guessCountPrev){
                    guessCountBest = guessCountNow;
                    guessCountPrev = guessCountNow;
                }
            }
            gamesCount++;
        }while(readBoolean("Do you want to play another game? (Y/N)", "Y","N"));
        if(gamesCount>0) stats(gamesCount, winCount, guessCountBest);
    }

    // TODO: comment this method
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
            else{
                guessCount--;
            }
        }
        if(guessCount == 0) {
            println("You lose!");
            println("No guesses left!");

            println("\n\nThe correct word was "+secretWord);
            displayHangman(guessCount);
        }
        return guessCount;
    }

    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
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

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        //todo
        char letter;
        String input;
        String illegalInput="`1234567890-=~!@#$%^&*()_+[]\\{}|;':\",./<>?";

        do{
            input = readLine("Your guess? ");
            if(illegalInput.contains(input)) println("Enter a letter from A-Z");
            else if(input.length() > 1) println("Enter a letter from A-Z");
            else if(guessedLetters.contains(input.toUpperCase())) println("You've already tried that.");
        }while(input.length() > 1 || illegalInput.contains(input) || guessedLetters.contains(input.toUpperCase()));
        letter = input.toUpperCase().charAt(0);
        return letter;
    }



    // TODO: comment this method
    private void displayHangman(int guessCount) {
        int lives;
        lives = guessCount;
        if (lives == 8){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 7){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 6){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 5){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 4){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 3){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display3.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 2){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives == 1){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if (lives ==0) {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+lives+".txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        // canvas.cls();
        canvas.reset();
    }

    // TODO: comment this method
    private void stats(float gamesCount, float gamesWon, int best) {
        // TODO: write this method
        double winRate = (gamesWon/gamesCount) * 100;
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("        Overall Statistics:");
        println("          Games played: "+gamesCount);
        println("            Games won: "+gamesWon);
        println("        Win percent: "+winRate+"%");
        println("  Best game: "+best+" guess(es) remaining");
        println("        Thanks for playing!");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        // TODO: write this method

        String randomWord = "";
        int max, goToLine;
        RandomGenerator rgen = RandomGenerator.getInstance();
        try {
            File source = new File(filename);
            Scanner dictionary = new Scanner(source);
            max = Integer.parseInt(dictionary.next());
            goToLine = rgen.nextInt(1,max);
            for(int i=0;i<=goToLine;i++){
                randomWord = dictionary.next();
            }
        }
        catch(Exception e){
            println("FILE NOT FOUND ERROR");
        }
        return randomWord;
    }

    // TODO: comment this method
    private int intro() {
        println("     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Welcome to HangmanAscii");
        println("       I will think of a random word");
        println("     You'll try to guess its letters.");
        println("       Every time you guess a letter");
        println("     that isn't in my word, a new body");
        println("      part of the hanging man appears.");
        println("                 Good luck!");
        println("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        return 0;
    }


    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        
    }

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new HangmanAscii().start(args);
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
