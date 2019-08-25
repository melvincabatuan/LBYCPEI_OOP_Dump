package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class PyramidNew extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    public static final int brickWidth = 30;
    public static final int brickHeight = 12;

    // Solves java.lang.NoClassDefFoundError 
    public static void main(String[] args) {
        (new PyramidNew()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makePyramid();
        addName();
    }

    public void makePyramid() {
        GRect[] block = new GRect[106];
        for (int i = 0; i < 105; i++) {
            block[i] = new GRect(brickWidth, brickHeight);
        }
        int x = (getWidth() - 30 * 14) / 2, y = getHeight() - 12, blockCount = 0, count = 14;

        for (int k = 0; k < 14; k++) {
            for (int j = 0; j < count; j++) {
                add(block[blockCount], x + brickWidth * j, y);
                blockCount++;
            }
            x = x + (brickWidth / 2);
            y = y - brickHeight;
            count--;
        }
    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text,(getWidth()-80),(getHeight()-5));
    }


}