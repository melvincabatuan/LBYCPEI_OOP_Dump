package module2.chan;/*
    Johndel Garrison M. Chan
    LBYCPEI EQ3
 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Aggregation extends GraphicsProgram {

    public static void main(String[] args) {
        (new Aggregation()).start(args);
    }

    public void run(){

        GRect pen1 = new GRect(20,100);
        pen1.setFilled(true);
        pen1.setFillColor(Color.BLUE);
        pen1.setColor(Color.black);
        add(pen1,50,50);

        GRect pen2 = new GRect(20,100);
        pen2.setFilled(true);
        pen2.setFillColor(Color.RED);
        pen2.setColor(Color.black);
        add(pen2,70,50);

        GRect pen3 = new GRect(20,100);
        pen3.setFilled(true);
        pen3.setFillColor(Color.BLACK);
        pen3.setColor(Color.black);
        add(pen3,90,50);

        GRect cover = new GRect(100,150);
        cover.setFilled(true);
        cover.setFillColor(Color.YELLOW);
        cover.setColor(Color.black);
        add(cover,30,100);

        GLabel text = new GLabel("The Casing has pens in it.");
        text.setFont("Serif-Bold-24");
        text.setColor(Color.BLACK);
        add(text, 250, 250);
        GLabel text1 = new GLabel("The pens do not need the case to function as pens.");
        text1.setFont("Serif-Bold-24");
        text1.setColor(Color.BLACK);
        add(text1, 250, 300);




    }
}
