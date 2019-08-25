package module2.llars;/*
Author: Lenard Ryan S. Llarenas
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

/*
Author: Lenard Ryan S. Llarenas
ID #: 11812508
Course & Section: LBYCPEI EQ3
Date: May 22, 2019
 */

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Aggregation extends GraphicsProgram {
    // Set the dimensions of window depending on image size 
    public static final int APPLICATION_WIDTH = 750;
    public static final int APPLICATION_HEIGHT = 750;

    // Solves java.lang.NoClassDefFoundError
    public static void main(String[] args) {
        (new Aggregation()).start(args);
    }

    public void run() {
        milkTea();
        pearls();
        addCaptions();
    }

    private void milkTea(){

        GRect straw = new GRect(25, 500);
        straw.setFilled(true);
        straw.setFillColor(Color.GRAY);
        add(straw, 310, 100);

        GPoint[] gt = new GPoint[4];
        gt[0]=new GPoint(207, 367);
        gt[1]=new GPoint(433, 367);
        gt[2]=new GPoint(410, 600);
        gt[3]=new GPoint(230, 600);
        GPolygon tea = new GPolygon(gt);
        tea.setFilled(true);
        tea.setFillColor(Color.PINK);
        add(tea);

        GPoint[] gpt = new GPoint[4];
        gpt[0]=new GPoint(200, 290);
        gpt[1]=new GPoint(440, 290);
        gpt[2]=new GPoint(410, 600);
        gpt[3]=new GPoint(230, 600);
        GPolygon glass = new GPolygon(gpt);
        add(glass);

    }

    private void pearls(){
        for(int x=230; x<=390;){
            GOval pearl = new GOval(20, 20);
            pearl.setFilled(true);
            pearl.setFillColor(Color.BLACK);
            add(pearl, x, 550);
            x=x+20;
        }
        for(int x=230; x<=390;){
            GOval pearl = new GOval(20, 20);
            pearl.setFilled(true);
            pearl.setFillColor(Color.BLACK);
            add(pearl, x, 575);
            x=x+20;
        }


    }

    private void addCaptions(){
        GLabel explain = new GLabel ("Pearl in Milk Tea is a weak relationship (aggregation)");
        explain.setFont("Serif-16");
        explain.setColor(Color.blue);
        add(explain, 400, 100);

        GLabel explain2 = new GLabel ("because consuming the pearls won't disregard");
        explain2.setFont("Serif-16");
        explain2.setColor(Color.blue);
        add(explain2, 400, 120);

        GLabel explain3 = new GLabel ("the drink's entire existence since the tea");
        explain3.setFont("Serif-16");
        explain3.setColor(Color.blue);
        add(explain3, 400, 140);

        GLabel explain4 = new GLabel ("still comprises the drink.");
        explain4.setFont("Serif-16");
        explain4.setColor(Color.blue);
        add(explain4, 400, 160);

        GLabel text = new GLabel("created by LENARD LLARENAS");
        text.setFont("Serif-italic-20");
        text.setColor(Color.RED);
        add(text, getWidth() - 300, getHeight() - 25);
    }

    }