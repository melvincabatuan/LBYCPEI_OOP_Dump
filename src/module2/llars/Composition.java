package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Composition extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 750;
    public static final int APPLICATION_HEIGHT = 750;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Composition()).start(args);
    }

    public void run() {
        drawBus();
        addCaptions();
    }

    public void drawBus(){
        drawFrame();
        drawWheels();
    }

    public void drawFrame(){
        GRect bus = new GRect(600, 210);
        bus.setFilled(true);
        bus.setFillColor(Color.BLUE);
        add(bus, 10, 10);

        GRect windows = new GRect(550, 90);
        windows.setFilled(true);
        windows.setFillColor(Color.CYAN);
        add(windows, 35, 30);

        GLine line = new GLine(35, 130, 585, 130);
        line.setColor(Color.RED);
        add(line, 35, 130);
    }

    public void drawWheels(){
        GOval wheel1 = new GOval(125,125);
        wheel1.setFilled(true);
        wheel1.setFillColor(Color.GRAY);
        wheel1.setColor(Color.BLACK);
        add(wheel1, 50, 175);

        GOval wheel2 = new GOval(125,125);
        wheel2.setFilled(true);
        wheel2.setFillColor(Color.GRAY);
        wheel2.setColor(Color.BLACK);
        add(wheel2, 450, 175);

    }

    public void addCaptions(){
        GLabel explain = new GLabel ("Bus and wheels are a strong relationship (composition)");
        explain.setFont("Serif-16");
        explain.setColor(Color.black);
        add(explain, 10, 400);

        GLabel explain2 = new GLabel ("because removing the wheels would take away");
        explain2.setFont("Serif-16");
        explain2.setColor(Color.black);
        add(explain2, 10, 420);

        GLabel explain3 = new GLabel ("the purpose of the bus (to travel).");
        explain3.setFont("Serif-16");
        explain3.setColor(Color.black);
        add(explain3, 10, 440);


        GLabel text = new GLabel("created by LENARD LLARENAS");
        text.setFont("Serif-italic-20");
        text.setColor(Color.RED);
        add(text, getWidth() - 300, getHeight() - 25);
    }
}
