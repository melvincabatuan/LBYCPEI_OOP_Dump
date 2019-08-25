package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

/*
 * File: FancyHello.java
 * ---------------------
 * Remember, if you change the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class DlsuFlags extends GraphicsProgram {
    // Set the dimensions of window depending on image size
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);
        firstFlag();
        secondFlag();
        dlsuName();
        threeHundred();
        laSalle();
    }

    private void firstFlag(){
        double x=62, y=384;
        GRect base = new GRect(180,400);
        add(base, x, y);

        GRect blue = new GRect(90, 400);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        add(blue, x, y);

        GRect red = new GRect(90, 400);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red, x+90, y);

        GPoint[] gp = new GPoint[3];
        gp[0] = new GPoint(x,y);
        gp[1] = new GPoint(x+180, y);
        gp[2] = new GPoint(x+90, y+175);
        GPolygon white = new GPolygon(gp);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white);


        GOval sun = new GOval(50, 50);
        add(sun, x+65, y+36);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);

        GLine ray1 = new GLine(x+43, y+61, x+133, y+61);
        ray1.setColor(Color.YELLOW);
        add(ray1);
        GLine ray2 = new GLine(x+88, y+16, x+88, y+106);
        ray2.setColor(Color.YELLOW);
        add(ray2);
        GLine ray3 = new GLine(120, 415, 180, 480);
        ray3.setColor(Color.YELLOW);
        add(ray3);
        GLine ray4 = new GLine(120, 480, 180, 415);
        ray4.setColor(Color.YELLOW);
        add(ray4);

        GLabel star1 = new GLabel("*");
        star1.setFont("Wide Latin-bold-42");
        star1.setColor(Color.YELLOW);
        add(star1, x+11, y+35);

        GLabel star2 = new GLabel("*");
        star2.setFont("Wide Latin-bold-42");
        star2.setColor(Color.YELLOW);
        add(star2, x+146, y+35);

        GLabel star3 = new GLabel("*");
        star3.setFont("Wide Latin-bold-42");
        star3.setColor(Color.YELLOW);
        add(star3, x+78, y+165);
    }

    private void secondFlag(){
        double x=415, y=384;
        GRect base = new GRect(180+2,400);
        add(base, x, y);

        GRect blue = new GRect(90+2, 400);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        add(blue, x, y);

        GRect red = new GRect(90, 400);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        add(red, x+90+2, y);

        GPoint[] gp = new GPoint[3];
        gp[0] = new GPoint(x,y);
        gp[1] = new GPoint(x+180+2, y);
        gp[2] = new GPoint(x+90+2, y+175);
        GPolygon white = new GPolygon(gp);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white);


        GOval sun = new GOval(50, 50);
        add(sun, x+65+2, y+36);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);

        GLine ray1 = new GLine(x+43+2, y+61, x+133+2, y+61);
        ray1.setColor(Color.YELLOW);
        add(ray1);
        GLine ray2 = new GLine(x+88+2, y+16, x+88+2, y+106);
        ray2.setColor(Color.YELLOW);
        add(ray2);
        GLine ray3 = new GLine(x+58+2, y+31, x+118+2, y+96);
        ray3.setColor(Color.YELLOW);
        add(ray3);
        GLine ray4 = new GLine(x+58+2, y+96, x+118+2, y+31);
        ray4.setColor(Color.YELLOW);
        add(ray4);

        GLabel star1 = new GLabel("*");
        star1.setFont("Wide Latin-bold-42");
        star1.setColor(Color.YELLOW);
        add(star1, x+11, y+35);

        GLabel star2 = new GLabel("*");
        star2.setFont("Wide Latin-bold-42");
        star2.setColor(Color.YELLOW);
        add(star2, x+148, y+35);

        GLabel star3 = new GLabel("*");
        star3.setFont("Wide Latin-bold-42");
        star3.setColor(Color.YELLOW);
        add(star3, x+80, y+165);
    }

    private void dlsuName(){
        GLabel school = new GLabel(" . DE . LA . SALLE . UNIVERSITY . ");
        school.setFont("Serif-35");
        school.setColor(Color.BLACK);
        add(school, 62, 341);
    }

    private void threeHundred(){
        GOval circle = new GOval(90,86);
        circle.setFilled(true);
        circle.setFillColor(Color.GREEN);
        circle.setColor(Color.GREEN);
        add(circle, 290, 400);

        GLabel school = new GLabel("300");
        school.setFont("Serif-italic-58");
        school.setColor(Color.WHITE);
        add(school, 292, 465);
    }

    private void laSalle(){
        GImage lasalle = new GImage("assets/lasalle.jpg");
        lasalle.setSize(126, 251);
        add(lasalle, 270, 556);
    }
    // Solves java.lang.NoClassDefFoundError
    public static void main (String [] args){
        (new DlsuFlags()).start(args);
    }
}
