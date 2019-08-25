package module2.sabu;

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class Dlsu2 extends GraphicsProgram {

    // Set the dimensions of window depending on image size
    public static final int APPLICATION_WIDTH = 640;
    public static final int APPLICATION_HEIGHT = 845;

    public void run() {
        GImage dlsu = new GImage("assets/DLSU2.png");
        add(dlsu);
        leftFlag();
        rightFlag();
        images();
        name();
    }
    // Solves java.lang.NoClassDefFoundError
    public static void main (String [] args){
        (new Dlsu2()).start(args);
    }

    private void images(){
        GImage john = new GImage("assets/lasalle.jpg");
        john.setSize(135,225);
        double x = 265;
        double y = 555;
        add(john,x,y);
        GImage dlsu = new GImage("assets/dlsu.jpg");
        dlsu.setSize(580,38);
        double x1 = 48;
        double y1 = 305;
        add(dlsu,x1,y1);
        GImage circle = new GImage("assets/300.jpg");
        circle.setSize(92,92);
        double x2 = 287;
        double y2 = 398;
        add(circle,x2,y2);
    }

    private void leftFlag(){
        leftBlueRed();
        leftWhite();
        leftSun();
        leftStars();
    }

    private void rightFlag(){
        rightBlueRed();
        rightWhite();
        rightSun();
        rightStars();
    }

    private void leftBlueRed() {
        GRect top = new GRect(400, 90);
        top.rotate(90);
        top.setFilled(true);
        top.setFillColor(Color.BLUE);
        double x = ((getWidth() - top.getWidth()) / 2) - 213;
        double y = ((getHeight() - top.getHeight()) / 2) + 572;
        add(top,x,y);
        GRect bottom = new GRect(400, 91);
        bottom.rotate(90);
        bottom.setFilled(true);
        bottom.setFillColor(Color.RED);
        double x1 = ((getWidth() - bottom.getWidth()) / 2 - 122);
        double y1 = ((getHeight() - bottom.getHeight()) / 2) + 572;
        add(bottom,x1,y1);
    }

    private void leftSun(){
        GOval sun = new GOval(135,425,39,39);
        sun.setColor(Color.YELLOW);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        add(sun);
        GPolygon ray1 = new GPolygon();
        ray1.addVertex(155,408); // 1
        ray1.addVertex(147,445); // 2
        ray1.addVertex(155,482); // 3
        ray1.addVertex(163,445); // 4
        ray1.setColor(Color.YELLOW);
        ray1.setFilled(true);
        ray1.setFillColor(Color.YELLOW);
        add(ray1);
        GPolygon ray2 = new GPolygon();
        ray2.addVertex(155,437); // 1
        ray2.addVertex(123,445); // 2
        ray2.addVertex(155,453); // 3
        ray2.addVertex(186,445); // 4
        ray2.setColor(Color.YELLOW);
        ray2.setFilled(true);
        ray2.setFillColor(Color.YELLOW);
        add(ray2);
        GPolygon ray3 = new GPolygon();
        ray3.addVertex(179,422); // 1
        ray3.addVertex(153,439); // 2
        ray3.addVertex(132,467); // 3
        ray3.addVertex(161,449); // 4
        ray3.setColor(Color.YELLOW);
        ray3.setFilled(true);
        ray3.setFillColor(Color.YELLOW);
        add(ray3);
        GPolygon ray4 = new GPolygon();
        ray4.addVertex(134,422); // 1
        ray4.addVertex(150,449); // 2
        ray4.addVertex(179,467); // 3
        ray4.addVertex(161,439); // 4
        ray4.setColor(Color.YELLOW);
        ray4.setFilled(true);
        ray4.setFillColor(Color.YELLOW);
        add(ray4);
    }

    private void leftWhite(){
        GPolygon triangle = new GPolygon();
        triangle.addVertex(152.5, 555); // 1
        triangle.addVertex(244, 384); // 2
        triangle.addVertex(63, 384); // 3
        triangle.setColor(Color.BLACK);
        triangle.setFillColor(Color.WHITE);
        triangle.setFilled(true);
        add(triangle);
    }

    private void leftStars(){
        GPolygon star1 = new GPolygon();
        star1.addVertex(149.5,522.5); //1
        star1.addVertex(152.3,526.1); //2
        star1.addVertex(156.9,523.6); //3
        star1.addVertex(155,529); //4
        star1.addVertex(159,533); //5
        star1.addVertex(153,532); //6
        star1.addVertex(150,537); //7
        star1.addVertex(149,531); //8
        star1.addVertex(145,530); //9
        star1.addVertex(149,527); //10
        star1.setColor(Color.YELLOW);
        star1.setFilled(true);
        star1.setFillColor(Color.YELLOW);
        add(star1);
        GPolygon star2 = new GPolygon();
        star2.addVertex(215.5,390); //1
        star2.addVertex(219.3,393); //2
        star2.addVertex(223.9,391); //3
        star2.addVertex(222,396); //4
        star2.addVertex(226,400); //5
        star2.addVertex(220,399); //6
        star2.addVertex(217,404); //7
        star2.addVertex(216,398); //8
        star2.addVertex(212,396); //9
        star2.addVertex(216,395); //10
        star2.setColor(Color.YELLOW);
        star2.setFilled(true);
        star2.setFillColor(Color.YELLOW);
        add(star2);
        GPolygon star3 = new GPolygon();
        star3.addVertex(83,390); //1
        star3.addVertex(87,393); //2
        star3.addVertex(92,391); //3
        star3.addVertex(89,396); //4
        star3.addVertex(93,400); //5
        star3.addVertex(87.5,399); //6
        star3.addVertex(84,404); //7
        star3.addVertex(84,398); //8
        star3.addVertex(79,396); //9
        star3.addVertex(84,395); //10
        star3.setColor(Color.YELLOW);
        star3.setFilled(true);
        star3.setFillColor(Color.YELLOW);
        add(star3);
    }

    private void rightBlueRed() {
        GRect top = new GRect(400, 90);
        top.rotate(90);
        top.setFilled(true);
        top.setFillColor(Color.BLUE);
        double x = ((getWidth() - top.getWidth()) / 2) + 140;
        double y = ((getHeight() - top.getHeight()) / 2) + 572;
        add(top,x,y);
        GRect bottom = new GRect(400, 91);
        bottom.rotate(90);
        bottom.setFilled(true);
        bottom.setFillColor(Color.RED);
        double x1 = ((getWidth() - bottom.getWidth()) / 2 + 232);
        double y1 = ((getHeight() - bottom.getHeight()) / 2) + 572;
        add(bottom,x1,y1);
    }

    private void rightSun(){
        GOval sun = new GOval(485,425,39,39);
        sun.setColor(Color.YELLOW);
        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);
        add(sun);
        GPolygon ray1 = new GPolygon();
        ray1.addVertex(505,408); // 1
        ray1.addVertex(497,445); // 2
        ray1.addVertex(505,482); // 3
        ray1.addVertex(513,445); // 4
        ray1.setColor(Color.YELLOW);
        ray1.setFilled(true);
        ray1.setFillColor(Color.YELLOW);
        add(ray1);
        GPolygon ray2 = new GPolygon();
        ray2.addVertex(505,437); // 1
        ray2.addVertex(473,445); // 2
        ray2.addVertex(505,453); // 3
        ray2.addVertex(536,445); // 4
        ray2.setColor(Color.YELLOW);
        ray2.setFilled(true);
        ray2.setFillColor(Color.YELLOW);
        add(ray2);
        GPolygon ray3 = new GPolygon();
        ray3.addVertex(529,422); // 1
        ray3.addVertex(503,439); // 2
        ray3.addVertex(482,467); // 3
        ray3.addVertex(511,449); // 4
        ray3.setColor(Color.YELLOW);
        ray3.setFilled(true);
        ray3.setFillColor(Color.YELLOW);
        add(ray3);
        GPolygon ray4 = new GPolygon();
        ray4.addVertex(484,422); // 1
        ray4.addVertex(500,449); // 2
        ray4.addVertex(529,467); // 3
        ray4.addVertex(511,439); // 4
        ray4.setColor(Color.YELLOW);
        ray4.setFilled(true);
        ray4.setFillColor(Color.YELLOW);
        add(ray4);
    }

    private void rightWhite(){
        GPolygon triangle = new GPolygon();
        triangle.addVertex(506, 555); // 1
        triangle.addVertex(597, 384); // 2
        triangle.addVertex(416, 384); // 3
        triangle.setColor(Color.BLACK);
        triangle.setFillColor(Color.WHITE);
        triangle.setFilled(true);
        add(triangle);
    }

    private void rightStars(){
        GPolygon star1 = new GPolygon();
        star1.addVertex(504.5,522.5); //1
        star1.addVertex(507.3,526.1); //2
        star1.addVertex(511.9,523.6); //3
        star1.addVertex(510,529); //4
        star1.addVertex(514,533); //5
        star1.addVertex(508,532); //6
        star1.addVertex(505,537); //7
        star1.addVertex(504,531); //8
        star1.addVertex(500,530); //9
        star1.addVertex(504,527); //10
        star1.setColor(Color.YELLOW);
        star1.setFilled(true);
        star1.setFillColor(Color.YELLOW);
        add(star1);
        GPolygon star2 = new GPolygon();
        star2.addVertex(570.5,390); //1
        star2.addVertex(574.3,393); //2
        star2.addVertex(578.9,391); //3
        star2.addVertex(577,396); //4
        star2.addVertex(581,400); //5
        star2.addVertex(575,399); //6
        star2.addVertex(572,404); //7
        star2.addVertex(571,398); //8
        star2.addVertex(567,396); //9
        star2.addVertex(571,395); //10
        star2.setColor(Color.YELLOW);
        star2.setFilled(true);
        star2.setFillColor(Color.YELLOW);
        add(star2);
        GPolygon star3 = new GPolygon();
        star3.addVertex(438,390); //1
        star3.addVertex(442,393); //2
        star3.addVertex(447,391); //3
        star3.addVertex(444,396); //4
        star3.addVertex(448,400); //5
        star3.addVertex(442.5,399); //6
        star3.addVertex(439,404); //7
        star3.addVertex(439,398); //8
        star3.addVertex(434,396); //9
        star3.addVertex(439,395); //10
        star3.setColor(Color.YELLOW);
        star3.setFilled(true);
        star3.setFillColor(Color.YELLOW);
        add(star3);
    }

    private void name(){
        GLabel text = new GLabel("Matthew Sabularse");
        text.setFont("Franchise-24");
        text.setColor(Color.BLACK);
        double x = 610;
        double y = 750;
        add(text,x,y);
    }
}
