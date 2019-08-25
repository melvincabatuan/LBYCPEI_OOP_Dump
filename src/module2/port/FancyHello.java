package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.GLabel;

import acm.program.*;

import java.awt.*;

public class FancyHello extends GraphicsProgram {

    public void run() {

        GLabel text = new GLabel("Hello LBYCPEI OOP!");;

        text.setFont("Impact-bold-36");

        text.setColor(Color.RED);

        double x = (getWidth() - text.getWidth()) / 2;

        double y = (getHeight() - text.getAscent()) / 2;

        add(text, x, y); // adding text label  to the center 

        add(text, x+50, y);

    }

    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new FancyHello()).start(args);
    }

}