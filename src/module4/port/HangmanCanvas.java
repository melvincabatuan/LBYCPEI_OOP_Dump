package module4.port;

import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acm.graphics.GRect;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HangmanCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 12;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;
    private GLabel canvasAllBlanks = new GLabel("");


    public void reset() {
        GRect clear = new GRect(1000, 1000);
        clear.setFilled(true);
        clear.setFillColor(Color.WHITE);
        add(clear);
    }

    public void losingCondition(int attempts) {

        if(attempts == 8){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display8.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 7){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display7.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 6){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display6.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 5){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display5.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 4){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display4.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 3){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display3.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 2){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display2.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 1){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display1.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }

        else if(attempts == 0){
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("assets/display0.txt"));
                String line;
                int i = 0;
                while ((line = buffer.readLine()) != null) {
                    GLabel theHangMan = new GLabel(line);
                    textX = TEXT_X_OFFSET;
                    textY = TEXT_HEIGHT;
                    add(theHangMan,  textX , textY + (i*TEXT_HEIGHT));
                    i = i + 1;
                }

            } catch(IOException e){
                e.printStackTrace();
            }
        }


    }

    public void printText(String text){
        textY = 375;
        canvasAllBlanks.setLabel(text);
        add(canvasAllBlanks,  textX , textY);
    }

    public void endText(String text){
        textY = 425;
        GLabel endText = new GLabel(text);
        endText.setFont("Impact-24");
        endText.setColor(Color.RED);
        add(endText,  textX , textY);
    }

    public void finalWord(String text){
        textY = 450;
        GLabel secretWord = new GLabel("The Word is: " + text);
        secretWord.setFont("Arial-14");
        add(secretWord,  textX , textY);
    }

    /* Write your methods here */
}
