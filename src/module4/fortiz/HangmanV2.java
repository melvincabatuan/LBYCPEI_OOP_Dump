package module4.fortiz;/*
*
* Fortiz, Patrick Ryan P.
* LBYCPEI EQ3
* 6/21/19
*
*/

import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.io.*; // for File
import java.util.*; // for Scanner

public class HangmanV2 extends ConsoleProgram{

    public void run (){
        float gamesCount = 0, winCount = 0;
        int guessCountBest = 0, guessCountPrev = 0, guessCountNow;
        intro();
        do{
            String filename = promptUserForFile("Enter the filename of the dictionary you want to use: ", "assets");
            playSound(1);
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

    private void intro(){

        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("          Welcome to Hangman!");
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
        StringBuilder guessedLetters1 = new StringBuilder();

        while(guessCount > 0) {
            displayHangman(guessCount);
            println("\nGuesses left: "+guessCount);
            print("Secret word: ");
            String hint = createHint(secretWord, guessedLetters1.toString());
            println(hint);
            if(guessedLetters1.length() > 0) println("Your guesses: "+guessedLetters1);
            String confirm = new String(correct);
            if(confirm.equals(secretWord)){
                println("You guessed the word correctly!");
                playSound(4);
                break;
            }
            char letter = readGuess(guessedLetters1.toString());
            guessedLetters1.append(letter);
            if(secretWord.contains(Character.toString(letter))){
                println("CORRECT!");
                playSound(2);
                for(int i=0;i<secretWord.length();i++){
                    if(secretWord.charAt(i) == letter) correct[i] = letter;
                }
            }
            else{
                guessCount--;
                playSound(3);
            }
        }
        if(guessCount == 0) {
            println("You lose!");
            println("You ran out of guesses!");
            readLine("PRESS ENTER TO SEE THE SECRET WORD!");
            println("The correct word was "+secretWord);
            displayHangman(guessCount);
            playSound(5);
        }
        return guessCount;
    }

    private void displayHangman(int guessCount){
//        String filename = "";
//        switch(guessCount){
//            case 8:
//                filename = "8.png";
//                break;
//            case 7:
//                filename = "7.png";
//                break;
//            case 6:
//                filename = "6.png";
//                break;
//            case 5:
//                filename = "5.png";
//                break;
//            case 4:
//                filename = "4.png";
//                break;
//            case 3:
//                filename = "3.png";
//                break;
//            case 2:
//                filename = "2.png";
//                break;
//            case 1:
//                filename = "1.png";
//                break;
//            case 0:
//                filename = "0.jpg";
//                break;
//        }
        canvas.cls();
        canvas.reset();
        canvas.showPhoto(guessCount);
    }

    private String createHint(String secretWord, String guessedLetters) {
        int i, j;
        StringBuilder hint = new StringBuilder();

        for(i=0;i<secretWord.length();i++){
            hint.append("-");
        }

        if (guessedLetters.length() > 0) {
            for (i = 0; i < secretWord.length(); i++) {
                for (j = 0; j < guessedLetters.length(); j++) {
                    if (guessedLetters.charAt(j) == secretWord.charAt(i)) {
                        hint.setCharAt(i, guessedLetters.charAt(j));
                    }
                }
            }
        }
        return hint.toString();
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

    private String getRandomWord(String filename){
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

    private void stats(float gamesCount, float gamesWon, int best){
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

    private void playSound(int situation){
        AudioClip effect;

        switch(situation){
            case 1:
                //effect = MediaTools.loadAudioClip("assets/start.mp3");
                effect = MediaTools.loadAudioClip("assets/horn.wav");
                effect.play();
                break;
            case 2:
                effect = MediaTools.loadAudioClip("assets/correct.mp3");
                effect.play();
                break;
            case 3:
                effect = MediaTools.loadAudioClip("assets/wrong.mp3");
                effect.play();
                break;
            case 4:
                effect = MediaTools.loadAudioClip("assets/win.mp3");
                effect.play();
                break;
            case 5:
                effect = MediaTools.loadAudioClip("assets/lose.mp3");
                effect.play();
                break;
        }
    }

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        setSize(900,800);
    }


    // Solves java.lang.NoClassDefFoundError
    public static void main (String[] args){
        (new HangmanV2()).start(args);
    }

    private HangmanCanvas canvas;
}
