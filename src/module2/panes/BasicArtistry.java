package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    05/22/19

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class BasicArtistry extends GraphicsProgram {

    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI!");
        text.setFont("Seref-italic-24");
        text.setColor(Color.RED);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() + text.getAscent()) / 2;


        GRect building = new GRect(150,400);
        building.setFilled(true);
        building.setColor(Color.PINK);
        building.setFillColor(Color.BLUE);

        GRect doorOne = new GRect(30,60);
        doorOne.setFilled(true);
        doorOne.setColor(Color.BLACK);
        doorOne.setFillColor(Color.YELLOW);

        GRect doorTwo = new GRect(30,60);
        doorTwo.setFilled(true);
        doorTwo.setColor(Color.BLACK);
        doorTwo.setFillColor(Color.BLACK);

        GRect Nose = new GRect(30,200);
        Nose.setFilled(true);
        Nose.setColor(Color.BLACK);
        Nose.setFillColor(Color.RED);

        GOval circleOne = new GOval(50,50);
        circleOne.setFilled(true);
        circleOne.setColor(Color.BLACK);
        circleOne.setFillColor(Color.PINK);

        GOval circleTwo = new GOval(50,50);
        circleTwo.setFilled(true);
        circleTwo.setColor(Color.BLACK);
        circleTwo.setFillColor(Color.YELLOW);

        GOval sun = new GOval(50,50);
        circleTwo.setFilled(true);
        circleTwo.setColor(Color.BLACK);
        circleTwo.setFillColor(Color.YELLOW);

        GPolygon triangle = new GPolygon (50,50);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        triangle.addEdge(0, 0);
        triangle.addEdge(0, 200);
        triangle.addEdge(150, -100);

        GPolygon topFlag = new GPolygon (50,50);
        topFlag.setFilled(true);
        topFlag.setFillColor(Color.BLUE);
        topFlag.addEdge(0, 0);
        topFlag.addEdge(500, 0);
        topFlag.addEdge(0, 100);
        topFlag.addEdge(-350, 0);

        GPolygon botFlag = new GPolygon (50,50);
        botFlag.setFilled(true);
        botFlag.setFillColor(Color.RED);
        botFlag.addEdge(0, 0);
        botFlag.addEdge(500, 0);
        botFlag.addEdge(0, -100);
        botFlag.addEdge(-350, 0);

        add(building, 30, 70);
        add(circleOne, 45, 90);
        add(circleTwo, 115, 90);
        add(Nose, 90, 150);
        add(doorOne, 70, 410);
        add(doorTwo, 100, 410);
        add(triangle, 200, 70);
        add(topFlag, 200, 70);
        add(botFlag, 200, 270);
    }

    // Solves java.lang.NoClassDefFoundError 
    public static void main (String [] args){
 (new BasicArtistry()).start(args);
    }
}
