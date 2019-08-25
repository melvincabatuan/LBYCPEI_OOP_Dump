package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Composition extends GraphicsProgram {

    public void run() {

        setWidth(615);
        setHeight(480);
        double x1 = getWidth();
        double y1 = getHeight();

        GRect background = new GRect(x1,y1);
        background.setFilled(true);
        background.setFillColor(Color.GREEN);
        add(background,0,0);

        GRect engine = new GRect(180,80);
        engine.setFilled(true);
        engine.setFillColor(Color.RED);
        add(engine,60,180);

        GRect car = new GRect(180,80);
        car.setFilled(true);
        car.setFillColor(Color.WHITE);
        car.setColor(Color.WHITE);
        add(car,375,180);

        GRect car1 = new GRect(80,80);
        car1.setFilled(true);
        car1.setFillColor(Color.WHITE);
        car1.setColor(Color.WHITE);
        add(car1,425,150);

        GOval tire = new GOval(40,40);
        tire.setFilled(true);
        tire.setFillColor(Color.BLACK);
        add(tire,390,250);

        GOval tire1 = new GOval(40,40);
        tire1.setFilled(true);
        tire1.setFillColor(Color.BLACK);
        add(tire1,500,250);

        GLine line = new GLine();
        line.setEndPoint(0,0);
        line.setEndPoint(80,0);
        add(line,425,180);

        GLine line1 = new GLine();
        line1.setEndPoint(0,0);
        line1.setEndPoint(0,30);
        add(line1,465,150);

        GLabel text=new GLabel("CAR ENGINE");
        text.setFont("Calibri-15");
        text.setColor(Color.black);
        add(text, 110,225);

        GLabel text1=new GLabel("CAR");
        text1.setFont("Calibri-15");
        text1.setColor(Color.black);
        add(text1, 454,225);

        signName();
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Composition()).start(args);

    }

    public void signName()
    {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,getWidth()-text.getWidth()-10,getHeight()-text.getHeight()+5);
    }

}

