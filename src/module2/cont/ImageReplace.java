package module2.cont;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;


public class ImageReplace extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {

        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);
        GImage john = new GImage("assets/lasalle.jpg");
        john.setSize(128,270);
        add(john, 271,556);


        GRect left1 = new GRect(90,400);
        left1.setFilled(true);
        left1.setColor(Color.blue);
        add(left1, 60,384);

        GRect left2 = new GRect(92,400);
        left2.setFilled(true);
        left2.setColor(Color.red);
        add(left2, 151,384);

        GPolygon triangle1 = new GPolygon(180,400);
        triangle1.setFilled(true);
        triangle1.setColor(Color.white);
        triangle1.addEdge(0, 0);
        triangle1.addEdge(182, 0);
        triangle1.addEdge(-91, 150);
        add(triangle1, 60,384);

        GRect right1 = new GRect(90,400);
        right1.setFilled(true);
        right1.setColor(Color.blue);
        add(right1, 415,385);

        GRect right2 = new GRect(93,400);
        right2.setFilled(true);
        right2.setColor(Color.red);
        add(right2, 506,385);

        GPolygon triangle2 = new GPolygon(180,400);
        triangle2.setFilled(true);
        triangle2.setColor(Color.white);
        triangle2.addEdge(0, 0);
        triangle2.addEdge(182, 0);
        triangle2.addEdge(-91, 150);
        add(triangle2, 415,385);


        GRect label = new GRect(550,40);
        label.setFilled(true);
        label.setColor(Color.lightGray);
        add(label, 60,306);
        //62,306

        GLabel text = new GLabel(" DE • LA • SALLE • UNIVERSITY ");
        text.setFont("Times New Roman-37");
        add(text, 60, 340);

        GOval symbol = new GOval(90,90);
        symbol.setFilled(true);
        symbol.setColor(Color.GREEN);
        add(symbol, 288,398 );
        // 288,398

        GLabel three = new GLabel("300");
        three.setFont("Arial-45");
        three.setColor(Color.white);
        three.rotate(45);
        add(three,320,475);

    }
    public static void main (String [] args){
        (new ImageReplace()).start(args);
    }
}
