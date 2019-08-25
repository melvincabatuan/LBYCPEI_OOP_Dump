package module4.sabu;

import acm.program.ConsoleProgram;
import acm.util.MediaTools;
import acm.util.RandomGenerator;

import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HangmanConsole extends ConsoleProgram{

    private char L;
    private static int guessCount = 8;
    private static int wordLength;

    public void run(){
        int gamesCount = 0;
        int gamesWon = 0;
        int gcOld = 0;
        int best = 0;
        intro();
        do{
            String filename = promptUserForFile("Dictionary filename: ", "assets");
            guessCount = playOneGame(getRandomWord(filename));
            if (guessCount > 0){
                gamesWon += 1;
            }
            if (guessCount > gcOld){
                best = guessCount;
                gcOld = guessCount;
            }
            gamesCount += 1;
            guessCount = 8;
        }while (readBoolean("Do you want to play again? ", "Y", "N"));

        stats(gamesCount,gamesWon,best);

    }

    private int playOneGame(String secretWord){
        wordLength = secretWord.length();
        char[] guess = new char[wordLength];
        displayHangman(guessCount);
        String guessedLetters = "";

        while (guessCount>0){

            String word = new String(guess);
            print("\nSecret Word: ");
            String hint = createHint(secretWord, guessedLetters);
            print(hint);

            print("\nYour Guesses: " + guessedLetters);

            println("\nGuesses left: " + guessCount);

            if (word.equals(secretWord)){
                println("You win! " + secretWord + " was guessed correctly.\n");
                AudioClip soundEffect = MediaTools.loadAudioClip("assets/reaction-video-supa-hot-fire-cheering.mp3");
                soundEffect.play();

                break;
            }

            L = readGuess(guessedLetters);
            guessedLetters += L;
            String c1 = Character.toString(L);

            if (secretWord.contains(c1)){
                println("Correct!");
                AudioClip soundEffect = MediaTools.loadAudioClip("assets/ding-sound-effect_2.mp3");
                soundEffect.play();
                for(int x=0;x<wordLength;x++){
                    if(secretWord.charAt(x) == L){
                        guess[x] = L;
                    }
                }
            }
            else{
                AudioClip soundEffect = MediaTools.loadAudioClip("assets/its-a-disaster_1.mp3");
                soundEffect.play();
                guessCount -= 1;
                displayHangman(guessCount);
                println("Incorrect!");
            }

            if (guessCount == 0){
                AudioClip soundEffect = MediaTools.loadAudioClip("assets/how.mp3");
                soundEffect.play();
                println("You LOSE!");
                println("The secret word was: "+ secretWord);
                break;
            }
        }

        return guessCount;
    }

    private String createHint(String secretWord, String guessedLetters){
        String hint = "";
        int gLength = guessedLetters.length();
        if(gLength == 0){
            for(int x=0;x<wordLength;x++){
                hint += "-";
            }
        }
        else{
            for(int x=0;x<wordLength;x++){
                int presentLetter = 0;
                for(int y=0;y<gLength;y++){
                    if(guessedLetters.charAt(y) == secretWord.charAt(x)){
                        hint += guessedLetters.charAt(y);
                        presentLetter+=1;
                    }
                }
                if(presentLetter != 1) {
                    hint += "-";
                }
            }
        }
        return hint;
    }



    private char readGuess(String guessedLetters){
        String guess;
        do{
            guess = readLine("Your guess: ").toUpperCase();

            if (guess.length() != 1){
                println("Type a single letter from A-Z");
            }
            if(guessedLetters.contains(guess.toUpperCase())){
                println("You already guessed that letter.");
            }

        }while(guess.length() > 1 || guessedLetters.contains(guess.toUpperCase()));

        char c = guess.charAt(0);

        return c;
    }


    private void displayHangman(int guessCount){
        if (guessCount == 8){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display8.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 7){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display7.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 6){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display6.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 5){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display5.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 4){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display4.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 3){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display3.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 2){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display2.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 1){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display1.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        if (guessCount == 0){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display0.txt"));
                String line;
                while ((line = buffer.readLine()) != null) {
                    println(line);
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    private String getRandomWord(String filename){
        String rWord = "";

        RandomGenerator random = RandomGenerator.getInstance();
        int count = 1;
        int wordCount = random.nextInt(count, 74);
        String numbers = "1234567890";

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(filename));
            for (int i = 0; i <= wordCount; i++) {
                rWord = buffer.readLine();
                if (rWord.contains(numbers)){
                    count += 1;
                }
            }
        } catch (IOException e) {
            println("File not found.");
        }

        return rWord;
    }


    private void stats(int gamesCount, int gamesWon, int best){
        double winPercent = gamesWon/gamesCount;
        double percentage = winPercent * 100.0;
        println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "     Overall statistics:\n" +
                "        Games played: " + gamesCount +
                "\n        Games won: " + gamesWon +
                "\n      Win percent: " + percentage + "%" +
                "\nBest game: " + best + " guess(es) remaining\n" +
                "     Thanks for playing!\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }



    private void intro(){
        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "     Welcome to Hangman!\n" +
                " I will think of a random word.\n" +
                "You'll try to guess its letters.\n" +
                " Every time you guess a letter\n" +
                "that isn't in my word, a new body\n" +
                " part of the hanging man appears.\n" +
                "          Goodluck!\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    public static void main(String[] args) {
        (new HangmanConsole()).start(args);
    }


}
