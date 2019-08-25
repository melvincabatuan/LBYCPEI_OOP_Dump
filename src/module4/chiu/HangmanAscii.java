package module4.chiu;

import acm.program.*;
import acm.util.MediaTools;
import acm.util.RandomGenerator;

import java.applet.AudioClip;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;


public class HangmanAscii extends ConsoleProgram {


    public static void main(String[] args) {
        new HangmanAscii().start(args);
    }


    public void run() {
        int game=0;
        int gameWon=0;
        int numGuess;
        int bestRecord=0;
        intro();
        do {
            String secretWord = getRandomWord("assets/dict.txt");
            numGuess=playOneGame(secretWord);
            game++;
            if(numGuess!=0)
            {
                gameWon++;
                if(numGuess>=bestRecord) bestRecord=numGuess;
            }
        }while(readBoolean("Do You Want to Play Again:","Y","N"));
        stats(game,gameWon,bestRecord);
    }


    private void intro() {
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("           Welcome to HangmanAscii!          ");
        println("       I will think of a random word.     ");
        println("      You'll try to guess its letters.     ");
        println("       Every time you guess a letter     ");
        println("      that isn't in my word, a new body     ");
        println("       part of the hanging man appears     ");
        println("                Goodluck!     ");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        // TODO: write this method
    }


    private int playOneGame(String secretWord) {
        char letter;
        String word;
        String resultText=" ";
        AudioClip result;
        String guessLetters=" ";
        word=createHint(secretWord,guessLetters);

        int numGuess=8;
        while(numGuess!=0) {
            displayHangman(numGuess);
            println("Secret Word: "+word);
            println("Your Guesses:" +guessLetters);
            println("Number of guesses left: "+numGuess);
            letter = readGuess(guessLetters);
            guessLetters = guessLetters + letter;
            word = createHint(secretWord, guessLetters);
            resultText=turnsLeft(secretWord,guessLetters);
            println(resultText);
            if(resultText=="INCORRECT") numGuess--;
            if(!word.contains("-")){
                println();
                println("You Win!!! Answer: "+secretWord);
                result= MediaTools.loadAudioClip("assets/win.mp3");
                result.play();
                break;
            }
        }
        println();
        displayHangman(numGuess);
        if(numGuess==0) {
            println("You Lose!!! Answer: "+secretWord);
            result= MediaTools.loadAudioClip("assets/lose.mp3");
            result.play();
        }
        return numGuess;
    }


    private String turnsLeft(String secretWord, String guessedLetters)
    {
        AudioClip answer;
        String guess=Character.toString(guessedLetters.charAt(guessedLetters.length()-1));
        if(!secretWord.contains(guess))
        {
            answer= MediaTools.loadAudioClip("assets/wrong.mp3");
            answer.play();
            return "INCORRECT";
        }
        else
        {
            answer= MediaTools.loadAudioClip("assets/correct.mp3");
            answer.play();
            return "CORRECT";
        }
    }

    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        String word="";
        for(int x=0; x<secretWord.length();x++)
        {
            word += "-";
        }

        for(int x=0; x<secretWord.length(); x++)
        {
            for(int y=0; y<guessedLetters.length();y++)
            {
                if(secretWord.charAt(x)== guessedLetters.charAt(y))
                {
                    word=word.substring(0,x) + guessedLetters.charAt(y) + word.substring(x+1);
                }
            }
        }

        return word;
    }

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        AudioClip background = MediaTools.loadAudioClip("assets/backgroundSound.mp3");
        background.play();
        String userGuess;
        userGuess=readLine("Type a Letter:");
        while(true)
        {
            userGuess=userGuess.toUpperCase();
            if(userGuess.length()!=1 || !Character.isLetter(userGuess.charAt(0))){
                userGuess=readLine("Invalid Input Type Again: ");
            }

            else if(guessedLetters.contains(userGuess))
            {
                userGuess=readLine("Type a different letter: ");
            }
            else
            {
                background.stop();
                return userGuess.charAt(0);

            }
        }

    }

    // TODO: comment this method
    private void displayHangman(int guessCount) {
        canvas.clear();
        canvas.println(guessCount);
        // TODO: write this method
    }

    // TODO: comment this method
    private void stats(int gamesCount, int gamesWon, int best) {
        double percent= (gamesWon*1.0 / gamesCount)*100;
        DecimalFormat formatter = new DecimalFormat("#0.00");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("           Overall Statistics:           ");
        println("              Games Played: "+gamesCount);
        println("               Games won: "+gamesWon);
        println("             Win percent: "+formatter.format(percent)+"%");
        println("      Best Game: "+best+" guess(es) remaining");
        println("            Thanks for playing!");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }

    // TODO: comment this method
    private String getRandomWord(String filename) {
        // TODO: write this method
        RandomGenerator rgen = RandomGenerator.getInstance();
        ArrayList<String>numWords= new ArrayList<>();
        int num=0;
        int randomNum;
        try {
            InputStream stream = new FileInputStream(filename);
            Scanner input = new Scanner(stream);
            num = input.nextInt();
            for (int x = 0; x < num; x++) {
                numWords.add(input.next());
            }
        }catch (FileNotFoundException e) {
            println("No File Exists");
        }

        randomNum=rgen.nextInt(0,num-1);

        return numWords.get(randomNum);
    }

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        setTitle("LBYCPEI HANGMAN");
        setSize(1280,720);
    }




    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
