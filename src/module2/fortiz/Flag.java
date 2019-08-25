package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GPolygon;
import acm.graphics.GLine;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Flag extends GraphicsProgram{
    public static final int APPLICATION_HEIGHT = 300;
    public static final int APPLICATION_WIDTH = 600;
    private static final int MARGIN = 20;

    public void run (){
        int topFlagY, bottomFlagY, halfFlagY, lineStacker=1;

        topFlagY = MARGIN;
        halfFlagY = (APPLICATION_HEIGHT-MARGIN)/2;
        bottomFlagY = APPLICATION_HEIGHT - (MARGIN*2);
        GPolygon triangle = new GPolygon();
        triangle.addVertex(APPLICATION_WIDTH/4, halfFlagY);
        triangle.addVertex(0,topFlagY);
        triangle.addVertex(0,bottomFlagY);
        triangle.setColor(Color.white);
        triangle.setFilled(true);
        triangle.setFillColor(Color.white);

        GRect blueRect = new GRect(600,halfFlagY);
        blueRect.setColor(Color.blue);
        blueRect.setFilled(true);
        blueRect.setFillColor(Color.blue);

        GRect redRect = new GRect(600,halfFlagY-topFlagY);
        redRect.setColor(Color.red);
        redRect.setFilled(true);
        redRect.setFillColor(Color.red);

        GOval sunBase = new GOval(30,30);
        sunBase.setColor(Color.yellow);
        sunBase.setFilled(true);
        sunBase.setFillColor(Color.yellow);

        add(blueRect, 0,topFlagY);
        add(redRect, 0,halfFlagY);
        add(triangle);
        add(sunBase,APPLICATION_WIDTH/16,halfFlagY-15);
        generateRays(APPLICATION_WIDTH/16+15,halfFlagY);

        while(lineStacker<=30){
            generateStars(15,topFlagY+30);
            generateStars(15,bottomFlagY-30);
            generateStars(APPLICATION_WIDTH/4-30, halfFlagY);
            lineStacker++;
        }

        generateSignature();

    }

    private void generateRays(int x, int y){
        int ang;

        for(ang=0;ang<=1080;ang+=45){
            //3 sets of sun rays are stacked to make the lines thicker
            GLine sunRays = new GLine();
            sunRays.setEndPointPolar(30,ang);
            sunRays.setColor(Color.yellow);
            add(sunRays, x, y);
        }
    }

    private void generateStars(int x, int y){
        int ang;

        for(ang=0;ang<=180;ang+=90){
            GLine star = new GLine();
            star.setEndPointPolar(10,ang);
            star.setColor(Color.yellow);
            add(star,x,y);
        }

        for(ang=225;ang<=315;ang+=90){
            GLine star = new GLine();
            star.setEndPointPolar(12,ang);
            star.setColor(Color.yellow);
            add(star,x,y);
        }
    }

    private void generateSignature(){
        double x,y;

        GLabel name = new GLabel("Patrick Fortiz");
        name.setFont("SansSerif-italic-10");
        x = getWidth() - name.getWidth();
        y = getHeight() - 8;

        add(name,x,y);
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main (String[] args){
        (new Flag()).start(args);
    }
}
