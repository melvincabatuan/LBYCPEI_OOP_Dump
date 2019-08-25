package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.GLabel;
import acm.program.*;
import acm.graphics.GRect;

import java.awt.*;

public class Pyramid extends GraphicsProgram {

    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 12;
    private static final int BRICKS_IN_BASE = 14;

    public void run() {
        GLabel text = new GLabel("Vasquez, Ralph Joshua V."); //summoning an object
        text.setFont("Papyrus-bold-18");
        text.setColor(Color.black);
        add(text, 500, 355);

        for( int row = 0; row < BRICKS_IN_BASE; row++ )
        {
            int RowBricks = BRICKS_IN_BASE - row;

            for( int CountBricks = 0; CountBricks < RowBricks; CountBricks++ )
            {
                int x = ( getWidth()/2 ) - (BRICK_WIDTH * RowBricks) / 2 + CountBricks * BRICK_WIDTH;
                int y = getHeight() - BRICK_HEIGHT * (row+1);


                GRect brick = new GRect( x , y , BRICK_WIDTH , BRICK_HEIGHT );
                add(brick);
            }
        }
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Pyramid()).start(args);
    }


}
