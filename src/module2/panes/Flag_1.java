package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.program.*;

import java.awt.*;

public class Flag_1 extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 510;
    public static final int APPLICATION_HEIGHT = 300;

    // Solves java.lang.NoClassDefFoundError 
    public static void main (String [] args){
        (new Flag_1()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        getFlag();
        addName();
    }


    public void getFlag(){
        background();
        makeSun();
        makeStars();
    }

    public void background(){
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

        add(triangle, 5, 20);
        add(topFlag, 5, 20);
        add(botFlag, 5, 220);
    }

    public void makeSun(){
        GOval sun = new GOval(40,40);
        sun.setFilled(true);
        sun.setColor(Color.BLACK);
        sun.setFillColor(Color.YELLOW);

        GPolygon rayOne = new GPolygon();
        rayOne.setFilled(true);
        rayOne.setColor(Color.BLACK);
        rayOne.setFillColor(Color.YELLOW);
        rayOne.addEdge(0, 0);
        rayOne.addEdge(46, 46);
        rayOne.addEdge(8, 2);
        rayOne.addEdge(-2, -8);
        rayOne.addEdge(-46, -46);
        rayOne.addEdge(-8, -2);

        GPolygon rayTwo = new GPolygon();
        rayTwo.setFilled(true);
        rayTwo.setColor(Color.BLACK);
        rayTwo.setFillColor(Color.YELLOW);
        rayTwo.addEdge(0, 0);
        rayTwo.addEdge(0, 60);
        rayTwo.addEdge(5, 5);
        rayTwo.addEdge(5, -5);
        rayTwo.addEdge(0, -60);
        rayTwo.addEdge(-5, -5);
        rayTwo.addEdge(-5, 5);

        GPolygon rayThree = new GPolygon();
        rayThree.setFilled(true);
        rayThree.setColor(Color.BLACK);
        rayThree.setFillColor(Color.YELLOW);
        rayThree.addEdge(0, 0);
        rayThree.addEdge(60, 0);
        rayThree.addEdge(5, -5);
        rayThree.addEdge(-5, -5);
        rayThree.addEdge(-60, 0);
        rayThree.addEdge(-5, 5);
        rayThree.addEdge(5, 5);

        GPolygon rayFour = new GPolygon();
        rayFour.setFilled(true);
        rayFour.setColor(Color.BLACK);
        rayFour.setFillColor(Color.YELLOW);
        rayFour.addEdge(0, 0);
        rayFour.addEdge(-46, 46);
        rayFour.addEdge(-2, 8);
        rayFour.addEdge(8, -2);
        rayFour.addEdge(46, -46);
        rayFour.addEdge(2, -8);

        add(rayOne, 30, 98);
        add(rayTwo, 50, 90);
        add(rayThree, 25, 123);
        add(rayFour, 74, 94);
        add(sun, 35, 100);
    }

    public void makeStars(){

        GPolygon starOne = new GPolygon();
        starOne.setFilled(true);
        starOne.setColor(Color.BLACK);
        starOne.setFillColor(Color.YELLOW);
        starOne.addEdge(0, 0);
        starOne.addEdge(-5, 3);
        starOne.addEdge(3, -5);
        starOne.addEdge(-5, -3);
        starOne.addEdge(5, -1);
        starOne.addEdge(3, -5);
        starOne.addEdge(3, 5);
        starOne.addEdge(5, 1);
        starOne.addEdge(-5, 3);
        starOne.addEdge(3, 5);

        GPolygon starTwo = new GPolygon();
        starTwo.setFilled(true);
        starTwo.setColor(Color.BLACK);
        starTwo.setFillColor(Color.YELLOW);
        starTwo.addEdge(0, 0);
        starTwo.addEdge(-5, 3);
        starTwo.addEdge(3, -5);
        starTwo.addEdge(-5, -3);
        starTwo.addEdge(5, -1);
        starTwo.addEdge(3, -5);
        starTwo.addEdge(3, 5);
        starTwo.addEdge(5, 1);
        starTwo.addEdge(-5, 3);
        starTwo.addEdge(3, 5);

        GPolygon starThree = new GPolygon();
        starThree.setFilled(true);
        starThree.setColor(Color.BLACK);
        starThree.setFillColor(Color.YELLOW);
        starThree.addEdge(0, 0);
        starThree.addEdge(-5, 3);
        starThree.addEdge(3, -5);
        starThree.addEdge(-5, -3);
        starThree.addEdge(5, -1);
        starThree.addEdge(3, -5);
        starThree.addEdge(3, 5);
        starThree.addEdge(5, 1);
        starThree.addEdge(-5, 3);
        starThree.addEdge(3, 5);

        add(starOne, 15, 50);
        add(starTwo, 130, 123);
        add(starThree, 15, 195);
    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text,(getWidth()-80),(getHeight()-5));
    }


}