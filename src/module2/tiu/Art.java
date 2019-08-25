package module2.tiu;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Art extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT =480;
    public static final int BRICK_WIDTH  = 30;
    public static final int BRICK_HEIGHT  = 12;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        signName();
        drawTrafficLight();
    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Art()).start(args);
    }


    public void drawTrafficLight(){
        GRect rect2=new GRect(50,300);
        rect2.setFilled(true);
        rect2.setFillColor(Color.GRAY);
        add(rect2,(getWidth()-rect2.getWidth())/2,(getHeight()-rect2.getHeight()));

        GRect rect1=new GRect(130,300);
        rect1.setFilled(true);
        rect1.setFillColor(Color.DARK_GRAY);
        add(rect1,(getWidth()-rect1.getWidth())/2,(getHeight()-rect1.getHeight())/2);

        GOval green=new GOval(70,70);
        green.setFilled(true);
        green.setFillColor(Color.GREEN);
        add(green,(getWidth()-green.getWidth())/2,300);

        GOval red=new GOval(70,70);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red,(getWidth()-green.getWidth())/2,100);

        GOval yellow=new GOval(70,70);
        yellow.setFilled(true);
        yellow.setFillColor(Color.YELLOW);
        add(yellow,(getWidth()-green.getWidth())/2,200);


    }
    public void signName()
    {
        GLabel text = new GLabel("Emerson Karl Tiu");
        add(text,getWidth()-text.getWidth(),getHeight()-text.getHeight());
    }

}