package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Aggregation extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 400;


    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);
    }

    public void run() {
        toolboxDrawing();
        malletDrawing();

        GLabel title = new GLabel("AGGREGATION"); //summoning an object
        title.setFont("Bahnschrift-bold-30");
        title.setColor(Color.black);
        add(title,getWidth()/2-100, 50);



        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text.setFont("Bahnschrift-bold-12");
        text.setColor(Color.black);
        add(text, 450, 350);

    }

    private void toolboxDrawing(){
        GRect handle = new GRect(50,20);
        handle.setFilled(true);

        add(handle,200,130);

        GRect handle2 = new GRect(45,15);
        handle2.setFillColor(Color.white);
        handle2.setFilled(true);

        add(handle2,203,133);


        GRect boxhead = new GRect(280, 50);
        boxhead.setFillColor(Color.red);
        boxhead.setColor(Color.black);
        boxhead.setFilled(true);

        add(boxhead,84,150);

        GRect box1 = new GRect(250, 100);
        box1.setFillColor(Color.red);
        box1.setColor(Color.red);
        box1.setFilled(true);

        add(box1,100,180);

        GOval circle = new GOval(20,15);
        circle.setFilled(true);

        add(circle,215, 180);

        GLabel text = new GLabel("TOOLBOX"); //summoning an object
        text.setFont("Papyrus-bold-12");
        text.setColor(Color.black);
        add(text, 190, 250);

    }

    private void malletDrawing(){
        GPolygon malletHandle = new GPolygon(30,30);
        malletHandle.setFillColor(Color.decode("#B5651D"));
        malletHandle.setColor(Color.decode("#B5651D"));
        malletHandle.setFilled(true);
        malletHandle.addEdge(0,0);
        malletHandle.addEdge(5,0);
        malletHandle.addEdge(10,150);
        malletHandle.addEdge(-25,0);

        add(malletHandle,465,155);

        GRect mallet = new GRect(90,50);
        mallet.setFilled(true);

        add(mallet,420,150);

        GLabel text = new GLabel("MALLET"); //summoning an object
        text.setFont("Papyrus-bold-12");
        text.setColor(Color.black);
        add(text, 490, 230);

    }
}
