package module2.nati;

import acm.program.*;
import acm.graphics.GRect;
import acm.graphics.GOval;
import acm.graphics.GCanvas;
import java.awt.*;

public class Plug extends GraphicsProgram{

    public void renderPlug(GCanvas c, double plugX, double plugY, double x, double y)
    {
        double metalX = plugX/2;
        double metalY = plugY/5;
        double wireX = plugX*2;
        double wireY = plugY/5;

        GRect mainPlug = new GRect(plugX, plugY);
        GRect metal1 = new GRect(metalX, metalY);
        GRect metal2 = new GRect(metalX, metalY);
        GRect wire = new GRect(wireX, wireY);
        GOval mainPlug2 = new GOval(plugX,plugY);

        mainPlug.setColor(Color.DARK_GRAY);
        mainPlug.setFillColor(Color.DARK_GRAY);
        mainPlug2.setColor(Color.DARK_GRAY);
        mainPlug2.setFillColor(Color.DARK_GRAY);
        metal1.setColor(Color.LIGHT_GRAY);
        metal1.setFillColor(Color.LIGHT_GRAY);
        metal2.setColor(Color.LIGHT_GRAY);
        metal2.setFillColor(Color.LIGHT_GRAY);
        wire.setColor(Color.DARK_GRAY);
        wire.setFillColor(Color.DARK_GRAY);

        mainPlug.setFilled(true);
        mainPlug2.setFilled(true);
        metal1.setFilled(true);
        metal2.setFilled(true);
        wire.setFilled(true);

        c.add(metal1, x - metalX, y+metalY);
        c.add(metal2, x - metalX, y+(metalY*3));
        c.add(mainPlug, x, y);
        c.add(mainPlug2, x+(plugX/2), y);
        c.add(wire, x+plugX, y+(wireY*2));
    }
}
