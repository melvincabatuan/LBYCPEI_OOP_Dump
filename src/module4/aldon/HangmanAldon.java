package module4.aldon;

import acm.program.ConsoleProgram;

/* INCOMPLETE */
public class HangmanAldon extends ConsoleProgram {
    public void run() {
//// TODO: write this method
//        intro();
//        playOneGame(word2Guess);
    }
//    private hangGuess word2Guess = new hangGuess();
//
//    // TODO: comment this method
//    private void intro() {
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"     );
//        println("          Welcome to HangmanAscii!"               );
//        println("     I will think of a random word."         );
//        println("     You'll try to guess its letters."       );
//        println("     Every time you guess a letter"          );
//        println("    that isn't in my word, a new body"       );
//        println("     part of the hanging man appears."       );
//        println("              Goodluck!"                     );
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n" );
//
//// TODO: write this method
//    }
//
//    public int guessAttempts = 8;
//    // TODO: comment this method
//    private int playOneGame(String secretWord) {
//
//        String secretWord1 = secretWord.toUpperCase();
//        int sWordLength = secretWord1.length();
//
//
//        char[] blanks = new char[sWordLength];
//
//        for (int counter1 = 0; counter1 < sWordLength; counter1++) {
//            blanks[counter1] = '-';
//        }
//
//        String allBlanks = new String(blanks);
//
//        while (guessAttempts > 0 && !allBlanks.equals(secretWord1)) {
//
//            println("Guesses left: " + guessAttempts);
//            println("Secret word: " + allBlanks);
//            String guess = readLine("Your guess");
//
//            String convert1 = guess.toUpperCase();
//            char guessChar = guess.charAt(0);
//            char charConvert = Character.toUpperCase(guessChar);
//
//            if (guess.length() > 1 || Character.isLetter(guessChar) != true) {
//                println("1 letter only");
//                continue;
//            } else if (secretWord1.indexOf(convert1) == -1) {
//                println(guess + " is not found in the secret word\n");
//                guessAttempts--;
//            } else {
//                println("You are correct.\n");
//                for (int counter1 = 0; counter1 < sWordLength; counter1++) {
//                    if (charConvert == secretWord1.charAt(counter1)) {
//                        blanks[counter1] = secretWord1.charAt(counter1);
//                    }
//                }
//
//                String temp = new String(blanks);
//                allBlanks = temp;
//            }
//
//        }
//        if (guessAttempts == 0) {
//            println("You lose");
//        } else if (allBlanks.equals(secretWord1)) {
//            println("You win!");
//        }
//        hangGraphic();
//        return 0;
//    }
//
//
//// TODO: write this method
// //       return 0;
//
//    // TODO: comment this method
//
//    private String createHint(String secretWord, String guessedLetters) {
//// TODO: write this method
//        return "";
//    }
//    // TODO: comment this method
//    private char readGuess(String guessedLetters) {
//// TODO: write this method
//        return '?';
//    }
//    // TODO: comment this method
//    private void displayHangman(int guessCount) {
//// TODO: write this method
//    }
//    // TODO: comment this method
//    private void stats(int gamesCount, int gamesWon, int best) {
//// TODO: write this method
//    }
//// TODO: comment this method
//    /*private String getRandomWord(String filename) {
//// TODO: write this method
//
//        return "";
//    }*/
//    // TODO: comment this method
//    public void init() {
//        canvas = new hangmanCanvas();
//        add(canvas);
//        canvas.reset(); // sample canvas method call
//    }
//
//    public void hangGraphic(){
//        GImage hang1 = new GImage("hangsrc/01.png");
//        GImage hang2 = new GImage("hangsrc/02.png");
//        GImage hang3 = new GImage("hangsrc/03.png");
//        GImage hang4 = new GImage("hangsrc/04.png");
//        GImage hang5 = new GImage("hangsrc/05.png");
//        GImage hang6 = new GImage("hangsrc/06.png");
//        GImage hang7 = new GImage("hangsrc/07.png");
//        GImage hang8 = new GImage("hangsrc/08.png");
//        if (guessAttempts == 7){
//            add(hang1);
//        }
//        if (guessAttempts == 6){
//            add(hang2);
//        }
//        if (guessAttempts == 5){
//            add(hang3);
//        }
//        if (guessAttempts == 4){
//            add(hang4);
//        }
//        if (guessAttempts == 3){
//            add(hang5);
//        }
//        if (guessAttempts == 2){
//            add(hang6);
//        }
//        if (guessAttempts == 1){
//            add(hang7);
//        }
//        if (guessAttempts == 0){
//            add(hang8);
//        }
//    }
//    /* Solves NoClassDefFoundError*/
//    public static void main(String[] args) {
//        new HangmanAldon().start(args);
//    }
//    private hangmanCanvas canvas;
}
