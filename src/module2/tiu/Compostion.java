package module2.tiu;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Compostion extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT =800;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makeImage();
        makeExplanation();


    }
    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Compostion()).start(args);
    }


    public void makeImage(){
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
        GRect house = new GRect(240,240*2/3);
        house.setFilled(true);
        house.setFillColor(Color.GRAY);
        add(house,400,400);

        GRect door= new GRect(house.getWidth()/4,house.getHeight()/2);
        door.setFilled(true);
        door.setFillColor(Color.WHITE);
        add(door,house.getX()+(house.getWidth()-door.getWidth())/2,house.getY()+house.getHeight()-door.getHeight());
    }

    public void makeExplanation(){
        GLabel explanation = new GLabel("This is a composition relationship.");
        explanation.setFont("Serif-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,400);

        GLabel explanation2 = new GLabel("A house wouldn't work without the walls" );
        explanation2.setFont("Serif-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,430);

        GLabel explanation3 = new GLabel("and vice versa");
        explanation3.setFont("Serif-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,460);
    }
}
