package module4.job;

import acm.program.*;
import acm.util.MediaTools;
import acm.util.RandomGenerator;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hangman extends ConsoleProgram {

    public static char[] hint;
    public static int word, counter;

    public void run() {
        int wins = 0, best = 0, guessCount = 0;
        char response = 'Y';
        String playAgain = "";

        intro();

        while(response == 'Y') {
            counter += 1;
            guessCount = playOneGame(getRandomWord("assets/dict.txt"));
            if (guessCount > 0) {
                wins += 1;
            }

            if (guessCount > best) {
                best = guessCount;
            }

            playAgain = readLine("Play again? (Y/N): ");
            if(playAgain.length() > 0) {
                response = playAgain.toUpperCase().charAt(0);
            }
        }
        stats(counter, wins, best);

    }

    // TODO: comment this method
    private void intro() {
        println("\t       @@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        println("\t             Welcome to Hangman!");
        println("\t       I will think of a random word.\n");
        println("\t      You'll try to guess its letters.\n");
        println("\t        Every time you guess a letter\n");
        println("\t     that isn't in my word, a new body\n");
        println("\t       part of the hanging man appears.\n");
        println("\t                 Good luck!\n");
        println("\t       @@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        int guessCount = 8;
        AudioClip sound = MediaTools.loadAudioClip("assets/Died.wav");
        word = secretWord.length();
        hint = new char[word];
        char guess = ' ';
        int toGuess = word;
        String guesses = "";
        boolean guessed = false;

        while (guessCount > 0) {
            /*displayHangman(guessCount);*/
            canvas.draw(guessCount);
            print("Secret word: "+createHint(secretWord,guesses));
            println();
            print("\nYour guesses: "+guesses);
            println("\nGuesses left: "+guessCount);
            String inputGuess = readLine("Your guess? ");

            if (inputGuess.length() > 0) {
                guess = inputGuess.toUpperCase().charAt(0);
            }

            guesses = guesses + guess;
            guessed = false;

            for(int k=0; k<word; k++) {
                if(secretWord.charAt(k) == guess) {
                    guessed = true;
                    if (hint[k] != guess) {
                        hint[k] = guess;
                        toGuess--;
                    }
                }
            }

            if (guessed == false) {
                guessCount--;
                if (guessCount > 0) println("Try again!");
                sound.play();
            }

            if (toGuess == 0) {
                println("CONGRATULATIONS!\nYou have guessed the word!");
                break;
            }

            if (guessCount == 0) {
                canvas.draw(guessCount);
                println("YOU LOSE!\nTry again next time.");
            }
        }
        println("My word was "+secretWord+"");
        return guessCount;
    }


    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        String hint="";
        boolean guessed=false;
        hint="";
        for(int i=0;i<secretWord.length();i++)
        {
            guessed=false;
            for(int j=0;j<guessedLetters.length();j++)
            {
                if (guessedLetters.charAt(j)==secretWord.charAt(i))
                {
                    hint=hint+guessedLetters.charAt(j);
                    guessed=true;
                    break;
                }
            }
            if(guessed==false) hint=hint+"-";
        }
        return hint;
    }

    // TODO: comment this method
    private char readGuess(String inputGuess) {
        // TODO: write this method
        char guess;
        inputGuess=inputGuess.toUpperCase();
        guess = inputGuess.charAt(0);

        return guess;
    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("assets/display"+guessCount+".txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {
        // TODO: write this method
        int percentage=gamesWon*100/gamesCount*100;
        percentage = percentage/100;
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Overall Statistics:         ");
        println("         Number of games played: "+gamesCount);
        println("            Number of games won: "+gamesWon);
        println("            Win percentage: "+percentage+"%");
        println("  Best game played: "+best+" guess(es) remaining");
        println("      Thanks for playing! Play again soon!");
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        String secretWord="";
        RandomGenerator rand= RandomGenerator.getInstance();
        int count=rand.nextInt(1,74);

        try{
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            for(int i=0;i<=count;i++)
            {
                secretWord=buffer.readLine();
            }
            //println(secretWord);
        } catch(IOException e){
            e.printStackTrace();
        }


        return secretWord;
    }

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        /*canvas.reset();*/  // sample canvas method call
        setSize(1080,800);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
