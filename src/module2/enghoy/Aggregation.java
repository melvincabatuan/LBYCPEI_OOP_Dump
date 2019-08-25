package module2.enghoy;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Aggregation extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 800;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        drawImage();
        insertDescription();
    }

    public void drawImage(){
        drawKnife();
        drawPerson();
    }

    public void drawKnife(){
        GRect edge = new GRect(300,50);
        edge.setFilled(true);
        edge.setFillColor(Color.darkGray);
        edge.setColor(Color.WHITE);
        add(edge,getWidth()/4,getHeight()/4+7);

        GRect handle = new GRect(150,35);
        handle.setFilled(true);
        handle.setFillColor(Color.lightGray);
        add(handle,getWidth()/4+300,getHeight()/4-105);

        GRect handleCover = new GRect(100,35);
        handleCover.setFilled(true);
        handleCover.setFillColor(Color.BLACK);
        add(handleCover,getWidth()/4+325,getHeight()/4-105);

        GRect frame = new GRect(300,150);
        frame.setFilled(true);
        frame.setFillColor(Color.lightGray);
        frame.setColor(Color.BLACK);
        add(frame,getWidth()/4,getHeight()/4-105);

        GOval hole = new GOval(35,35);
        hole.setFilled(true);
        hole.setFillColor(Color.WHITE);
        hole.setColor(Color.BLACK);
        add(hole, getWidth()/4+5,getHeight()/4-100);
    }

    public void drawPerson(){
        GOval circle = new GOval(80,80);
        circle.setFilled(true);
        circle.setFillColor(Color.WHITE);
        circle.setColor(Color.BLACK);

        GLine body = new GLine(0,0,0,130);
        GLine rightarm = new GLine(0,0,40,40);
        GLine leftarm = new GLine(0,0,-40,40);
        GLine leftLeg = new GLine(0,0,-40,80);
        GLine rightLeg = new GLine(0,0,40,80);

        add(circle,450,400);
        add(body,circle.getX()+circle.getWidth()/2,circle.getY()+circle.getHeight());
        add(leftarm,body.getX(),(body.getY()+body.getHeight())-75);
        add(rightarm,body.getX(),(body.getY()+body.getHeight())-75);
        add(leftLeg,body.getX(),body.getY()+body.getHeight());
        add(rightLeg,body.getX(),body.getY()+body.getHeight());
    }

    public void insertDescription(){
        GLabel explanation = new GLabel("On this frame, an Aggregation relationship is shown.");
        explanation.setFont("Serif-20");
        explanation.setColor(Color.BLACK);
        add(explanation,10,500);

        GLabel explanation2 = new GLabel("A person is still a person without the butcher knife" );
        explanation2.setFont("Serif-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,10,530);

        GLabel explanation3 = new GLabel("and the butcher knife is still a butcher knife");
        explanation3.setFont("Serif-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,10,560);

        GLabel explanation4 = new GLabel("without the person.");
        explanation4.setFont("Serif-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,10,590);
    }
}
