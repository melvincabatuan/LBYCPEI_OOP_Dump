package module2.job;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    public static final int BRICK_WIDTH  = 30;
    public static final int BRICK_HEIGHT  = 12;
    public static final int BRICKS_IN_BASE  = 14;
    int i, j;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        createPyramid();
        signName();
    }

    public void createPyramid() {
        /*Number of Bricks Per Row*/
        GRect[] brick = new GRect[106];

        /*Brick Size*/
        for (i = 0; i < 106; i++) {
            brick[i] = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
        }

        /*Brick Position*/
        j = 30;
        for  (i = 0; i < BRICKS_IN_BASE; i++) {
            add(brick[i], 79 + j,468);
            j += 30;
        }

        j = 30;
        for (i = 14; i < BRICKS_IN_BASE+13; i++) {
            add(brick[i], 94 + j, 456);
            j += 30;
        }

        j = 30;
        for (i = 27; i < BRICKS_IN_BASE+13+12; i++) {
            add(brick[i], 109 + j, 444);
            j += 30;
        }

        j = 30;
        for (i = 39; i < BRICKS_IN_BASE+13+12+11; i++) {
            add(brick[i], 124 + j, 432);
            j += 30;
        }

        j = 30;
        for (i = 50; i < BRICKS_IN_BASE+13+12+11+10; i++) {
            add(brick[i], 139 + j, 420);
            j += 30;
        }

        j = 30;
        for (i = 60; i < BRICKS_IN_BASE+13+12+11+10+9; i++) {
            add(brick[i], 154 + j, 408);
            j += 30;
        }

        j = 30;
        for (i = 69; i < BRICKS_IN_BASE+13+12+11+10+9+8; i++) {
            add(brick[i], 169 + j, 396);
            j += 30;
        }
        j = 30;
        for (i = 77; i < BRICKS_IN_BASE+13+12+11+10+9+8+7; i++) {
            add(brick[i], 184 + j, 384);
            j += 30;
        }

        j = 30;
        for (i = 84; i < BRICKS_IN_BASE+13+12+11+10+9+8+7+6; i++) {
            add(brick[i], 199 + j, 372);
            j += 30;
        }

        j = 30;
        for (i = 90; i < BRICKS_IN_BASE+13+12+11+10+9+8+7+6+5; i++) {
            add(brick[i], 214 + j, 360);
            j += 30;
        }

        j = 30;
        for (i = 95; i < BRICKS_IN_BASE+13+12+11+10+9+8+7+6+5+4; i++) {
            add(brick[i], 229 + j, 348);
            j += 30;
        }

        j = 30;
        for (i = 99; i < BRICKS_IN_BASE+13+12+11+10+9+8+7+6+5+4+3; i++) {
            add(brick[i], 244 + j, 336);
            j += 30;
        }

        j = 30;
        for (i = 102; i < BRICKS_IN_BASE+13+12+11+10+9+8+7+6+5+4+3+2; i++) {
            add(brick[i], 259 + j, 324);
            j += 30;
        }

        add(brick[105], 304, 312);
    }

    public void signName() {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,510,450);
    }

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new Pyramid()).start(args);
    }
}

