package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.*;
import java.awt.*;

public class FancyHello extends GraphicsProgram {
    public void run(){
        GLabel text = new GLabel("Hello LBYCPEI OOP!");
        GOval circle = new GOval(200,200);
        circle.setFilled(true);
        circle.setFillColor(Color.PINK);
        circle.setColor(Color.PINK);
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() + text.getAscent()) / 2;
        double screenX = (getWidth() - 200) / 2;
        add(text, x, y);
        add(circle, screenX, y+8);
    }

    public static void main(String[] args){
        (new FancyHello()).start(args);
    }
}
