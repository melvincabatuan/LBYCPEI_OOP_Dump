package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class FancyHello extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI OOP!"); //summoning an object
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        add(text, 100, 100);

        double x = (getWidth() - text.getWidth()) / 2;  //centers the text from left to right
        double y = (getHeight() + text.getAscent()) / 2;  //centers the text from top to bottom

        GLabel text1 = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text1.setFont("Bahnschrift-bold-12");
        text1.setColor(Color.black);
        add(text1, 250, 250);

        //CircleDrawing();
        //RectangleDrawing();

        //println(getWidth());
        //println(getHeight());

    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new FancyHello()).start(args);
    }

    private void CircleDrawing(){
        GOval circle = new GOval(100,100);
        circle.setFillColor(Color.YELLOW);
        circle.setColor(Color.YELLOW);
        circle.setFilled(true);

        add(circle,5,5);

        GOval circle2 = new GOval(100,100);
        circle2.setFillColor(Color.YELLOW);
        circle2.setColor(Color.YELLOW);
        circle2.setFilled(true);

        add(circle2,540,5);
    }

    private void RectangleDrawing(){
        GRect bbox = new GRect(200, 100);
        bbox.setFillColor(Color.black);
        bbox.setColor(Color.black);
        bbox.setFilled(true);

        add(bbox,200,200);

        GRect bbox2 = new GRect(200, 100);
        bbox2.setFillColor(Color.pink);
        bbox2.setColor(Color.pink);
        bbox2.setFilled(true);

        add(bbox2,200,200+bbox.getHeight());
    }

}