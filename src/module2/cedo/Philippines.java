package module2.cedo;

import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.graphics.GPolygon;
import acm.program.*;
import java.awt.*;

public class Philippines extends GraphicsProgram {

    public void run(){
        GRect blueBox = new GRect(720,180);
        blueBox.setFillColor(Color.blue);
        blueBox.setFilled(true);
        add(blueBox,0,0);

        GRect redBox = new GRect(720,180);
        redBox.setFillColor(Color.red);
        redBox.setFilled(true);
        add(redBox,0,180);

        GPolygon triangle = new GPolygon();
        triangle.addVertex(0,0);
        triangle.addVertex(78*4,180);
        triangle.addVertex(0,360);
        triangle.setFillColor(Color.white);
        triangle.setFilled(true);
        triangle.sendForward();
        add(triangle,0,0);

        GOval starCenter = new GOval(18*4,18*4);
        starCenter.setFillColor(Color.yellow);
        add(starCenter,19*4,180-18*2);

        GRect starLineN = new GRect(5,40);
        starLineN.setFillColor(Color.yellow);
        starLineN.setFilled(true);
        add(starLineN,19*4+18*2,180-18*4-5);

        GRect starLineS = new GRect(5,40);
        starLineS.setFillColor(Color.yellow);
        starLineS.setFilled(true);
        add(starLineS,19*4+18*2,180+18*2);

        GRect starLineW = new GRect(40,5);
        starLineW.setFillColor(Color.yellow);
        starLineW.setFilled(true);
        add(starLineW,19*4-18*2-5,180);

        GRect starLineE = new GRect(40,5);
        starLineE.setFillColor(Color.yellow);
        starLineE.setFilled(true);
        add(starLineE,19*4+18*4,180);

        GLine starLineNW = new GLine(19*4+5,180);
        starLineNW.setColor(Color.yellow);
    }

    public static void main(String[] args){
        (new Philippines()).start(args);
    }

}