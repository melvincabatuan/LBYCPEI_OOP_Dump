package module2.aldon;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PartialFlag extends GraphicsProgram {
    public void run() {

//        GLabel text = new GLabel("Hello LBYCPEI OOP!");
//
//        text.setFont("Serif-italic-48");
//        text.setColor(Color.RED);
//        double x = (getWidth() - text.getWidth()) / 2;
//        double y = (getHeight() + text.getAscent()) / 2;
//        add(text, x, y); // adding text label to the center


        GCanvas canvas = new GCanvas();

        GRect redBox = new GRect(getWidth(), getHeight());
        redBox.setFilled(true);
        redBox.setFillColor(Color.RED);
        redBox.setColor(Color.RED);
        add(redBox);

        GRect blueBox = new GRect(getWidth(), getHeight()/2);
        blueBox.setFilled(true);
        blueBox.setFillColor(Color.BLUE);
        blueBox.setColor(Color.BLUE);
        add(blueBox);

        GPolygon whiteTriangle = new GPolygon();
        whiteTriangle.addVertex(0, 0);
        whiteTriangle.addVertex(380, getHeight()/2);
        whiteTriangle.addVertex(0, getHeight());
        whiteTriangle.setFilled(true);
        whiteTriangle.setFillColor(Color.WHITE);
        whiteTriangle.setColor(Color.WHITE);
        add(whiteTriangle);




    }
    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError
        (new PartialFlag()).start(args);
    }
}
