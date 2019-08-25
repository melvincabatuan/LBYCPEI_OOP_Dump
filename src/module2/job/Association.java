package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class Association extends GraphicsProgram {

    public void run() {

        setWidth(615);
        setHeight(480);
        double x1 = getWidth();
        double y1 = getHeight();

        GRect background = new GRect(x1,y1);
        background.setFilled(true);
        background.setFillColor(Color.decode("#006633"));
        add(background,0,0);

        /*Person 1*/
        GOval head = new GOval(50,50);
        head.setFilled(true);
        head.setFillColor(Color.decode("#FFCBA4"));
        add(head,60,100);

        GLine body = new GLine();
        body.setStartPoint(0,0);
        body.setEndPoint(0,180);
        add(body,85,150);

        GLine arm1 = new GLine();
        arm1.setStartPoint(0,0);
        arm1.setEndPoint(-40,50);
        add(arm1,85,180);

        GLine arm2 = new GLine();
        arm2.setStartPoint(0,0);
        arm2.setEndPoint(40,50);
        add(arm2,85,180);

        GLine leg1 = new GLine();
        leg1.setStartPoint(0,0);
        leg1.setEndPoint(-20,80);
        add(leg1,85,330);

        GLine leg2 = new GLine();
        leg2.setStartPoint(0,0);
        leg2.setEndPoint(20,80);
        add(leg2,85,330);

        /*Person 2*/
        GOval head1 = new GOval(50,50);
        head1.setFilled(true);
        head1.setFillColor(Color.decode("#FFCBA4"));
        add(head1,500,100);

        GLine body1 = new GLine();
        body1.setStartPoint(0,0);
        body1.setEndPoint(0,180);
        add(body1,525,150);

        GLine arm3 = new GLine();
        arm3.setStartPoint(0,0);
        arm3.setEndPoint(-40,50);
        add(arm3,525,180);

        GLine arm4 = new GLine();
        arm4.setStartPoint(0,0);
        arm4.setEndPoint(40,50);
        add(arm4,525,180);

        GLine leg3 = new GLine();
        leg3.setStartPoint(0,0);
        leg3.setEndPoint(-20,80);
        add(leg3,525,330);

        GLine leg4 = new GLine();
        leg4.setStartPoint(0,0);
        leg4.setEndPoint(20,80);
        add(leg4,525,330);

        GLabel text=new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        text.setFont("Serif-30");
        text.setColor(Color.WHITE);
        add(text, 99,450);

        GLabel text1=new GLabel("LBYCPEI");
        text1.setFont("Serif-30");
        text1.setColor(Color.WHITE);
        add(text1, x1/2-60,50);

        GLabel text2=new GLabel("Sir Melvin Cabatuan");
        text2.setFont("Calibri-15");
        text2.setColor(Color.WHITE);
        add(text2, x1/25,90);

        GLabel text3=new GLabel("Me");
        text3.setFont("Calibri-15");
        text3.setColor(Color.WHITE);
        add(text3, x1/2+206,90);

        signName();


    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Association()).start(args);

    }

    public void signName()
    {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,getWidth()-text.getWidth()-10,getHeight()-text.getHeight()+5);
    }

}