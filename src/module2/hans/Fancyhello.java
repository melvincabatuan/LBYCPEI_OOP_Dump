package module2.hans;/*
Ongsitco Hans Alfonso A.
11813830
LBYCPEI
5/31/2019
 */
import acm.graphics.GLabel;
import acm.program.*;

import java.awt.*;

public class Fancyhello extends GraphicsProgram {
    public void run() {
        GLabel text = new GLabel("Hello LBYCPEI OOP!");
        text.setFont("Serif-italic-48");
        text.setColor(Color.GREEN);
        double x = ((getWidth() - text.getWidth()) / 2);
        double y = ((getHeight() - text.getAscent()) / 2);
        add(text, x, y);

    }

    public static void main(String[] args) {
        (new Fancyhello()).start(args);

    }
}