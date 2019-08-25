package module2.khow;/*
    Author: Johnal Khow
    Date: May 31, 2019
 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.*;


public class PyramidModel extends GraphicsProgram {
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 12;
    private static final int BRICK_BASE = 14;

    public void run() {
        int  k=0;
        GLabel text = new GLabel("Khow, Johnal A.");
        text.setFont("Courier-bold");
        add(text, 605, 480);
        for (int i = BRICK_BASE; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                double x = ((getWidth() - BRICK_WIDTH) / 2) - (i * (BRICK_WIDTH / 2)) + (j * BRICK_WIDTH);
                double y = (getHeight()) - BRICK_HEIGHT * k;
                GRect rectangle = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                add(rectangle, x, y);
            }
            k++;
        }





        }

    public static void main (String [] args){
        (new PyramidModel()).start(args);
    }

    }


