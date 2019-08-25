package module2.chiu;/*
Kenley Lewis Chiu
LBYCPEI EQ3
May 29,2019
*/

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 12;
    private static final int BRICK_BASE = 14;

    public static void main(String[] args) {
        (new Pyramid()).start(args);
    }


    public void run() {
        int k=0;
        for (int i = BRICK_BASE; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                double x =((getWidth()-BRICK_WIDTH)/2)-(i*(BRICK_WIDTH/2))+(j*BRICK_WIDTH);
                double y = getHeight()-BRICK_HEIGHT*k;
                GRect rectangle = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                add(rectangle,x,y);
            }
            k++;
        }

        GLabel name= new GLabel("Created by Kenley Lewis Chiu");
        println(name.getHeight());
        println(name.getWidth());
        double y= getHeight()-name.getHeight();
        double x= getWidth()-name.getWidth();
        add(name,x,y+15);


    }


}
