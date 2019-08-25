package nq4;

import acm.program.ConsoleProgram;

public class NqAldon extends ConsoleProgram {

    public static void main (String [] args){
        (new NqAldon()).start(args);
    }

    public void run() {

        playOneGame("java");
    }

    private int playOneGame(String secretWord) {
        int guessAttempts = 8;
        String secretWord1 = secretWord.toUpperCase();
        int sWordLength = secretWord1.length();


        char[] blanks = new char[sWordLength];

        for (int counter1 = 0; counter1 < sWordLength; counter1++) {
            blanks[counter1] = '-';
        }

        String allBlanks = new String(blanks);

        while (guessAttempts > 0 && !allBlanks.equals(secretWord1)) {

            println("Guesses left: " + guessAttempts);
            println("Secret word: " + allBlanks);
            String guess = readLine("Your guess");

            String convert1 = guess.toUpperCase();
            char guessChar = guess.charAt(0);
            char charConvert = Character.toUpperCase(guessChar);

            if (guess.length() > 1 || Character.isLetter(guessChar) != true) {
                println("1 letter only");
                continue;
            } else if (secretWord1.indexOf(convert1) == -1) {
                println(guess + " is not found in the secret word\n");
                guessAttempts--;
            } else {
                println("You are correct.\n");
                for (int counter1 = 0; counter1 < sWordLength; counter1++) {
                    if (charConvert == secretWord1.charAt(counter1)) {
                        blanks[counter1] = secretWord1.charAt(counter1);
                    }
                }

                String temp = new String(blanks);
                allBlanks = temp;
            }

        }
        if (guessAttempts == 0) {
            println("You lose");
        } else if (allBlanks.equals(secretWord1)) {
            println("You win!");
        }
        return 0;
    }
}