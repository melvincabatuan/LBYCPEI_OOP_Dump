package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Main extends GraphicsProgram {

    public void run() {

        GOval circle = new GOval(300,100);
        GRect rectangle = new GRect(50,288);
        GRect rectangle2 = new GRect(50,288);
        GRect rectangle3 = new GRect(300,50);
        GLabel text = new GLabel("Contemporary.");
        text.setFont("Serif-italic-25");
        text.setColor(Color.red);
        circle.setFilled(true);
        rectangle.setFilled(true);
        rectangle2.setFilled(true);
        rectangle3.setFilled(true);
        rectangle.setFilled(true);
        rectangle2.setFilled(true);
        rectangle3.setFilled(true);
        double x1 = getWidth();
        double y1 = getHeight();
        GRect background = new GRect(x1,y1);
        background.setFilled(true);
        background.setFillColor(Color.yellow);

        add(background, 0, 0);
        add (circle, 225, 100);
        add(rectangle3,225,350);
        add(rectangle,225,112);
        add(rectangle2,475,112);
        add(text,304,275);

        while (circle.isFilled()) {
            circle.setFillColor(Color.black);
            rectangle.setFillColor(Color.GREEN);
            rectangle2.setFillColor(Color.GREEN);
            rectangle3.setFillColor(Color.black);

            circle.setFillColor(Color.GREEN);
            rectangle.setFillColor(Color.black);
            rectangle2.setFillColor(Color.black);
            rectangle3.setFillColor(Color.GREEN);
            }




    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Main()).start(args);

    }
}