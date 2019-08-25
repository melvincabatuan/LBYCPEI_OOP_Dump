package module2.go;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Aggregation extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 500;

    public static void main(String[] args) {
        (new Aggregation()).start(args);
    }

    public void run() {

        GOval top = new GOval(100,30);
        GOval bottom = new GOval(100,30);
        top.setFilled(true);
        bottom.setFilled(true);
        top.setFillColor(Color.LIGHT_GRAY);
        bottom.setFillColor(Color.LIGHT_GRAY);
        add(top, 20,30);
        add(bottom,20,150);

        GLine left = new GLine(20,44,20,168);
        GLine right = new GLine(120,44,120,168);
        add(left);
        add(right);

        GOval water = new GOval(100,100);
        water.setFilled(true);
        water.setFillColor(Color.BLUE);
        add(water,180,70);

        GLabel lblWater = new GLabel("WATER");
        lblWater.setColor(Color.RED);
        lblWater.setFont("Calibri-24");
        add(lblWater, 189,65);

        GLabel textOne = new GLabel("The Bottle and the water can be");
        GLabel textTwo = new GLabel("separated yet the bottle is still a");
        GLabel textThree = new GLabel("bottle and water is still water");
        textOne.setFont("Times New Roman, 20");
        textThree.setFont("Times New Roman, 20");
        textTwo.setFont("Times New Roman, 20");
        add(textOne, 20, 300);
        add(textTwo, 20, 320);
        add(textThree, 20, 340);

        sign(getHeight(), getWidth());

    }


    public void sign(int height, int width) {
        GLabel name = new GLabel("Marc Christian Go");
        name.setFont("Segoe Script-18");
        name.setColor(Color.BLACK);
        add(name, width - name.getWidth(), height - name.getHeight());
    }
}