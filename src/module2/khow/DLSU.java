package module2.khow;/*

 Author: Johnal Khow
 Course Section: EQ3
 Date: May 31,2019

 */
import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.program.*;
import acm.graphics.GImage;


import java.awt.*;

public class DLSU extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;
    private static final int RECT_COORDY = 384;
    private static final int BOTRECT_COORDX = 62;
    private static final int TOPRECT_COORDX = 152;
    private static final int TRI_COORDY = 185;
    private static final int TRI_COORDX = 50;
    private static final int SUN_COORDX = 128;
    private static final int SUN_COORDY = 415;


    public void run() {
        images();
        FlagA();
        FlagB();
        Banner();
        circle300();
        GLabel text = new GLabel("Khow, Johnal A.");
        text.setFont("Courier-bold");
        add(text, 100, 100);

    }


    private void images() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        GImage John = new GImage("assets/John.jpg");
        John.setBounds(270, 558, 130, 250);
        add(dlsu);
        add(John);


    }

    private void FlagA() {
        RectangleA();
        triangleA();
        sunA();
        starA();

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

    private void FlagB(){
        botRectB();
        topRectB();
        triangleB();
        sunB();
        starB();

    }

    private void Banner(){
        GLabel text2 = new GLabel("•DE•LA•SALLE•UNIVERSITY•");
        text2.setFont("Serif-36");
        add(text2, 120, 335);
    }

    private void circle300(){
        GOval mycircleC = new GOval(90,90);
        add(mycircleC, 288, 395);
        mycircleC.setFillColor(Color.GREEN);
        mycircleC.setFilled(true);
        mycircleC.setColor(Color.GREEN);

        GLabel text3 = new GLabel("300");
        text3.setFont("Serif-Italic-60");
        text3.setColor(Color.WHITE);
        add(text3, 288, 460);


    }

    private void RectangleA(){
        botRectA();
        topRectA();
    }

    private void botRectA(){
        GRect myrec = new GRect(90, 400 );
        myrec.sendToFront();
        myrec.setFillColor(Color.BLUE);
        myrec.setFilled(true);
        myrec.setColor(Color.BLACK);
        add(myrec, BOTRECT_COORDX, RECT_COORDY);
    }

    private void topRectA(){
        GRect myrec2 = new GRect(90, 400 );
        myrec2.sendToFront();
        myrec2.setFillColor(Color.RED);
        myrec2.setFilled(true);
        myrec2.setColor(Color.BLACK);
        add(myrec2, TOPRECT_COORDX, RECT_COORDY);
    }

    private void sunA(){
        Ray(147, 396, 0);
        Ray(119, 411, 40);
        Ray(110, 447, 90);
        Ray(129, 479, 140);
        Ray(162, 485, 180);
        Ray(191, 467, 225);
        Ray(199, 432, 270);
        Ray(182, 404, 315);

        GOval mycircle = new GOval(50,50);
        add(mycircle, SUN_COORDX, SUN_COORDY);
        mycircle.setFillColor(Color.YELLOW);
        mycircle.setFilled(true);
        mycircle.setColor(Color.BLACK);


    }

    private void triangleA(){
        GPolygon tri = new GPolygon();
        tri.addVertex(12,199);
        tri.addVertex(192,199);
        tri.addVertex(102,350);
        tri.setFillColor(Color.WHITE);
        tri.setFilled(true);
        tri.setColor(Color.BLACK);
        add(tri, TRI_COORDX, TRI_COORDY);
    }

    private void botRectB(){
        GRect myrecB = new GRect(94, 401 );
        myrecB.sendToFront();
        myrecB.setFillColor(Color.BLUE);
        myrecB.setFilled(true);
        myrecB.setColor(Color.BLACK);
        add(myrecB, BOTRECT_COORDX+353, RECT_COORDY);
    }

    private void topRectB() {
        GRect myrec2B = new GRect(95, 401 );
        myrec2B.sendToFront();
        myrec2B.setFillColor(Color.RED);
        myrec2B.setFilled(true);
        myrec2B.setColor(Color.BLACK);
        add(myrec2B, TOPRECT_COORDX+354, RECT_COORDY);
    }

    private void sunB(){
        Ray(501, 396, 0);
        Ray(473, 411, 40);
        Ray(463, 447, 90);
        Ray(483, 479, 140);
        Ray(515, 485, 180);
        Ray(545, 467, 225);
        Ray(553, 432, 270);
        Ray(535, 404, 315);

        GOval mycircleB = new GOval(50,50);
        add(mycircleB, SUN_COORDX+355, SUN_COORDY);
        mycircleB.setFillColor(Color.YELLOW);
        mycircleB.setFilled(true);
        mycircleB.setColor(Color.BLACK);
    }

    private void triangleB(){
        GPolygon triB = new GPolygon();
        triB.addVertex(12,199);
        triB.addVertex(192,199);
        triB.addVertex(101,350);
        triB.setFillColor(Color.WHITE);
        triB.setFilled(true);
        triB.setColor(Color.BLACK);
        add(triB, TRI_COORDX+355, TRI_COORDY);
    }

    private void starA(){
        GLabel star = new GLabel("*");
        star.setFont("Berlin Sans FB-70");
        star.setColor(Color.YELLOW);
        add(star, 75, 432);

        GLabel star2 = new GLabel("*");
        star2.setFont("Berlin Sans FB-70");
        star2.setColor(Color.YELLOW);
        add(star2, 200, 432);

        GLabel star3 = new GLabel("*");
        star3.setFont("Berlin Sans FB-70");
        star3.setColor(Color.YELLOW);
        add(star3, 140, 535);
    }

    private void starB(){
        GLabel starB = new GLabel("*");
        starB.setFont("Berlin Sans FB-70");
        starB.setColor(Color.YELLOW);
        add(starB, 430, 432);

        GLabel star2B = new GLabel("*");
        star2B.setFont("Berlin Sans FB-70");
        star2B.setColor(Color.YELLOW);
        add(star2B, 560, 432);

        GLabel star3B = new GLabel("*");
        star3B.setFont("Berlin Sans FB-70");
        star3B.setColor(Color.YELLOW);
        add(star3B, 495, 535);
    }
    public static void main (String [] args){
        (new DLSU()).start(args);
    }
}
