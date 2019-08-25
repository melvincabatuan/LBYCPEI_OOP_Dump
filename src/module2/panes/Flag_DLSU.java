package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */
import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Flag_DLSU extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Flag_DLSU()).start(args);
    }

    public void run() {
       image();
       circle300();
       makeFlags();
       makeText();
       addName();
    }

    public void image(){
        GImage dlsu = new GImage("assets/DLSU2.png");
        GImage SJBDLS = new GImage("assets/basic.jpg");


        add(dlsu);
        add(SJBDLS, 271, 563);
    }

    public void circle300(){
        GOval circle = new GOval(91,90);
        circle.setFilled(true);
        circle.setColor(Color.decode("#006400"));
        circle.setFillColor(Color.decode("#006400"));

        GRect boxBack = new GRect(91,91);
        boxBack.setFilled(true);
        boxBack.setColor(Color.LIGHT_GRAY);
        boxBack.setColor(Color.decode("#F5F5F5"));

        GLabel text = new GLabel("300");
        text.rotate(45);
        text.setFont("Lucida-italic-50");
        text.setColor(Color.WHITE);

        add(boxBack,288, 399);
        add(circle, 289, 400);
        add(text, 314, 487);
    }

    public void makeText(){
        GRect box = new GRect(550,35);
        box.setFilled(true);
        box.setColor(Color.decode("#DCDCDC"));
        box.setColor(Color.decode("#DCDCDC"));

        GLabel text = new GLabel("• DE • LA • SALLE • UNIVERSITY •");
        text.setFont("Lucida-32");
        text.setColor(Color.decode("#808080"));

        add(box, 60, 306);
        add(text,69, 334);
    }

    public void makeFlags(){
        makeFlagOne();
        makeFlagTwo();
        makeSunOne();
        makeSunTwo();
        makeStarsOne();
        makeStarsTwo();
    }

    public void makeFlagOne(){
        GPolygon triangle = new GPolygon (50,50);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        triangle.addEdge(0, 0);
        triangle.addEdge(180, 0);
        triangle.addEdge(-90, 158);

        GPolygon topFlag = new GPolygon (50,50);
        topFlag.setFilled(true);
        topFlag.setFillColor(Color.BLUE);
        topFlag.addEdge(0, 0);
        topFlag.addEdge(0, 400);
        topFlag.addEdge(90, 0);
        topFlag.addEdge(0, -242);

        GPolygon botFlag = new GPolygon (50,50);
        botFlag.setFilled(true);
        botFlag.setFillColor(Color.RED);
        botFlag.addEdge(0, 0);
        botFlag.addEdge(0, 400);
        botFlag.addEdge(-90,0 );
        botFlag.addEdge(0, -242);

        add(triangle, 62, 384);
        add(topFlag, 62, 384);
        add(botFlag, 242, 384);
    }

    public void makeFlagTwo(){
        GPolygon triangle = new GPolygon (50,50);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        triangle.addEdge(0, 0);
        triangle.addEdge(182, 0);
        triangle.addEdge(-91, 158);

        GPolygon topFlag = new GPolygon (50,50);
        topFlag.setFilled(true);
        topFlag.setFillColor(Color.BLUE);
        topFlag.addEdge(0, 0);
        topFlag.addEdge(0, 400);
        topFlag.addEdge(91, 0);
        topFlag.addEdge(0, -242);

        GPolygon botFlag = new GPolygon (50,50);
        botFlag.setFilled(true);
        botFlag.setFillColor(Color.RED);
        botFlag.addEdge(0, 0);
        botFlag.addEdge(0, 400);
        botFlag.addEdge(-91,0 );
        botFlag.addEdge(0, -242);

        add(triangle, 415, 385);
        add(topFlag, 415, 385);
        add(botFlag, 597, 385);
    }

    public void makeSunOne(){
        GOval makeSunOne = new GOval(40,40);
        makeSunOne.setFilled(true);
        makeSunOne.setColor(Color.YELLOW);
        makeSunOne.setFillColor(Color.YELLOW);

        GPolygon rayOne = new GPolygon();
        rayOne.setFilled(true);
        rayOne.setColor(Color.YELLOW);
        rayOne.setFillColor(Color.YELLOW);
        rayOne.addEdge(0, 0);
        rayOne.addEdge(46, 46);
        rayOne.addEdge(8, 2);
        rayOne.addEdge(-2, -8);
        rayOne.addEdge(-46, -46);
        rayOne.addEdge(-8, -2);

        GPolygon rayTwo = new GPolygon();
        rayTwo.setFilled(true);
        rayTwo.setColor(Color.YELLOW);
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
        rayThree.setColor(Color.YELLOW);
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
        rayFour.setColor(Color.YELLOW);
        rayFour.setFillColor(Color.YELLOW);
        rayFour.addEdge(0, 0);
        rayFour.addEdge(-46, 46);
        rayFour.addEdge(-2, 8);
        rayFour.addEdge(8, -2);
        rayFour.addEdge(46, -46);
        rayFour.addEdge(2, -8);

        add(rayOne, 128, 410);
        add(rayTwo, 149, 402);
        add(rayThree, 123, 435);
        add(rayFour, 173, 406);
        add(makeSunOne, 134, 410);



    }

    public void makeSunTwo(){
        GOval makeSunTwo = new GOval(40,40);
        makeSunTwo.setFilled(true);
        makeSunTwo.setColor(Color.YELLOW);
        makeSunTwo.setFillColor(Color.YELLOW);

        GPolygon rayOne = new GPolygon();
        rayOne.setFilled(true);
        rayOne.setColor(Color.YELLOW);
        rayOne.setFillColor(Color.YELLOW);
        rayOne.addEdge(0, 0);
        rayOne.addEdge(46, 46);
        rayOne.addEdge(8, 2);
        rayOne.addEdge(-2, -8);
        rayOne.addEdge(-46, -46);
        rayOne.addEdge(-8, -2);

        GPolygon rayTwo = new GPolygon();
        rayTwo.setFilled(true);
        rayTwo.setColor(Color.YELLOW);
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
        rayThree.setColor(Color.YELLOW);
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
        rayFour.setColor(Color.YELLOW);
        rayFour.setFillColor(Color.YELLOW);
        rayFour.addEdge(0, 0);
        rayFour.addEdge(-46, 46);
        rayFour.addEdge(-2, 8);
        rayFour.addEdge(8, -2);
        rayFour.addEdge(46, -46);
        rayFour.addEdge(2, -8);


        add(rayOne, 482, 410);
        add(rayTwo, 502, 402);
        add(rayThree, 477, 435);
        add(rayFour, 526, 406);
        add(makeSunTwo, 487, 411);
    }

    public void makeStarsOne(){
        GPolygon starOne = new GPolygon();
        starOne.setFilled(true);
        starOne.setColor(Color.YELLOW);
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
        starTwo.setColor(Color.YELLOW);
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
        starThree.setColor(Color.YELLOW);
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

        add(starOne, 83, 397);
        add(starTwo, 220, 397);
        add(starThree, 152, 522);
    }

    public void makeStarsTwo(){
        GPolygon starOne = new GPolygon();
        starOne.setFilled(true);
        starOne.setColor(Color.YELLOW);
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
        starTwo.setColor(Color.YELLOW);
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
        starThree.setColor(Color.YELLOW);
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

        add(starOne, 438, 398);
        add(starTwo, 578, 398);
        add(starThree, 505, 522);
    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.BLACK);
        add(text, (getWidth() - 80), (getHeight() - 100));
    }

}