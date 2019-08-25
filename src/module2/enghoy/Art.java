package module2.enghoy;/*
Author: Enghoy, Martin Adrian C.
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.GRect;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class Art extends GraphicsProgram {
    public void run(){
        readySignal();
        goSignal();
        stopSignal();
    }

    public void readySignal(){
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
        green.setFillColor(Color.BLACK);
        add(green,(getWidth()-green.getWidth())/2,300);

        GOval yellow=new GOval(70,70);
        yellow.setFilled(true);
        yellow.setFillColor(Color.YELLOW);
        add(yellow,(getWidth()-green.getWidth())/2,200);

        GOval red=new GOval(70,70);
        red.setFilled(true);
        red.setFillColor(Color.BLACK);
        add(red,(getWidth()-green.getWidth())/2,100);
    }

    public void goSignal(){
        GRect rect2=new GRect(50,300);
        rect2.setFilled(true);
        rect2.setFillColor(Color.GRAY);
        add(rect2,(getWidth()-rect2.getWidth())*0.75,(getHeight()-rect2.getHeight()));

        GRect rect1=new GRect(130,300);
        rect1.setFilled(true);
        rect1.setFillColor(Color.DARK_GRAY);
        add(rect1,(getWidth()-rect1.getWidth())*0.75+15,(getHeight()-rect1.getHeight())/2);

        GOval green=new GOval(70,70);
        green.setFilled(true);
        green.setFillColor(Color.GREEN);
        add(green,(getWidth()-green.getWidth())*0.75,300);

        GOval yellow=new GOval(70,70);
        yellow.setFilled(true);
        yellow.setFillColor(Color.BLACK);
        add(yellow,(getWidth()-green.getWidth())*0.75,200);

        GOval red=new GOval(70,70);
        red.setFilled(true);
        red.setFillColor(Color.BLACK);
        add(red,(getWidth()-green.getWidth())*0.75,100);
    }

    public void stopSignal(){
        GRect rect2=new GRect(50,300);
        rect2.setFilled(true);
        rect2.setFillColor(Color.GRAY);
        add(rect2,(getWidth()-rect2.getWidth())*0.25,(getHeight()-rect2.getHeight()));

        GRect rect1=new GRect(130,300);
        rect1.setFilled(true);
        rect1.setFillColor(Color.DARK_GRAY);
        add(rect1,(getWidth()-rect1.getWidth())*0.25-15,(getHeight()-rect1.getHeight())/2);

        GOval green=new GOval(70,70);
        green.setFilled(true);
        green.setFillColor(Color.BLACK);
        add(green,(getWidth()-green.getWidth())*0.25,300);

        GOval yellow=new GOval(70,70);
        yellow.setFilled(true);
        yellow.setFillColor(Color.BLACK);
        add(yellow,(getWidth()-green.getWidth())*0.25,200);

        GOval red=new GOval(70,70);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red,(getWidth()-green.getWidth())*0.25,100);
    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new Art()).start(args);
    }
}