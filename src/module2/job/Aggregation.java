package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Aggregation extends GraphicsProgram {

    public void run() {

        setWidth(615);
        setHeight(480);
        double x1 = getWidth();
        double y1 = getHeight();

        GRect background = new GRect(x1,y1);
        background.setFilled(true);
        background.setFillColor(Color.RED);
        add(background,0,0);

        GRect phone = new GRect(80,150);
        phone.setFilled(true);
        phone.setFillColor(Color.BLACK);
        add(phone,100,150);

        GRect phone1 = new GRect(60,125);
        phone1.setFilled(true);
        phone1.setFillColor(Color.WHITE);
        add(phone1,109,160);

        GOval phone2 = new GOval(10,10);
        phone2.setFilled(true);
        phone2.setFillColor(Color.WHITE);
        add(phone2,135,288);

        GRect phone3 = new GRect(80,150);
        phone3.setFilled(true);
        phone3.setFillColor(Color.decode("#7F00FF"));
        add(phone3,435,150);

        GLine line1 = new GLine();
        line1.setStartPoint(0,0);
        line1.setEndPoint(80,0);
        add(line1,435,285);

        GOval phone4 = new GOval(10,10);
        phone4.setFilled(true);
        phone4.setFillColor(Color.decode("#7F00FF"));
        add(phone4,470,288);

        GLabel text=new GLabel("PHONE");
        text.setFont("Calibri-bold-15");
        text.setColor(Color.black);
        add(text, 116,140);

        GLabel text1=new GLabel("PHONE CASE");
        text1.setFont("Calibri-bold-15");
        text1.setColor(Color.black);
        add(text1, 435,140);

        signName();




    }

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);

    }

    public void signName()
    {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,getWidth()-text.getWidth()-10,getHeight()-text.getHeight()+5);
    }
}