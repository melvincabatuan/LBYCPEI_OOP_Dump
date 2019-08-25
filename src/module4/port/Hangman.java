package module4.port;

import acm.program.ConsoleProgram;

public class Hangman extends ConsoleProgram {
//
//    int guessAttempts = 8, quit = 0, gamesLost = 0, bestGuessAttempts = 0;
//    double gamesPlayed = 0, gamesWon = 0;
//
//    public void run() {
//        // TODO: write this method
//        do {
//            gamesPlayed = gamesPlayed + 1;
//            intro();
//            String randomWord = getRandomWord("assets/twowords.txt");
//            playOneGame(randomWord);
//
//            while (true) {
//                Scanner scan = new Scanner(System.in);
//                printf("\n>> Do you wish to play again? ( 1 = YES / 0 = NO ): ");
//                quit = readInt();
//                if (quit == 1 || quit == 0){
//                    guessAttempts = 8;
//                    canvas.reset();
//                    canvas.losingCondition(guessAttempts);
//                    break;
//                } else {
//                    println("INVALID INPUT\n");
//                }
//            }
//        }while (quit == 1) ;
//
//        stats(gamesPlayed, gamesWon,bestGuessAttempts);
//    }
//
//    // TODO: comment this method
//    private void intro() {
//        println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        println("     Welcome to Hangman!");
//        println(" I will think of a random word.");
//        println(" You'll try to guess its letters");
//        println("  Every time you guess a letter");
//        println("that isn't in my word, a new body");
//        println(" part of the hanging man appears.");
//        println("          Good Luck!");
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
//
//    }
//
//    // TODO: comment this method
//    private int playOneGame(String secretWord) {
//        // TODO: write this method
//
//        String secretWordUpperCase = secretWord.toUpperCase();
//
//        int secretWordLength = secretWordUpperCase.length();
//
//
//        char[] displayBlank = new char[secretWordLength];
//
//        for(int i=0;i<secretWordLength;i++){
//            displayBlank[i] = '-';
//        }
//        String displayAllBlanks = new String(displayBlank);
//
//        while(guessAttempts > 0 &&! displayAllBlanks.equals(secretWordUpperCase)){
//
//            println("You are guessing for the word: [ " + displayAllBlanks + " ]");
//
//            if(guessAttempts == 8){
//                println("You have " + guessAttempts + " attempts.");
//            }
//            else{
//                println("You now have " + guessAttempts + " attempts left.");
//            }
//
//            String guess = readLine(">> Your guess: ");
//
//            String upperCaseConvert = guess.toUpperCase();
//            char guessChar = guess.charAt(0);
//            char upperCaseCharConvert = Character.toUpperCase(guessChar);
//
//            if(guess.length() > 1){
//                println("\nINVALID INPUT");
//                println("Only ONE CHARACTER is accepted.\n");
//                continue;
//            }
//
//            if(secretWordUpperCase.indexOf(upperCaseConvert) == -1){
//                println("\nThere is no '" + guess + "' in the word.\n");
//                guessAttempts = guessAttempts - 1;
//
//                // Commented out parts are for the HangmanCanvas Class, shows the ascii version of the hangman game.
//                //canvas.reset();
//                add(canvas);
//                canvas.losingCondition(guessAttempts);
//                //canvas.printText(displayAllBlanks);
//            }
//
//            else{
//                println("\nThat guess is CORRECT.\n");
//                for(int i=0;i<secretWordLength;i++){
//                    if(upperCaseCharConvert == secretWordUpperCase.charAt(i)){
//                        displayBlank[i]=secretWordUpperCase.charAt(i);
//                    }
//                }
//
//                String charPass = new String(displayBlank);
//                displayAllBlanks = charPass;
//
//                add(canvas);
//                canvas.printText(displayAllBlanks);
//            }
//
//        }
//
//        if(guessAttempts == 0){
//            String loseText = "GAME OVER";
//            println(loseText);
//            println("You did not guess correct the word, which is '" + secretWordUpperCase + "'.");
//            canvas.endText(loseText);
//            canvas.finalWord(secretWordUpperCase);
//        }
//
//        else if(displayAllBlanks.equals(secretWordUpperCase)){
//            String winText = "YOU WIN !!";
//            println("\nWell Done");
//            println("You guessed the word, which is '" + secretWordUpperCase + "'.");
//            println(winText);
//            canvas.endText(winText);
//            canvas.finalWord(secretWordUpperCase);
//
//            if(bestGuessAttempts < guessAttempts){
//                bestGuessAttempts = guessAttempts;
//            }
//
//            gamesWon = gamesWon + 1;
//        }
//
//        return 0;
//    }
//
//    // TODO: comment this method
//    private void stats(double gamesCount, double gamesWon, int best) {
//        // TODO: write this method
//        double winPercentage = (gamesWon / gamesCount) * 100;
//        double winPercentageRound = Math.round(winPercentage * 100.0) / 100.0;
//        println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//        println("       Games played: " + Math.round(gamesCount));
//        println("         Games won: " + Math.round(gamesWon));
//        println("      Win percent: " + winPercentageRound + "%");
//        println("Best game: " + best + " guess(es) remaining");
//        println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
//
//    }
//
//    // TODO: comment this method
//    private String getRandomWord(String filename) {
//        // TODO: write this method
//        int i = 0;
//        RandomGenerator rgen = RandomGenerator.getInstance();
//        String words[] = new String[200];
//        try{
//            BufferedReader buffer = new BufferedReader(new FileReader(filename));
//            String line;
//            while ((line = buffer.readLine()) != null) {
//                words[i] = line;
//                i = i + 1;
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        }
//        int n = rgen.nextInt(0, i-1);
//        return words[n];
//    }
//
//    public void init() {
//        //canvas = new HangmanCanvas();
//        canvas = new HangmanCanvasImage();
//        add(canvas);
//        canvas.losingCondition(guessAttempts);  // sample canvas method call
//    }
//
//
//    /* Solves NoClassDefFoundError */
//    public static void main(String[] args) {
//        new Hangman().start(args);
//    }
//

    // private HangmanCanvas canvas;
    //private HangmanCanvas canvas;
    private HangmanCanvasImage canvas;
}
