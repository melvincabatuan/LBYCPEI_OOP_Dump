package module4.dong;

import acm.program.ConsoleProgram;
//String is immutable ( not changeable);

// Incomplete
public class Hangman extends ConsoleProgram {

    private int guessesLeft = 10;
    private String enteredLetters = "";
    private String guessedLetters = "";
    private String secretWord = "PROGRAMMER";
    private String ABC;
    private char ch;
    private String getChar;

    //private StringBuilder myString;
    private StringBuilder myString= new StringBuilder("----------");
    public void run() {
        intro();
        playOneGame("PROGRAMMER");
    }

    private int playOneGame(String secretWord) {

        println();
        println("Guesses Left: " + guessesLeft);
        println("Enter you guess: ");

        for (int i = 0; i <secretWord.length();i++){
            guessedLetters += "-";
        }
        //createHint(secretWord, guessedLetters);
        println("Secret Word: " + guessedLetters);

                while (guessesLeft > 0) {
                    String getChar = readLine("Your guess: ");
                    getChar = getChar.toUpperCase();

                    while (true) {
                        if (getChar.length() > 1) {
                            getChar = readLine("You can only guess one letter at a time. Try again: ");
                            getChar = getChar.toUpperCase();
                        }
                        if (getChar.length() == 1) break;
                    }


                    ch = getChar.charAt(0);
                    readGuess(guessedLetters);
                    enteredLetters = enteredLetters + ch;
                    println("Guesses left: " + guessesLeft);
                    println("Entered Letters: " + enteredLetters);
                    createHint(secretWord, guessedLetters);
                    println("The word now looks like this: " + myString);



                }
                return 0;
            }




    private StringBuilder createHint(String secretWord, String guessedLetters) {
        for(int i = 0;i <secretWord.length();i++){
            if(secretWord.charAt(i)==ch){
                myString.setCharAt(i,ch);
            }
        }
        return myString;
    }



    // TODO: comment this method
    private char readGuess(String guessedLetters) {
        if (secretWord.indexOf(ch) == -1) {
            println("Incorrect");
            guessesLeft--;
        }
        if (secretWord.indexOf(ch) != -1) {
            println("Correct!");
        }
        return ch;
    }

    private void displayHangman(int guessCount) {
        // TODO: write this method
    }
    private void stats(int gamesCount, int gamesWon, int best) {
        // TODO: write this method
    }
    private String getRandomWord(String filename) {
        // TODO: write this method
        return "";
    }
    /**  public void init() {
     canvas = new HangmanCanvas();
     add(canvas);
     canvas.reset();  // sample canvas method call
     println("Hello LBYCPEI!");
     println("This is the next line!");
     }**/
    //  }
    //
    private void intro(){
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("      Welcome to Hangman !");
        println("I will think of a random word.");
        println("You 'll try to guess its letters.");
        println("Every time you guess a letter");
        println("that isn 't in my word, a new body");
        println("part of the hanging man appears.");
        println("           Goodluck !");
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    // private HangmanCanvas canvas;
    /* Solves NoClassDefFoundError */

    public void init() {
        canvas = new HangmanCanvas();
        add(canvas);
        canvas.reset();  // sample canvas method call
     //   canvas.clear();
      //  GImage abc = new GImage("assets/display0");
       // canvas.add(abc,0,0);
      //  println("Hello LBYCPEI!");
      //  println("This is the next line!");



    }

    public static void main(String[] args) {
        new Hangman().start(args);
    }
    private HangmanCanvas canvas;

}
