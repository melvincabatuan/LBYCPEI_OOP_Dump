/*
    Panes, Michael Ryan B.
    LBYCPEI EQ3
    06/01/19

 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class Art extends GraphicsProgram {

    public static final int APPLICATION_WIDTH = 510;
    public static final int APPLICATION_HEIGHT = 510;

    // Solves java.lang.NoClassDefFoundError 
    public static void main (String [] args){
        (new Art()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        makeFace();
        addName();
    }

    public void makeFace(){
        makeFaceBackground();
        makeGlasses();
        makeTeeth();
        makeNose();
    }

    public void makeTeeth(){

        GRect toothOne = new GRect(20,30);
        toothOne.setFilled(true);
        toothOne.setColor(Color.BLACK);
        toothOne.setFillColor(Color.WHITE);

        GRect toothTwo = new GRect(20,30);
        toothTwo.setFilled(true);
        toothTwo.setColor(Color.BLACK);
        toothTwo.setFillColor(Color.WHITE);

        GRect toothThree = new GRect(20,30);
        toothThree.setFilled(true);
        toothThree.setColor(Color.BLACK);
        toothThree.setFillColor(Color.WHITE);

        GRect toothFour = new GRect(20,30);
        toothFour.setFilled(true);
        toothFour.setColor(Color.BLACK);
        toothFour.setFillColor(Color.WHITE);

        GRect toothFive = new GRect(20,30);
        toothFive.setFilled(true);
        toothFive.setColor(Color.BLACK);
        toothFive.setFillColor(Color.WHITE);

        GRect toothSix = new GRect(20,30);
        toothSix.setFilled(true);
        toothSix.setColor(Color.BLACK);
        toothSix.setFillColor(Color.WHITE);

        GRect teethOne = new GRect(20,30);
        teethOne.setFilled(true);
        teethOne.setColor(Color.BLACK);
        teethOne.setFillColor(Color.WHITE);

        GRect teethTwo = new GRect(20,30);
        teethTwo.setFilled(true);
        teethTwo.setColor(Color.BLACK);
        teethTwo.setFillColor(Color.WHITE);

        GRect teethThree = new GRect(20,30);
        teethThree.setFilled(true);
        teethThree.setColor(Color.BLACK);
        teethThree.setFillColor(Color.WHITE);

        GRect teethFour = new GRect(20,30);
        teethFour.setFilled(true);
        teethFour.setColor(Color.BLACK);
        teethFour.setFillColor(Color.GREEN);

        GRect teethFive = new GRect(20,30);
        teethFive.setFilled(true);
        teethFive.setColor(Color.BLACK);
        teethFive.setFillColor(Color.WHITE);

        GRect teethSix = new GRect(20,30);
        teethSix.setFilled(true);
        teethSix.setColor(Color.BLACK);
        teethSix.setFillColor(Color.WHITE);

        add(toothOne, 83, 430);
        add(toothTwo, 103, 430);
        add(toothThree, 63, 430);
        add(toothFour, 123, 430);
        add(toothFive, 143, 430);
        add(toothSix, 43, 430);
        add(teethOne, 83, 400);
        add(teethTwo, 103, 400);
        add(teethThree, 63, 400);
        add(teethFour, 123, 400);
        add(teethFive, 143, 400);
        add(teethSix, 43, 400);
    }

    public void makeNose(){
        GPolygon Nose = new GPolygon ();
        Nose.setFilled(true);
        Nose.setFillColor(Color.BLACK);
        Nose.addEdge(0, 0);
        Nose.addEdge(-50, 200);
        Nose.addEdge(100,0);

        GOval mole = new GOval(20,20);
        mole.setFilled(true);
        mole.setColor(Color.BLACK);
        mole.setFillColor(Color.MAGENTA);

        GOval snort = new GOval(25,25);
        snort.setFilled(true);
        snort.setColor(Color.YELLOW);
        snort.setFillColor(Color.YELLOW);

        GRect snortTwo = new GRect(15,30);
        snortTwo.setFilled(true);
        snortTwo.setColor(Color.YELLOW);
        snortTwo.setFillColor(Color.YELLOW);

        add(snortTwo, 80,340);
        add(Nose, 105, 150);
        add(mole, 125,315);
        add(snort, 75,360);
    }

    public void makeFaceBackground(){
        GRect face = new GRect(150,400);
        face.setFilled(true);
        face.setColor(Color.PINK);
        face.setFillColor(Color.BLUE);

        add(face, 30, 70);

    }

    public void makeGlasses(){
        GOval eyesOne = new GOval(50,50);
        eyesOne.setFilled(true);
        eyesOne.setColor(Color.BLACK);
        eyesOne.setFillColor(Color.YELLOW);

        GOval eyesTwo = new GOval(50,50);
        eyesTwo.setFilled(true);
        eyesTwo.setColor(Color.BLACK);
        eyesTwo.setFillColor(Color.YELLOW);

        GRect frame = new GRect(60,11);
        frame.setFilled(true);
        frame.setColor(Color.BLACK);
        frame.setFillColor(Color.BLACK);

        add(frame, 90, 109);
        add(eyesOne, 45, 90);
        add(eyesTwo, 115, 90);
    }

    public void addName(){
        GLabel text = new GLabel("Ryan Panes");
        text.setFont("TimesRoman-italic-12");
        text.setColor(Color.RED);
        add(text,(getWidth()-80),(getHeight()-5));
    }
}
