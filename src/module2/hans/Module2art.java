package module2.hans;/*
Ongsitco Hans Alfonso A.
LBYCPEI
5/31/2019
 */
import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Module2art extends GraphicsProgram{
    public static final int APPLICATION_WIDTH=640;
    public static final int APPLICATION_HEIGHT=480;
    public static final Color bodyColor = new Color(255, 215, 0);
    public void run(){
        billBody();
        billHat();
        billEye();
        signature();

    }
    private void billBody(){
        GPolygon body= new GPolygon();
        body.addVertex(0,180);
        body.addVertex(200,180);
        body.addVertex(100,0);
        body.setFilled(true);
        body.setFillColor(bodyColor);
        add(body,150,200);
    }
    private void billHat(){
        GRect hatBase = new GRect(40, 10);
        add(hatBase, 230, 195);
        hatBase.setFilled(true);
        hatBase.setFillColor(Color.BLACK);

        GRect topHat = new GRect(20, 70);
        add(topHat, 240, 125);
        topHat.setFilled(true);
        topHat.setFillColor(Color.BLACK);
    }
    private void billEye(){
        GOval eye = new GOval(40, 30);
        add(eye, 230, 255);
        eye.setFilled(true);
        eye.setFillColor(Color.WHITE);

        GOval pupil = new GOval(20, 30);
        add(pupil, 240, 255);
        pupil.setFilled(true);
        pupil.setFillColor(Color.BLACK);

    }
    private void signature() {
        GLabel name = new GLabel("created by Hans Ongsitco");
        add(name, getWidth() - name.getWidth()-10, getHeight()-10);
    }

    public static void main (String [] args){
        (new Module2art()).start(args);
    }
}