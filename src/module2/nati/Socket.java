package module2.nati;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

import java.awt.*;

public class Socket {

    public void renderSocket(GCanvas c, double socketD, double x, double y)
    {
        double holeX = socketD/5;
        double holeY = (3*socketD)/5;
        double holeOffset = socketD/5;

        GRect socket = new GRect(socketD, socketD);
        GRect hole1 = new GRect(holeX, holeY);
        GRect hole2 = new GRect(holeX, holeY);

        hole1.setFillColor(Color.BLACK);
        hole2.setFillColor(Color.BLACK);
        hole1.setFilled(true);
        hole2.setFilled(true);

        c.add(socket,x,y);
        c.add(hole1,x+holeOffset,y+holeOffset);
        c.add(hole2,x+(holeOffset*3),y+holeOffset);
    }

}
