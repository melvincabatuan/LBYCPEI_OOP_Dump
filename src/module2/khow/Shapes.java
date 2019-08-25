package module2.khow;/*

 Author: Johnal Khow
 Course Section: EQ3
 Date: May 29,2019

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class Shapes extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {

        midTri();
        topRect();
        sun();
        GLabel text = new GLabel("Khow, Johnal A.");
        text.setFont("Courier-bold");
        add(text, 400, 350);


    }

    private void topRect() {
        GRect myrec = new GRect(400, 100);
        myrec.sendBackward();
        myrec.setFillColor(Color.RED);
        myrec.setFilled(true);
        myrec.setColor(Color.BLACK);
        add(myrec, 200, 200);
    }


    private void midTri() {
        GPolygon tri = new GPolygon();
        tri.addVertex(200, 0);
        tri.addVertex(200, 200);
        tri.addVertex(350, 100);
        tri.setFillColor(Color.BLACK);
        tri.setFilled(true);
        tri.setColor(Color.BLACK);
        add(tri, -30, 150);

    }

    private void sun() {
        GOval mycircle = new GOval(50, 50);
        add(mycircle, 30, 230);
        mycircle.setFillColor(Color.YELLOW);
        mycircle.setFilled(true);
        mycircle.setColor(Color.YELLOW);

    }

    public static void main(String[] args) {
        (new Shapes()).start(args);
    }
}
