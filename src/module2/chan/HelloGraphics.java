package module2.chan;/*
    Johndel Garrison M. Chan
    LBYCPEI EQ3
 */


import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;

public class HelloGraphics extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI OOP!");
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth() / 2);
        double y = (getHeight() - text.getAscent() / 2);
        add(text, x, y);

    }

    public static void main(String[] args) {
        (new HelloGraphics()).start(args);
    }
}