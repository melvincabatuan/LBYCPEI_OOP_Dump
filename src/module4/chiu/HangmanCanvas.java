package module4.chiu;/*
 * File: HangmanCanvas.java
 * ---------------------
 * This class holds the graphics elements to the HangmanAscii game.
 * Author: Cobalt - M.Cabatuan
 * Date modified: 06/11/2019
 */


import acm.graphics.GCanvas;
import acm.graphics.GLabel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HangmanCanvas extends GCanvas {
    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 20;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;


    public void printText(String text){
        GLabel line = new GLabel(text);
        line.setFont("Monospaced-Bold-14");
        textY += TEXT_HEIGHT;
        textX = TEXT_X_OFFSET;
        add(line,  textX , textY );
    }

    public void println(int num)
    {
        String order=Integer.toString(num);
        textY=12;
        try (BufferedReader br = new BufferedReader(new FileReader("assets/display"+order+".txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                printText(line);
            }

        }
        catch(IOException ex)
        {
           printText("Error reading file");
        }
    }

}
