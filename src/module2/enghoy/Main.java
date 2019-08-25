package module2.enghoy;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Main extends GraphicsProgram {
        // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;
    double x;
    double y;

    public void run() {
        template();
        firstLabel();
        putYears();
        stLasalle();
        philippineFlag(60,380);
        philippineFlag(415,380);
    }   // Solves java.lang.NoClassDefFoundError 

    public void template(){
        GImage dlsu = new GImage("DLSU2.png");
        add(dlsu);
    }

    public void firstLabel(){
        GRect dlsubg = new GRect(550,35);
        dlsubg.setFilled(true);
        dlsubg.setFillColor(Color.lightGray);
        dlsubg.setColor(Color.lightGray);

        GLabel name = new GLabel("• DE • LA • SALLE • UNIVERSITY •");
        name.setFont("Serif-italic-30");
        name.setColor(Color.gray);

        add(dlsubg,60,306);
        add(name,120,335);
    }

    public void putYears(){
        GRect yearsBg = new GRect(91,90);
        yearsBg.setFilled(true);
        yearsBg.setFillColor(Color.lightGray);
        yearsBg.setColor(Color.lightGray);

        GOval greenCircle = new GOval(91, 91);
        greenCircle.setFilled(true);
        greenCircle.setFillColor(Color.GREEN);
        greenCircle.setColor(Color.green);

        GLabel years = new GLabel("300");
        years.rotate(38);
        years.setFont("Lucida-italic-50");
        years.setColor(Color.white);

        add(yearsBg,288,399);
        add(greenCircle,289,400);
        add(years,310,485);

    }

    public void stLasalle(){
        GImage DeLaSalle = new GImage("lasalle.jpg");
        DeLaSalle.setSize(128,270);
        add(DeLaSalle,269,557);
    }

    public void philippineFlag(int x, int y){
            GRect blue=new GRect(getWidth()/7,getHeight()/2);
            blue.setFilled(true);
            blue.setFillColor(Color.BLUE);
            add(blue,x,y);

            GRect red=new GRect(getWidth()/7,getHeight()/2);
            red.setFilled(true);
            red.setFillColor(Color.RED);
            add(red,x+red.getWidth(),y);

            GPolygon white=new GPolygon();
            white.addVertex(0,0);
            white.addVertex(blue.getWidth()*2,0);
            white.addVertex(blue.getWidth(),blue.getHeight()*2/5);
            white.setFilled(true);
            white.setFillColor(Color.WHITE);
            add(white,x,y);

            GPolygon star1 = new GPolygon();
            star1.setFilled(true);
            star1.setColor(Color.BLACK);
            star1.setFillColor(Color.YELLOW);
            star1.addEdge(0, 0);
            star1.addEdge(-5, 3);
            star1.addEdge(3, -5);
            star1.addEdge(-5, -3);
            star1.addEdge(5, -1);
            star1.addEdge(3, -5);
            star1.addEdge(3, 5);
            star1.addEdge(5, 1);
            star1.addEdge(-5, 3);
            star1.addEdge(3, 5);
            star1.rotate(45);
            add(star1,blue.getX()+20, blue.getY()+15);

            GPolygon star2 = new GPolygon();
            star2.setFilled(true);
            star2.setColor(Color.BLACK);
            star2.setFillColor(Color.YELLOW);
            star2.addEdge(0, 0);
            star2.addEdge(-5, 3);
            star2.addEdge(3, -5);
            star2.addEdge(-5, -3);
            star2.addEdge(5, -1);
            star2.addEdge(3, -5);
            star2.addEdge(3, 5);
            star2.addEdge(5, 1);
            star2.addEdge(-5, 3);
            star2.addEdge(3, 5);
            star2.rotate(-45);
            add(star2,blue.getX()+160, blue.getY()+14);

            GPolygon star3 = new GPolygon();
            star3.setFilled(true);
            star3.setColor(Color.BLACK);
            star3.setFillColor(Color.YELLOW);
            star3.addEdge(0, 0);
            star3.addEdge(-5, 3);
            star3.addEdge(3, -5);
            star3.addEdge(-5, -3);
            star3.addEdge(5, -1);
            star3.addEdge(3, -5);
            star3.addEdge(3, 5);
            star3.addEdge(5, 1);
            star3.addEdge(-5, 3);
            star3.addEdge(3, 5);
            star3.rotate(180);
            add(star3,red.getX(), blue.getY()+blue.getHeight()*2/5-22);

            GOval sun=new GOval(white.getHeight()*2/9,white.getHeight()*2/9);
            sun.setFilled(true);
            sun.setFillColor(Color.YELLOW);
            add(sun,red.getX()-sun.getWidth()/2,blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3);

            GPolygon wing1=new GPolygon();
            wing1.addVertex(0,0);
            wing1.addVertex(7,8);
            wing1.addVertex(3,25);
            wing1.addVertex(-3,25);
            wing1.addVertex(-7,8);
            wing1.setFilled(true);
            wing1.setFillColor(Color.YELLOW);
            add(wing1,sun.getX()+sun.getWidth()/2,sun.getY()-wing1.getHeight());

            GPolygon wing2=new GPolygon();
            wing2.addVertex(0,0);
            wing2.addVertex(7,8);
            wing2.addVertex(3,25);
            wing2.addVertex(-3,25);
            wing2.addVertex(-7,8);
            wing2.rotate(180);
            wing2.setFilled(true);
            wing2.setFillColor(Color.YELLOW);
            add(wing2,sun.getX()+sun.getWidth()/2,sun.getY()+wing1.getHeight()+sun.getWidth());

            GPolygon wing3=new GPolygon();
            wing3.addVertex(0,0);
            wing3.addVertex(7,8);
            wing3.addVertex(3,25);
            wing3.addVertex(-3,25);
            wing3.addVertex(-7,8);
            wing3.rotate(90);
            wing3.setFilled(true);
            wing3.setFillColor(Color.YELLOW);
            add(wing3,sun.getX()-wing1.getHeight(),sun.getY()+sun.getWidth()/2);

            GPolygon wing4=new GPolygon();
            wing4.addVertex(0,0);
            wing4.addVertex(7,8);
            wing4.addVertex(3,25);
            wing4.addVertex(-3,25);
            wing4.addVertex(-7,8);
            wing4.rotate(-90);
            wing4.setFilled(true);
            wing4.setFillColor(Color.YELLOW);
            add(wing4,sun.getX()+wing1.getHeight()+sun.getWidth(),sun.getY()+sun.getWidth()/2);

            GPolygon wing5=new GPolygon();
            wing5.addVertex(0,0);
            wing5.addVertex(7,8);
            wing5.addVertex(3,25);
            wing5.addVertex(-3,25);
            wing5.addVertex(-7,8);
            wing5.rotate(45);
            wing5.setFilled(true);
            wing5.setFillColor(Color.YELLOW);
            add(wing5,sun.getX()-sun.getWidth()*3/10,sun.getY()-sun.getWidth()*3/10);

            GPolygon wing6=new GPolygon();
            wing6.addVertex(0,0);
            wing6.addVertex(7,8);
            wing6.addVertex(3,25);
            wing6.addVertex(-3,25);
            wing6.addVertex(-7,8);
            wing6.rotate(-45);
            wing6.setFilled(true);
            wing6.setFillColor(Color.YELLOW);
            add(wing6,sun.getX()+sun.getWidth()*3/10+sun.getWidth(),sun.getY()-sun.getWidth()*3/10);

            GPolygon wing7=new GPolygon();
            wing7.addVertex(0,0);
            wing7.addVertex(7,8);
            wing7.addVertex(3,25);
            wing7.addVertex(-3,25);
            wing7.addVertex(-7,8);
            wing7.rotate(135);
            wing7.setFilled(true);
            wing7.setFillColor(Color.YELLOW);
            add(wing7,sun.getX()-sun.getWidth()*3/10,sun.getY()+sun.getWidth()*3/10+sun.getWidth());

            GPolygon wing8=new GPolygon();
            wing8.addVertex(0,0);
            wing8.addVertex(7,8);
            wing8.addVertex(3,25);
            wing8.addVertex(-3,25);
            wing8.addVertex(-7,8);
            wing8.rotate(-135);
            wing8.setFilled(true);
            wing8.setFillColor(Color.YELLOW);
            add(wing8,sun.getX()+sun.getWidth()*3/10+sun.getWidth(),sun.getY()+sun.getWidth()*3/10+sun.getWidth());

            add(sun,red.getX()-sun.getWidth()/2,blue.getY()+blue.getHeight()*2/5-sun.getWidth()*10/3);
    }


    public static void main (String [] args){
        (new Main()).start(args);
    }
}

