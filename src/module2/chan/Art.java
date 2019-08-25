package module2.chan;/*
    Johndel Garrison M. Chan
    LBYCPEI EQ3
 */

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Art extends GraphicsProgram {

    public static void main(String[] args) {
        (new Art()).start(args);
    }

    public void run(){



        GOval circle2 = new GOval(200,200);
        circle2.setFilled(true);
        circle2.setFillColor(Color.YELLOW);
        circle2.setColor(Color.BLACK);
        add(circle2, 50,50);

        GOval eyes1 = new GOval(50,50);
        eyes1.setFilled(true);
        eyes1.setFillColor(Color.WHITE);
        eyes1.setColor(Color.BLACK);
        add(eyes1, 100,70);

        GOval eyes2 = new GOval(50,50);
        eyes2.setFilled(true);
        eyes2.setFillColor(Color.WHITE);
        eyes2.setColor(Color.BLACK);
        add(eyes2, 150,70);

        GOval pupil1 = new GOval(20,20);
        pupil1.setFilled(true);
        pupil1.setFillColor(Color.BLACK);
        pupil1.setColor(Color.BLACK);
        add(pupil1, 100,70);

        GOval pupil2 = new GOval(20,20);
        pupil2.setFilled(true);
        pupil2.setFillColor(Color.BLACK);
        pupil2.setColor(Color.BLACK);
        add(pupil2, 150,70);

        GRect teeth = new GRect(100,20);
        teeth.setFilled(true);
        teeth.setFillColor(Color.BLACK);
        teeth.setColor(Color.black);
        add(teeth,90,150);

        GPolygon hat = new GPolygon(30, 40);
        hat.addVertex(0, 100);
        hat.addVertex(182,100);
        hat.addVertex(90, 10);
        hat.rotate(330);
        hat.setFilled(true);
        hat.setFillColor(Color.GRAY);
        hat.setColor(Color.BLACK);
        add(hat, 160 ,-50);


    }
}
