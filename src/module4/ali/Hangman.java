package module4.ali;

import acm.program.ConsoleProgram;

/* Incomplete and erroneous */
public class Hangman extends ConsoleProgram {
    private int guesses, length, count;
    private char[] hint, guessedLetters;

    public static void main (String [] args){
        (new Hangman()).start(args);
    }

    public void run(){
        setTitle("LBYCPEI Hangman Game");
        intro();
        playOneGame("PROGRAMMER");
    }

    private int playOneGame(String SecretWord){
        display(8);
        guesses = 8;
        length = SecretWord.length();
        hint = new char[length];
        guessedLetters = new char[length];
        for(int i=0; i<length;i++){
            hint[i] = '-';
            guessedLetters[i] = ' ';
        }
        while(guesses>0){
            print("\nSecret Word:");
            for(int i=0; i<length;i++){
                print(hint[i]);
            }
            println("\nguesses left:"+guesses);
            print("Guessed Letters: ");
            for(int i=0; i<length;i++){
                print(guessedLetters[i]);
            }
            String guess = readLine("\nInput guess:");
            guess = guess.toUpperCase();
            char c = guess.charAt(0);
            guessedLetters[count] = c;
            count++;
            if(!SecretWord.contains(guess)){
                guesses--;
                display(guesses);
            }
            else{
                for(int i=0 ;i<length; i++){
                    if(SecretWord.charAt(i)==c){
                        hint[i]=c;
                    }
                }
                display(guesses);
            }
        }
        return guesses;
    }
    private void intro(){
        println(" ");
        println("\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        println("\t\t\t             Welcome to Hangman!\n" +
                "\t\t\t         I will think of a random word.\n" +
                "\t\t\t        You'll try to guess its letters.\n" +
                "\t\t\t        Every time you guess a letter\n" +
                "\t\t\t       that isn't in my word, a new body\n" +
                "\t\t\t       part of the hanging man appears.\n" +
                "\t\t\t                   Goodluck!\n");
        println("\t\t\t    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    public void display(int guesses){
        switch(guesses) {
            case 0:
                println("   +------------+          _________________\n" +
                        "   |            |         /                 \\\n" +
                        "   |         _____      | AUGH, I'M DEAD. |\n" +
                        "   |        / X   X \\   / \\_________________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+----//\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |           / \\\n" +
                        "   |          /   \\\n" +
                        "   |       __/     \\__\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;

            case 1:
                println("   +------------+          ____________\n" +
                        "   |            |         /            \\\n" +
                        "   |         _____      | Help me!!! |\n" +
                        "   |        / o   o \\   / \\____________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+----//\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |           / \\\n" +
                        "   |          /   \\\n" +
                        "   |       __/\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;

            case 2:
                println("   +------------+          ____________\n" +
                        "   |            |         /            \\\n" +
                        "   |         _____      | Hurry up!! |\n" +
                        "   |        / o   o \\   / \\____________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+----//\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |           / \\\n" +
                        "   |          /   \\\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
            case 3:
                println("   +------------+          _____________\n" +
                        "   |            |         /             \\\n" +
                        "   |         _____      | Not good... |\n" +
                        "   |        / o   o \\   / \\_____________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+----//\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |           /\n" +
                        "   |          /\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
            case 4:
                println("   +------------+          ______________\n" +
                        "   |            |         /              \\\n" +
                        "   |         _____      | Half gone... |\n" +
                        "   |        / o   o \\   / \\______________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+----//\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
            case 5:
                println("   +------------+          __________________\n" +
                        "   |            |         /                  \\\n" +
                        "   |         _____      | I need a \"hand\"! |\n" +
                        "   |        / o   o \\   / \\__________________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |      \\\\----+\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;

            case 6:
                println("   +------------+          _____________\n" +
                        "   |            |         /             \\\n" +
                        "   |         _____      | I'm scared! |\n" +
                        "   |        / o   o \\   / \\_____________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |            |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
            case 7:
                println("   +------------+          _________\n" +
                        "   |            |         /         \\\n" +
                        "   |         _____      | Why me? |\n" +
                        "   |        / o   o \\   / \\_________/\n" +
                        "   |        |   .   |  /\n" +
                        "   |        |  _  |\n" +
                        "   |        \\_______/\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
            case 8:
                println("   +------------+\n" +
                        "   |            |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "   |\n" +
                        "---+---\n" +
                        "#######\n");
                break;
        }

    }
}