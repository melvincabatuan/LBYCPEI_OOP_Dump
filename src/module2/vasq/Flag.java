package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Flag extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run() {
        titleText();

        RectangleDrawing();
        whiteTriangle();
        SunDrawing();
        sunRays();
        starDrawing();

    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Flag()).start(args);
    }

    private void starDrawing(){

        GPolygon star1 = new GPolygon();
        star1.addVertex(2,12);
        star1.addVertex(6,6);
        star1.addVertex(12,6);
        star1.addVertex(7,0);
        star1.addVertex(8,-3);
        star1.addVertex(2,0);
        star1.addVertex(-4,-3);
        star1.addVertex(-2,2);
        star1.addVertex(-8,6);
        star1.addVertex(0,6);
        star1.setFilled(true);
        star1.setFillColor(Color.YELLOW);
        star1.setColor(Color.YELLOW);
        star1.rotate(290);
        add(star1,120,230);

        GPolygon star2 = new GPolygon();
        star2.addVertex(2,12);
        star2.addVertex(6,6);
        star2.addVertex(12,6);
        star2.addVertex(7,0);
        star2.addVertex(8,-3);
        star2.addVertex(2,0);
        star2.addVertex(-4,-3);
        star2.addVertex(-2,2);
        star2.addVertex(-8,6);
        star2.addVertex(0,6);
        star2.setFilled(true);
        star2.setFillColor(Color.YELLOW);
        star2.setColor(Color.YELLOW);
        star2.rotate(230);
        add(star2,210,300);

        GPolygon star3 = new GPolygon();
        star3.addVertex(2,12);
        star3.addVertex(6,6);
        star3.addVertex(12,6);
        star3.addVertex(7,0);
        star3.addVertex(8,-3);
        star3.addVertex(2,0);
        star3.addVertex(-4,-3);
        star3.addVertex(-2,2);
        star3.addVertex(-8,6);
        star3.addVertex(0,6);
        star3.setFilled(true);
        star3.setFillColor(Color.YELLOW);
        star3.setColor(Color.YELLOW);
        star3.rotate(260);
        add(star3,120,360);
    }

    private void RectangleDrawing(){
        GRect box = new GRect(350, 100);
        box.setFillColor(Color.blue);
        box.setColor(Color.blue);
        box.setFilled(true);

        add(box,100,200);

        GRect box2 = new GRect(350, 100);
        box2.setFillColor(Color.red);
        box2.setColor(Color.red);
        box2.setFilled(true);

        add(box2,100,200+box.getHeight());
    }

    private void SunDrawing(){
        GOval circle = new GOval(35,35);
        circle.setFillColor(Color.yellow);
        circle.setColor(Color.yellow);
        circle.setFilled(true);

        add(circle,128,282);


    }

    private void sunRays(){
        //West and east
        GPolygon diamond = new GPolygon();
        diamond.setFillColor(Color.yellow);
        diamond.setColor(Color.yellow);
        diamond.setFilled(true);
        diamond.addVertex(-30, 0);
        diamond.addVertex(0, 5);
        diamond.addVertex(30, 0);
        diamond.addVertex(0, -5);

        add(diamond,145,300);


        //North & South sun rays
        GPolygon diamond2 = new GPolygon();
        diamond2.setFillColor(Color.yellow);
        diamond2.setColor(Color.yellow);
        diamond2.setFilled(true);
        diamond2.addVertex(5, 0);
        diamond2.addVertex(0, -30);
        diamond2.addVertex(-5, 0);
        diamond2.addVertex(0, 30);

        add(diamond2,145,300);

        //Northwest & Southeast sun rays
        GPolygon diamond3 = new GPolygon();
        diamond3.setFillColor(Color.yellow);
        diamond3.setColor(Color.yellow);
        diamond3.setFilled(true);
        diamond3.addVertex(5, 0);
        diamond3.addVertex(0, -25);
        diamond3.addVertex(-5, 0);
        diamond3.addVertex(0, 25);
        diamond3.rotate(45);
        add(diamond3,145,300);

        //Northeast & Southwest sun rays
        GPolygon diamond4 = new GPolygon();
        diamond4.setFillColor(Color.yellow);
        diamond4.setColor(Color.yellow);
        diamond4.setFilled(true);
        diamond4.addVertex(5, 0);
        diamond4.addVertex(0, -25);
        diamond4.addVertex(-5, 0);
        diamond4.addVertex(0, 25);
        diamond4.rotate(135);
        add(diamond4,145,300);



    }

    private void whiteTriangle(){
        GPolygon triangle = new GPolygon(170,160);
        triangle.setFillColor(Color.white);
        triangle.setColor(Color.black);
        triangle.setFilled(true);

        triangle.sendForward();

        triangle.setVisible(true);

        triangle.addVertex(120,0);
        triangle.addVertex(250,100);
        triangle.addVertex(120,200);

        add(triangle,-20,200);

    }


    private void titleText(){

        GLabel title = new GLabel("Flag"); //summoning an object
        title.setFont("Bahnschrift-bold-30");
        title.setColor(Color.black);
        add(title, getWidth() / 2 - 40, 150);


        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text.setFont("Bahnschrift-bold-12");
        text.setColor(Color.black);
        add(text, 450, 550);
    }
}