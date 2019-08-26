package module4.enghoy;

import acm.program.ConsoleProgram;
import acm.util.MediaTools;
import acm.util.RandomGenerator;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Hangman extends ConsoleProgram {

    public void run() {
        int turns = 0, gamesWon = 0, gamesPlayed = 0, hScore = 0;

        char answer = 'N';
        String temp = "";

        intro();

        do{
            gamesPlayed++;
            turns = playOneGame(getRandomWord("assets/dict.txt"));
            if(turns > 0) {
                gamesWon++;
            }
            if(turns > hScore){
                hScore = turns;
            }

            temp = readLine("PLAY AGAIN?(Y or N)");
            if(temp.length() > 0) {
                answer = temp.toUpperCase().charAt(0);
            }
        }while(answer == 'Y');

        stats(gamesPlayed,gamesWon,hScore);
    }

    private void intro() {
        for(int i = 0; i < 50; i++){
            print("@");
        }
        println();
        println("             Welcome to Hangman!         ");
        println("       I will think of a random word.    ");
        println("      You'll try to guess its letters.   ");
        println("       Every time you guess a letter     ");
        println("     that isn't in my word, a new body   ");
        println("      part of the hanging man appears.   ");
        println("                 Goodluck!!!!            ");
        for(int i = 0; i < 50; i++){
            print("@");
        }
    }

    private int playOneGame(String secretWord) {
        String temp;
        int wordLen = secretWord.length();
        int turns = 8;
        int lettersToGuess = wordLen;
        char[] secret = new char[wordLen];
        String guesses = "";
        char guess = ' ';
        boolean guessed = false;

        AudioClip oofClip = MediaTools.loadAudioClip("assets/lose.mp3");
        AudioClip marioClip = MediaTools.loadAudioClip("assets/win.mp3");
        AudioClip alertClip = MediaTools.loadAudioClip("assets/wrong.mp3");
        AudioClip circleClip = MediaTools.loadAudioClip("assets/correct.mp3");

        do{
            canvas.draw(turns);
            println();
            println("SECRET WORD :" + createHint(secretWord,guesses));
            println("YOUR GUESSES :" + guesses);
            println("GUESSES LEFT :" + turns);
            println();
            temp = readLine("WHAT IS YOUR GUESS? ");
            if(temp.length()>0) guess = temp.toUpperCase().charAt(0);
            guesses = guesses + guess;
            guessed = false;
            for(int i = 0; i < wordLen; i++)
            {
                if(guess == secretWord.charAt(i))
                {
                    guessed = true;
                    circleClip.play();
                    if(secret[i]!=guess)
                    {
                        secret[i] = guess;
                        lettersToGuess--;
                    }

                }
            }
            if(guessed == false) {
                turns--;
                alertClip.play();
            }
            if(lettersToGuess == 0) {
                break;
            }
        }while(turns > 0);

        canvas.draw(turns);
        if(turns == 0) {
            println("YOU DIDN'T GET THE WORD!");
            oofClip.play();
        }
        else {
            println("YOU HAVE GUESSED THE WORD!");
            marioClip.play();
        }

        println("THE WORD WAS " + secretWord + "");

        return turns;
    }

    private String createHint(String secretWord, String guessedLetters) {
        String hint = "";
        boolean guessed = false;
        hint = "";
        for(int i = 0; i < secretWord.length(); i++)
        {
            guessed=false;
            for(int j = 0; j < guessedLetters.length(); j++)
            {
                if (guessedLetters.charAt(j) == secretWord.charAt(i))
                {
                    hint = hint + guessedLetters.charAt(j);
                    guessed = true;
                    break;
                }
            }
            if(guessed == false) {
                hint = hint + "-";
            }
        }

        return hint;
    }

    private char readGuess(String guessedLetter) {
        char guess;
        guessedLetter = guessedLetter.toUpperCase();
        guess = guessedLetter.charAt(0);

        return guess;
    }

    private void displayHangman(int guessCount) {
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("assets/display" + guessCount + ".txt"));
            String line;
            while ((line = buffer.readLine()) != null) {
                println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private void stats(int gamesPlayed, int gamesWon, int hScore) {
        int winPercent = gamesWon*100 / gamesPlayed*100;

        winPercent = winPercent / 100;

        for(int i = 0; i < 50; i++){
            print("@");
        }
        println();
        println("             Overall Statistics:                  ");
        println("              Games played: "+gamesPlayed          );
        println("                Games won: "+gamesWon              );
        println("              Win percent: "+winPercent+"%        ");
        println("         Best game: "+hScore+" guess(es) remaining");
        println("             Thanks for playing!!!                ");
        for(int i = 0; i < 50; i++){
            print("@");
        }
        println();
    }

    private String getRandomWord(String filename) {
        String secretWord = "";
        RandomGenerator random = RandomGenerator.getInstance();
        int wordCount = random.nextInt(1,74);

        try{
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            for(int i = 0; i <= wordCount; i++)
            {
                secretWord = buffer.readLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }


        return secretWord;
    }

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        /*canvas.reset();*/  // sample canvas method call
        setSize(1040,800);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }

    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
