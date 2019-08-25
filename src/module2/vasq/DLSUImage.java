package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;

public class DLSUImage extends GraphicsProgram{
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {
        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text.setFont("Bahnschrift-bold-12");
        text.setColor(Color.black);
        add(text, 450, 550);


        GImage dlsu = new GImage("assets/DLSU2.png");
        dlsu.setSize(440,645);
        add(dlsu);

        GImage dlsuSeal = new GImage("assets/dlsuseal1.png",198,315);
        dlsuSeal.setSize(65,72);
        add(dlsuSeal);

        GImage stlasalle = new GImage("assets/stlasalle.jpg",186,500);
        stlasalle.setSize(85,150);
        add(stlasalle);

        GImage flagPic= new GImage("assets/Flag.png",168,305);
        flagPic.setSize(320,125);
        flagPic.rotate(270);
        add(flagPic);

        GImage flagPic2= new GImage("assets/Flag.png",411,305);
        flagPic2.setSize(320,125);
        flagPic2.rotate(270);
        add(flagPic2);

        dlsuText();
    }


    private void dlsuText(){
        GLabel text = new GLabel("DE LA SALLE UNIVERSITY");
        text.setFont("Baskerville Old Face-29");
        text.setColor(Color.BLACK);
        add(text, 47, 265);
    }

    public static void main (String [] args){
        (new DLSUImage()).start(args);
    }
}