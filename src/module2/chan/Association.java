package module2.chan;/*
    Johndel Garrison M. Chan
    LBYCPEI EQ3
 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Association extends GraphicsProgram {

    public static void main(String[] args) {
        (new Association()).start(args);
    }

    public void run(){

        GRect side1 = new GRect(50,20);
        side1.setFilled(true);
        side1.setFillColor(Color.BLACK);
        side1.setColor(Color.black);
        add(side1,90,250);

        GRect side2 = new GRect(20,100);
        side2.setFilled(true);
        side2.setFillColor(Color.BLACK);
        side2.setColor(Color.black);
        add(side2,70,150);

        GRect side3 = new GRect(20,100);
        side3.setFilled(true);
        side3.setFillColor(Color.BLACK);
        side3.setColor(Color.black);
        add(side3,140,150);

        GRect water = new GRect(50,80);
        water.setFilled(true);
        water.setFillColor(Color.BLUE);
        water.setColor(Color.black);
        add(water,90,170);

        GLabel text = new GLabel("The Cup has water in it.");
        text.setFont("Serif-Bold-24");
        text.setColor(Color.BLACK);
        add(text, 250, 250);
        GLabel text1 = new GLabel("Water does not need a cup to function as a water.");
        text1.setFont("Serif-Bold-24");
        text1.setColor(Color.BLACK);
        add(text1, 250, 300);




    }
}
