package module2.go;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Flag extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public static void main(String[] args) {
        (new Flag()).start(args);
    }

    public void run() {
        GRect blueRect = new GRect(640, 160);
        GRect redRect = new GRect(640, 160);
        blueRect.setFilled(true);
        redRect.setFilled(true);
        blueRect.setLineWidth(0);
        redRect.setLineWidth(0);
        blueRect.setFillColor(Color.BLUE);
        redRect.setFillColor(Color.RED);
        add(blueRect, 0, 20);
        add(redRect, 0, 20 + redRect.getHeight());
        drawTriangle(0, 20, redRect.getHeight() * 2, redRect.getWidth());
        GOval sun = new GOval(redRect.getHeight() / 3, redRect.getHeight() / 3);
        sun.setFilled(true);
        sun.setLineWidth(0);
        sun.setFillColor(Color.YELLOW);
        add(sun, 55, redRect.getY() - redRect.getHeight() / 6);

        drawStar(3, 95);
        drawStar(3, 327);
        drawStar(175, 211);

        rays(74, 129, 0);
        rays(40, 149, 45);
        rays(30, 188, 90);
        rays(51, 223, 135);
        rays(91, 232, 180);
        rays(124, 211, 225);
        rays(133, 170, 270);
        rays(113, 138, 315);

        name(getHeight(), getWidth());

    }

    public void drawTriangle(int x, int y, double height, double width) {
        GPolygon triangle = new GPolygon();
        triangle.addVertex(0, 0);
        triangle.addVertex(0, height);
        triangle.addVertex(width * 2 / 5, height / 2);
        triangle.setFilled(true);
        triangle.setLineWidth(0);
        triangle.setFillColor(Color.WHITE);
        add(triangle, x, y);
    }

    public void drawStar(int x, int y) {
        GLabel star = new GLabel("*");
        star.setFont("Wide Latin-70");
        star.setColor(Color.YELLOW);
        add(star, x, y);
    }

    public void rays(int x, int y, int angle) {
        GPolygon rays = new GPolygon();
        rays.addVertex(8, 0);
        rays.addVertex(16, 5);
        rays.addVertex(12, 25);
        rays.addVertex(3, 25);
        rays.addVertex(0, 5);
        rays.setFilled(true);
        rays.setLineWidth(0);
        rays.rotate(angle);
        rays.setFillColor(Color.YELLOW);
        add(rays, x, y);
    }

    public void name(int height, int width) {
        GLabel name = new GLabel("Marc Christian Go");
        name.setFont("Segoe Script-18");
        name.setColor(Color.BLACK);
        add(name, width - name.getWidth(), height - name.getHeight());
    }

}