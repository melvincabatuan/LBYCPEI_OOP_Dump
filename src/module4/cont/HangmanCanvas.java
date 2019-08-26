package module4.cont;/*
 * File: HangmanCanvas.java
 * ---------------------
 * This class holds the graphics elements to the Hangman game.
 * Author: Cobalt
 * Date modified: 06/11/2019
 */


import acm.graphics.GCanvas;
import acm.graphics.GImage;

public class HangmanCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 12;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;


    /**
     * Resets the display so that only the hangman scaffold appears
     */
    public void reset() {
        // Sample graphics object

    }


    public void draw(int lives){
        reset();

        GImage[] hangman= new GImage[9];
        for(int i=0;i<9;i++)
        {
            hangman[i]=new GImage("assets/hangman"+i+".png");
        }
        add(hangman[lives],0,0);
    }

    /* Write your methods here */
}
