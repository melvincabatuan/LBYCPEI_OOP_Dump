package nq4;

import acm.program.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class HangmanTiu extends ConsoleProgram {

    public void run() {
        // TODO: write this method
        intro();
        playOneGame("PROGRAMMER");
    }

    // TODO: comment this method
    private void intro() {
        // TODO: write this method
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Welcome to HangmanTiu!         ");
        println("       I will think of a random word.    ");
        println("      You'll try to guess its letters.");
        println("       Every time you guess a letter");
        println("     that isn't in my word, a new body");
        println("      part of the hanging man appears.");
        println("                  Goodluck!");
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method
        int wordLen = secretWord.length();
        int chance = 8;
        int lettersToGuess= wordLen;
        char[] secret= new char[wordLen];
        String guesses = "";
        char guess =' ';
        boolean guessed=false;

        do{
            draw(chance);
            print("SECRET WORD :"+createHint(secretWord,guesses));
            /*for(int i = 0;i<wordLen;i++)
            {
                print(secret[i]);
            }*/
            println();
            println("YOUR GUESSES :"+guesses);
            println("GUESSES LEFT :"+chance);
            guess = readGuess(readLine("YOUR GUESS? "));
            guesses=guesses+guess;
            guessed=false;
            for(int i = 0;i<wordLen;i++)
            {
                if(guess==secretWord.charAt(i))
                {
                    guessed=true;
                    if(secret[i]!=guess)
                    {
                        secret[i]=guess;
                        lettersToGuess--;
                    }

                }
            }
            if(guessed==false) chance--;
            if(lettersToGuess==0) break;
        }while(chance>0);
        draw(chance);
        if(chance==0) println("YOU LOSE");
        else println("YOU WIN");
        println("MY WORD WAS "+secretWord+"");

        return 0;
    }


    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        // TODO: write this method
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
    private char readGuess(String guessedLetter) {
        // TODO: write this method
        char guess;
        guessedLetter=guessedLetter.toUpperCase();
        guess = guessedLetter.charAt(0);

        return guess;
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

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        canvas.reset();  // sample canvas method call
        setSize(1040,800);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new HangmanTiu().start(args);
    }

    public void draw(int chance){
        if(chance==8)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display8.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==7)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display7.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==6)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display6.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==5)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display5.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==4)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display4.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==3)
        {
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
        else if(chance==2)
        {
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display2.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(chance==1)
        {
            try{
            BufferedReader buffer = new BufferedReader(new FileReader("assets/display1.txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        }
        else if(chance==0)
        {
            try{
            BufferedReader buffer = new BufferedReader(new FileReader("assets/display0.txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        }

    }

    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
