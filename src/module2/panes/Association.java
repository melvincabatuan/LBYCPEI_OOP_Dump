package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;

public class Association extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 750;
    public static final int APPLICATION_HEIGHT = 750;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Association()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makeImage();
        makeExplanation();
        addName();
    }

    public void makeImage(){
        makeChair();
        makeFeet();
    }

    public void makeChair(){
        GRoundRect backRest = new GRoundRect(50,300);
        backRest.setFilled(true);
        backRest.setFillColor(Color.LIGHT_GRAY);
        backRest.setColor(Color.BLACK);

        GRect seatSide = new GRect(300,50);
        seatSide.setFilled(true);
        seatSide.setFillColor(Color.LIGHT_GRAY);
        seatSide.setColor(Color.BLACK);

        GPolygon feet1 = new GPolygon();
        feet1.setFilled(true);
        feet1.setFillColor(Color.decode("#A0522D"));
        feet1.setColor(Color.BLACK);
        feet1.addEdge(0,0);
        feet1.addEdge(50,0);
        feet1.addEdge(-20,210);
        feet1.addEdge(-20,0);

        GPolygon feet2 = new GPolygon();
        feet2.setFilled(true);
        feet2.setFillColor(Color.decode("#A0522D"));
        feet2.setColor(Color.BLACK);
        feet2.addEdge(0,0);
        feet2.addEdge(50,0);
        feet2.addEdge(-20,210);
        feet2.addEdge(-20,0);


        add(backRest,50,70);
        add(seatSide,50,370);
        add(feet1,50,420);
        add(feet2,300,420);
    }

    public void makeFeet(){
        GPolygon feet1 = new GPolygon();
        feet1.setFilled(true);
        feet1.setFillColor(Color.decode("#A0522D"));
        feet1.setColor(Color.BLACK);
        feet1.addEdge(0,0);
        feet1.addEdge(50,0);
        feet1.addEdge(-20,210);
        feet1.addEdge(-20,0);

        GPolygon feet2 = new GPolygon();
        feet2.setFilled(true);
        feet2.setFillColor(Color.decode("#A0522D"));
        feet2.setColor(Color.BLACK);
        feet2.addEdge(0,0);
        feet2.addEdge(50,0);
        feet2.addEdge(-20,210);
        feet2.addEdge(-20,0);

        add(feet1,450,420);
        add(feet2,600,420);
    }

    public void makeExplanation(){
        GLabel explanation = new GLabel("In this relationship,");
        explanation.setFont("Lucida-20");
        explanation.setColor(Color.BLACK);
        add(explanation,200,200);

        GLabel explanation2 = new GLabel("we have the chair and the legs." );
        explanation2.setFont("Lucida-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,200,230);

        GLabel explanation3 = new GLabel("In this Association relationship,");
        explanation3.setFont("Lucida-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,200,260);

        GLabel explanation4 = new GLabel("the chair is using the functions of the legs ");
        explanation4.setFont("Lucida-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,200,290);

        GLabel explanation5 = new GLabel("to work better and vise versa.");
        explanation5.setFont("Lucida-20");
        explanation5.setColor(Color.BLACK);
        add(explanation5,200,320);

    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text, (getWidth() - 80), (getHeight() - 25));
    }
}