package module2.khow;/*

 Author: Johnal Khow
 Course Section: EQ3
 Date: May 29,2019

 */
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.*;

public class Arc extends GraphicsProgram {

    public void run() {
        topRect();
        botRect();
        midTri();
        sun();
        GLabel text = new GLabel("Khow, Johnal A.");
        text.setFont("Courier-bold");
        add(text, 100, 100);


    }

    private void topRect(){
        GRect myrec = new GRect(400, 100 );
        myrec.sendBackward();
        myrec.setFillColor(Color.BLUE);
        myrec.setFilled(true);
        myrec.setColor(Color.BLACK);
        add(myrec, 200, 50);
    }

    private void botRect(){
        GRect myrec2 = new GRect(400, 100 );
        myrec2.sendBackward();
        myrec2.setFillColor(Color.RED);
        myrec2.setFilled(true);
        myrec2.setColor(Color.BLACK);
        add(myrec2, 200, 150);

    }

    private void midTri() {
        GPolygon tri = new GPolygon();
        tri.addVertex(200,0);
        tri.addVertex(200,200);
        tri.addVertex(350,100);
        tri.setFillColor(Color.WHITE);
        tri.setFilled(true);
        tri.setColor(Color.BLACK);
        add(tri, 0, 50);

    }

    private void sun(){
        GOval mycircle = new GOval(50,50);
        add(mycircle, 230, 120);
        mycircle.setFillColor(Color.YELLOW);
        mycircle.setFilled(true);
        mycircle.setColor(Color.YELLOW);

    }
    public static void main (String [] args){
        (new Arc()).start(args);
    }
}
