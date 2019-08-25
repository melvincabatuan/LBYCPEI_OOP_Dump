package module2.nati;

import acm.program.*;
import acm.graphics.GRect;
import acm.graphics.GLabel;

import java.awt.*;

public class Aggregation extends GraphicsProgram{

    public void run()
    {
        GRect colored = new GRect(100,100);
        GRect empty = new GRect(100,100);
        GLabel explanation = new GLabel("Aggregation: A box without its color is still a box.");

        colored.setFilled(true);
        colored.setFillColor(Color.GRAY);

        add(colored, 50, 50);
        add(empty, 200, 50);
        add(explanation, 50, 200);
    }

}
