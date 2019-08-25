package module2.go;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Art extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    public static void main(String[] args) {
        (new Art()).start(args);
    }

    public void run() {

        GRect head = new GRect(200, 150);
        head.setLineWidth(3);
        head.setFilled(true);
        head.setFillColor(Color.LIGHT_GRAY);
        add(head, 150, 100);

        GLine antennaeOne = new GLine(170, 70, 220, 100);
        GLine antennaeTwo = new GLine(330, 70, 280, 100);
        antennaeOne.setLineWidth(2);
        antennaeTwo.setLineWidth(2);

        add(antennaeOne);
        add(antennaeTwo);

        GOval circleAntennaOne = new GOval(20, 20);
        GOval circleAntennaTwo = new GOval(20, 20);
        GOval eyeLeft = new GOval(40, 40);
        GOval eyeRight = new GOval(45, 30);
        circleAntennaOne.setLineWidth(2);
        circleAntennaTwo.setLineWidth(2);
        eyeLeft.setFillColor(Color.RED);
        eyeRight.setFillColor(Color.RED);


        add(circleAntennaOne, 151, 52);
        add(circleAntennaTwo, 329, 52);
        add(eyeLeft, 190, 120);
        add(eyeRight, 275, 125);
        int count = 0;
        for (count = 0; count < 5; count++) {
            teeth(200 + (20 * count), 190);
        }

        GLabel name = new GLabel("Bobot the Bot");
        name.setFont("Segoe Script-30");
        add(name, (getWidth() - name.getWidth()) / 2, 290);

        sign(getHeight(), getWidth());

    }

    public void teeth(int x, int y) {
        GRect teeth = new GRect(20, 30);
        teeth.setFilled(true);
        teeth.setFillColor(Color.WHITE);
        add(teeth, x, y);

    }


    public void sign(int height, int width) {
        GLabel name = new GLabel("Marc Christian Go");
        name.setFont("Segoe Script-18");
        name.setColor(Color.BLACK);
        add(name, width - name.getWidth(), height - name.getHeight());
    }
}