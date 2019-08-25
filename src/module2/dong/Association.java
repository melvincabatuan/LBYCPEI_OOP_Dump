package module2.dong;

import acm.graphics.GLabel;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.graphics.GOval;

import acm.program.*;

import java.awt.*;
public class Association extends GraphicsProgram {

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Association()).start(args);
    }

    public void run(){

        GPolygon leftBook = new GPolygon();
        add(leftBook);
        leftBook.addVertex(50,75);
        leftBook.addVertex(70,80);
        leftBook.addVertex(70,100);
        leftBook.addVertex(50,105);
        GPolygon rightBook = new GPolygon();
        add(rightBook);
        rightBook.addVertex(70,80);
        rightBook.addVertex(90,75);
        rightBook.addVertex(90,105);
        rightBook.addVertex(70,100);

        GOval eraser = new GOval(30,30);
        add(eraser,150,30);
        eraser.setFilled(true);
        eraser.setColor(Color.red);

        GRect pencil = new GRect(30,100);
        add(pencil,150,50);
        pencil.setFilled(true);
        pencil.setColor(Color.yellow);

        GPolygon pencilHead = new GPolygon();
        add(pencilHead);
        pencilHead.addVertex(150,150);
        pencilHead.addVertex(165,170);
        pencilHead.addVertex(180,150);
        pencilHead.setFilled(true);
        pencilHead.setColor(Color.darkGray);

        GOval bag = new GOval(100,120);
        add(bag,65,260);
        bag.setFilled(true);
        bag.setColor(Color.blue);

        GRect bag1 = new GRect(15,60);
        add(bag1,85,290);

        GRect bag2 = new GRect(15,60);
        add(bag2,125,290);

        GLabel text1 = new GLabel("NOTEBOOK");
        add(text1,20,50);
        text1.setFont("Arial-bold-20");

        GLabel text2 = new GLabel("pencil");
        add(text2,140,190);
        text2.setFont("Arial-bold-20");

        GLabel text3 = new GLabel("bag");
        add(text3,90,400);
        text3.setFont("Arial-bold-20");

    }

}