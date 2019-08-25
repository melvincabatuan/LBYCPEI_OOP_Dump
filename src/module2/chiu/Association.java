package module2.chiu;
/*
Kenley Lewis Chiu
LBYCPEI EQ3
May 29,2019
*/

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Association extends GraphicsProgram {

    public static void main(String[] args) {
        (new Association()).start(args);
    }

    public void run(){
        roof();
        walls();
        window(300,170,-200);
        window(425,170, 60);
        doors();
        GLabel relation= new GLabel("The house must have roof, window,");
        GLabel relation2 =new GLabel("walls, and door to become a house.");
        relation.setFont("Arial-Bold-20");
        relation2.setFont("Arial-Bold-20");
        add(relation,100,420);
        add(relation2,100,440);


    }

    private void walls(){
        GRect walls = new GRect(200,200);
        double x = (getWidth()-walls.getWidth())/2;
        double y = (getHeight()-walls.getHeight())/2;
        walls.setFilled(true);
        walls.setFillColor(Color.GREEN);
        add(walls,x,y);
        labels("wall",439,243,500,235);

    }
    private void window(double x,double y, double x1){
        GRect window = new GRect(30,30);
        add (window,x,y);
        window.setFilled(true);
        window.setFillColor(Color.WHITE);
        labels("window",x+20,y+10,x+x1,y-40);
    }
    private void roof(){
        GPolygon roof = new GPolygon();
        roof.addVertex(377,0);
        roof.addVertex(277,135.5);
        roof.addVertex(477,135.5);
        roof.setFilled(true);
        roof.setFillColor(Color.RED);
        add(roof,0,0);
        labels("roof",327,100,490,90);
    }
    private void doors(){
        GRect door= new GRect(50,100);
        GOval knob= new GOval(10,10);
        door.setFilled(true);
        door.setFillColor(Color.LIGHT_GRAY);
        knob.setFilled(true);
        knob.setFillColor(Color.YELLOW);
        add(door,350,235.5);
        add(knob,350,(335.5+235.5)/2);
        labels("door",370,255,496,300);

    }
    private void labels(String part, double x0, double y0, double x1, double y1)
    {
        GLabel name= new GLabel(part);
        name.setFont("Arial-Bold-45");
        GLine point= new GLine(x0,y0,x1,y1);
        add(point);
        add(name,x1,y1);
    }
}
