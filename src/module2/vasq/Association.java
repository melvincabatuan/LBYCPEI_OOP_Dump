package module2.vasq;/*
 * Vasquez, Ralph Joshua V.
 * LBYCPEI EQ3
 * 06/01/19
 */

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class Association extends GraphicsProgram {


    public static final int APPLICATION_WIDTH = 600;
    public static final int APPLICATION_HEIGHT = 400;

    public void run() {
        titleText();
        airportDrawing();
        employee();
    }

    private void employee(){
        GRect body = new GRect(3,40);
        body.setFilled(true);
        add(body, getWidth()/2+164,175);

        GRect hands = new GRect(25,3);
        hands.setFilled(true);
        add(hands, getWidth()/2+153,187);

        GOval head = new GOval(30,30);
        head.setFillColor(Color.white);
        head.setColor(Color.black);
        head.setFilled(true);
        head.sendForward();
        add(head, getWidth()/2+150,150);

        GRect feet = new GRect(3,20);
        feet.setFilled(true);
        feet.rotate(35);
        add(feet, getWidth()/2+164,215);

        GRect feet2 = new GRect(3,20);
        feet2.setFilled(true);
        feet2.rotate(-35);
        add(feet2, getWidth()/2+163,215);

        GLabel title = new GLabel("Airport Employee"); //summoning an object
        title.setFont("Papyrus-bold-18");
        title.setColor(Color.black);
        add(title, getWidth() / 2 + 100, 135);
    }

    private void airportDrawing(){
        GRect signStand = new GRect(100,50);
        signStand.setFilled(true);

        add(signStand,160,120);

        GRect airport = new GRect(310,120);
        airport.setFillColor(Color.white);
        airport.setColor(Color.black);
        airport.setFilled(true);
        add(airport,50,getHeight()/2-20);

        GRect window = new GRect(50,100);
        window.setFillColor(Color.white);
        window.setColor(Color.black);
        window.setFilled(true);
        add(window,60,getHeight()/2);

        GRect window2 = new GRect(50,100);
        window2.setFillColor(Color.white);
        window2.setColor(Color.black);
        window2.setFilled(true);
        add(window2,120,getHeight()/2);

        GRect window3 = new GRect(50,100);
        window3.setFillColor(Color.white);
        window3.setColor(Color.black);
        window3.setFilled(true);
        add(window3,180,getHeight()/2);

        GRect window4 = new GRect(50,100);
        window4.setFillColor(Color.white);
        window4.setColor(Color.black);
        window4.setFilled(true);
        add(window4,240,getHeight()/2);

        GRect window5 = new GRect(50,100);
        window5.setFillColor(Color.white);
        window5.setColor(Color.black);
        window5.setFilled(true);
        add(window5,300,getHeight()/2);

        GRect sign = new GRect(175,50);
        sign.setFillColor(Color.white);
        sign.setColor(Color.black);
        sign.setFilled(true);

        add(sign,120,113);

        GLabel title = new GLabel("AIRPORT"); //summoning an object
        title.setFont("Papyrus-bold-25");
        title.setColor(Color.black);
        add(title, getWidth() / 2 - 160, 145);
    }

    private void titleText(){

        GLabel title = new GLabel("ASSOCIATION"); //summoning an object
        title.setFont("Bahnschrift-bold-30");
        title.setColor(Color.black);
        add(title, getWidth() / 2 - 100, 50);


        GLabel text = new GLabel("Vasquez, Ralph \nJoshua V."); //summoning an object
        text.setFont("Bahnschrift-bold-12");
        text.setColor(Color.black);
        add(text, 450, 350);
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Association()).start(args);
    }
}