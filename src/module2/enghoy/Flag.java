package module2.enghoy;/*
Author: Enghoy, Martin Adrian C.
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

/*
 * File: Main.java
 * ---------------------
 * Remember, if you change the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
public class Flag extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run(){
            GRect blue=new GRect(getWidth(),getHeight()/3);
            blue.setFilled(true);
            blue.setFillColor(Color.BLUE);
            add(blue,0,(getHeight()-blue.getHeight()*2)/2);

            GRect red=new GRect(getWidth(),getHeight()/3);
            red.setFilled(true);
            red.setFillColor(Color.RED);
            add(red,0,blue.getY()+blue.getHeight());

            GPolygon white=new GPolygon();
            white.addVertex(0,0);
            white.addVertex(0,blue.getHeight()*2);
            white.addVertex(getWidth()*2/5,blue.getHeight());
            white.setFilled(true);
            white.setFillColor(Color.WHITE);
            add(white,0,blue.getY());

            GOval sun=new GOval(white.getHeight()*2/9,white.getHeight()*2/9);
            sun.setFilled(true);
            sun.setFillColor(Color.YELLOW);
            add(sun,blue.getX()+sun.getHeight()*7/10,(red.getY()-sun.getWidth()/2));

            GPolygon wing1=new GPolygon();
            wing1.addVertex(15,0);
            wing1.addVertex(30,10);
            wing1.addVertex(22,40);
            wing1.addVertex(8,40);
            wing1.addVertex(0,10);
            wing1.setFilled(true);
            wing1.setFillColor(Color.YELLOW);
            add(wing1,sun.getX()+20,sun.getY()-40);

            GPolygon wing2=new GPolygon();
            wing2.addVertex(15,0);
            wing2.addVertex(30,10);
            wing2.addVertex(22,40);
            wing2.addVertex(8,40);
            wing2.addVertex(0,10);
            wing2.setFilled(true);
            wing2.setFillColor(Color.YELLOW);
            wing2.rotate(180);
            add(wing2,sun.getX()+50,sun.getY()+sun.getWidth()+38);

            GPolygon wing3=new GPolygon();
            wing3.addVertex(15,0);
            wing3.addVertex(30,10);
            wing3.addVertex(22,40);
            wing3.addVertex(8,40);
            wing3.addVertex(0,10);
            wing3.setFilled(true);
            wing3.setFillColor(Color.YELLOW);
            wing3.rotate(90);
            add(wing3,sun.getX()-40,sun.getY()+sun.getWidth()-19);

            GPolygon wing4=new GPolygon();
            wing4.addVertex(15,0);
            wing4.addVertex(30,10);
            wing4.addVertex(22,40);
            wing4.addVertex(8,40);
            wing4.addVertex(0,10);
            wing4.setFilled(true);
            wing4.setFillColor(Color.YELLOW);
            wing4.rotate(270);
            add(wing4,sun.getX()+38+sun.getWidth(),sun.getY()+sun.getWidth()-50);

            GPolygon wing5=new GPolygon();
            wing5.addVertex(15,0);
            wing5.addVertex(30,10);
            wing5.addVertex(22,40);
            wing5.addVertex(8,40);
            wing5.addVertex(0,10);
            wing5.setFilled(true);
            wing5.setFillColor(Color.YELLOW);
            wing5.rotate(45);
            add(wing5,sun.getX()-27,sun.getY()+sun.getWidth()-77);

            GPolygon wing6=new GPolygon();
            wing6.addVertex(15,0);
            wing6.addVertex(30,10);
            wing6.addVertex(22,40);
            wing6.addVertex(8,40);
            wing6.addVertex(0,10);
            wing6.setFilled(true);
            wing6.setFillColor(Color.YELLOW);
            wing6.rotate(135);
            add(wing6,sun.getX()-6,sun.getY()+sun.getWidth()+25);

            GPolygon wing7=new GPolygon();
            wing7.addVertex(15,0);
            wing7.addVertex(30,10);
            wing7.addVertex(22,40);
            wing7.addVertex(8,40);
            wing7.addVertex(0,10);
            wing7.setFilled(true);
            wing7.setFillColor(Color.YELLOW);
            wing7.rotate(225);
            add(wing7,sun.getX()+sun.getWidth()+23,sun.getY()+sun.getWidth()+5);

            GPolygon wing8=new GPolygon();
            wing8.addVertex(15,0);
            wing8.addVertex(30,10);
            wing8.addVertex(22,40);
            wing8.addVertex(8,40);
            wing8.addVertex(0,10);
            wing8.setFilled(true);
            wing8.setFillColor(Color.YELLOW);
            wing8.rotate(315);
            add(wing8,sun.getX()+sun.getWidth()+6,sun.getY()+sun.getWidth()-sun.getWidth()-27);

            GPolygon star1 = new GPolygon();
            star1.setFilled(true);
            star1.setColor(Color.BLACK);
            star1.setFillColor(Color.YELLOW);
            star1.addEdge(0, 0);
            star1.addEdge(-10, 6);
            star1.addEdge(6, -10);
            star1.addEdge(-10, -6);
            star1.addEdge(10, -2);
            star1.addEdge(6, -10);
            star1.addEdge(6, 10);
            star1.addEdge(10, 2);
            star1.addEdge(-10, 6);
            star1.addEdge(6, 10);
            star1.rotate(40);
            add(star1,blue.getX()+25, blue.getY()+45);

            GPolygon star2 = new GPolygon();
            star2.setFilled(true);
            star2.setColor(Color.BLACK);
            star2.setFillColor(Color.YELLOW);
            star2.addEdge(0, 0);
            star2.addEdge(-10, 6);
            star2.addEdge(6, -10);
            star2.addEdge(-10, -6);
            star2.addEdge(10, -2);
            star2.addEdge(6, -10);
            star2.addEdge(6, 10);
            star2.addEdge(10, 2);
            star2.addEdge(-10, 6);
            star2.addEdge(6, 10);
            star2.rotate(130);
            add(star2,blue.getX()+30, red.getY()+red.getHeight()-50);

            GPolygon star3 = new GPolygon();
            star3.setFilled(true);
            star3.setColor(Color.BLACK);
            star3.setFillColor(Color.YELLOW);
            star3.addEdge(0, 0);
            star3.addEdge(-10, 6);
            star3.addEdge(6, -10);
            star3.addEdge(-10, -6);
            star3.addEdge(10, -2);
            star3.addEdge(6, -10);
            star3.addEdge(6, 10);
            star3.addEdge(10, 2);
            star3.addEdge(-10, 6);
            star3.addEdge(6, 10);
            star3.rotate(270);
            add(star3,blue.getX()+210, red.getY());

            add(sun,blue.getX()+sun.getHeight()*7/10,(red.getY()-sun.getWidth()/2));

        }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new Flag()).start(args);
    }
}