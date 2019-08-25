package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Bricks extends GraphicsProgram {

    public static final int BRICK_WIDTH = 30;
    public static final int BRICK_HEIGHT = 12;
    public static final int BRICKS_IN_BASE = 14;

    public void run() {

        for (int i = 0; i < BRICKS_IN_BASE; i++){

            for (int j = 0; j < BRICKS_IN_BASE - i; j++){

                GRect brick = new GRect(BRICK_WIDTH,BRICK_HEIGHT);

                double x = ((getWidth() - ( 30 * (BRICKS_IN_BASE - i))) / 2);
                double y = getHeight() - 12 * i+1;

                add(brick, x  + (BRICK_WIDTH * j) , y );
            }

        }

        nameLabel();

    }

    private void nameLabel(){

        GLabel text = new GLabel("created by JOSEPH PORTUGAL");;

        text.setFont("Times New Roman-18");

        double x = (getWidth() - text.getWidth());

        double y = getHeight();

        add(text, x, y); // adding text label  to the center 

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new Bricks()).start(args);

    }

}