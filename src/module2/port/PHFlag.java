package module2.port;/* Author's Name: Joseph Portugal
 * Course / Section: LBYCPEI / EQ3
 * Date: 05 - 22 - 2019
 */

import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class PHFlag extends GraphicsProgram {

    public void run() {

        generateBlueRectangle();
        generateRedRectangle();
        generateTriangle();
        generateRays();
        generateCircle();
        generateStar1();
        generateStar2();
        generateStar3();
        nameLabel();

    }

    private void generateBlueRectangle(){

        GRect square = new GRect(720,180);

        square.setFilled(true);
        square.setFillColor(Color.BLUE);

        add(square, 0, 0);


    }

    private void generateRedRectangle(){

        GRect square = new GRect(720,180);

        square.setFilled(true);
        square.setFillColor(Color.RED);

        add(square, 0, 180);

    }

    public void generateTriangle() {

        GPolygon triangle = new GPolygon();

        triangle.addVertex(0,0);

        triangle.addVertex(0,360);

        triangle.addVertex(180 * java.lang.Math.sqrt(3),180);

        triangle.setColor(Color.WHITE);

        triangle.setFilled(true);

        add(triangle, 0, 0);

    }

    public void generateCircle(){

        GOval sun = new GOval(72,72);

        sun.setFilled(true);
        sun.setFillColor(Color.YELLOW);

        add(sun, 76, 144);

    }

    public void generateStar1() {

        GPolygon star = new GPolygon();

        double size = 30;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = 30;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 25, 55);

    }


    public void generateStar2() {

        GPolygon star = new GPolygon();

        double size = 30;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = -15;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 256, 177);

    }

    public void generateStar3() {

        GPolygon star = new GPolygon();

        double size = 30;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        star.addVertex(-size / 2, -b * size);

        int angle = 15;
        for (int i = 0; i < 5; i++) {
            star.addPolarEdge(edge, angle);
            star.addPolarEdge(edge, angle + 72);
            angle -= 72;
        }

        star.setColor(Color.YELLOW);

        star.setFilled(true);

        add(star, 25, 310);

    }

    public void generateRays() {

        GPolygon ray = new GPolygon();

        double size = 50;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;

        ray.addVertex(-size / 2, -b * size);

        int angle = 0;
        for (int i = 0; i < 8; i++) {
            ray.addPolarEdge(edge, angle);
            ray.addPolarEdge(edge, angle + 45);
            angle -= 45;
        }

        ray.setColor(Color.YELLOW);

        ray.setFilled(true);

        add(ray, 103, 153);

    }

    private void nameLabel(){

        GLabel text = new GLabel("created by JOSEPH PORTUGAL");;

        text.setFont("Times New Roman-18");

        double x = (getWidth() - text.getWidth());

        double y = getHeight();

        add(text, x, y); // adding text label  to the center 

    }


    public static void main (String [] args){ // Solves java.lang.NoClassDefFoundError 
        (new PHFlag()).start(args);
    }

}