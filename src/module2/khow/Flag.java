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

public class Flag extends GraphicsProgram {

    public void run() {
        topRect();
        botRect();
        midTri();
        starA();
        sun();
        GLabel text = new GLabel("Khow, Johnal A.");
        text.setFont("Courier-bold");
        add(text, 500, 260);


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
    private void Ray(int a, int b, int theta){
        GPolygon raysA = new GPolygon();
        raysA.addVertex(8, 0);
        raysA.addVertex(16, 5);
        raysA.addVertex(12, 25);
        raysA.addVertex(3, 25);
        raysA.addVertex(0, 5);
        raysA.setFilled(true);
        raysA.rotate(theta);
        raysA.setFillColor(Color.YELLOW);
        add(raysA, a, b);

    }
    private void sun(){
        Ray(164+50+30, 129-30-2, 0);
        Ray(130+50+30, 149-30-2, 45);
        Ray(120+50+30, 188-30-2, 90);
        Ray(141+50+30, 223-30-2, 135);
        Ray(181+50+30, 232-30-2, 180);
        Ray(214+50+30, 211-30-2, 225);
        Ray(223+50+30, 170-30-2, 270);
        Ray(203+50+30, 138-30-2, 315);


        GOval mycircle = new GOval(60,60);
        add(mycircle, 223, 120);
        mycircle.setFillColor(Color.YELLOW);
        mycircle.setFilled(true);
        mycircle.setColor(Color.BLACK);

    }

    private void starA(){
        GLabel star = new GLabel("*");
        star.setFont("Berlin Sans FB-60");
        star.setColor(Color.YELLOW);
        add(star, 205, 105);

        GLabel star2 = new GLabel("*");
        star2.setFont("Berlin Sans FB-60");
        star2.setColor(Color.YELLOW);
        add(star2, 315, 180);

        GLabel star3 = new GLabel("*");
        star3.setFont("Berlin Sans FB-60");
        star3.setColor(Color.YELLOW);
        add(star3, 205, 255);
    }
    public static void main (String [] args){
        (new Flag()).start(args);
    }
}
