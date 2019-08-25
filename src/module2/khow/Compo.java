package module2.khow;/*

 Author: Johnal Khow
 Course Section: EQ3
 Date: May 29,2019

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.program.*;

import java.awt.*;

public class Compo extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {
        GLabel text3 = new GLabel("A heart can't live without a host/person, and a person can't live without a heart");
        text3.setFont("Serif-15");
        add(text3, 30, 150);


        GOval mycircle = new GOval(50, 50);
        add(mycircle, 30, 230);
        mycircle.setFillColor(Color.RED);
        mycircle.setFilled(true);
        mycircle.setColor(Color.RED);

        GOval mycircle2 = new GOval(50, 50);
        add(mycircle2, 300, 230);
        mycircle2.setFillColor(Color.WHITE);
        mycircle2.setFilled(true);
        mycircle2.setColor(Color.BLACK);

        GLabel text2 = new GLabel("-.-");
        text2.setFont("Serif-25");
        add(text2, 305, 260);

    }




    public static void main(String[] args) {
        (new Compo()).start(args);
    }
}
