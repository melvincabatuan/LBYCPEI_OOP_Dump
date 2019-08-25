package module4.tiu;

import acm.program.ConsoleProgram;
import acm.util.MediaTools;
import acm.util.RandomGenerator;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Hangman3 extends ConsoleProgram {

    public void run() {
        int chance = 0,win = 0,count = 0,best = 0;

        char answer='N';
        String temp="";

        intro();
        do{
            count++;
            chance=playOneGame(getRandomWord("assets/dict.txt"));
            if(chance>0) win++;
            if(chance>best) best=chance;

            temp=readLine("PLAY AGAIN?(Yes or No)");
            if(temp.length()>0) answer=temp.toUpperCase().charAt(0);
        }while(answer=='Y');
        stats(count,win,best);

    }

    private void intro() {
        // TODO: write this method
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
        AudioClip hornClip = MediaTools.loadAudioClip("assets/Died.wav");
        String temp;
        int wordLen = secretWord.length();
        int chance = 8;
        int lettersToGuess= wordLen;
        char[] secret= new char[wordLen];
        String guesses = "";
        char guess =' ';
        boolean guessed=false;

        do{
            canvas.draw(chance);
            print("SECRET WORD :"+createHint(secretWord,guesses));
            /*for(int i = 0;i<wordLen;i++)
            {
                print(secret[i]);
            }*/
            println();
            println("YOUR GUESSES :"+guesses);
            println("GUESSES LEFT :"+chance);
            temp=readLine("YOUR GUESS? ");
            if(temp.length()>0) guess = temp.toUpperCase().charAt(0);
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
            if(guessed==false) {
                chance--;
                hornClip.play();
            }
            if(lettersToGuess==0) break;
        }while(chance>0);
        canvas.draw(chance);
        if(chance==0) println("YOU LOSE");
        else println("YOU WIN");
        println("MY WORD WAS "+secretWord+"");

        return chance;
    }

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

    private char readGuess(String guessedLetter) {
        // TODO: write this method
        char guess;
        guessedLetter=guessedLetter.toUpperCase();
        guess = guessedLetter.charAt(0);

        return guess;
    }

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

    private void stats(int gamesCount, int gamesWon, int best) {
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
        setSize(1040,800);
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman3().start(args);
    }

    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
