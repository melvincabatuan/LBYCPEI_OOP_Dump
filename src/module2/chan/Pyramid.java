package module2.chan;/*
Johndel Garrison M. Chan
LBYCPEI EQ3
May 29,2019
*/


import acm.graphics.GRect;
import acm.program.*;


public class Pyramid extends GraphicsProgram {
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 15;
    private static final int BRICK_BASE = 15;

    public static void main(String[] args) {
        (new Pyramid()).start(args);
    }


    public void run() {
        int counter = 0;
        for (int m = BRICK_BASE; m >= 0; m--) {

            for (int o = 0; o <= m; o++) {

                double x = ((getWidth() - BRICK_WIDTH) / 2) - (m * (BRICK_WIDTH / 2)) + (o * BRICK_WIDTH);
                double y = getHeight() - (BRICK_HEIGHT * counter);
                GRect rectangle = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                add(rectangle, x, y);
            }

            counter++;
        }
    }
}
