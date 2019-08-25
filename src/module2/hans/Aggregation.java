package module2.hans;/*
Ongsitco Hans Alfonso A.
LBYCPEI
5/31/2019
 */
import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Aggregation extends GraphicsProgram{
    public static final int APPLICATION_WIDTH=640;
    public static final int APPLICATION_HEIGHT=480;

    public void run(){
        pencil();
        pencilcase();
        explanation();
        signature();

    }
    private void pencil(){
        GRect body = new GRect(10, 60);
        add(body, 240, 125);
        body.setFilled(true);
        body.setFillColor(Color.YELLOW);

        GPolygon point= new GPolygon();
        point.addVertex(0,15);
        point.addVertex(10,15);
        point.addVertex(5,0);
        point.setFilled(true);
        point.setFillColor(Color.BLACK);
        add(point,240,110);

        GRect eraser = new GRect(10, 10);
        add(eraser, 240, 185);
        eraser.setFilled(true);
        eraser.setFillColor(Color.RED);
    }
    private void pencilcase(){
        GRect pcase = new GRect(20, 80);
        add(pcase, 270, 115);
        pcase.setFilled(true);
        pcase.setFillColor(Color.BLUE);

    }
    private void explanation(){
        GLabel words = new GLabel("A pencil can be a part of a pencil case but the pencil case does not need a pencil to exist");
        add(words, 10, 250);
    }

    private void signature() {
        GLabel name = new GLabel("created by Hans Ongsitco");
        add(name, getWidth() - name.getWidth()-10, getHeight()-10);
    }

    public static void main (String [] args){
        (new Aggregation()).start(args);
    }
}