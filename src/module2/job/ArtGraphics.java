package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class ArtGraphics extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {

        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);

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
        add(circle, 165, 100);
        add(rectangle3,165,350);
        add(rectangle,165,112);
        add(rectangle2,415,112);
        add(text,244,275);

        circle.setFillColor(Color.GREEN);
        rectangle.setFillColor(Color.white);
        rectangle2.setFillColor(Color.white);
        rectangle3.setFillColor(Color.GREEN);

        signName();

    }

    public void signName()
    {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,getWidth()-text.getWidth()-10,getHeight()-text.getHeight());
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new ArtGraphics()).start(args);

    }
}