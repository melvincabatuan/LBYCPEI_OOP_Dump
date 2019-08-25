package module4.chiu;/*
 * File: HangmanCanvas.java
 * ---------------------
 * This class holds the graphics elements to the HangmanAscii game.
 * Author: Cobalt - M.Cabatuan
 * Date modified: 06/11/2019
 */


import acm.graphics.GCanvas;
import acm.graphics.GImage;

public class HangmanGraphics extends GCanvas {
    private static final int Y_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int X_OFFSET = 20;   // you can modify this to suit your ascii art

    /* assets not present */
    public void printImage(int num) {
        String order = Integer.toString(num);
        GImage hangman = new GImage("assets/hangman" + order + ".png");
        add(hangman, X_OFFSET, Y_HEIGHT);
    }
}

