package module5.port;

import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GObject;

public class BrickClass extends GCompound {

    private static final int NBRICKS_PER_ROW = 10;
    private static final int NBRICKS_PER_COL = 10;
    private static final double BRICK_GAP = 4;
    private static final double BRICK_WIDTH = Math.floor(
            (640 - (NBRICKS_PER_ROW + 1.0) * BRICK_GAP) / NBRICKS_PER_ROW);
    private static final double BRICK_HEIGHT = 20;
    private static final double BRICK_Y_OFFSET = 60; // from top

    public BrickClass() {

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < NBRICKS_PER_ROW; i++) {
                GImage brick = new GImage("assets/breakout/2.png");
                brick.setSize(BRICK_WIDTH, BRICK_HEIGHT);
                add(brick, 640 - ((BRICK_WIDTH * (NBRICKS_PER_ROW - i)) + (BRICK_GAP * (10 - i))), BRICK_Y_OFFSET + (BRICK_HEIGHT + BRICK_GAP) * j);
            }
        }

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < NBRICKS_PER_ROW; i++) {
                GImage brick = new GImage("assets/breakout/1.png");
                brick.setSize(BRICK_WIDTH, BRICK_HEIGHT);
                add(brick, 640 - ((BRICK_WIDTH * (NBRICKS_PER_ROW - i)) + (BRICK_GAP * (10 - i))), BRICK_Y_OFFSET + (BRICK_HEIGHT + BRICK_GAP) * j);
            }
        }

    }

    GObject getBrick(double x, double y){
            return getElementAt(x,y);
    }



}
