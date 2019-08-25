package module4.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 6/21/19
 */

import acm.program.ConsoleProgram;

/* Graphics and audio files not present */
public class HangmanGraphics extends ConsoleProgram {
//    AudioClip startSound = MediaTools.loadAudioClip("C:/Users/Ralph/IdeaProjects/Hangman2/assets/yeet.mp3");
//    AudioClip correctSound = MediaTools.loadAudioClip("C:/Users/Ralph/IdeaProjects/Hangman2/assets/Yeah.mp3");
//    AudioClip wrongSound = MediaTools.loadAudioClip("C:/Users/Ralph/IdeaProjects/Hangman2/assets/IGH.au");
//    AudioClip winningSound = MediaTools.loadAudioClip("C:/Users/Ralph/IdeaProjects/Hangman2/assets/celebration.mp3");
//    AudioClip losingSound = MediaTools.loadAudioClip("C:/Users/Ralph/IdeaProjects/Hangman2/assets/sad.mp3");


    public void run() {
        // TODO: write this method
//
//        int bestGameCount = 0, previousCount = 0, guessCountNow;
//        float gamesCount = 0, winCount = 0;
//
//
//        AudioClip effect;
//
//        setSize(750,800);
//        intro();
//        do{
//            String filename = promptUserForFile("\n\nEnter the filename of the dictionary you want to use: ", "assets");
//            startSound.play();
//            guessCountNow = playOneGame(getRandomWord(filename));
//
//            if(guessCountNow>0){
//                winCount++;
//                if(guessCountNow > previousCount){
//                    bestGameCount = guessCountNow;
//                    previousCount = guessCountNow;
//                }
//            }
//            gamesCount++;
//        }while(readBoolean("Do you want to play another game? (Y/N)", "Y","N"));
//        if(gamesCount>0) stats(gamesCount, winCount, bestGameCount);
    }

    // TODO: comment this method
//    private int playOneGame(String secretWord){
//        int lives = 8;
//        char[] correct = new char[secretWord.length()];
//        String guessedLetters = "";
//
//        while(lives > 0) {
//            displayHangman(lives);
//            print("\nSecret word: ");
//            String hint = createHint(secretWord, guessedLetters);
//            println(hint);
//            if(guessedLetters.length() > 0) println("Your guesses: "+guessedLetters);
//            println("Guesses left: "+lives);
//            String confirm = new String(correct);
//            if(confirm.equals(secretWord)){
//                winningSound.play();
//                println("You guessed the word correctly!");
//                break;
//            }
//            char letter = readGuess(guessedLetters);
//            guessedLetters += letter;
//            if(secretWord.contains(Character.toString(letter))){
//                println("Correct!");
//                correctSound.play();
//                for(int i=0;i<secretWord.length();i++){
//                    if(secretWord.charAt(i) == letter) correct[i] = letter;
//                }
//            }
//            else{
//                lives--;
//                wrongSound.play();
//            }
//        }
//        if(lives == 0) {
//            losingSound.play();
//            println("You lose!");
//            println("No guesses left!");
//            println("\n\nThe correct word was "+secretWord);
//            displayHangman(lives);
//        }
//        return lives;
//    }
//
//    // TODO: comment this method
//    private String createHint(String secretWord, String guessedLetters) {
//        String hint = "";
//        int i, j;
//
//        if(guessedLetters.length() > 0) {
//            for(i=0;i<secretWord.length();i++){
//                boolean verify = false;
//                for(j=0;j<guessedLetters.length();j++){
//                    if(guessedLetters.charAt(j) == secretWord.charAt(i)){
//                        hint += guessedLetters.charAt(j);
//                        verify = true;
//                    }
//                }
//                if(!verify)hint += "-";
//            }
//        }
//        else{
//            for(i=0;i<secretWord.length();i++) hint += "-";
//        }
//        return hint;
//    }
//
//    // TODO: comment this method
//    private char readGuess(String guessedLetters) {
//        //todo
//        char letter;
//        String input;
//        String illegalInput="`1234567890-=~!@#$%^&*()_+[]\\{}|;':\",./<>?";
//
//        do{
//            input = readLine("Your guess? ");
//            if(illegalInput.contains(input)) println("Enter a letter from A-Z");
//            else if(input.length() > 1) println("Enter a letter from A-Z");
//            else if(guessedLetters.contains(input.toUpperCase())) println("You've already tried that.");
//        }while(input.length() > 1 || illegalInput.contains(input) || guessedLetters.contains(input.toUpperCase()));
//        letter = input.toUpperCase().charAt(0);
//        return letter;
//    }
//
//
//
//    // TODO: comment this method
//    private void displayHangman(int lives) {
//
//        String picture = "", text = "";
//        if (lives == 8){
//            picture = "pic8.png";
//        }
//        else if (lives == 7){
//            picture = "pic7.png";
//        }
//        else if (lives == 6){
//            picture = "pic6.png";
//        }
//        else if (lives == 5){
//            picture = "pic5.png";
//        }
//        else if (lives == 4){
//            picture = "pic4.png";
//        }
//        else if (lives == 3){
//            picture = "pic3.png";
//        }
//        else if (lives == 2){
//            picture = "pic2.png";
//        }
//        else if (lives == 1){
//            picture = "pic1.png";
//        }
//        else if (lives ==0) {
//            picture = "pic1.png";
//        }
//        // canvas.cls();
//        canvas.reset();
//        // canvas.showPhoto(picture);
//    }
//
//    // TODO: comment this method
//    private void stats(float gamesCount, float gamesWon, int best) {
//        // TODO: write this method
//        double winRate = (gamesWon/gamesCount) * 100;
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        println("        Overall Statistics:");
//        println("          Games played: "+gamesCount);
//        println("            Games won: "+gamesWon);
//        println("        Win percent: "+winRate+"%");
//        println("  Best game: "+best+" guess(es) remaining");
//        println("        Thanks for playing!");
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//    }
//
//    // TODO: comment this method
//    private String getRandomWord(String filename) {
//        // TODO: write this method
//
//        String randomWord = "";
//        int max, goToLine;
//        RandomGenerator rgen = RandomGenerator.getInstance();
//        try {
//            File source = new File(filename);
//            Scanner dictionary = new Scanner(source);
//            max = Integer.parseInt(dictionary.next());
//            goToLine = rgen.nextInt(1,max);
//            for(int i=0;i<=goToLine;i++){
//                randomWord = dictionary.next();
//            }
//        }
//        catch(Exception e){
//            println("FILE NOT FOUND ERROR");
//        }
//        return randomWord;
//    }
//
//    // TODO: comment this method
//    private int intro() {
//        println("    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        println("            Welcome to HangmanAscii");
//        println("      I will think of a random word");
//        println("    You'll try to guess its letters.");
//        println("      Every time you guess a letter");
//        println("    that isn't in my word, a new body");
//        println("     part of the hanging man appears.");
//        println("                Good luck!");
//        println("    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
//        return 0;
//    }
//
//
//    public void init() {
//        canvas = new HangmanCanvas();
//        add(canvas);
//
//    }
//
//    /* Solves NoClassDefFoundError */
//    public static void main(String[] args) {
//        new HangmanGraphics().start(args);
//    }
//

    // private HangmanCanvas canvas;
    private HangmanCanvas canvas;
}
