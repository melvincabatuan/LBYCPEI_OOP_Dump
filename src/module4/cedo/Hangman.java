package module4.cedo;

import acm.program.ConsoleProgram;

// Incomplete
public class Hangman extends ConsoleProgram {

    public void run() {
        // TODO: write this method
        intro();
        playOneGame("PROGRAMMER");
    }

    // TODO: comment this method
    private void intro() {
        int i;
        for (i = 0; i < 28; i++) printf("@");
        printf("\nWelcome to Hangman!\n");
        println("I will think of a random word.");
        println("You'll try to guess its letters.");
        println("Every time you guess a letter");
        println("that isn't in my word, a new body");
        println("part of the hanging man appears.");
        println("Good Luck!");
        for (i = 0; i < 28; i++) printf("@");
        String x = readLine();
        clearConsole();
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        // TODO: write this method
        int guessCount = 8;
        StringBuffer guessedLetters = new StringBuffer("ABCD");
        String mySecretWord = "";

        while (guessCount > 0) { // replace() cant be resolved
            mySecretWord = " ";// createHint(secretWord,guessedLetters.toString().replace());
            println("Secret Word: " + mySecretWord);
            println("Your guesses: " + guessedLetters);
            println("Guesses left: " + guessCount);
            char guess = readGuess(guessedLetters.toString());
            guessedLetters.append(guess);
        }
        return 0;
    }

    // TODO: comment this method
    private String createHint(String secretWord, String guessedLetters) {
        // TODO: write this method
        StringBuilder mySecretWord = new StringBuilder(secretWord);
        StringBuilder oppSecretWord = new StringBuilder(secretWord);
        StringBuilder myGuessedLetters = new StringBuilder(guessedLetters);
        myGuessedLetters.reverse();
        String guess = myGuessedLetters.substring(0,0);

        if (secretWord.contains(guess)) {
            mySecretWord.setCharAt(oppSecretWord.indexOf(guess),guess.charAt(0));
            oppSecretWord.setCharAt(oppSecretWord.indexOf(guess),'-');
        }
        return mySecretWord.toString();
    }


    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        // TODO: write this method
        String guess = "";
        do {
            guess = readLine("Your guess? ");
            if (guessedLetters.contains(guess)) {
                println("You have already guessed the letter!");
                println("Please try another letter.");
            }
            if (guess.length()>1) {
                println("Type a single letter from A-Z.");
            }
        }
        while (guessedLetters.contains(guess)) ;
        return guess.charAt(0);
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
        println("Hello LBYCPEI!");
        println("This is the next line!");
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Hangman().start(args);
    }


    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
