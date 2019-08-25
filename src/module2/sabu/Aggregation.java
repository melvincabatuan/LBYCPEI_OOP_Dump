package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Aggregation extends GraphicsProgram {

    public void run() {
        bg();
        zipper();
        pants();
        texts();
    }

    public static void main(String[] args) { // Solves java.lang.NoClassDefFoundError
        (new Aggregation()).start(args);
    }

    private void pants(){
        inLegs();
        top();
        right();
        left();
    }

    private void top(){
        GArc arc = new GArc(200,20,0,180);
        arc.setColor(Color.BLACK);
        double x = 340;
        double y = 100;
        add(arc,x,y);
        GArc arc2 = new GArc(200,20,0,-180);
        arc2.setColor(Color.BLACK);
        double x2 = 340;
        double y2 = 100;
        add(arc2,x2,y2);
        GOval button = new GOval(433,123,15,15);
        button.setFilled(true);
        button.setFillColor(Color.DARK_GRAY);
        button.setColor(Color.BLACK);
        add(button);
        GArc pocket1 = new GArc(60,70,-60,-140);
        double x1 = 498;
        double y1 = 95;
        add(pocket1,x1,y1);
        GArc pocket2 = new GArc(60,70,-120,140);
        double x3 = 322;
        double y3 = 95;
        add(pocket2,x3,y3);
    }

    private void inLegs(){
        GArc arc = new GArc(60,430,0,180);
        arc.setColor(Color.BLACK);
        //arc.setFilled(true);
        //arc.setFillColor(Color.WHITE);
        double x = 410;
        double y = 175;
        add(arc,x,y);
    }

    private void right(){
        GArc arc = new GArc(70,10,0,-180);
        arc.setColor(Color.BLACK);
        double x = 470;
        double y = 385;
        add(arc,x,y);
        GArc right = new GArc(10,280,-90,180);
        right.setColor(Color.BLACK);
        double x1 = 535;
        double y1 = 110;
        add(right,x1,y1);
    }

    private void left(){
        GArc arc = new GArc(70,10,0,-180);
        arc.setColor(Color.BLACK);
        double x = 340;
        double y = 385;
        add(arc,x,y);
        GArc left = new GArc(10,280,90,180);
        left.setColor(Color.BLACK);
        double x1 = 335;
        double y1 = 110;
        add(left,x1,y1);
    }

    private void zipper(){
        GOval base = new GOval(40,25);
        base.setColor(Color.BLACK);
        base.setFilled(true);
        base.setFillColor(Color.decode("#C0C0C0"));
        double x = 135;
        double y = 135;
        add(base,x,y);
        GArc left = new GArc(60,150,0,90);
        double x1 = 95;
        double y1 = 90;
        add(left,x1,y1);
        GArc right = new GArc(60,150,-270,90);
        double x2 = 155;
        double y2 = 90;
        add(right,x2,y2);
        GLine line = new GLine(155,155,155,255);
        add(line);
        GPolygon big = new GPolygon();
        big.addVertex(155,160); //top
        big.addVertex(169,210); //right
        big.addVertex(138,210); //left
        big.setColor(Color.BLACK);
        big.setFilled(true);
        big.setFillColor(Color.decode("#C0C0C0"));
        add(big);
        GPolygon small = new GPolygon();
        small.addVertex(155,170); //top
        small.addVertex(162,205); //right
        small.addVertex(145,205); //left
        small.setColor(Color.BLACK);
        small.setFilled(true);
        small.setFillColor(Color.decode("#1560bd"));
        add(small);
        GRect rect = new GRect(10,40);
        rect.setColor(Color.BLACK);
        rect.setFilled(true);
        rect.setFillColor(Color.decode("#C0C0C0"));
        double x3 = 150;
        double y3 = 130;
        add(rect,x3,y3);


    }

    private void bg(){
        GRect box = new GRect(getWidth() + 25,getHeight() + 25);
        box.setFilled(true);
        box.setFillColor(Color.decode("#1560bd"));
        box.setColor(Color.decode("#1560bd"));
        double x = -5; //340
        double y = -5; //110
        add(box,x,y);
    }

    private void texts(){
        GLabel explain = new GLabel("A pair of pants would still serve its purpose of" +
                " being pants even without its zipper.");
        explain.setFont("Comic Sans-14");
        explain.setColor(Color.BLACK);
        double x = (getWidth() - explain.getWidth())/2;
        double y = 50;
        add(explain,x,y);
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Ostrich Sans Black-20");
        text.setColor(Color.BLACK);
        double x1 = 575;
        double y1 = 450;
        add(text,x1,y1);
    }

}