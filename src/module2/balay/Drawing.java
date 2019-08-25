package module2.balay;

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Drawing extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("made with java");
        GLabel text2 = new GLabel("nobody: You can't make a meme in Java");
        GLabel text3 = new GLabel("Observe.");
        text2.setFont("Arial-15");
        text3.setFont("Arial-15");
        text.setFont("Comic Sans MS-10");
      
        text.setColor(Color.RED);
        double x = (getWidth() - text.getWidth()) / 2;
        double y = (getHeight() + text.getAscent()) / 2;
        GOval circle = new GOval(100, 100);
        GOval circle1 = new GOval(50, 50);
        GOval circle2 = new GOval(50, 50);
        GOval circle3 = new GOval(70, 70);
        GOval circle4 = new GOval(70, 70);
        GRect box = new GRect(400,600);
        GRect box1 = new GRect(20,100);

        box.setFillColor(Color.BLUE);
        box.setColor(Color.BLACK);
        circle.setFillColor(Color.RED);
        circle.setColor(Color.RED);
        circle1.setFillColor(Color.RED);
        circle1.setColor(Color.RED);
        circle2.setFillColor(Color.RED);
        circle2.setColor(Color.RED);
        circle3.setFillColor(Color.BLACK);
        circle3.setColor(Color.BLACK);
        circle4.setFillColor(Color.BLACK);
        circle4.setColor(Color.BLACK);
        add(box, x,y);
        add(circle,x+(x/10),y*2.5);
        add(circle1,x+(x/2),y*3.1);
        add(circle2,x+(x/2),y*2.2);
        add(circle3,x+x,y*2.2);
        add(circle4,x+x,y*3);
        add(box1,x+x+(x/8),y*2.5);
        add(text, x+(x/10),y*4.7);
        add(text2,x+(x/10),y*1.5);
        add(text3,x+x,y*3.8);
    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new Drawing()).start(args);
    }
}