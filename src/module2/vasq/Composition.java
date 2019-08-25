package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Composition extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 400;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Composition()).start(args);
    }

    public void run() {
        titleText();
        guitarHandle();
        guitarHead();
        guitarStrings();


        GLabel title = new GLabel("Guitar & guitar strings"); //summoning an object
        title.setFont("Papyrus-bold-20");
        title.setColor(Color.black);
        add(title, getWidth() / 2 +70, 150);

    }

    private void guitarStrings(){
        GRect stringCap = new GRect(10,40);
        stringCap.setFilled(true);

        add(stringCap,getWidth()/2-140,getHeight()/2+5);

        GLine string = new GLine(170,200,450,200);

        add(string);

        GLine string2 = new GLine(170,205,450,205);

        add(string2);

        GLine string3 = new GLine(170,210,450,210);

        add(string3);

        GLine string4 = new GLine(170,216,450,216);

        add(string4);

        GLine string5 = new GLine(170,221,450,221);

        add(string5);

        GLine string6 = new GLine(170,226,450,226);

        add(string6);
    }

    private void guitarHandle(){
        GOval circle = new GOval(30,40);
        circle.setFillColor(Color.decode("#B5651D"));
        circle.setColor(Color.decode("#B5651D"));
        circle.setFilled(true);

        add(circle,getWidth()/2+210,getHeight()/2);

        GOval circle2 = new GOval(30,40);
        circle2.setFillColor(Color.decode("#B5651D"));
        circle2.setColor(Color.decode("#B5651D"));
        circle2.setFilled(true);

        add(circle2,getWidth()/2+210,getHeight()/2+20);

        GRect handle = new GRect(140,30);
        handle.setFilled(true);
        add(handle,getWidth()/2+80,getHeight()/2+10);
    }

    private void guitarHead(){
        GOval circle = new GOval(200,160);
        circle.setFillColor(Color.decode("#B5651D"));
        circle.setColor(Color.decode("#B5651D"));
        circle.setFilled(true);

        add(circle,getWidth()/2-200,getHeight()/2-50);

        GOval circle2 = new GOval(200,160);
        circle2.setFillColor(Color.decode("#B5651D"));
        circle2.setColor(Color.decode("#B5651D"));
        circle2.setFilled(true);

        add(circle2,getWidth()/2-100,getHeight()/2-50);

        GOval circle3 = new GOval(50,50);
        circle3.setFilled(true);

        add(circle3, getWidth()/2-80,getHeight()/2);
    }


    private void titleText(){

        GLabel title = new GLabel("COMPOSITION"); //summoning an object
        title.setFont("Bahnschrift-bold-30");
        title.setColor(Color.black);
        add(title, getWidth() / 2 - 100, 50);


        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text.setFont("Bahnschrift-bold-12");
        text.setColor(Color.black);
        add(text, 450, 350);
    }
}

