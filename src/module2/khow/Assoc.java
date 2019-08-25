package module2.khow;/*

 Author: Johnal Khow
 I.D. #: 1181340
 Course Section: EQ3
 Date: May 29,2019

 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Assoc extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {

        Rect();
        cap();
        GLabel text = new GLabel("Coke inside a bottle.");
        text.setFont("Courier-bold-50");
        add(text, 100, 100);
    }

    private void Rect() {
        GRect myrec = new GRect(100, 300);
        myrec.sendBackward();
        myrec.setFillColor(Color.BLACK);
        myrec.setFilled(true);
        myrec.setColor(Color.BLACK);
        add(myrec, 200, 200);
    }

    private void cap(){
        GRect myrec2 = new GRect(60, 40);
        myrec2.sendBackward();
        myrec2.setFillColor(Color.RED);
        myrec2.setFilled(true);
        myrec2.setColor(Color.BLACK);
        add(myrec2, 220, 160);

    }



    public static void main(String[] args) {
        (new Assoc()).start(args);
    }
}
