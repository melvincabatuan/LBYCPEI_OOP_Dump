package module2.fortiz;/*
*
* Fortiz, Patrick Ryan P.
* LBYCPEI EQ3
* 6/1/19
*
*/


import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram{

    private static final int BRICKS_IN_BASE = 14;
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 12;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int APPLICATION_WIDTH = 700;

    public void run (){

        setBackground(Color.ORANGE);
        generatePyramid();
        generateSignature();
    }

    private void generatePyramid(){
        int x,y;

        for(int i=0;i<=BRICKS_IN_BASE;i++){
            y = getHeight() - (BRICK_HEIGHT*i);
            for(int j=0;j<BRICKS_IN_BASE-i;j++){
                x = (getWidth() - BRICK_WIDTH*(BRICKS_IN_BASE-i))/2 + (BRICK_WIDTH*j);
                GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
                add(brick,x,y);
            }
        }
    }

    private void generateSignature(){
        double x,y;

        GLabel name = new GLabel("Patrick Fortiz");
        name.setFont("SansSerif-italic-10");
        x = getWidth() - name.getWidth();
        y = getHeight() - name.getAscent();

        add(name,x,y);
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main (String[] args){
        (new Pyramid()).start(args);
    }
}
