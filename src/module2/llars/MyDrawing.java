package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class MyDrawing extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 600;
    public void run(){
        GPoint[] gp = new GPoint[8];
        gp[0] = new GPoint(220,100);
        gp[1] = new GPoint(420,100);
        gp[7] = new GPoint(170,150);
        gp[2] = new GPoint(470,150);
        gp[6] = new GPoint(170,310);
        gp[3] = new GPoint(470,310);
        gp[5] = new GPoint(220,475);
        gp[4] = new GPoint(420,475);
        GPolygon head = new GPolygon(gp);
        head.setFilled(true);
        head.setFillColor(Color.red);
        head.setColor(Color.red);
        add(head);

        GArc forehead = new GArc(170, 25, 300, 280, 0, 180);
        forehead.setFilled(true);
        forehead.setFillColor(Color.red);
        forehead.setColor(Color.red);
        add(forehead);

        GPoint[] gpt = new GPoint[4];
        gpt[0]=new GPoint(200, 290);
        gpt[1]=new GPoint(440, 290);
        gpt[2]=new GPoint(410, 460);
        gpt[3]=new GPoint(230, 460);
        GPolygon jaw = new GPolygon(gpt);
        jaw.setFilled(true);
        jaw.setFillColor(Color.YELLOW);
        jaw.setColor(Color.YELLOW);
        add(jaw);

        GRect face = new GRect(260, 120);
        face.setFilled(true);
        face.setFillColor(Color.YELLOW);
        face.setColor(Color.YELLOW);
        add(face, 190, 170);

        GPoint[] gf1 = new GPoint[4];
        gf1[0]=new GPoint(205,170);
        gf1[1]=new GPoint(285, 170);
        gf1[2]=new GPoint(280, 40);
        gf1[3]=new GPoint(210, 80);
        GPolygon fore1 = new GPolygon(gf1);
        fore1.setFilled(true);
        fore1.setFillColor(Color.yellow);
        fore1.setColor(Color.YELLOW);
        add(fore1);

        GPoint[] gf2 = new GPoint[4];
        gf2[0]=new GPoint(435,170);
        gf2[1]=new GPoint(355, 170);
        gf2[2]=new GPoint(360, 40);
        gf2[3]=new GPoint(430, 80);
        GPolygon fore2 = new GPolygon(gf2);
        fore2.setFilled(true);
        fore2.setFillColor(Color.yellow);
        fore2.setColor(Color.YELLOW);
        add(fore2);

        GPoint[] ey1 = new GPoint[4];
        ey1[0] = new GPoint(205, 195);
        ey1[1] = new GPoint(305, 200);
        ey1[2] = new GPoint(300, 235);
        ey1[3] = new GPoint(210, 230);
        GPolygon eye1 = new GPolygon(ey1);
        eye1.setFilled(true);
        eye1.setFillColor(Color.CYAN);
        add(eye1);

        GPoint[] ey2 = new GPoint[4];
        ey2[0] = new GPoint(440, 195);
        ey2[1] = new GPoint(340, 200);
        ey2[2] = new GPoint(345, 235);
        ey2[3] = new GPoint(435, 230);
        GPolygon eye2 = new GPolygon(ey2);
        eye2.setFilled(true);
        eye2.setFillColor(Color.CYAN);
        add(eye2);

        GLine mouth  = new GLine (240, 425, 400, 425);
        mouth.setColor(Color.BLACK);
        add(mouth);

        GLabel name = new GLabel("created by LENARD LLARENAS");
        name.setFont("Serif-italic-22");
        name.setColor(Color.BLUE);
        add(name,getWidth()-300,getHeight()-22);

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new MyDrawing()).start(args);
    }
}
