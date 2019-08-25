package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Art extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 450;
    public static final int APPLICATION_HEIGHT = 400;

    public void run() {
        RectangleDrawing();

        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V.");
        text.setFont("Papyrus-bold-12");
        text.setColor(Color.black);
        add(text, 300, 350);

        phineasName();
        phineasHair();
        phineasEyes1();
        phineasHead();
        phineasEyes2();
        phineasSmile();

    }

    private void phineasName(){

        GLabel text = new GLabel("Phineas"); //summoning an object
        text.setFont("Bahnschrift-italic-48");
        text.setColor(Color.decode("#228B22"));
        add(text, 100, 130);

    }

    private void phineasHair(){
        GPolygon hair = new GPolygon();
        hair.setFillColor(Color.decode("#DC4503"));
        hair.setColor(Color.darkGray);
        hair.setFilled(true);
        hair.addVertex(8, 0);
        hair.addVertex(0, -50);
        hair.addVertex(-8, 0);
        hair.addVertex(0, 50);

        add(hair,90,205);

        GPolygon hair2 = new GPolygon();
        hair2.setFillColor(Color.decode("#DC4503"));
        hair2.setColor(Color.darkGray);
        hair2.setFilled(true);
        hair2.addVertex(8, 0);
        hair2.addVertex(0, -50);
        hair2.addVertex(-8, 0);
        hair2.addVertex(0, 50);
        hair2.rotate(20);

        add(hair2,90,205);

        GPolygon hair3 = new GPolygon();
        hair3.setFillColor(Color.decode("#DC4503"));
        hair3.setColor(Color.darkGray);
        hair3.setFilled(true);
        hair3.addVertex(8, 0);
        hair3.addVertex(0, -50);
        hair3.addVertex(-8, 0);
        hair3.rotate(40);

        add(hair3,90,205);

        GPolygon hair6 = new GPolygon();
        hair6.setFillColor(Color.decode("#DC4503"));
        hair6.setColor(Color.darkGray);
        hair6.setFilled(true);
        hair6.addVertex(8, 0);
        hair6.addVertex(0, -50);
        hair6.addVertex(-8, 0);
        hair6.rotate(60);

        add(hair6,90,205);



        GPolygon hair4 = new GPolygon();
        hair4.setFillColor(Color.decode("#DC4503"));
        hair4.setColor(Color.darkGray);
        hair4.setFilled(true);
        hair4.addVertex(8, 0);
        hair4.addVertex(0, -50);
        hair4.addVertex(-8, 0);
        hair4.rotate(-20);

        add(hair4,90,205);

        GPolygon hair5 = new GPolygon();
        hair5.setFillColor(Color.decode("#DC4503"));
        hair5.setColor(Color.darkGray);
        hair5.setFilled(true);
        hair5.addVertex(8, 0);
        hair5.addVertex(0, -50);
        hair5.addVertex(-8, 0);
        hair5.rotate(-40);

        add(hair5,90,205);
    }


    private void phineasSmile(){
        GArc arc = new GArc(220, 300, 30, 90, 10, -90);
        arc.rotate(270);
        add(arc);
    }
    private void phineasEyes1(){
        GOval circle2 = new GOval(55,40);
        circle2.setFillColor(Color.white);
        circle2.setColor(Color.black);
        circle2.setFilled(true);

        add(circle2,160,225);

        GOval eyes1 = new GOval(20,23);
        eyes1.setFillColor(Color.blue);
        eyes1.setColor(Color.black);
        eyes1.setFilled(true);

        add(eyes1, 185,240);

        GOval eyeball2 = new GOval(11,6);
        eyeball2.setFillColor(Color.white);
        eyeball2.setColor(Color.blue);
        eyeball2.setFilled(true);
        eyeball2.rotate(45);

        add(eyeball2, 187,249);
    }

    private void phineasEyes2(){
        GOval circle = new GOval(65,50);
        circle.setFillColor(Color.white);
        circle.setColor(Color.black);
        circle.setFilled(true);

        add(circle,115,210);

        GOval eyes = new GOval(23,25);
        eyes.setFillColor(Color.blue);
        eyes.setColor(Color.black);
        eyes.setFilled(true);

        add(eyes, 145,233);

        GOval eyeball = new GOval(13,8);
        eyeball.setFillColor(Color.white);
        eyeball.setColor(Color.blue);
        eyeball.setFilled(true);
        eyeball.rotate(45);

        add(eyeball, 146,242);

    }

    private void RectangleDrawing(){
        GRect bbox = new GRect(500, 500);
        bbox.setFillColor(Color.decode("#F98B88"));
        bbox.setColor(Color.blue);
        bbox.setFilled(true);
        int x= 0;
        int y= 0;

        bbox.setVisible(true);
        add(bbox,x,y);


    }

    private void phineasHead(){
        GPolygon triangle = new GPolygon(200,200);
        triangle.setFillColor(Color.decode("#DCD0BA"));
        triangle.setColor(Color.decode("#B5651D"));
        triangle.setFilled(true);

        triangle.sendForward();

        triangle.setVisible(true);

        triangle.addVertex(100,0);
        triangle.addVertex(300,100);
        triangle.addVertex(100,200);

        add(triangle,-20,200);



    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Art()).start(args);
    }

}