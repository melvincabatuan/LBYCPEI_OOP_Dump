package module4.enghoy;/*
 * File: HangmanCanvas.java
 * ---------------------
 * This class holds the graphics elements to the Hangman game.
 * Author: Cobalt
 * Date modified: 06/11/2019
 */


import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;

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
        removeAll();
    }

    public void printText(String text){
        GLabel line = new GLabel(text);
        textY += TEXT_HEIGHT;
        add(line,  textX , textY );
    }

    public void draw(int chance){
        reset();

        GImage[] image= new GImage[9];
        for(int i=0;i<9;i++)
        {
            image[i]=new GImage("assets/"+i+".jpg");
        }
        add(image[chance],0,0);
    }

    /* Write your methods here */
}
