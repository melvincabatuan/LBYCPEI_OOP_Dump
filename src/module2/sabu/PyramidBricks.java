package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PyramidBricks extends GraphicsProgram {

    public void run() {
        bricks();
        name();
    }

    public static void main(String[] args) { // Solves java.lang.NoClassDefFoundError
        (new PyramidBricks()).start(args);
    }

    public static int D = 0;
    public static int H = 12;
    public static int BRICK_WIDTH = 30;
    public static int BRICK_HEIGHT = 12;
    public static int LENGTH = 390;

    private void bricks(){
        double l;
        double x;
        double y;
        for(l = LENGTH; l >= 0;){
            for(x = D + 50; x <= D + 50 + l;){
                y = getHeight() - H;
                GRect brick = new GRect(BRICK_WIDTH,BRICK_HEIGHT);
                add(brick,x,y);
                x = x + 30;
            }
            H = H + BRICK_HEIGHT;
            l = l - 30;
            D = D + 15;
        }
    }

    private void name(){
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Rosario-16");
        text.setColor(Color.BLACK);
        double x = 550;
        double y = 450;
        add(text,x,y);
    }

}