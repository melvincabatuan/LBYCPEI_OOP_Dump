package module2.toro;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Module2_4 extends GraphicsProgram {
    // Set the dimensions of window depending on image size
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {

        GImage dlsu = new GImage("assets/DLSU2.png");

        GLabel text = new GLabel("• DE • LA • SALLE • UNIVERSITY •");
        text.setFont("Serif-bold-31");

        GOval oval = new GOval(100,100);
        oval.setColor(Color.GREEN);
        oval.setFilled(true);

        GLabel threehundred = new GLabel("300");
        threehundred.setFont("SansSerif-italic-55");
        threehundred.setColor(Color.WHITE);

        GImage lasalle = new GImage("assets/lasalle.jpg");
        lasalle.scale(0.70, 0.95);

        add(dlsu);
        add(text, 76, 334);
        add(oval, 284, 391);
        add(threehundred,285, 459);
        add(lasalle, 269, 557);
        addFlag(60, 384);
        addFlag(415, 384);
    }

    private void addFlag(int x, int y) {
        GRect blue = new GRect(91.5,402);
        blue.setColor(Color.BLUE);
        blue.setFilled(true);

        GRect red = new GRect(91.5,402);
        red.setColor(Color.RED);
        red.setFilled(true);

        GPoint[] gp = new GPoint[3];
        gp[0] = new GPoint(x,y);
        gp[1] = new GPoint(x + 183, y);
        gp[2] = new GPoint(x + 91.5,y + 183);

        GPolygon white = new GPolygon(gp);
        white.setColor(Color.WHITE);
        white.setFilled(true);

        GOval sun_center = new GOval(30, 30);
        sun_center.setColor(Color.YELLOW);
        sun_center.setFilled(true);

        GLine sun_ray1 = new GLine(0, 0, 0, 60);
        sun_ray1.setColor(Color.YELLOW);

        GLine sun_ray2 = new GLine(0, 0, 60, 0);
        sun_ray2.setColor(Color.YELLOW);

        GLine sun_ray3 = new GLine(0, 0, 45, 45);
        sun_ray3.setColor(Color.YELLOW);

        GLine sun_ray4 = new GLine(45, 0, 0, 45);
        sun_ray4.setColor(Color.YELLOW);

        add(blue, x, y);
        add(red, x + 91.5, y);
        add(white, 0, 0);
        add(sun_center, x + 76.5, y + 55);
        add(sun_ray1, x + 91.5, y + 40);
        add(sun_ray2, x + 61.5, y + 70);
        add(sun_ray3, x + 68, y + 50);
        add(sun_ray4, x + 113, y + 50);
        createStar(x + 18, y + 18);
        createStar(x + 167, y + 18);
        createStar(x + 90, y + 167);
    }

    private void createStar(int x, int y) {
        GPolygon star = new GPolygon();
        star.setColor(Color.YELLOW);
        star.setFilled(true);
        star.addPolarEdge(6,108);
        star.addPolarEdge(6,180);
        star.addPolarEdge(6,36);
        star.addPolarEdge(6,108);
        star.addPolarEdge(6,333);
        star.addPolarEdge(6,36);
        star.addPolarEdge(6,252);
        star.addPolarEdge(6,333);
        star.addPolarEdge(6,180);
        star.addPolarEdge(6,252);
        add(star, x, y);
    }

    // Solves java.lang.NoClassDefFoundError
    public static void main (String [] args){
        (new Module2_4()).start(args);
    }
}