package module2.dong;

import acm.graphics.GRect;
import acm.program.*;


public class Pyramid extends GraphicsProgram{

    int BRICK_WIDTH = 30;
    int BRICK_HEIGHT = 15;
    int BRICKS_IN_BASE = 14;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Pyramid()).start(args);
    }

    public void run(){

        int pyramidHeight = BRICKS_IN_BASE * BRICK_HEIGHT;
        double pyramidY = (getHeight() - pyramidHeight) ;


        for (int i=BRICKS_IN_BASE ; i >= 1; i--){

            int layerWidth = BRICK_WIDTH * i;
            double X = (getWidth() - layerWidth) / 2;
            double Y = pyramidY + (i-1)* BRICK_HEIGHT;

            for(int j=0 ; j<i ; j++)
            {
                GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                add(brick,X + j*BRICK_WIDTH, Y);
            }
        }
    }


}