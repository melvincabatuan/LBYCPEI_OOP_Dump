package module2.dong;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class PHFlag extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 523;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new PHFlag()).start(args);
    }

    public void run() {
        GRect rec1 = new GRect(800, 250);
        add(rec1, 0, 0);
        rec1.setFilled(true);
        rec1.setColor(Color.BLUE);

        GRect rec2 = new GRect(800, 250);
        add(rec2, 0, 250);
        rec2.setFilled(true);
        rec2.setColor(Color.RED);

      //  GLine line1 = new GLine (100,100,300,300);
      //  add(line1, 300, 200);
        //line1.setFilled(true);
      //  line1.setColor(Color.black);

      //  GPen pen1 = new GPen (50,100);
      //  add(pen1, 300, 200);
       // pen1.setFilled(true);
       // pen1.setColor(Color.black);

        GPolygon poly = new GPolygon();

        poly.addVertex(0,0);
        poly.addVertex(0,500);
        poly.addVertex(400,250);
        add(poly);
        poly.setFilled(true);
        poly.setColor(Color.white);

        GOval sun = new GOval(80,80);
        add(sun, 120,210);
        sun.setFilled(true);
        sun.setColor(Color.yellow);

        GLine line1 = new GLine (160,210,160,180);
        add(line1);
        line1.setColor(Color.yellow);

        GLine line2 = new GLine (160,290,160,320);
        add(line2);
        line2.setColor(Color.yellow);

        GLine line3 = new GLine (200,250,230,250);
        add(line3);
        line3.setColor(Color.yellow);

        GLine line4 = new GLine (120,250,90,250);
        add(line4);
        line4.setColor(Color.yellow);

        GLine line5 = new GLine (125,230,95,200);
        add(line5);
        line5.setColor(Color.yellow);

        GLine line6 = new GLine (195,230,225,195);
        add(line6);
        line6.setColor(Color.yellow);

        GLine line7 = new GLine (125,275,95,305);
        add(line7);
        line7.setColor(Color.yellow);

        GLine line8 = new GLine (195,275,225,305);
        add(line8);
        line8.setColor(Color.yellow);


        GStar star1 = new GStar(50);
        add(star1,30,60);
        GStar star2 = new GStar(50);
        add(star2,340,250);
        GStar star3 = new GStar(50);
        add(star3,30,440);
        star1.rotate(90);
        star2.rotate(270);
        star3.rotate(10);

        star1.setFilled(true);
        star2.setFilled(true);
        star3.setFilled(true);
        star1.setColor(Color.yellow);
        star2.setColor(Color.yellow);
        star3.setColor(Color.yellow);

        GLabel NAME = new GLabel("Created by: Dong, Neil");
        add(NAME, 650,800);
        NAME.setColor(Color.orange);
        NAME.setFont("Arial-bold-28");




    }

}