package module2.cont;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Main extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 200;
    public static final int APPLICATION_HEIGHT = 200;

    public void run() {
        int i;
        /*GLabel text = new GLabel("Hello LBYCPEI OOP!");
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() + text.getAscent()) / 2;
        add(text, x, y);        // adding text label  to the center 
        GOval circle = new GOval(50,50);
        add(circle, 10,10);*/

        for(i = 0; i<10; i++) {
            GRect stripes = new GRect(200, 10);
            stripes.setFilled(true);
            stripes.setColor(Color.blue);
            add(stripes, 0, 0+i*20);
        }

        for(i=0; i<10; i++){
            GRect stripes = new GRect(10, 200);
            stripes.setFilled(true);
            stripes.setColor(Color.red);
            add(stripes, 0+ i*20, 0);
        }

        GOval circle = new GOval(50,50);
        circle.setFilled(true);
        circle.setColor(Color.black);
        add(circle, 100-25, 100-25);

        GPolygon poly = new GPolygon(30,30);
        poly.setFilled(true);
        poly.setColor(Color.green);
        poly.addEdge(0,0);
        poly.addEdge(0, 100);
        poly.addEdge(100, -150);

        add(poly, 0,0);



    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Main()).start(args);
    }
}