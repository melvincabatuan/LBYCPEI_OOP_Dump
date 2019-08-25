package module2.hans;/*
Ongsitco Hans Alfonso A.
LBYCPEI
5/31/2019
 */

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
    public static final int APPLICATION_WIDTH=640;
    public static final int APPLICATION_HEIGHT=480;

    public static final int BRICK_WIDTH = 30;
    public static final int BRICK_HEIGHT = 12;
    private int BRICKS_IN_BASE = 14;


    public void run() {
        signature();
        int width = getWidth();
        int height = getHeight();
        int mid = width / 2;
        int startx = mid - (BRICK_WIDTH * (BRICKS_IN_BASE / 2));
        for (int i = 1; i <= BRICKS_IN_BASE; i++) {
            int y = height - (i * BRICK_HEIGHT);
            for (int c = BRICKS_IN_BASE; c >= i; c--) {
                int x = startx - (BRICK_WIDTH / 2) + (c * BRICK_WIDTH) - (i * (BRICK_WIDTH / 2));
                add(new GRect(x, y, BRICK_WIDTH, BRICK_HEIGHT));
            }
        }
    }

    private void signature() {
        GLabel name = new GLabel("created by Hans Ongsitco");
        add(name, getWidth() - name.getWidth() - 10, getHeight()- 50);
    }

    public static void main(String[] args) {
        (new Pyramid()).start(args);
    }
}