package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GArc;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Art extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run(){
        setBackground(Color.DARK_GRAY);

        GRect filter = new GRect(20,50);
        int filterCenterX = (getWidth() - 20)/2;
        int filterCenterY = (getHeight() + 100)/2;
        filter.setFilled(true);
        filter.setFillColor(Color.ORANGE);

        GRect cigarette = new GRect(20,120);
        int cigaretteX = (getWidth() - 20)/2;
        int cigaretteY = (getHeight() - 130)/2;
        cigarette.setFilled(true);
        cigarette.setFillColor(Color.WHITE);

        GArc smoke1 = new GArc(30,50,65,150);
        smoke1.setColor(Color.DARK_GRAY);

        GArc smoke2 = new GArc(30,60,40,160);
        smoke2.setColor(Color.DARK_GRAY);

        GLabel warning = new GLabel("NAKAMAMATAY");
        warning.setFont("SansSerif-italic-25");
        warning.setColor(Color.ORANGE);

        generateFrame();
        add(filter, filterCenterX, filterCenterY);
        add(cigarette, cigaretteX, cigaretteY);
        add(smoke1, cigaretteX+5, cigaretteY-50);
        add(smoke2, cigaretteX+5, cigaretteY-60);
        add(warning, getWidth()/2, getHeight()-100);
        generateSignature();
    }

    private void generateFrame(){
        double circleCenterX, circleCenterY;

        GOval frame = new GOval(300,300);
        circleCenterX = (getWidth() - 300)/2;
        circleCenterY = (getHeight() - 300)/2;
        frame.setFilled(true);
        frame.setColor(Color.GRAY);
        frame.setFillColor(Color.GRAY);
        add(frame, circleCenterX, circleCenterY);
    }

    private void generateSignature(){
        double x,y;

        GLabel name = new GLabel("Patrick Fortiz");
        name.setFont("SansSerif-italic-10");
        name.setColor(Color.ORANGE);
        x = getWidth() - name.getWidth();
        y = getHeight() - name.getAscent();

        add(name,x,y);
    }

    public static void main(String[] args){
        (new Art()).start(args);
    }
}
