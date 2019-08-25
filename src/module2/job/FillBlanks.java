package module2.job;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class FillBlanks extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);

        insertImg();
        insertFlag1(62,380);
        insertFlag2(415,380);

    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new FillBlanks()).start(args);
    }

    public void insertImg() {
        GImage dlsu= new GImage("assets/DLSU2.png");
        GImage john = new GImage("assets/lasalle.jpg");
        add(dlsu,0,0);
        john.setSize(130,280);
        add(john,(getWidth()-john.getWidth())/2+11,getHeight()-john.getHeight()+13);

        GOval circle=new GOval(90,90);
        circle.setFilled(true);
        circle.setFillColor(Color.decode("#2E8B57"));
        add(circle,(getWidth()-circle.getWidth())/2+14,396);

        GLabel number=new GLabel("300");
        number.setFont("Edwardian Script ITC-60");
        number.rotate(30);
        number.setColor(Color.WHITE);
        add(number,circle.getX()+number.getWidth()/2-35,circle.getY()+number.getHeight()+14);

        GLabel text=new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        text.setFont("Serif-40");
        text.setColor(Color.decode("#708090"));
        add(text,(getWidth()-text.getWidth())/2+12,340);

    }

    public void insertFlag1(int x, int y) {
        GRect blue = new GRect(getWidth()/7,getHeight()/2);
        blue.setFilled(true);
        blue.setFillColor(Color.blue);
        add(blue,x,y);

        GRect red = new GRect(getWidth()/7,getHeight()/2);
        red.setFilled(true);
        red.setFillColor(Color.red);
        add(red,x+red.getWidth(),y);

        GPolygon white = new GPolygon();
        white.addVertex(0,0);
        white.addVertex(blue.getWidth()*2,0);
        white.addVertex(blue.getWidth(),blue.getHeight()*2/5);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,x,y);

        GOval sun = new GOval(60,60);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);
        add(sun, red.getX()-sun.getWidth()/2, blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3+55);

        GPolygon north = new GPolygon();
        north.addVertex(-15,0);
        north.addVertex(0,5);
        north.addVertex(15,0);
        north.addVertex(0,-5);
        north.setFilled(true);
        north.setFillColor(Color.YELLOW);
        north.setColor(Color.YELLOW);
        north.rotate(90);
        add(north,152,400);

        GPolygon south = new GPolygon();
        south.addVertex(-15,0);
        south.addVertex(0,5);
        south.addVertex(15,0);
        south.addVertex(0,-5);
        south.setFilled(true);
        south.setFillColor(Color.YELLOW);
        south.setColor(Color.YELLOW);
        south.rotate(90);
        add(south,152,461);

        GPolygon east = new GPolygon();
        east.addVertex(-15,0);
        east.addVertex(0,5);
        east.addVertex(15,0);
        east.addVertex(0,-5);
        east.setFilled(true);
        east.setFillColor(Color.YELLOW);
        east.setColor(Color.YELLOW);
        east.rotate(0);
        add(east,183,430);

        GPolygon west = new GPolygon();
        west.addVertex(-15,0);
        west.addVertex(0,5);
        west.addVertex(15,0);
        west.addVertex(0,-5);
        west.setFilled(true);
        west.setFillColor(Color.YELLOW);
        west.setColor(Color.YELLOW);
        west.rotate(0);
        add(west,122,430);

        GPolygon northeast = new GPolygon();
        northeast.addVertex(-15,0);
        northeast.addVertex(0,5);
        northeast.addVertex(15,0);
        northeast.addVertex(0,-5);
        northeast.setFilled(true);
        northeast.setFillColor(Color.YELLOW);
        northeast.setColor(Color.YELLOW);
        northeast.rotate(45);
        add(northeast,174,409);

        GPolygon southwest = new GPolygon();
        southwest.addVertex(-15,0);
        southwest.addVertex(0,5);
        southwest.addVertex(15,0);
        southwest.addVertex(0,-5);
        southwest.setFilled(true);
        southwest.setFillColor(Color.YELLOW);
        southwest.setColor(Color.YELLOW);
        southwest.rotate(45);
        add(southwest,131,452);

        GPolygon northwest = new GPolygon();
        northwest.addVertex(-15,0);
        northwest.addVertex(0,5);
        northwest.addVertex(15,0);
        northwest.addVertex(0,-5);
        northwest.setFilled(true);
        northwest.setFillColor(Color.YELLOW);
        northwest.setColor(Color.YELLOW);
        northwest.rotate(135);
        add(northwest,130,409);

        GPolygon southeast = new GPolygon();
        southeast.addVertex(-15,0);
        southeast.addVertex(0,5);
        southeast.addVertex(15,0);
        southeast.addVertex(0,-5);
        southeast.setFilled(true);
        southeast.setFillColor(Color.YELLOW);
        southeast.setColor(Color.YELLOW);
        southeast.rotate(135);
        add(southeast,174,452);

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
        star1.rotate(530);
        add(star1,90,395);

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
        star2.rotate(560);
        add(star2,225,395);

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
        star3.rotate(500);
        add(star3,152,515);
    }

    public void insertFlag2(int x, int y) {
        GRect blue = new GRect(getWidth()/7,getHeight()/2);
        blue.setFilled(true);
        blue.setFillColor(Color.blue);
        add(blue,x,y);

        GRect red = new GRect(getWidth()/7,getHeight()/2);
        red.setFilled(true);
        red.setFillColor(Color.red);
        add(red,x+red.getWidth(),y);

        GPolygon white = new GPolygon();
        white.addVertex(0,0);
        white.addVertex(blue.getWidth()*2,0);
        white.addVertex(blue.getWidth(),blue.getHeight()*2/5);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
        add(white,x,y);

        GOval sun = new GOval(60,60);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        sun.setColor(Color.YELLOW);
        add(sun, red.getX()-sun.getWidth()/2, blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3+55);

        GPolygon north = new GPolygon();
        north.addVertex(-15,0);
        north.addVertex(0,5);
        north.addVertex(15,0);
        north.addVertex(0,-5);
        north.setFilled(true);
        north.setFillColor(Color.YELLOW);
        north.setColor(Color.YELLOW);
        north.rotate(90);
        add(north,505,400);

        GPolygon south = new GPolygon();
        south.addVertex(-15,0);
        south.addVertex(0,5);
        south.addVertex(15,0);
        south.addVertex(0,-5);
        south.setFilled(true);
        south.setFillColor(Color.YELLOW);
        south.setColor(Color.YELLOW);
        south.rotate(90);
        add(south,505,461);

        GPolygon east = new GPolygon();
        east.addVertex(-15,0);
        east.addVertex(0,5);
        east.addVertex(15,0);
        east.addVertex(0,-5);
        east.setFilled(true);
        east.setFillColor(Color.YELLOW);
        east.setColor(Color.YELLOW);
        east.rotate(0);
        add(east,536,430);

        GPolygon west = new GPolygon();
        west.addVertex(-15,0);
        west.addVertex(0,5);
        west.addVertex(15,0);
        west.addVertex(0,-5);
        west.setFilled(true);
        west.setFillColor(Color.YELLOW);
        west.setColor(Color.YELLOW);
        west.rotate(0);
        add(west,475,430);

        GPolygon northeast = new GPolygon();
        northeast.addVertex(-15,0);
        northeast.addVertex(0,5);
        northeast.addVertex(15,0);
        northeast.addVertex(0,-5);
        northeast.setFilled(true);
        northeast.setFillColor(Color.YELLOW);
        northeast.setColor(Color.YELLOW);
        northeast.rotate(45);
        add(northeast,527,409);

        GPolygon southwest = new GPolygon();
        southwest.addVertex(-15,0);
        southwest.addVertex(0,5);
        southwest.addVertex(15,0);
        southwest.addVertex(0,-5);
        southwest.setFilled(true);
        southwest.setFillColor(Color.YELLOW);
        southwest.setColor(Color.YELLOW);
        southwest.rotate(45);
        add(southwest,484,452);

        GPolygon northwest = new GPolygon();
        northwest.addVertex(-15,0);
        northwest.addVertex(0,5);
        northwest.addVertex(15,0);
        northwest.addVertex(0,-5);
        northwest.setFilled(true);
        northwest.setFillColor(Color.YELLOW);
        northwest.setColor(Color.YELLOW);
        northwest.rotate(135);
        add(northwest,483,409);

        GPolygon southeast = new GPolygon();
        southeast.addVertex(-15,0);
        southeast.addVertex(0,5);
        southeast.addVertex(15,0);
        southeast.addVertex(0,-5);
        southeast.setFilled(true);
        southeast.setFillColor(Color.YELLOW);
        southeast.setColor(Color.YELLOW);
        southeast.rotate(135);
        add(southeast,527,452);

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
        star1.rotate(530);
        add(star1,443,395);

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
        star2.rotate(560);
        add(star2,578,395);

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
        star3.rotate(500);
        add(star3,505,515);
    }

}
