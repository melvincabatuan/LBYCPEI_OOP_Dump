package module2.dong;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GLine;
import acm.program.*;
import java.awt.*;
public class Composition extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Composition()).start(args);
    }

    public void run(){
        GRect monitor = new GRect(150,100);
        add(monitor,100,50);

        monitor.setFilled(true);
        monitor.setColor(Color.BLACK);

        GRect screen = new GRect(130,80);
        add(screen, 110,60);
        screen.setFilled(true);
        screen.setColor(Color.white);

        GOval monitorStand = new GOval(40,15);
        add(monitorStand, 155,150);
        GLabel monitorText = new GLabel("Monitor");
        add(monitorText, 145,20);

        GOval mouse = new GOval(20,50);
        mouse.setFilled(true);
        mouse.setColor(Color.pink);
        add(mouse,300,200);

        GLabel mouseText = new GLabel("Mouse");
        add(mouseText,290,180);

        GLine mouseLine1 = new GLine(310,200,310,215);
        add(mouseLine1);

        GLine mouseLine2 = new GLine(300,215,320,215);
        add(mouseLine2);

        GRect keyboard = new GRect(250,100);
        add(keyboard,30,200 );
        keyboard.setFilled(true);
        keyboard.setColor(Color.green);

        GRect keyboardKeys1 = new GRect(110,80);
        add(keyboardKeys1, 40,210);

        GRect keyboardKeys2 = new GRect(50,80);
        add(keyboardKeys2, 160,210);

        GRect keyboardKeys3 = new GRect(50,80);
        add(keyboardKeys3, 220,210);

        GLabel keyboardText = new GLabel("Keyboard");
        add(keyboardText, 120,320);

        GRect CPU = new GRect(100,200);
        add(CPU, 360,90);
        CPU.setFilled(true);
        CPU.setColor(Color.darkGray);

        GRect box1 = new GRect(80,20);
        add(box1, 370,100);
        box1.setFilled(true);
        box1.setColor(Color.black);

        GRect box2 = new GRect(80,20);
        add(box2, 370,140);
        box2.setFilled(true);
        box2.setColor(Color.black);

        GLabel CPUText = new GLabel("CPU");
        add(CPUText,390,70);

        GLabel TEXT = new GLabel("COMPUTER");
        TEXT.setFont("Arial-bold-30");
        add(TEXT, 80,400);

        GLabel NAME = new GLabel("Created by: Dong, Neil");
        NAME.setColor(Color.orange);
        NAME.setFont("Arial-bold-20");
        add(NAME,200,430);
    }

}