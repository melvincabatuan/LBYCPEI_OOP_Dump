package module4.balay;


import acm.graphics.GCanvas;
import acm.graphics.GLabel;
import acm.util.ErrorException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HangmanCanvas extends GCanvas {

    private static final int TEXT_HEIGHT = 20;   // you can modify this to suit your ascii art
    private static final int TEXT_X_OFFSET = 20;   // you can modify this to suit your ascii art
    private int textX;
    private int textY;


    /**
     * Resets the display so that only the hangman scaffold appears
     */
    public void noteIncorrectGuess(int count) {

        if(count==7) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display7.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==6) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display6.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==5) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display5.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==4) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display4.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==3) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display3.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==2) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display2.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==1) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display1.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }
        if(count==0) {
            try {
                BufferedReader rd = new BufferedReader(new FileReader("assets/display0.txt"));
                while (true) {
                    String line = rd.readLine();
                    if (line == null) break;
                    printText(line);
                }rd.close();
            }catch (IOException ex){
                throw new ErrorException(ex);
            }


        }


        }



    public void reset() {



        try{
            BufferedReader rd = new BufferedReader(new FileReader("assets/display8.txt"));
            while(true){
                String line = rd.readLine();
                if (line == null ) break;
                printText(line);
            }
            rd.close();
        }catch (IOException ex){
            throw new ErrorException(ex);
        }
    }

    public void printText(String text){
        GLabel line = new GLabel(text);
        textY += TEXT_HEIGHT;
        add(line,  textX , textY );
    }

    /* Write your methods here */
}
