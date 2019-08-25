package module4.panes;//Panes, Michael Ryan B.

import acm.program.ConsoleProgram;
import acm.util.MediaTools;
import acm.util.RandomGenerator;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Hangman extends ConsoleProgram {

    public void run() {
        int correct = 0,win = 0,count = 0,best = 0;

        char again='Y';
        String temp="";

        intro();
        while(again=='Y'){
            count++;
            correct=playOneGame(getRandomWord("assets/dict.txt"));
            if(correct>0) win++;
            if(correct>best) best=correct;

            temp=readLine("PLAY AGAIN?(Yes or No)");
            if(temp.length()>0) again=temp.toUpperCase().charAt(0);
            if(again=='N') break;
            clearScreen();
        }
        stats(count,win,best);
    }

    private void intro() {
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Welcome to Hangman!         ");
        println("       I will think of a random word.    ");
        println("      You'll try to guess its letters.");
        println("       Every time you guess a letter");
        println("     that isn't in my word, a new body");
        println("      part of the hanging man appears.");
        println("                  Goodluck!");
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    private int playOneGame(String secretWord) {
        AudioClip death = MediaTools.loadAudioClip("assets/dead.mp3");
        char[] theWord;
        theWord = new char[secretWord.length()];
        String temp;
        int lettersLeft = secretWord.length();
        int guessCount = 8;
        String allGuesses = "";
        char myGuess =' ';


        while(guessCount!=0) {
            canvas.draw(guessCount);
            //displayHangman(guessCount);

            println("");

            println("Secret Word: "+createHint(secretWord,allGuesses));
            println("Your Guesses: "+ allGuesses);
            println("Guesses Left: " + guessCount);
            println("");
            temp=readLine("What is your guess? ");
            if(temp.length()>0) myGuess = temp.toUpperCase().charAt(0);
            allGuesses = allGuesses + myGuess;
            boolean correct = false;
            for(int i = 0;i<secretWord.length();i++) {
                if(myGuess==secretWord.charAt(i)) {
                    correct=true;
                    if(theWord[i]!=myGuess) {
                        theWord[i]=myGuess;
                        lettersLeft--;
                    }
                }
            }
            if(!correct){ guessCount--;death.play();}
            if(lettersLeft==0) break;
        }
        println("");
        println("");
        canvas.draw(guessCount);
        if(guessCount==0) {
/*
            try {
                BufferedReader hangman = new BufferedReader(new FileReader("assets/display0.txt"));
                String line;
                while ((line = hangman.readLine()) != null) {
                    println(line);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

 */


            death.play();
            pause(1000);
            death.play();
            println("YOU LOSE");
        }
        else println("YOU WIN");
        println("THE WORD WAS "+secretWord+"");

        return guessCount;
    }

    private StringBuilder createHint(String secretWord, String guessedLetters){

        char guessedLetter[] = guessedLetters.toCharArray();
        String initHint = "";
        for(int i=0;i<secretWord.length();i++){
            initHint=initHint+"-";
        }

        StringBuilder newHint = new StringBuilder(initHint);


        for(int i=0;i<secretWord.length();i++) {
            for(int j=0;j<guessedLetters.length();j++) {
                if (guessedLetters.charAt(j)==secretWord.charAt(i)) {
                    newHint.setCharAt(i,guessedLetter[j]);

                    break;
                }
            }

        }


        return newHint;
    }


    private char readGuess(String guessedLetter){
        char myGuess;
        guessedLetter=guessedLetter.toUpperCase();
        myGuess = guessedLetter.charAt(0);

        return myGuess;
    }



    private void displayHangman(int guessCount) {
        try {
            BufferedReader hangman = new BufferedReader(new FileReader("assets/display"+guessCount+".txt"));
            String line;
            while ((line = hangman.readLine()) != null) {
                println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void stats(int games, int win, int best){
        int percent=win*100/games*100;
        percent = percent/100;
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("             Overall Statistics:         ");
        println("              Games played: " + games);
        println("                Games won: " + win);
        println("              Win percent: " + percent + "%");
        println("         Best game: " + best + " guess(es) remaining");
        println("             Thanks for playing");
        println("   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    private String getRandomWord(String filename) {
        String secretWord="";
        RandomGenerator random= RandomGenerator.getInstance();
        int wordCount=random.nextInt(1,74);

        try{
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            for(int i=0;i<=wordCount;i++)
            {
                secretWord=buffer.readLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }


        return secretWord;
    }
    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        setSize(1000,700);
    }




    /* Solves NoClassDefFoundError */
    public static void main(String[] args){
        new Hangman().start(args);

    }

    public void clearScreen () {
        for (int i = 0; i < 500; i++) {
            println("");
        }
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;

}