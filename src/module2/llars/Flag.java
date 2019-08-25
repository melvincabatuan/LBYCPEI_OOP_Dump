package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class Flag extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 2000;
    public static final int APPLICATION_HEIGHT = 600;

    public void run(){
        double x=10, y=10;
        GRect base = new GRect(1000,500);
        add(base, x, y);

        GRect blue = new GRect(1000, 250);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        add(blue, x, y);

        GRect red = new GRect(1000, 250);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red, x, y+250);

        GPoint[] gp = new GPoint[3];
        gp[0] = new GPoint(x,y);
        gp[1] = new GPoint(x+350, y+250);
        gp[2] = new GPoint(x, y+500);
        GPolygon white = new GPolygon(gp);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white);


        GOval sun = new GOval(100, 100);
        add(sun, x+40, y+200);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);

        GLine ray1 = new GLine(x+15, y+250, x+165, y+250);
        ray1.setColor(Color.YELLOW);
        add(ray1);
        GLine ray2 = new GLine(x+90, y+175, x+90, y+325);
        ray2.setColor(Color.YELLOW);
        add(ray2);
        GLine ray3 = new GLine(x+38, y+198, x+143, y+303);
        ray3.setColor(Color.YELLOW);
        add(ray3);
        GLine ray4 = new GLine(x+143, y+198, x+38, y+303);
        ray4.setColor(Color.YELLOW);
        add(ray4);

        GLabel star1 = new GLabel("*");
        star1.setFont("Wide Latin-85");
        star1.setColor(Color.YELLOW);
        add(star1, x+3, y+85);

        GLabel star2 = new GLabel("*");
        star2.setFont("Wide Latin-85");
        star2.setColor(Color.YELLOW);
        add(star2, x+285, y+287);

        GLabel star3 = new GLabel("*");
        star3.setFont("Wide Latin-85");
        star3.setColor(Color.YELLOW);
        add(star3, x+3, y+490);


    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new Flag()).start(args);
    }
}