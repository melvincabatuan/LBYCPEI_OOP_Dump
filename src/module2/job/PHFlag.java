package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class PHFlag extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        GRect blue = new GRect(450,125);
        blue.setFilled(true);
        blue.setFillColor(Color.blue);
        add(blue,95,100);

        GRect red = new GRect(450,125);
        red.setFilled(true);
        red.setFillColor(Color.red);
        add(red,95,225);

        GPolygon white = new GPolygon();
        white.addVertex(95,0);
        white.addVertex(95,250);
        white.addVertex(270,125);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,0,blue.getY());

        GOval sun = new GOval(60,60);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);
        add(sun, 130, 200);

        GPolygon north = new GPolygon();
        north.addVertex(-15,0);
        north.addVertex(0,5);
        north.addVertex(15,0);
        north.addVertex(0,-5);
        north.setFilled(true);
        north.setFillColor(Color.YELLOW);
        north.setColor(Color.YELLOW);
        north.rotate(90);
        add(north,160,200);

        GPolygon south = new GPolygon();
        south.addVertex(-15,0);
        south.addVertex(0,5);
        south.addVertex(15,0);
        south.addVertex(0,-5);
        south.setFilled(true);
        south.setFillColor(Color.YELLOW);
        south.setColor(Color.YELLOW);
        south.rotate(90);
        add(south,160,261);

        GPolygon east = new GPolygon();
        east.addVertex(-15,0);
        east.addVertex(0,5);
        east.addVertex(15,0);
        east.addVertex(0,-5);
        east.setFilled(true);
        east.setFillColor(Color.YELLOW);
        east.setColor(Color.YELLOW);
        east.rotate(0);
        add(east,191,230);

        GPolygon west = new GPolygon();
        west.addVertex(-15,0);
        west.addVertex(0,5);
        west.addVertex(15,0);
        west.addVertex(0,-5);
        west.setFilled(true);
        west.setFillColor(Color.YELLOW);
        west.setColor(Color.YELLOW);
        west.rotate(0);
        add(west,130,230);

        GPolygon northeast = new GPolygon();
        northeast.addVertex(-15,0);
        northeast.addVertex(0,5);
        northeast.addVertex(15,0);
        northeast.addVertex(0,-5);
        northeast.setFilled(true);
        northeast.setFillColor(Color.YELLOW);
        northeast.setColor(Color.YELLOW);
        northeast.rotate(45);
        add(northeast,182,209);

        GPolygon southwest = new GPolygon();
        southwest.addVertex(-15,0);
        southwest.addVertex(0,5);
        southwest.addVertex(15,0);
        southwest.addVertex(0,-5);
        southwest.setFilled(true);
        southwest.setFillColor(Color.YELLOW);
        southwest.setColor(Color.YELLOW);
        southwest.rotate(45);
        add(southwest,139,252);

        GPolygon northwest = new GPolygon();
        northwest.addVertex(-15,0);
        northwest.addVertex(0,5);
        northwest.addVertex(15,0);
        northwest.addVertex(0,-5);
        northwest.setFilled(true);
        northwest.setFillColor(Color.YELLOW);
        northwest.setColor(Color.YELLOW);
        northwest.rotate(135);
        add(northwest,138,209);

        GPolygon southeast = new GPolygon();
        southeast.addVertex(-15,0);
        southeast.addVertex(0,5);
        southeast.addVertex(15,0);
        southeast.addVertex(0,-5);
        southeast.setFilled(true);
        southeast.setFillColor(Color.YELLOW);
        southeast.setColor(Color.YELLOW);
        southeast.rotate(135);
        add(southeast,182,252);

        GPolygon star1 = new GPolygon();
        star1.addVertex(2,12);
        star1.addVertex(6,6);
        star1.addVertex(12,6);
        star1.addVertex(7,0);
        star1.addVertex(8,-3);
        star1.addVertex(2,0);
        star1.addVertex(-4,-3);
        star1.addVertex(-2,2);
        star1.addVertex(-8,6);
        star1.addVertex(0,6);
        star1.setFilled(true);
        star1.setFillColor(Color.YELLOW);
        star1.setColor(Color.YELLOW);
        star1.rotate(290);
        add(star1,112,135);

        GPolygon star2 = new GPolygon();
        star2.addVertex(2,12);
        star2.addVertex(6,6);
        star2.addVertex(12,6);
        star2.addVertex(7,0);
        star2.addVertex(8,-3);
        star2.addVertex(2,0);
        star2.addVertex(-4,-3);
        star2.addVertex(-2,2);
        star2.addVertex(-8,6);
        star2.addVertex(0,6);
        star2.setFilled(true);
        star2.setFillColor(Color.YELLOW);
        star2.setColor(Color.YELLOW);
        star2.rotate(230);
        add(star2,240,230);

        GPolygon star3 = new GPolygon();
        star3.addVertex(2,12);
        star3.addVertex(6,6);
        star3.addVertex(12,6);
        star3.addVertex(7,0);
        star3.addVertex(8,-3);
        star3.addVertex(2,0);
        star3.addVertex(-4,-3);
        star3.addVertex(-2,2);
        star3.addVertex(-8,6);
        star3.addVertex(0,6);
        star3.setFilled(true);
        star3.setFillColor(Color.YELLOW);
        star3.setColor(Color.YELLOW);
        star3.rotate(260);
        add(star3,112,320);

        signName();

    }

    public void signName()
    {
        GLabel text = new GLabel("Job Vincent L. Aseniero");
        add(text,getWidth()-text.getWidth()-10,getHeight()-text.getHeight());
    }

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new PHFlag()).start(args);

    }
}