package module2.toro;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Module2_3_B extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    public void run() {
        displayFries();
        displayLabels();
    }

    private void displayFries() {
        for (int i = 0; i< 8; i++) {
            double random_number = (Math.random() * 20) + 0;
            G3DRect fries = new G3DRect(20, 100);
            fries.setFilled(true);
            fries.setColor(Color.YELLOW);
            fries.setRaised(true);
            add(fries, 220 + (i * 23), 120 + random_number);
        }

        GRect table = new GRect(640, 200);
        table.setFillColor(Color.LIGHT_GRAY);
        table.setFilled(true);

        GPolygon container = new GPolygon();
        container.addVertex(0,0);
        container.addVertex(200,0);
        container.addVertex(180, 160);
        container.addVertex(20, 160);
        container.setFilled(true);
        container.setFillColor(Color.RED);

        GLabel logo = new GLabel("m");
        logo.setColor(Color.YELLOW);
        logo.setFont("SansSerif-bold-110");

        add(table,0,320);
        add(container, 210, 200);
        add(logo, 260, 300);
    }

    private void displayLabels() {
        GLabel fries_label = new GLabel("Fries");
        fries_label.setFont("Helvetica-15");

        GLabel container_label = new GLabel("Container");
        container_label.setFont("Helvetica-15");

        GLabel description = new GLabel("AGGREGATION: Both the fries and the container can live separately.");
        description.setFont("Helvetica-bold-15");

        GLabel text = new GLabel("Created by Matthew Toro");
        text.setFont("Helvetica-bold-15");

        add(fries_label, 160, 170);
        add(container_label, 420, 270);
        add(description, 20, 20);
        add(text, 440, 440);
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Module2_3_B()).start(args);
    }
}