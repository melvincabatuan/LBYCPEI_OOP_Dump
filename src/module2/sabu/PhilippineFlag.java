package module2.sabu;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class PhilippineFlag extends GraphicsProgram {

    public void run() {
        blueRectangle();
        redRectangle();
        whitePolygon();
    }

    public static void main(String[] args) { // Solves java.lang.NoClassDefFoundError
        (new PhilippineFlag()).start(args);
    }

    private void blueRectangle() {
        GRect top = new GRect(250, 75);
        top.setFilled(true);
        top.setFillColor(Color.BLUE);
        double x = ((getWidth() - top.getWidth()) / 2);
        double y = ((getHeight() - top.getHeight()) / 2) - 75;
        add(top, x, y);
    }

    private void redRectangle() {
        GRect bottom = new GRect(250, 75);
        bottom.setFilled(true);
        bottom.setFillColor(Color.RED);
        double x = ((getWidth() - bottom.getWidth()) / 2);
        double y = ((getHeight() - bottom.getHeight()) / 2);
        add(bottom, x, y);
    }

    private void whitePolygon(){
        GPolygon triangle = new GPolygon();
        triangle.addVertex(-80, 30);
        triangle.addEdge(80, 75);
        triangle.addEdge(-80, 74);
        triangle.setColor(Color.BLACK);
        triangle.setFillColor(Color.WHITE);
        triangle.setFilled(true);
        double x = 331;
        double y = 91;
        //double x = ((getWidth() - triangle.getWidth()) / 2) - 40;
        //double y = ((getHeight() - triangle.getHeight()) / 2) + 3;
        add(triangle,x,y);
    }
}