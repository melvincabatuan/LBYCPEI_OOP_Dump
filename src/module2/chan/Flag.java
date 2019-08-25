package module2.chan;/*
Johndel Chan
LBYCPEI EQ3

*/

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Flag extends GraphicsProgram {

    public static void main(String[] args) {
        (new Flag()).start(args);
    }

    public void run() {

        GRect rect = new GRect(90,400);
        rect.setFilled(true);
        rect.setFillColor(Color.BLUE);
        rect.setColor(Color.BLUE);
        add(rect,30,30);

        GRect rect2 = new GRect(90,400);
        rect2.setFilled(true);
        rect2.setFillColor(Color.RED);
        rect2.setColor(Color.RED);
        add(rect2,120,30);
//
        GPolygon triangle = new GPolygon();
        triangle.addVertex(0, 0);
        triangle.addVertex(180,0);
        triangle.addVertex(90, 160);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        triangle.setColor(Color.WHITE);
        add(triangle, 30 ,29);

        GOval circle = new GOval(50,50);
        circle.setFilled(true);
        circle.setFillColor(Color.YELLOW);
        circle.setColor(Color.WHITE);
        add(circle, 96,63);

        GPolygon rays=new GPolygon();
        rays.addVertex(8,0);
        rays.addVertex(16,5);
        rays.addVertex(12,25);
        rays.addVertex(3,25);
        rays.addVertex(0,5);
        rays.setFilled(true);
        rays.rotate(0);
        rays.setFillColor(Color.YELLOW);
        add(rays,112,38);

        GPolygon rays1=new GPolygon();
        rays1.addVertex(8,0);
        rays1.addVertex(16,5);
        rays1.addVertex(12,25);
        rays1.addVertex(3,25);
        rays1.addVertex(0,5);
        rays1.setFilled(true);
        rays1.rotate(180);
        rays1.setFillColor(Color.YELLOW);
        add(rays1,128,138);

        GPolygon rays2=new GPolygon();
        rays2.addVertex(8,0);
        rays2.addVertex(16,5);
        rays2.addVertex(12,25);
        rays2.addVertex(3,25);
        rays2.addVertex(0,5);
        rays2.setFilled(true);
        rays2.rotate(90);
        rays2.setFillColor(Color.YELLOW);
        add(rays2,71,95);

        GPolygon rays3=new GPolygon();
        rays3.addVertex(8,0);
        rays3.addVertex(16,5);
        rays3.addVertex(12,25);
        rays3.addVertex(3,25);
        rays3.addVertex(0,5);
        rays3.setFilled(true);
        rays3.rotate(270);
        rays3.setFillColor(Color.YELLOW);
        add(rays3,171,79);

        GPolygon rays4=new GPolygon();
        rays4.addVertex(8,0);
        rays4.addVertex(16,5);
        rays4.addVertex(12,25);
        rays4.addVertex(3,25);
        rays4.addVertex(0,5);
        rays4.setFilled(true);
        rays4.rotate(45);
        rays4.setFillColor(Color.YELLOW);
        add(rays4,79,59);

        GPolygon rays5=new GPolygon();
        rays5.addVertex(8,0);
        rays5.addVertex(16,5);
        rays5.addVertex(12,25);
        rays5.addVertex(3,25);
        rays5.addVertex(0,5);
        rays5.setFilled(true);
        rays5.rotate(135);
        rays5.setFillColor(Color.YELLOW);
        add(rays5,90,129);

        GPolygon rays6=new GPolygon();
        rays6.addVertex(8,0);
        rays6.addVertex(16,5);
        rays6.addVertex(12,25);
        rays6.addVertex(3,25);
        rays6.addVertex(0,5);
        rays6.setFilled(true);
        rays6.rotate(225);
        rays6.setFillColor(Color.YELLOW);
        add(rays6,163,117);

        GPolygon rays7=new GPolygon();
        rays7.addVertex(8,0);
        rays7.addVertex(16,5);
        rays7.addVertex(12,25);
        rays7.addVertex(3,25);
        rays7.addVertex(0,5);
        rays7.setFilled(true);
        rays7.rotate(315);
        rays7.setFillColor(Color.YELLOW);
        add(rays7,153,48);

        rays.setColor(Color.YELLOW);
        rays1.setColor(Color.YELLOW);
        rays2.setColor(Color.YELLOW);
        rays3.setColor(Color.YELLOW);
        rays4.setColor(Color.YELLOW);
        rays5.setColor(Color.YELLOW);
        rays6.setColor(Color.YELLOW);
        rays7.setColor(Color.YELLOW);


        GLabel star1 = new GLabel("*");
        star1.setFont("Serif-Bold-36");
        star1.setColor(Color.YELLOW);
        add(star1, 40, 60);

        GLabel star2 = new GLabel("*");
        star2.setFont("Serif-Bold-36");
        star2.setColor(Color.YELLOW);
        add(star2, 180, 60);

        GLabel star3 = new GLabel("*");
        star3.setFont("Serif-Bold-36");
        star3.setColor(Color.YELLOW);
        add(star3, 110, 185);

    }

//    public void rays(int x, int y, int angle){
//        GPolygon rays=new GPolygon();
//        rays.addVertex(8,0);
//        rays.addVertex(16,5);
//        rays.addVertex(12,25);
//        rays.addVertex(3,25);
//        rays.addVertex(0,5);
//        rays.setFilled(true);
//        rays.rotate(angle);
//        rays.setFillColor(Color.YELLOW);
//        add(rays,x,y);
//    }


}
