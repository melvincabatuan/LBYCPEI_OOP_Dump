package module2.toro;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Module2_3_A extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;

    public void run() {
        displayRestaurant();
        displayPerson();
        displayLabels();
    }

    private void displayRestaurant() {
        GRect building = new GRect(300, 200);
        building.setFilled(true);
        building.setColor(Color.LIGHT_GRAY);

        GRect door = new GRect(100, 80);
        door.setFilled(true);
        door.setFillColor(Color.CYAN);

        GRect signpost = new GRect(10, 200);
        signpost.setFilled(true);
        signpost.setColor(Color.LIGHT_GRAY);

        GRoundRect sign = new GRoundRect(60, 60);
        sign.setFilled(true);
        sign.setColor(Color.RED);

        GLabel logo = new GLabel("m");
        logo.setColor(Color.YELLOW);
        logo.setFont("SansSerif-bold-50");

        add(building, 200, 280);
        add(door, 300, 390);
        add(signpost, 550, 280);
        add(sign, 525, 220);
        add(logo, 533, 263);
    }

    private void displayPerson() {
        GPolygon body = new GPolygon();
        body.addVertex(15, 0);
        body.addVertex(35, 0);
        body.addVertex(50, 70);
        body.addVertex(0, 70);

        GOval head = new GOval(40, 40);
        head.setFilled(true);
        head.setFillColor(Color.WHITE);

        add(body, 35, 390);
        add(head, 40, 360);
    }

    private void displayLabels() {
        GLabel persontxt = new GLabel("Person");
        persontxt.setFont("Helvetica-15");

        GLabel mctxt = new GLabel("Restaurant");
        mctxt.setFont("Helvetica-15");

        GLabel description = new GLabel("ASSOCIATION: The person uses the food provided from the restaurant.");
        description.setFont("Helvetica-bold-15");

        GLabel text = new GLabel("Created by Matthew Toro");
        text.setFont("Helvetica-bold-15");

        add(persontxt, 35, 340);
        add(mctxt, 310, 250);
        add(description, 20, 20);
        add(text, 440, 440);
    }

    public static void main(String[] args) {    // Solves java.lang.NoClassDefFoundError 
        (new Module2_3_A()).start(args);
    }
}