package module2.sabu;

import acm.graphics.*;
import acm.program.GraphicsProgram;

import java.awt.*;

public class MyDrawing extends GraphicsProgram {

    public void run() {
        backgroundColor();
        finnQuote();
        finn();
        name();
    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new MyDrawing()).start(args);
    }

    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 600;

    private void finn(){
        topCurve();
        finnsFace();
        leftEye();
        rightEye();
        finnsSmile();
        leftEar();
        rightEar();
        leftLine();
        rightLine();
        bottomCurve();
    }

    private void topCurve(){
        GArc arc = new GArc(245,60,38,107);
        arc.setColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2) - 20;
        double y = ((getHeight() - arc.getHeight()) / 2) - 105;
        add(arc,x,y);
        GArc arc2 = new GArc(260,60,38,108);
        arc2.setColor(Color.WHITE);
        arc2.setFilled(true);
        arc2.setFillColor(Color.WHITE);
        double x1 = ((getWidth() - arc2.getWidth()) / 2) - 20;
        double y1 = ((getHeight() - arc2.getHeight()) / 2) - 95;
        add(arc2,x1,y1);
    }

    private void leftEar(){
        GArc arc = new GArc(65,110,20,160);
        arc.setColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2) - 118.2;
        double y = ((getHeight() - arc.getHeight()) / 2) - 110;
        add(arc,x,y);
        GArc arc2 = new GArc(64,110,20,160);
        arc2.setColor(Color.WHITE);
        arc2.setFilled(true);
        arc2.setFillColor(Color.WHITE);
        double x1 = ((getWidth() - arc2.getWidth()) / 2) - 117.5;
        double y1 = ((getHeight() - arc2.getHeight()) / 2) - 108;
        add(arc2,x1,y1);
    }

    private void rightEar(){
        GArc arc = new GArc(66,110,360,160);
        arc.setColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2) + 116;
        double y = ((getHeight() - arc.getHeight()) / 2) - 110;
        add(arc,x,y);
        GArc arc2 = new GArc(64,110,360,160);
        arc2.setColor(Color.WHITE);
        arc2.setFilled(true);
        arc2.setFillColor(Color.WHITE);
        double x1 = ((getWidth() - arc2.getWidth()) / 2) + 115.7;
        double y1 = ((getHeight() - arc2.getHeight()) / 2) - 108;
        add(arc2,x1,y1);
    }

    private void bottomCurve(){
        GArc arc = new GArc(300,40,180,180);
        arc.setColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2);
        double y = ((getHeight() - arc.getHeight()) / 2) + 80;
        add(arc,x,y);
        GArc arc2 = new GArc(300,40,190,180);
        arc2.setColor(Color.WHITE);
        arc2.setFilled(true);
        arc2.setFillColor(Color.WHITE);
        double x1 = ((getWidth() - arc2.getWidth()) / 2) - 2;
        double y1 = ((getHeight() - arc2.getHeight()) / 2) + 80;
        add(arc2,x1,y1);
    }

    private void finnsFace(){
        GOval face = new GOval(200,145);
        face.setColor(Color.BLACK);
        face.setFilled(true);
        face.setFillColor(Color.WHITE);
        double x = ((getWidth() - face.getWidth()) / 2);
        double y = ((getHeight() - face.getHeight()) / 2);
        add(face,x,y);
    }

    private void leftLine(){
        GLine line = new GLine(250,380,250,200);
        line.setColor(Color.BLACK);
        add(line);
    }

    private void rightLine(){
        GLine line = new GLine(550,380,550,200);
        line.setColor(Color.BLACK);
        add(line);
    }

    private void finnsSmile(){
        GArc smile = new GArc(50,20,210,125);
        smile.setColor(Color.BLACK);
        double x = ((getWidth() - smile.getWidth()) / 2);
        double y = ((getHeight() - smile.getHeight()) / 2) - 10;
        add(smile,x,y);
    }

    private void leftEye(){
        GArc arc = new GArc(10,14,0,360);
        arc.setFilled(true);
        arc.setFillColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2) - 50;
        double y = ((getHeight() - arc.getHeight()) / 2) - 15;
        add(arc,x,y);
    }

    private void rightEye(){
        GArc arc = new GArc(10,14,0,360);
        arc.setFilled(true);
        arc.setFillColor(Color.BLACK);
        double x = ((getWidth() - arc.getWidth()) / 2) + 50;
        double y = ((getHeight() - arc.getHeight()) / 2) - 15;
        add(arc,x,y);
    }

    private void finnQuote(){
        GLabel text = new GLabel("MATHEMATICAL!");
        text.setFont("Norwester-36");
        text.setColor(Color.BLUE);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = 100;
        add(text, x,y);
    }

    private void backgroundColor(){
        GRect bg = new GRect(800,600);
        bg.setFilled(true);
        bg.setFillColor(Color.lightGray);
        add(bg);
        GRect bg2 = new GRect(300,185);
        bg2.setColor(Color.WHITE);
        bg2.setFilled(true);
        bg2.setFillColor(Color.WHITE);
        double x1 = 250;
        double y1 = 195;
        add(bg2,x1,y1);
    }

    private void name(){
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Freestyle script-24");
        text.setColor(Color.BLACK);
        double x = 625;
        double y = 540;
        add(text, x,y);
    }

}