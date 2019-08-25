package module2.tiu;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Aggregation extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT =800;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        drawImage();
        writeExplanation();


    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Aggregation()).start(args);
    }


    public void drawImage(){
        drawHouse();
        drawPerson();
    }

    public void drawHouse(){
        GPolygon roof = new GPolygon();
        roof.setFilled(true);
        roof.setFillColor(Color.DARK_GRAY);
        roof.addVertex(120,0);
        roof.addVertex(0,100);
        roof.addVertex(240,100);

        GRect house = new GRect(roof.getWidth(),roof.getWidth()*2/3);
        house.setFilled(true);
        house.setFillColor(Color.GRAY);

        GRect door= new GRect(house.getWidth()/4,house.getHeight()/2);
        door.setFilled(true);
        door.setFillColor(Color.DARK_GRAY);

        add(roof,(getWidth()-240)/2,0);
        add(house,(getWidth()-240)/2,roof.getY()+roof.getHeight());
        add(door,house.getX()+(house.getWidth()-door.getWidth())/2,house.getY()+house.getHeight()-door.getHeight());
    }

    public void drawPerson(){
        GOval circle = new GOval(80,80);
        circle.setFilled(true);
        circle.setFillColor(Color.WHITE);
        circle.setColor(Color.BLACK);

        GLine body = new GLine(0,0,0,130);

        GLine leftLeg = new GLine(0,0,-40,80);
        GLine rightLeg = new GLine(0,0,40,80);

        add(circle,400,400);
        add(body,circle.getX()+circle.getWidth()/2,circle.getY()+circle.getHeight());
        add(leftLeg,body.getX(),body.getY()+body.getHeight());
        add(rightLeg,body.getX(),body.getY()+body.getHeight());
    }

    public void writeExplanation(){
        GLabel explanation = new GLabel("This is an aggregation relationship.");
        explanation.setFont("Serif-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,400);

        GLabel explanation2 = new GLabel("A person is still a person without the house" );
        explanation2.setFont("Serif-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,430);

        GLabel explanation3 = new GLabel("and the house is still a house");
        explanation3.setFont("Serif-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,460);

        GLabel explanation4 = new GLabel("without the person.");
        explanation4.setFont("Serif-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,20,490);
    }
}
