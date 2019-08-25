package module2.nati;

import acm.program.*;

import acm.graphics.GRect;
import acm.graphics.GOval;

import java.awt.*;

public class HelloGraphics extends GraphicsProgram{

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    public static int midX = APPLICATION_WIDTH/2;
    public static int midY = APPLICATION_HEIGHT/2;


    public void ball()
    {
        GOval hard = new GOval(100,20);
        hard.setFilled(true);
        hard.setFillColor(Color.BLACK);
        GOval shadow = new GOval(100,100);
        shadow.setFilled(true);
        shadow.setFillColor(Color.DARK_GRAY);
        GOval light = new GOval(75,75);
        light.setFilled(true);
        light.setFillColor(Color.GRAY);
        GOval highlight = new GOval(20,20);
        highlight.setFilled(true);
        highlight.setFillColor(Color.WHITE);
        highlight.setColor(Color.WHITE);
        add(hard,midX-80,midY+30);
        add(shadow,midX-50,midY-50);
        add(light,midX-30,midY-45);
        add(highlight,midX+10,midY-35);
    }

    public void run()
    {
        GRect bg = new GRect(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        bg.setFilled(true);
        bg.setFillColor(Color.DARK_GRAY);

        add(bg,0,0);
        ball();
    }

    public static void main(String[] args)
    {
        (new HelloGraphics()).start(args);
    }

}
