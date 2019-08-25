package module2.chan;/*
    Chan, Johndel Garrison
    LBYCPEI EQ3
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Main extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);
        GImage Lozol = new GImage("assets/lasalle.jpg");
        Lozol.setBounds(275, 558, 130, 250);

        add(dlsu);
        add(Lozol);


//Left Flag
        GLabel text = new GLabel("DE LA SALLE UNIVERSITY");
        text.setFont("Serif-Bold-36");
        text.setColor(Color.BLACK);
        double x = (getWidth() - text.getWidth()) / 2;
//        double y = (getHeight() + text.getAscent()) / 2;
        add(text, x, 335);        // adding text label  to the center 

        GRect rect = new GRect(91, 400);
        rect.setFilled(true);
        rect.setFillColor(Color.BLUE);
        rect.setColor(Color.BLUE);
        add(rect, 61, 384);

        GRect rect2 = new GRect(91, 400);
        rect2.setFilled(true);
        rect2.setFillColor(Color.RED);
        rect2.setColor(Color.RED);
        add(rect2, 151, 384);
//
        GPolygon triangle = new GPolygon(30, 40);
        triangle.addVertex(0, 0);
        triangle.addVertex(182, 0);
        triangle.addVertex(90, 130);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        triangle.setColor(Color.WHITE);
        add(triangle, 61, 384);


        GOval circle = new GOval(60, 60);
        circle.setFilled(true);
        circle.setFillColor(Color.YELLOW);
        circle.setColor(Color.YELLOW);
        add(circle, 123, 400);


//right flag
        GRect rect3 = new GRect(91, 400);
        rect3.setFilled(true);
        rect3.setFillColor(Color.BLUE);
        rect3.setColor(Color.BLUE);
        add(rect3, 415, 384);

        GRect rect4 = new GRect(91, 400);
        rect4.setFilled(true);
        rect4.setFillColor(Color.RED);
        rect4.setColor(Color.RED);
        add(rect4, 506, 384);

        GPolygon triangle2 = new GPolygon(30, 40);
        triangle2.addVertex(0, 0);
        triangle2.addVertex(182, 0);
        triangle2.addVertex(90, 130);
        triangle2.setFilled(true);
        triangle2.setFillColor(Color.WHITE);
        triangle2.setColor(Color.WHITE);
        add(triangle2, 415, 384);

        GOval circle2 = new GOval(60, 60);
        circle2.setFilled(true);
        circle2.setFillColor(Color.YELLOW);
        circle2.setColor(Color.YELLOW);
        add(circle2, 477, 400);

        //circle
        GOval circleThreeHundred = new GOval(80, 80);
        circleThreeHundred.setFilled(true);
        circleThreeHundred.setColor(Color.BLACK);
        circleThreeHundred.setFillColor(Color.GREEN);
        add(circleThreeHundred, 295, 400);

        GLabel wordThreeHundred = new GLabel("300");
        wordThreeHundred.setFont("Serif-Bold-46");
        wordThreeHundred.setColor(Color.WHITE);
        double x1 = (getWidth() - wordThreeHundred.getWidth()) / 2;
        add(wordThreeHundred, x1 + 15, 460);


    }

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new Main()).start(args);
    }
}