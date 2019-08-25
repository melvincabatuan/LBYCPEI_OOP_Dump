package module2.fortiz;/*
 *
 * Fortiz, Patrick Ryan P.
 * LBYCPEI EQ3
 * 6/1/19
 *
 */

import acm.graphics.GLine;
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;
import java.awt.*;

public class Association extends GraphicsProgram{
    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 600;

    public void run(){
        setBackground(Color.GRAY);

        generateClock();
        generateText();
        generateSignature();
    }

    private void generateClock(){
        int ang, clockC, hoursC, coverC, middleX, middleY, handC;

        GOval clock = new GOval(300,300);
        clockC = (getWidth()-300)/2;

        hoursC = (getWidth())/2;

        GOval cover = new GOval(250,250);
        cover.setFilled(true);
        cover.setFillColor(Color.GRAY);
        cover.setColor(Color.GRAY);
        coverC = (getWidth()-250)/2;


        GOval middle = new GOval(20,20);
        middle.setFilled(true);
        middle.setFillColor(Color.BLACK);
        middleX = (getWidth()-20)/2;
        middleY = (getWidth()-30)/2;

        for(ang=0;ang<=360;ang+=30){
            GLine hours = new GLine();
            hours.setEndPointPolar(150,ang);
            add(hours, hoursC, hoursC);
        }

        GLine hand1 = new GLine();
        hand1.setEndPointPolar(100,330);
        handC = (getWidth())/2;

        GLine hand2 = new GLine();
        hand2.setEndPointPolar(75,270);
        add(cover, coverC, coverC);
        add(clock, clockC, clockC);
        add(middle, middleX, middleY);
        add(hand1, handC, handC);
        add(hand2, handC, handC);
    }

    private void generateText(){
        double textBoxX, textBoxY, textX;

        GRect textBox = new GRect(500,100);
        textBoxX = (getWidth()-500)/2;
        textBoxY = (getHeight()/2)+170;

        GLabel description1 = new GLabel("An analogy for ASSOCIATION:");
        description1.setFont("SansSerif-italic-16");
        description1.setColor(Color.YELLOW);

        GLabel description2 = new GLabel("A clock uses the gears inside it to move the hands that point the time.");
        description2.setFont("SansSerif-italic-12");
        description2.setColor(Color.YELLOW);
        textX = (getWidth() - description2.getWidth())/2;

        add(textBox, textBoxX, textBoxY);
        add(description1, textX, textBoxY+40);
        add(description2, textX, textBoxY+70);
    }
    private void generateSignature(){
        double x,y;

        GLabel name = new GLabel("Patrick Fortiz");
        name.setFont("SansSerif-italic-10");
        name.setColor(Color.ORANGE);
        x = getWidth() - name.getWidth();
        y = getHeight() - 5;

        add(name,x,y);
    }

    public static void main(String[] args){
        (new Association()).start(args);
    }
}
