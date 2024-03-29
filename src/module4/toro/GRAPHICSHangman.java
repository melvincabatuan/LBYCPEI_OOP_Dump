package module4.toro;

import acm.program.ConsoleProgram;
import acm.util.MediaTools;

import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GRAPHICSHangman extends ConsoleProgram {

    public void run() {
        AudioClip hornClip = MediaTools.loadAudioClip("assets/horn.wav");
        int gamesCount = 0;
        int gamesWon = 0;
        int best = 0;
        while (true) {
            canvas.clear();
            canvas.reset();
            intro();
            String randomWord = getRandomWord(readLine("Input file name: "));
            hornClip.play();
            println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            int guessCount;
            guessCount = playOneGame(randomWord);
            if (guessCount == 0) {
                println("\nYou lose. My word was \"" + randomWord + "\".");
                canvas.displayHangman(guessCount);
                gamesCount += 1;
            } else {
                println("\nYou win! My word was \"" + randomWord + "\".");
                gamesCount += 1;
                gamesWon += 1;
                if (guessCount > best) best = guessCount;
            }
            stats(gamesCount, gamesWon, best);
            while (true) {
                String choice = readLine("Play again? Y/N");
                if (choice.equalsIgnoreCase("Y")) {
                    break;
                }
                else if (choice.equalsIgnoreCase("N")) {
                    System.exit(0);
                    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
                else {
                    println("Invalid choice.");
                }
            }
        }
    }

    // Displays intro message on right part of program
    private void intro() {
        canvas.printText("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        canvas.printText("          Welcome to HangmanAscii!       ");
        canvas.printText("    I will think of a random word.  ");
        canvas.printText("   You'll try to guess its letters. ");
        canvas.printText("    Every time you guess a letter   ");
        canvas.printText("    that isn't my word, a new body  ");
        canvas.printText("   part of the hanging man appears. ");
        canvas.printText("              Good luck!            ");
        canvas.printText("  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

    }

    // Main loop of the program, where the game of HangmanAscii is ran
    private int playOneGame(String secretWord) {
        String hint;
        String guessedLetters = " ";
        int guessCount = 8;
        while (guessCount != 0) {
            canvas.displayHangman(guessCount);
            hint = createHint(secretWord, guessedLetters);
            if (!hint.contains("-")) return guessCount;
            println("Secret Word: " + hint);
            println("Your guesses:" + guessedLetters);
            println("Guesses left: " + guessCount);
            char[] valReturned = readGuess(guessedLetters, secretWord);
            char guess = valReturned[0];
            if (valReturned[1] == '0') guessCount -= 1;
            guessedLetters = guessedLetters + guess;
        }
        return guessCount;
    }


    // Displays a hint for the HangmanAscii game, showing letters guessed correctly and leaving the incorrect ones as dashes
    private String createHint(String secretWord, String guessedLetters) {
        StringBuilder hint = new StringBuilder();

        for(int i = 0; i < secretWord.length(); i++) {
            if (containsCorrectLetter(secretWord, guessedLetters, i)) {
                hint.append(secretWord.charAt(i));
            }
            else {
                hint.append("-");
            }
        }
        return hint.toString();
    }

    private boolean containsCorrectLetter(String secretWord, String guessedLetters, int i) {
        return (guessedLetters.indexOf(secretWord.charAt(i)) > -1);
    }

    // Takes letter from user, checks if it was repeated and if it is a one digit letter, then checks if it was right or wrong
    private char[] readGuess(String guessedLetters, String secretWord) {
        AudioClip hornClip = MediaTools.loadAudioClip("assets/horn.wav");
        while (true) {
            boolean repeated = false;
            println("Your guess?");
            String input = readLine();
            //input.toUpperCase();
            if (input.length() != 1 || !input.matches("[a-zA-Z]+")) {
                println("Type a single letter from A-Z.");
                continue;
            }
            char c = input.charAt(0);
            c = Character.toUpperCase(c);
            for(int i = 0; i < guessedLetters.length(); i++) {
                if(guessedLetters.charAt(i) == c) {
                    println("You already guessed that letter.");
                    repeated = true;
                    break;
                }
            }
            if(repeated) continue;
            boolean correct = false;
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == c) {
                    correct = true;
                }
            }
            if (!correct) {
                println("Incorrect.");
                hornClip.play();
                return new char[]{c, '0'};
            }
            else {
                println("Correct!");
                hornClip.play();
                return new char[]{c, '1'};
            }
        }
    }

    // Displays the stats of the HangmanAscii games played
    private void stats(int gamesCount, int gamesWon, int best) {
        println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("       Overall statistics:    ");
        println("         Games Played: " + gamesCount);
        println("          Games Won: " + gamesWon);
        double winPercent = (gamesWon * 1.0 / gamesCount) * 100;
        printf("      Win percent: %.1f%% \n", winPercent);
        println("Best game: " + best + " guess(es) remaining");
        println("       Thanks for playing!       ");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

    }

    // Gets a random word from a text file
    private String getRandomWord(String filename) {
        Random rand = new Random();
        while (true) {
            try {
                Scanner scanner = new Scanner(new File("assets/" + filename));
                int n = rand.nextInt((Integer.parseInt(scanner.nextLine()) - 1) + 1) + 1;
                while (scanner.hasNext()) {
                    for (int i = 0; i < n; i++) {
                        if (i == n - 1) {
                            return scanner.nextLine();
                        }
                        scanner.nextLine();

                    }
                }
            } catch (IOException e) {
                println("Invalid filename. Example: \"dict.txt\"");
                filename = readLine("Input file name: ");
            }
        }
    }

    public void init() {
        canvas = new GRAPHICSHangmanCanvas();
        add(canvas);
        canvas.reset();  // sample canvas method call
    }


    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new GRAPHICSHangman().start(args);
    }


    // private HangmanCanvas canvas;
    private GRAPHICSHangmanCanvas canvas;
}
