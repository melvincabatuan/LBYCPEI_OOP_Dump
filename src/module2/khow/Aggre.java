package module2.khow;/*

 Author: Johnal Khow
 Course Section: EQ3
 Date: May 29,2019

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class Aggre extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {
        GLabel text3 = new GLabel("The relationship between a driver and his/her car");
        text3.setFont("Serif-15");
        add(text3, 30, 130);

        GRect myrec = new GRect(300, 100);
        myrec.sendBackward();
        myrec.setFillColor(Color.BLACK);
        myrec.setFilled(true);
        myrec.setColor(Color.BLACK);
        add(myrec, 200, 200);

        GRect myrec2 = new GRect(200, 50);
        myrec2.sendBackward();
        myrec2.setFillColor(Color.BLACK);
        myrec2.setFilled(true);
        myrec2.setColor(Color.BLACK);
        add(myrec2, 260, 150);

        GOval mycircle2 = new GOval(50, 50);
        add(mycircle2, 280, 150);
        mycircle2.setFillColor(Color.WHITE);
        mycircle2.setFilled(true);
        mycircle2.setColor(Color.BLACK);

        GLabel text2 = new GLabel("-.-");
        text2.setFont("Serif-25");
        add(text2, 295, 180);

        GOval mycircle3 = new GOval(50, 50);
        add(mycircle3, 250, 280);
        mycircle3.setFillColor(Color.WHITE);
        mycircle3.setFilled(true);
        mycircle3.setColor(Color.BLACK);

        GOval mycircle4 = new GOval(50, 50);
        add(mycircle4, 400, 280);
        mycircle4.setFillColor(Color.WHITE);
        mycircle4.setFilled(true);
        mycircle4.setColor(Color.BLACK);

    }




    public static void main(String[] args) {
        (new Aggre()).start(args);
    }
}
