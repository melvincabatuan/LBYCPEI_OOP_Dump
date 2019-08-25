package module2.nati;

import acm.graphics.GPolygon;

import java.awt.*;

public class GStar extends GPolygon{

    private static final int cCirc = 25;
    private static final int iCirc = 10;

    public GStar(float rotation)
    {
        for(int i = 0; i<=360; i+=360/5)
        {
            double rad = Math.toRadians(i);
            double x = cCirc*Math.cos(rad);
            double y = cCirc*Math.sin(rad);

            double newRad = Math.toRadians(i+36);
            double newX = iCirc*Math.cos(newRad);
            double newY = iCirc*Math.sin(newRad);

            addVertex(x,y);
            addVertex(newX,newY);

            setFilled(true);
            setFillColor(Color.YELLOW);

            rotate(rotation);
        }
    }

}
