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
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

import java.awt.*;
public class FancyHello extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI OOP!");
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() + text.getAscent()) / 2;
        add(text, x, y); // adding text label to the center
    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new FancyHello()).start(args);
    }
}
