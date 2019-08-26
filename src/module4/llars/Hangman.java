package module4.llars;

import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class Hangman extends ConsoleProgram {

    public void run() {
        int games = 0;
        int guess;
        int gamesWon=0;
        int guessBest=0;
        do {
            games++;
            intro();
            String secretWord = getRandomWord("assets/dict.txt");
            guess=playOneGame(secretWord);
            if (guess > 0) {
                gamesWon++;
            }
            if (guess>guessBest){
                guessBest=guess;
            }
        }while (readBoolean("\nDo you wish to play again? (y/n)", "y", "n")) ;

        stats(games, gamesWon, guessBest);

    }


    private void intro() {
        printf("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
        printf("        Welcome to Hangman!\n");
        printf("   I will think of a random word\n");
        printf("   You'll try to guess its letters.\n");
        printf("  Every time you guess a letter\n");
        printf(" that isn't in my word, a new body\n");
        printf("  part of the hanging man appears.\n");
        printf("             Goodluck!\n");
        printf("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    // TODO: comment this method
    private int playOneGame(String secretWord) {
        printf("\n");
        int guessCount = 8;
        int wordLength = secretWord.length();
        String letters = "";
        int correct = 0;
        int win = 0;
        String guessedLetters = "";
        String input;
        //char[] letters = new char[wordLength];
        char guess = ' ';
        int n = 0;
        int finish=0;

            do {

                displayHangman(guessCount);

                printf("Secret word: " + createHint(secretWord, guessedLetters));
                printf("\nYour guesses: " + guessedLetters);
                printf("\nGuesses left: " + guessCount);
                input = readLine("\nYour guess: ").toUpperCase();
                guess=readGuess(input);
                guessedLetters = guessedLetters + input;
                if (secretWord.indexOf(guess) != (-1)) {
                    printf("CORRECT!\n");
                    for (int x = 0; x < (secretWord.length()); x++) {
                        for (int y = 0; y < guessedLetters.length(); y++) {
                            if (guessedLetters.charAt(y) == secretWord.charAt(x)) {
                                letters = letters + guessedLetters.charAt(y);
                                break;
                            }
                        }
                    }
                    if (letters.contains(secretWord)) {
                        win++;
                        finish=1;
                    }
                } else if (secretWord.indexOf(guess) == (-1)) {
                    printf("WRONG!\n");
                    guessCount = guessCount - 1;
                    if (guessCount==0){
                        win=0;
                        finish=1;
                    }
                }

            } while (finish!=1);
            if (win > 0) {
                clearScreen();
                printf("You Won!\n");
                println("Congratulations! The Secret word is: " + secretWord);
            } else {
                displayHangman(0);
                println("You died! The Secret word is: " + secretWord);
            }
        return guessCount;
    }


    // TODO: comment this method
        private String createHint(String secretWord, String guessedLetters) {


        String hint = " ";
        for (int x = 0; x < (secretWord.length()); x++) {
            hint=hint+"-";
            for (int y = 0; y < guessedLetters.length(); y++) {
                if (guessedLetters.charAt(y) == secretWord.charAt(x)) {
                    hint = hint + guessedLetters.charAt(y);
                    break;
                }
            }
        }


        /*
        StringBuilder hint = new StringBuilder(" ");
            for (int x = 0; x < (secretWord.length()); x++) {
                hint.setCharAt(x, '-');
                for (int y = 0; y < guessedLetters.length(); y++) {
                    if (guessedLetters.charAt(y) == secretWord.charAt(x)) {
                        //hint = hint + guessedLetters.charAt(y);
                        hint.setCharAt(y, guessedLetters.charAt(y));
                        break;
                    }
                }
            }
            */
        return hint;
    }

            // TODO: comment this method
    private char readGuess (String guessedLetter){
        char guess=guessedLetter.charAt(0);
        return guess;
    }


            private void displayHangman (int guessCount){
                if (guessCount == 8) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display8.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 7) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display7.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 6) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display6.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 5) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display5.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 4) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display4.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 3) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display3.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 2) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display2.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 1) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display1.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (guessCount == 0) {
                    try {
                        BufferedReader buffer = new BufferedReader(new FileReader("assets/display0.txt"));
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            // TODO: comment this method
            private void stats ( int gamesCount, int gamesWon, int best){
                printf("\n");
                println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                println("       Overall Statistics");
                println("        Games played: "+gamesCount+"");
                println("         Games Won: " + gamesWon + "");
                println("      Win Percentage: " + ((gamesWon/gamesCount)*100) + "%");
                println(" Best game: " + best + " guesses remaining");
                println("       Thanks for playing!");
                println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }

            // TODO: comment this method
            private String getRandomWord (String filename){
                String secretWord = "";
                int num=0;
                RandomGenerator random = RandomGenerator.getInstance();
                int wordCount = random.nextInt(1, num);

                try {
                    BufferedReader buffer = new BufferedReader(new FileReader(filename));
                    for (int i = 0; i <= wordCount; i++) {
                        secretWord = buffer.readLine();
                        num=num+1;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


                return secretWord;
            }

            /*public void init () {
                canvas = new HangmanCanvas();
                add(canvas);
                canvas.reset();  // sample canvas method call
                println("Hello LBYCPEI!");
                println("This is the next line!");
            }*/

    public void clearScreen() {
        for (int i = 0; i < 1000; i++) {
            println();
        }
    }


            /* Solves NoClassDefFoundError */
            public static void main (String[]args){
                new Hangman().start(args);
            }


            // private HangmanCanvas canvas;
            //private HangmanCanvas canvas;
        }
