package module2.panes;/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRoundRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Composition extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 750;
    public static final int APPLICATION_HEIGHT = 750;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Composition()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makeImage();
        makeExplanation();
        addName();
    }

    public void makeImage(){
        makeCamera();
        makeLens();
    }

    public void makeCamera(){
        GPolygon camera = new GPolygon();
        camera.setFilled(true);
        camera.setFillColor(Color.RED);
        camera.setColor(Color.BLACK);
        camera.addEdge(0,0);
        camera.addEdge(300,0);
        camera.addEdge(25,-50);
        camera.addEdge(50,0);
        camera.addEdge(25,50);
        camera.addEdge(300,0);
        camera.addEdge(0,250);
        camera.addEdge(-700,0);

        GPolygon camera1 = new GPolygon();
        camera1.setFilled(true);
        camera1.setFillColor(Color.BLACK);
        camera1.setColor(Color.BLACK);
        camera1.addEdge(0,0);
        camera1.addEdge(305,0);
        camera1.addEdge(25,-50);
        camera1.addEdge(70,0);
        camera1.addEdge(25,50);
        camera1.addEdge(305,0);
        camera1.addEdge(0,272);
        camera1.addEdge(-730,0);


        GOval circle = new GOval(235,235);
        circle.setFilled(true);
        circle.setFillColor(Color.BLACK);
        circle.setColor(Color.BLACK);

        GOval circle1 = new GOval(210,210);
        circle1.setFilled(true);
        circle1.setFillColor(Color.GREEN);
        circle1.setColor(Color.BLACK);

        GRoundRect powerButton = new GRoundRect(40,40);
        powerButton.setFilled(true);
        powerButton.setFillColor(Color.BLACK);
        powerButton.setColor(Color.BLACK);

        GOval flash = new GOval(60,40);
        flash.setFilled(true);
        flash.setFillColor(Color.YELLOW);
        flash.setColor(Color.BLACK);

        add(camera1,5,70);
        add(camera,20,80);
        add(circle,255,85);
        add(circle1,268,98);
        add(powerButton,670,90);
        add(flash,45,95);
    }

    public void makeLens(){
        GOval circle = new GOval(235,235);
        circle.setFilled(true);
        circle.setFillColor(Color.BLACK);
        circle.setColor(Color.BLACK);

        GOval circle1 = new GOval(210,210);
        circle1.setFilled(true);
        circle1.setFillColor(Color.GREEN);
        circle1.setColor(Color.BLACK);

        add(circle,400,400);
        add(circle1,413,413);
    }

    public void makeExplanation(){
        GLabel explanation = new GLabel("In this relationship,");
        explanation.setFont("Lucida-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,400);

        GLabel explanation2 = new GLabel("we have the camera and the lens." );
        explanation2.setFont("Lucida-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,430);

        GLabel explanation3 = new GLabel("In this composition relationship,");
        explanation3.setFont("Lucida-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,460);

        GLabel explanation4 = new GLabel("without the lens, the camera cannot");
        explanation4.setFont("Lucida-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,20,490);

        GLabel explanation5 = new GLabel("work and vise versa.");
        explanation5.setFont("Lucida-20");
        explanation5.setColor(Color.BLACK);
        add(explanation5,20,520);

    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text, (getWidth() - 80), (getHeight() - 25));
    }
}