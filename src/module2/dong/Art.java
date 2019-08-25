package module2.dong;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GLine;
import acm.program.*;
import java.awt.*;
public class Art extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 1000;
    public void run() {
        GLabel text = new GLabel("Hi");
        text.setFont("Arial-bold-48");
        text.setColor(Color.GREEN);
        add(text,400,150);
        GRect rec1 = new GRect(200,400);
        add(rec1, 100,300);
        rec1.setFilled(true);
        rec1.setColor(Color.BLUE);
        GRect rec2 = new GRect(90,150);
        add(rec2, 100,700);
        rec2.setFilled(true);
        rec2.setColor(Color.RED);
        GRect rec3 = new GRect(90,150);
        add(rec3, 210,700);
        rec3.setFilled(true);
        rec3.setColor(Color.RED);


        GOval circle = new GOval(200,200);
        add(circle, 100,100);
        circle.setFilled(true);
        circle.setColor(Color.pink);

        GLine line1 = new GLine(100,250,300,100);
        add(line1, 300,400);
        line1.setColor(Color.BLACK);

        GLabel NAME = new GLabel("Created by: Dong, Neil");
        add(NAME, 650,800);
        NAME.setColor(Color.orange);
        NAME.setFont("Arial-bold-28");
        //double x = (getWidth() - text.getWidth()) / 2;
        //double y = (getHeight() + text.getAscent()) / 2;
        //add(text, x,y );        // adding text label  to the center 
    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Art()).start(args);
    }
}