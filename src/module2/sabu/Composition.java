package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Composition extends GraphicsProgram {

    public void run() {
        color();
        trunk();
        leaves();
        texts();
    }

    public static void main(String[] args) { // Solves java.lang.NoClassDefFoundError
        (new Composition()).start(args);
    }

    private void leaves(){
        GOval leaf1 = new GOval(50,50);
        leaf1.setFillColor(Color.decode("#3A5F0B"));
        leaf1.setFilled(true);
        leaf1.setColor(Color.decode("#3A5F0B"));
        double x1 = 287;
        double y1 = 250;
        add(leaf1,x1,y1);
        GOval leaf2 = new GOval(50,50);
        leaf2.setFillColor(Color.decode("#3A5F0B"));
        leaf2.setFilled(true);
        leaf2.setColor(Color.decode("#3A5F0B"));
        double x2 = 257;
        double y2 = 230;
        add(leaf2,x2,y2);
        GOval leaf3 = new GOval(50,50);
        leaf3.setFillColor(Color.decode("#3A5F0B"));
        leaf3.setFilled(true);
        leaf3.setColor(Color.decode("#3A5F0B"));
        double x3 = 262;
        double y3 = 195;
        add(leaf3,x3,y3);
        GOval leaf4 = new GOval(50,50);
        leaf4.setFillColor(Color.decode("#3A5F0B"));
        leaf4.setFilled(true);
        leaf4.setColor(Color.decode("#3A5F0B"));
        double x4 = 275;
        double y4 = 165;
        add(leaf4,x4,y4);
        GOval leaf5 = new GOval(50,50);
        leaf5.setFillColor(Color.decode("#3A5F0B"));
        leaf5.setFilled(true);
        leaf5.setColor(Color.decode("#3A5F0B"));
        double x5 = 305;
        double y5 = 145;
        add(leaf5,x5,y5);
        GOval leaf6 = new GOval(50,50);
        leaf6.setFillColor(Color.decode("#3A5F0B"));
        leaf6.setFilled(true);
        leaf6.setColor(Color.decode("#3A5F0B"));
        double x6 = 342;
        double y6 = 135;
        add(leaf6,x6,y6);
        GOval leaf7 = new GOval(50,50);
        leaf7.setFillColor(Color.decode("#3A5F0B"));
        leaf7.setFilled(true);
        leaf7.setColor(Color.decode("#3A5F0B"));
        double x7 = 380;
        double y7 = 145;
        add(leaf7,x7,y7);
        GOval leaf8 = new GOval(50,50);
        leaf8.setFillColor(Color.decode("#3A5F0B"));
        leaf8.setFilled(true);
        leaf8.setColor(Color.decode("#3A5F0B"));
        double x8 = 410;
        double y8 = 165;
        add(leaf8,x8,y8);
        GOval leaf9 = new GOval(50,50);
        leaf9.setFillColor(Color.decode("#3A5F0B"));
        leaf9.setFilled(true);
        leaf9.setColor(Color.decode("#3A5F0B"));
        double x9 = 415;
        double y9 = 195;
        add(leaf9,x9,y9);
        GOval leaf10 = new GOval(50,50);
        leaf10.setFillColor(Color.decode("#3A5F0B"));
        leaf10.setFilled(true);
        leaf10.setColor(Color.decode("#3A5F0B"));
        double x10 = 417;
        double y10 = 228;
        add(leaf10,x10,y10);
        GOval leaf11 = new GOval(50,50);
        leaf11.setFillColor(Color.decode("#3A5F0B"));
        leaf11.setFilled(true);
        leaf11.setColor(Color.decode("#3A5F0B"));
        double x11 = 395;
        double y11 = 250;
        add(leaf11,x11,y11);
        GRect color = new GRect(300,180,125,105);
        color.setColor(Color.decode("#3A5F0B"));
        color.setFilled(true);
        color.setFillColor(Color.decode("#3A5F0B"));
        add(color);
    }


    private void trunk(){
        GRect bg = new GRect(333,280,65,190);
        bg.setColor(Color.decode("#A52A2A"));
        bg.setFilled(true);
        bg.setFillColor(Color.decode("#A52A2A"));
        add(bg);
        GArc bg3 = new GArc(30,360,90,90);
        bg3.setColor(Color.decode("#A52A2A"));
        bg3.setFilled(true);
        bg3.setFillColor(Color.decode("#A52A2A"));
        double a = 320;
        double b = 290;
        add(bg3,a,b);
        GArc bg4 = new GArc(30,360,90,-90);
        bg4.setColor(Color.decode("#A52A2A"));
        bg4.setFilled(true);
        bg4.setFillColor(Color.decode("#A52A2A"));
        double a1 = 381;
        double b1 = 290;
        add(bg4,a1,b1);
        GOval hole = new GOval(20,20);
        hole.setFilled(true);
        hole.setFillColor(Color.BLACK);
        double x = ((getWidth() - hole.getWidth())/2) - 10;
        double y = 330;
        add(hole,x,y);
    }

    private void texts(){
        GLabel explain = new GLabel("Trees provide oxygen. Without its leaves, trunk, or the" +
                " roots, oxygen would not be produced.");
        explain.setFont("Comic Sans-14");
        explain.setColor(Color.BLACK);
        double x = (getWidth() - explain.getWidth())/2;
        double y = 50;
        add(explain,x,y);
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Ostrich Sans Black-20");
        text.setColor(Color.BLACK);
        double x1 = 575;
        double y1 = 450;
        add(text,x1,y1);
    }

    private void color(){
        GRect bg = new GRect(754,470);
        bg.setFilled(true);
        bg.setFillColor(Color.decode("#87ceeb"));
        add(bg);
    }
}