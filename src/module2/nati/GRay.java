package module2.nati;

import acm.graphics.GPolygon;

import java.awt.*;

public class GRay extends GPolygon {
    public GRay(double rotation)
    {
        double height = 45+40;
        double offset = height*java.lang.Math.tan(java.lang.Math.toRadians(11.25));

        addVertex(0,0);
        addVertex(-offset,height);
        addVertex(0,height+10);
        addVertex(offset,height);

        setFilled(true);
        setFillColor(Color.YELLOW);

        rotate(rotation);

    }
}
