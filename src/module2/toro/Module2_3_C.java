package module2.toro;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Module2_3_C extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 480;
    public void run() {
        displayFan();
        displayLabels();
    }

    private void displayFan() {
        GRoundRect stand = new GRoundRect(20, 250);
        stand.setFilled(true);
        stand.setColor(Color.LIGHT_GRAY);

        GOval circle = new GOval(40, 40);
        circle.setFilled(true);
        circle.setColor(Color.DARK_GRAY);

        GOval circle_big = new GOval(210, 210);

        GLine wind1 = new GLine(0, 0, 180, 0);
        wind1.setColor(Color.CYAN);

        GLine wind2 = new GLine(0, 0, 180, 0);
        wind2.setColor(Color.CYAN);

        GLine wind3 = new GLine(0, 0, 180, 0);
        wind3.setColor(Color.CYAN);

        add(stand, 150, 230);

        for (int i = 0; i <= 240; i+= 120) {
            GPolygon blade = new GPolygon();
            blade.setFilled(true);
            blade.setFillColor(Color.WHITE);
            blade.addVertex(0, 0);
            blade.addVertex(-30, -50);
            blade.addVertex(0, -100);
            blade.rotate(i);
            add(blade, 160, 240);
        }

        add(circle, 140, 220);
        add(circle_big, 55, 135);
        add(wind1, 300, 170);
        add(wind2, 350, 230);
        add(wind3, 300, 290);
    }

    private void displayLabels() {
        GLabel blade_label = new GLabel("Fan Blade");
        blade_label.setFont("Helvetica-15");

        GLabel fan_label = new GLabel("Fan");
        fan_label.setFont("Helvetica-15");

        GLabel description = new GLabel("COMPOSITION: A fan and its blades CANNOT function seperately.");
        description.setFont("Helvetica-bold-15");

        GLabel text = new GLabel("Created by Matthew Toro");
        text.setFont("Helvetica-bold-15");

        add(blade_label, 170, 190);
        add(fan_label, 260, 310);
        add(description, 20, 20);
        add(text, 440, 440);
    }

    public static void main (String [] args){    // Solves java.lang.NoClassDefFoundError 
        (new Module2_3_C()).start(args);
    }
}