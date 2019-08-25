package module2.enghoy;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Composition extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 900;
    public static final int APPLICATION_HEIGHT = 900;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Composition()).start(args);
    }

    public void run() {
        setWidth(APPLICATION_WIDTH);
        setHeight(APPLICATION_HEIGHT);
        drawClock();
        insertDescription();
    }


    public void drawClock(){
        GOval clockEdge = new GOval(675,675);
        clockEdge.setFilled(true);
        clockEdge.setFillColor(Color.BLACK);
        clockEdge.setColor(Color.BLACK);
        add(clockEdge, getWidth()/4-100,getHeight()/4-95);

        GOval clock = new GOval(650,650);
        clock.setFilled(true);
        clock.setFillColor(Color.LIGHT_GRAY);
        clock.setColor(Color.BLACK);
        add(clock, getWidth()/4-85,getHeight()/4-90);

        GLabel hour12 = new GLabel("12");
        hour12.setFont("Lucida-italic-40");
        hour12.setColor(Color.BLACK);
        add(hour12,getWidth()/2,getHeight()/4-40);

        GLabel hour11 = new GLabel("11");
        hour11.setFont("Lucida-italic-40");
        hour11.setColor(Color.BLACK);
        add(hour11,getWidth()/2-150,getHeight()/4);

        GLabel hour10 = new GLabel("10");
        hour10.setFont("Lucida-italic-40");
        hour10.setColor(Color.BLACK);
        add(hour10,getWidth()/2-250,getHeight()/4+95);

        GLabel hour8 = new GLabel("8");
        hour8.setFont("Lucida-italic-40");
        hour8.setColor(Color.BLACK);
        add(hour8,getWidth()/2-250,getHeight()/4+375);

        GLabel hour7 = new GLabel("7");
        hour7.setFont("Lucida-italic-40");
        hour7.setColor(Color.BLACK);
        add(hour7,getWidth()/2-150,getHeight()-200);

        GLabel hour6 = new GLabel("6");
        hour6.setFont("Lucida-italic-40");
        hour6.setColor(Color.BLACK);
        add(hour6,getWidth()/2+10,getHeight()-150);

        GLabel hour5 = new GLabel("5");
        hour5.setFont("Lucida-italic-40");
        hour5.setColor(Color.BLACK);
        add(hour5,getWidth()/2+150,getHeight()-200);


        GLabel hour4 = new GLabel("4");
        hour4.setFont("Lucida-italic-40");
        hour4.setColor(Color.BLACK);
        add(hour4,getWidth()/2+250,getHeight()/4+375);

        GLabel hour3 = new GLabel("3");
        hour3.setFont("Lucida-italic-40");
        hour3.setColor(Color.BLACK);
        add(hour3,getWidth()/2+275,getHeight()/4+235);

        GLabel hour2 = new GLabel("2");
        hour2.setFont("Lucida-italic-40");
        hour2.setColor(Color.BLACK);
        add(hour2,getWidth()/2+250,getHeight()/4+95);

        GLabel hour1 = new GLabel("1");
        hour1.setFont("Lucida-italic-40");
        hour1.setColor(Color.BLACK);
        add(hour1,getWidth()/2+150,getHeight()/4);

        GRect hourHand = new GRect(25,250);
        hourHand.setFilled(true);
        hourHand.setFillColor(Color.BLACK);
        hourHand.setColor(Color.LIGHT_GRAY);
        add(hourHand,getWidth()/2+10,getHeight()/4+20);

        GRect minuteHand = new GRect(25,300);
        minuteHand.setFilled(true);
        minuteHand.setFillColor(Color.BLACK);
        minuteHand.setColor(Color.LIGHT_GRAY);
        minuteHand.rotate(35);
        add(minuteHand,getWidth()/2,getHeight()-450);

        GOval handlePoint = new GOval(25,25);
        handlePoint.setFilled(true);
        handlePoint.setFillColor(Color.GRAY);
        handlePoint.setColor(Color.BLACK);
        add(handlePoint,getWidth()/2+10,getHeight()/2);




    }

    public void insertDescription(){
        GRect textBG = new GRect(355,150);
        textBG.setFilled(true);
        textBG.setFillColor(Color.GRAY);
        textBG.setColor(Color.BLACK);
        add(textBG,20,375);

        GLabel explanation = new GLabel("In the image shown, we have a clock");
        explanation.setFont("ComicSansMS-20");
        explanation.setColor(Color.BLACK);
        add(explanation,20,400);

        GLabel explanation2 = new GLabel("and its time hands. This is what" );
        explanation2.setFont("ComicSansMS-20");
        explanation2.setColor(Color.BLACK);
        add(explanation2,20,430);

        GLabel explanation3 = new GLabel("you call a Composition Relationship.");
        explanation3.setFont("ComicSansMS-20");
        explanation3.setColor(Color.BLACK);
        add(explanation3,20,460);

        GLabel explanation4 = new GLabel("Without the time hands, the clock");
        explanation4.setFont("ComicSansMS-20");
        explanation4.setColor(Color.BLACK);
        add(explanation4,20,490);

        GLabel explanation5 = new GLabel("can't do its purpose and vice versa.");
        explanation5.setFont("ComicSansMS-20");
        explanation5.setColor(Color.BLACK);
        add(explanation5,20,520);

    }
}