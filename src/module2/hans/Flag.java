package module2.hans;/*
Ongsitco Hans Alfonso A.
LBYCPEI
5/22/2019
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Flag extends GraphicsProgram {
    public static final Color flagYellow = new Color(255, 215, 0);

    public void run() {
        signature();
        blue();
        red();
        white();
        flagSun();
        stars();

    }

    private void blue() {
        GRect blue = new GRect(400, 100);
        add(blue, 100, 100);
        blue.setFilled(true);
        blue.setFillColor(Color.BLUE);
        blue.setColor(Color.BLUE);
    }

    private void red() {
        GRect red = new GRect(400, 100);
        add(red, 100, 200);
        red.setFilled(true);
        red.setFillColor(Color.RED);
        red.setColor(Color.RED);
    }

    private void white() {
        GPolygon white = new GPolygon();
        white.addVertex(0, 0);
        white.addVertex(0, 200);
        white.addVertex(175, 100);
        add(white, 100, 100);
        white.setFilled(true);
        white.setFillColor(Color.WHITE);
    }

    private void flagSun() {

        GOval sun = new GOval(45, 45);
        add(sun, 200 / 1.45, 175);
        sun.setFilled(true);
        sun.setFillColor(flagYellow);
        sun.setColor(flagYellow);

        GLine horizontalRay = new GLine(120, 199, 200, 199);
        add(horizontalRay);
        horizontalRay.setColor(flagYellow);

        GLine verticalRay = new GLine(160, 157, 160, 237);
        add(verticalRay);
        verticalRay.setColor(flagYellow);

        GLine diagonalRay1 = new GLine(130, 167, 190, 227);
        add(diagonalRay1);
        diagonalRay1.setColor(flagYellow);

        GLine diagonalRay2 = new GLine(130, 227, 190, 167);
        add(diagonalRay2);
        diagonalRay2.setColor(flagYellow);
    }

    private void stars() {
        GLabel star1 = new GLabel("*");
        add(star1, 230, 222);
        star1.setFont("Wide Latin-50");
        star1.setColor(flagYellow);

        GLabel star2 = new GLabel("*");
        add(star2, 200 / 1.54 - 23, 150);
        star2.setFont("Wide Latin-50");
        star2.setColor(flagYellow);

        GLabel star3 = new GLabel("*");
        add(star3, 200 / 1.54 - 23, 295);
        star3.setFont("Wide Latin-50");
        star3.setColor(flagYellow);
    }
    private void signature() {
        GLabel name = new GLabel("created by Hans Ongsitco");
        add(name, getWidth() - name.getWidth()-10, getHeight()-10);
    }

    public static void main(String[] args) {
        (new Flag()).start(args);
    }
}
