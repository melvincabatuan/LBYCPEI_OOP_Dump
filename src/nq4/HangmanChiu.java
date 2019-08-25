package nq4;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class HangmanChiu extends ConsoleProgram {


    public void run() {
        intro();
        String secretWord = getRandomWord("assets/dict.txt");
        playOneGame(secretWord);

    }

    private void intro() {
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("           Welcome to HangmanChiu!          ");
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
        String guessLetters = " ";
        word = createHint(secretWord, guessLetters);
        int numGuess = 8;
        while (numGuess != 0) {
            displayHangman(numGuess);
            println("SECRET WORD:"+word);
            println("Your Guesses:" + guessLetters);
            println("Number of guesses left: " + numGuess);
            letter = readGuess(guessLetters);
            guessLetters = guessLetters + letter;
            word = createHint(secretWord, guessLetters);
            numGuess = turnsLeft(numGuess, secretWord, guessLetters);
            println();
            if (!word.contains("-")) {
                break;
            }
        }
        println();
        displayHangman(numGuess);
        if (numGuess == 0) println("Answer: " + secretWord);
        return numGuess;
    }


    private int turnsLeft(int num, String secretWord, String guessedLetters) {
        String guess = Character.toString(guessedLetters.charAt(guessedLetters.length() - 1));
        if (!secretWord.contains(guess)) {
            num--;
        }
        return num;
    }

    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        String word = "";
        for (int x = 0; x < secretWord.length(); x++) {
            word += "-";
        }

        for (int x = 0; x < secretWord.length(); x++) {
            for (int y = 0; y < guessedLetters.length(); y++) {
                if (secretWord.charAt(x) == guessedLetters.charAt(y)) {
                    word = word.substring(0, x) + guessedLetters.charAt(y) + word.substring(x + 1);

                }
            }
        }

        return word;
    }

    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        String userGuess;
        userGuess = readLine("Type a Letter:");
        while (true) {
            userGuess = userGuess.toUpperCase();
            if (userGuess.length() != 1 || !Character.isLetter(userGuess.charAt(0))) {
                userGuess = readLine("Invalid Input Type Again: ");
            } else if (guessedLetters.contains(userGuess)) {
                userGuess = readLine("Type a different letter: ");
            } else {
                return userGuess.charAt(0);
            }
        }

    }

    // TODO: comment this method
    private void displayHangman(int guessCount)
        {
            String order = Integer.toString(guessCount);
            try (BufferedReader br = new BufferedReader(new FileReader("assets/display"+order+".txt"))) {
                String line = null;
                while ((line = br.readLine()) != null) {
                    println(line);
                }

            } catch (IOException ex) {
                println("Error reading file");
            }
        }

        /*
        private void stats ( int gamesCount, int gamesWon, int best){
            double percent = (gamesWon * 1.0 / gamesCount) * 100;
            DecimalFormat formatter = new DecimalFormat("#0.00");
            println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            println("           Overall Statistics:           ");
            println("              Games Played: " + gamesCount);
            println("               Games won: " + gamesWon);
            println("             Win percent: " + formatter.format(percent) + "%");
            println("      Best Game: " + best + " guess(es) remaining");
            println("            Thanks for playing!");
            println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        }
*/
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
/*
    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
    }

*/
        /* Solves NoClassDefFoundError */

    public static void main(String[] args) {
        new HangmanChiu().start(args);
    }

    }
