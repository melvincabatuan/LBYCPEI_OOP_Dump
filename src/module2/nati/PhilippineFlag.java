package module2.nati;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class PhilippineFlag extends GraphicsProgram {

    public static final int APPLICATION_WIDTH  = 900;
    public static final int APPLICATION_HEIGHT = 450;


    public void run()
    {
        int c = APPLICATION_HEIGHT;
        int b = APPLICATION_HEIGHT/2;
        float pythagorean = ((c*c) - (b*b));
        double triangleVertex = Math.sqrt(pythagorean);

        GRect topRect = new GRect(APPLICATION_WIDTH*1, APPLICATION_HEIGHT/2);
        GRect botRect = new GRect(APPLICATION_WIDTH*1, APPLICATION_HEIGHT/2);
        GPolygon triangle = new GPolygon();

        GOval sun = new GOval(90,90);

        triangle.addVertex (triangleVertex, b);
        triangle.addVertex (0,0);
        triangle.addVertex (0,APPLICATION_HEIGHT);

        topRect.setFilled(true);
        botRect.setFilled(true);
        triangle.setFilled(true);
        sun.setFilled(true);
        topRect.setFillColor(Color.BLUE);
        botRect.setFillColor(Color.RED);
        triangle.setFillColor(Color.WHITE);
        sun.setFillColor(Color.YELLOW);

        add(topRect, 0, 0);
        add(botRect, 0, APPLICATION_HEIGHT/2);
        add(triangle, 0,0);

        for(float i = 0; i<=360; i+=360/8)
        {
            GRay ray = new GRay(i);
            add(ray,140,APPLICATION_HEIGHT/2);
        }

        GStar rightStar = new GStar(0);
        add(rightStar,triangleVertex-90,APPLICATION_HEIGHT/2);
        GStar bottomStar = new GStar(-110);
        add(bottomStar,100*java.lang.Math.cos(java.lang.Math.toRadians(70)),APPLICATION_HEIGHT - 70*java.lang.Math.sin(java.lang.Math.toRadians(70)));
        GStar topStar = new GStar(110);
        add(topStar,100*java.lang.Math.cos(java.lang.Math.toRadians(70)),70*java.lang.Math.sin(java.lang.Math.toRadians(70)));
        add(sun, 95,APPLICATION_HEIGHT/2-45);
    }

    public static void main (String[] args)
    {
        (new PhilippineFlag()).start(args);
    }
}
