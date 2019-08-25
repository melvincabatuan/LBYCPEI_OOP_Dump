package module2.go;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class DlsuFlag extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public static void main(String[] args) {
        (new DlsuFlag()).start(args);
    }

    public void run() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);

        GLabel lblDLSU = new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        lblDLSU.setFont("Serif-39");
        lblDLSU.setColor(Color.gray);
        add(lblDLSU, 65, 338);

        GRect flagLeftOne = new GRect(92, 400);
        flagLeftOne.setFilled(true);
        flagLeftOne.setColor(Color.BLUE);
        add(flagLeftOne, 61, 384);

        GRect flagLeftTwo = new GRect(92, 400);
        flagLeftTwo.setFilled(true);
        flagLeftTwo.setColor(Color.RED);
        add(flagLeftTwo, 153, 384);

        GRect flagRightOne = new GRect(92, 400);
        flagRightOne.setFilled(true);
        flagRightOne.setColor(Color.BLUE);
        add(flagRightOne, 415, 384);

        GRect flagRightTwo = new GRect(92, 400);
        flagRightTwo.setFilled(true);
        flagRightTwo.setColor(Color.RED);
        add(flagRightTwo, 507, 384);

        drawTriangle(61, 384);
        drawTriangle(415, 384);

        drawCircle(134, 420);
        drawCircle(488, 420);

        drawStar(80, 425);
        drawStar(200, 425);
        drawStar(435, 425);
        drawStar(555, 425);
        drawStar(140, 540);
        drawStar(495, 540);

        GImage delasalle = new GImage("assets/lasalle.jpg");
        delasalle.setSize(124, 252);
        add(delasalle, 271, 556);

        GOval threeHunred = new GOval(92, 92);
        threeHunred.setFilled(true);
        threeHunred.setFillColor(Color.GREEN);
        add(threeHunred, 288, 400);

        GLabel lblThreeHundred = new GLabel("300");
        lblThreeHundred.setColor(Color.WHITE);
        lblThreeHundred.setFont("Bodoni MT-60");
        lblThreeHundred.rotate(30);
        add(lblThreeHundred, 305, 485);

        rays(147, 396, 0);
        rays(501, 396, 0);

        rays(119, 411, 41);
        rays(473, 411, 41);

        rays(110, 447, 90);
        rays(463, 447, 90);

        rays(129, 479, 139);
        rays(483, 479, 139);

        rays(162, 485, 180);
        rays(515, 485, 180);

        rays(191, 467, 225);
        rays(545, 467, 225);

        rays(199, 432, 270);
        rays(553, 432, 270);

        rays(182, 404, 315);
        rays(535, 404, 315);

        name(getHeight(), getWidth());

    }


    public void drawTriangle(int x, int y) {
        GPolygon triangle = new GPolygon();
        triangle.addVertex(0, 0);
        triangle.addVertex(92 * 2, 0);
        triangle.addVertex(92, 400 * 2 / 5);
        triangle.setFilled(true);
        triangle.setFillColor(Color.WHITE);
        add(triangle, x, y);
    }

    public void drawCircle(int x, int y) {
        GOval circle = new GOval(40, 40);
        circle.setFilled(true);
        circle.setFillColor(Color.YELLOW);
        add(circle, x, y);
    }

    public void drawStar(int x, int y) {
        GLabel star = new GLabel("*");
        star.setFont("Wide Latin-55");
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