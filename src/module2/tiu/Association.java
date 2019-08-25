package module2.tiu;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Association extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT =800;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        drawImage();
        writeExplanation();


    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Association()).start(args);
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
        GOval circle = new GOval(25,25);
        circle.setFilled(true);
        circle.setFillColor(Color.WHITE);
        circle.setColor(Color.BLACK);

        GLine body = new GLine(0,0,0,40);

        GLine leftLeg = new GLine(0,0,-10,20);
        GLine rightLeg = new GLine(0,0,10,20);

        add(circle,200,200);
        add(body,circle.getX()+circle.getWidth()/2,circle.getY()+circle.getHeight());
        add(leftLeg,body.getX(),body.getY()+body.getHeight());
        add(rightLeg,body.getX(),body.getY()+body.getHeight());
    }

    public void writeExplanation(){
        GLabel explanation = new GLabel("This is an Association.");
        explanation.setFont("Serif-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,400);

        GLabel explanation2 = new GLabel("the person uses the house" );
        explanation2.setFont("Serif-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,430);

        GLabel explanation3 = new GLabel("for their own benefit");
        explanation3.setFont("Serif-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,460);
    }
}
