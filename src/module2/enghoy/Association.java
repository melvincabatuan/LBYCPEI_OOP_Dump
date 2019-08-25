package module2.enghoy;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Association extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 800;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Association()).start(args);
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
        add(edge,getWidth()/2-70,getHeight()/4+7);

        GRect handle = new GRect(150,35);
        handle.setFilled(true);
        handle.setFillColor(Color.lightGray);
        add(handle,getWidth()/2+225,getHeight()/4-105);

        GRect handleCover = new GRect(100,35);
        handleCover.setFilled(true);
        handleCover.setFillColor(Color.BLACK);
        add(handleCover,getWidth()/2+250,getHeight()/4-105);

        GRect frame = new GRect(300,150);
        frame.setFilled(true);
        frame.setFillColor(Color.lightGray);
        frame.setColor(Color.BLACK);
        add(frame,getWidth()/2-70,getHeight()/4-105);

        GOval hole = new GOval(35,35);
        hole.setFilled(true);
        hole.setFillColor(Color.WHITE);
        hole.setColor(Color.BLACK);
        add(hole, getWidth()/2-65,getHeight()/4-100);
    }

    public void drawPerson(){
        GOval circle = new GOval(50,50);
        circle.setFilled(true);
        circle.setFillColor(Color.WHITE);
        circle.setColor(Color.BLACK);

        GLine body = new GLine(0,0,0,80);
        GLine rightarm = new GLine(0,0,25,25);
        GLine leftarm = new GLine(0,0,-25,25);
        GLine leftLeg = new GLine(0,0,-20,40);
        GLine rightLeg = new GLine(0,0,20,40);

        add(circle,150,200);
        add(body,circle.getX()+circle.getWidth()/2,circle.getY()+circle.getHeight());
        add(leftarm,body.getX(),(body.getY()+body.getHeight())-50);
        add(rightarm,body.getX(),(body.getY()+body.getHeight())-50);
        add(leftLeg,body.getX(),body.getY()+body.getHeight());
        add(rightLeg,body.getX(),body.getY()+body.getHeight());
    }

    public void insertDescription(){
        GLabel description = new GLabel("Shown here is an Association.");
        description.setFont("ComicSansMS-20");
        description.setColor(Color.BLACK);
        add(description,20,450);

        GLabel description2 = new GLabel("The person on the left uses the butcher knife" );
        description2.setFont("ComicSansMS-20");
        description2.setColor(Color.BLACK);
        add(description2,20,480);

        GLabel description3 = new GLabel("for their own benefit, like preparation of ingredients.");
        description3.setFont("ComicSansMS-20");
        description3.setColor(Color.BLACK);
        add(description3,20,510);
    }
}
