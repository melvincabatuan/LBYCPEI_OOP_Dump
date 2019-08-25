package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Aggregation extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 750;
    public static final int APPLICATION_HEIGHT = 750;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Aggregation()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makeImage();
        makeExplanation();
        addName();
    }

    public void makeImage(){
        makeCabinet();
        makeShirt();
    }

    public void makeCabinet(){
        GRect cabinetBack = new GRect(250,450);
        cabinetBack.setFilled(true);
        cabinetBack.setFillColor(Color.decode("#A0522D"));
        cabinetBack.setColor(Color.BLACK);

        GRect cabinet1 = new GRect(100,400);
        cabinet1.setFilled(true);
        cabinet1.setFillColor(Color.decode("#A0522D"));
        cabinet1.setColor(Color.BLACK);

        GRect cabinet2 = new GRect(100,400);
        cabinet2.setFilled(true);
        cabinet2.setFillColor(Color.decode("#A0522D"));
        cabinet2.setColor(Color.BLACK);

        GOval handle1 = new GOval(30,30);
        handle1.setFilled(true);
        handle1.setFillColor(Color.RED);
        handle1.setColor(Color.BLACK);

        GOval handle2 = new GOval(30,30);
        handle2.setFilled(true);
        handle2.setFillColor(Color.RED);
        handle2.setColor(Color.BLACK);

        add(cabinetBack,20,70);
        add(cabinet1,45,95);
        add(cabinet2,145,95);
        add(handle1,110,260);
        add(handle2,149,260);
    }

    public void makeShirt(){
        GPolygon shirt = new GPolygon();
        shirt.setFilled(true);
        shirt.setFillColor(Color.decode("#FFD700"));
        shirt.setColor(Color.BLACK);
        shirt.addEdge(0, 0);
        shirt.addEdge(200, 0);
        shirt.addEdge(100, 80);
        shirt.addEdge(-40, 80);
        shirt.addEdge(-60, -50);
        shirt.addEdge(0, 270);
        shirt.addEdge(-200, 0);
        shirt.addEdge(0, -270);
        shirt.addEdge(-60, 50);
        shirt.addEdge(-40, -80);


        GOval circle = new GOval(100,70);
        circle.setFilled(true);
        circle.setFillColor(Color.WHITE);
        circle.setColor(Color.WHITE);


        add(shirt,400,70);
        add(circle,450,30);
    }

    public void makeExplanation(){
        GLabel explanation = new GLabel("In this relationship,");
        explanation.setFont("Lucida-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,550);

        GLabel explanation2 = new GLabel("we have the cabinet and the shirt." );
        explanation2.setFont("Lucida-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,580);

        GLabel explanation3 = new GLabel("In this aggregation relationship,");
        explanation3.setFont("Lucida-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,610);

        GLabel explanation4 = new GLabel("the cabinet can still exist without the");
        explanation4.setFont("Lucida-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,20,640);

        GLabel explanation5 = new GLabel("shirt and vise versa.");
        explanation5.setFont("Lucida-20");
        explanation5.setColor(Color.BLACK);
        add(explanation5,20,670);

    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text, (getWidth() - 80), (getHeight() - 25));
    }
}