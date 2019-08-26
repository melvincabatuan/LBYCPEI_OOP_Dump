package module4.llars;/*
 * File: HangmanCanvas.java
 * ---------------------
 * This class holds the graphics elements to the Hangman game.
 * Author: Cobalt
 * Date modified: 06/11/2019
 */


import acm.graphics.GCanvas;
import acm.graphics.GImage;
import acm.graphics.GLabel;

import acm.util.*;
import java.applet.*;

public class HangmanCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 12;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;


    /**
     * Resets the display so that only the hangman scaffold appears
     */
    public void reset(int guessCount) {
        // Sample graphics object
        GLabel testMessage = new GLabel("Hello LBYCPEI!");
        textX = TEXT_X_OFFSET;
        textY = TEXT_HEIGHT;
        add(testMessage,  textX , textY);

        GLabel nextMessage = new GLabel("This is the next line!");
        textY += TEXT_HEIGHT;
        add(nextMessage,  textX , textY );

        printText("Custom println()");

        printText("Custom println()");

    }

    public void printText(String text){
        GLabel line = new GLabel(text);
        textY += TEXT_HEIGHT;
        add(line,  textX , textY );
    }

    public void addHangman(int guessCount){
        if (guessCount==8){
            GImage hangman = new GImage("assets/8.jpg");
            hangman.setSize(500,700);
            add(hangman,0,0);
        }
        else if (guessCount==7){
            GImage hangman = new GImage("assets/7.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==6){
            GImage hangman = new GImage("assets/6.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==5){
            GImage hangman = new GImage("assets/5.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==4){
            GImage hangman = new GImage("assets/4.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==3){
            GImage hangman = new GImage("assets/3.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==2){
            GImage hangman = new GImage("assets/2.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==1){
            GImage hangman = new GImage("assets/1.jpg");
            hangman.setSize(500,700);
            AudioClip groan = MediaTools.loadAudioClip("assets/wrong.mp3");
            groan.play();
            add(hangman, 0, 0);
        }
        else if (guessCount==0){
            int x=30;
            GImage hangman = new GImage("assets/0.jpg");
            hangman.setSize(500,700);
            add(hangman, 0, 0);
            while(x!=0){
                AudioClip BeepCensor = MediaTools.loadAudioClip("assets/dead.mp3");
                BeepCensor.play();
                x=x-1;
            }
        }
    }



    /* Write your methods here */
}
